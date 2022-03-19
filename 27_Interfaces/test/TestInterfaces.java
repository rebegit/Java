
package test;

import accesodatos.I_AccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

/**
 *
 * @author Rebeca
 */
public class TestInterfaces {
        public static void main(String[] args) {
        I_AccesoDatos datos= new ImplementacionMySql(); //se puede asingar un objeto que implementa una interface al tipo que esta implementando
        datos.listar();//con la variable de datos aplicamos polimorfismo. el metodo al que llama es el de la clase
        imprimirAct(datos);
        
        datos= new ImplementacionOracle();
        datos.listar();
        imprimirAct(datos);
        }
        
        public static void imprimirAct(I_AccesoDatos datos){
            datos.actualizar();
        }
}
