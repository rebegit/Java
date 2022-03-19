
package accesodatos;

/**
 *
 * @author Rebeca
 */

//palabra reservada implements para implementar una interface
//obligar a clases que implementen el comportamiento definido en la interface. si no se implementan los metodos hay que definirla como abstacta y definiendo una clase hija. 
//Recordar: no se puede crear objetos de una clase abstracta
public class ImplementacionMySql implements I_AccesoDatos{ //pulsar en all implements methods

    @Override
    public void insertar() {
        System.out.println("Insertar desde Mysql");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Mysql");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Mysql");
    }

    @Override
    public void eliminar() {
        System.out.println("Eliminar desde Mysql");
    }
    
}
