//CTRL+H= sustituir!
package datos;

import com.mysql.cj.jdbc.StatementImpl;
import domain.Usuario;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rebeca
 */
public class UsuarioDAO {
    //las sentencias se declaran al inicio
    private static final String SQL_SELECT = "SELECT * FROM usuario";
    private static final String SQL_INSERT = "INSERT INTO usuario (username,password) VALUES (?,?)";
    private static final String SQL_UPDATE = "UPDATE usuario SET username= ?, password=? WHERE idusuario= ?";
    private static final String SQL_DELETE= "DELETE FROM usuario WHERE idusuario= ?";
    
    public List <Usuario> select(){//devuelve una lista de obbjetos tipo Usuario
        Connection conn= null; // no puede ser var conn porque hay que aplicar el tipo que se utiliza
        PreparedStatement stmt = null; //preparedStatemnt es mas conveniente para trabajar con querys(mas que Statement)
        ResultSet rs = null;
        Usuario usuario =null;
        List <Usuario> usuarios = new ArrayList<>();
        
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while(rs.next()){//indica si tenemosun elemento a iterar, si es asi devuelve verdadero y sigue iterando
                int idUsuario= rs.getInt("idusuario"); //getInt xq es de tipo entero
                String username= rs.getString("username");
                String password = rs.getString("password");
                                
                usuario = new Usuario();
                usuario.setIdusuario(idUsuario);
                usuario.setUsername(username);
                usuario.setPassword(password);
                
                usuarios.add(usuario);
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
        return usuarios;
    }
    
    public int insert(Usuario usuario){
        Connection conn= null; 
        PreparedStatement stmt = null; 
        int registros =0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsername()); //cada uno de los parametros son de tipoString. indice 1 corresponde a parametro username
            stmt.setString(2, usuario.getPassword());  
        
            System.out.println("ejecutando query:" + SQL_INSERT);
            registros = stmt.executeUpdate();
            System.out.println("Registros afectados:" + registros);
            
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
    
    public int update(Usuario usuario){
        Connection conn= null; 
        PreparedStatement stmt = null; 
        int registros =0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword()); 
            stmt.setInt(3, usuario.getIdusuario());
        
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
    
    public int delete(Usuario usuario){ //aunque recibe el idusuario solamente, es mejor trabajar con objetos completos
        Connection conn= null; 
        PreparedStatement stmt = null; 
        int registros =0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);  
            stmt.setInt(1, usuario.getIdusuario());
        
            registros =stmt.executeUpdate(); 
            System.out.println("Registros eliminados:" + registros);
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
