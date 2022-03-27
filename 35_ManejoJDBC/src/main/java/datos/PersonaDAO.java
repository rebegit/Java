//PATORN DISEÑO DAO: DATA ACCESS OBJECT
//acceso a datos para la clase entidad Persona
//operaciones: select, insert, update...
package datos;

import com.mysql.cj.jdbc.StatementImpl;
import domain.Persona;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rebeca
 */
public class PersonaDAO {
    //las sentencias se declaran al inicio
    private static final String SQL_SELECT = "SELECT * FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona (nombre,apellido,email,telefono) VALUES (?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre= ?, apellido=?, email= ?, telefono= ? WHERE idpersona= ?";
    private static final String SQL_DELETE= "DELETE FROM persona WHERE idpersona= ?";
    
    public List <Persona> seleccionar(){//devuelve una lista de obbjetos tipo Persona
        Connection conn= null; // no puede ser var conn porque hay que aplicar el tipo que se utiliza
        PreparedStatement stmt = null; //preparedStatemnt es mas conveniente para trabajar con querys(mas que Statement)
        ResultSet rs = null;
        Persona persona =null;
        List <Persona> personas = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){//indica si tenemosun elemento a iterar, si es asi devuelve verdadero y sigue iterando
                int idPersona= rs.getInt("idpersona"); //getInt xq es de tipo entero
                String nombre= rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email= rs.getString("email");
                String telefono = rs.getString("telefono");
                
                persona = new Persona (idPersona, nombre, apellido, email, telefono); //esto es lo que hace Hibernate o tecnologia JPA por nosotros
                personas.add(persona);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(rs);
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
               ex.printStackTrace(System.out);

            }
        }
        return personas;
    }
    
    public int insertar(Persona persona){
        Connection conn= null; 
        PreparedStatement stmt = null; 
        int registros =0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, persona.getNombre()); //cada uno de los parametros son de tipoString. indice 1 corresponde a parametro nombre
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());        
        
            registros =stmt.executeUpdate(); //para actualizar estado en bbdd
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int actualizar(Persona persona){
        Connection conn= null; 
        PreparedStatement stmt = null; 
        int registros =0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, persona.getNombre());
            stmt.setString(2, persona.getApellido());
            stmt.setString(3, persona.getEmail());
            stmt.setString(4, persona.getTelefono());   
            stmt.setInt(5, persona.getIdPersona());
        
            registros =stmt.executeUpdate(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
    
    public int eliminar(Persona persona){ //aunque recibe el idpersona solamente, es mejor trabajar con objetos completos
        Connection conn= null; 
        PreparedStatement stmt = null; 
        int registros =0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);  
            stmt.setInt(1, persona.getIdPersona());
        
            registros =stmt.executeUpdate(); 
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            try {
                Conexion.close(stmt);
                Conexion.close(conn);
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registros;
    }
}
