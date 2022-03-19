
package excepciones;

/**
 *
 * @author Rebeca
 */

//la diferencia con Exception la otra es que el compilador no obliga a procesar este tipo de excepciones


public class OperacionExcepcion extends RuntimeException{
    public OperacionExcepcion(String mensaje){
        super (mensaje);
    }

}
