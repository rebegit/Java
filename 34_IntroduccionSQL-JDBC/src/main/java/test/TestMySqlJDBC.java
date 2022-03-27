
package test;

import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**CONEXION A LA BBDD CREADA EN MYSQL WORKBENCH
 *
 * @author Rebeca
 */
public class TestMySqlJDBC {
    public static void main(String[] args) {
        //cadena de conexion -> IP del servidor de la bbdd + bbdd + parametros: 
        //uSSL es no usar conexion segura, useTimezone: usar zona horaria, allowPublicKeyRetrieval: conectar de manera exitosa
        var url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url,"root", "admin"); //usuario y contraseña de SQL
            //ejecutar sentencias
            Statement instruccion =conexion.createStatement();
            var sql =" SELECT idpersona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){//indica si tenemosun elemento a iterar, si es asi devuelve verdadero y sigue iterando
                System.out.print("Id Persona: "+ resultado.getInt("idpersona")); //getInt xq es de tipo entero
                System.out.print(" Nombre: "+ resultado.getString("nombre"));
                System.out.print(" Apellido: "+ resultado.getString("apellido"));
                System.out.print(" Email: "+ resultado.getString("email"));
                System.out.print(" Telefono: "+ resultado.getString("telefono"));
                System.out.println("");
            }
            //se cierran objetos abiertos
            resultado.close();
            instruccion.close();
            conexion.close();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
