
package excepciones;

/**
 *
 * @author Rebeca
 */


//tiene que heredar de alguna de las clases de excepcion
public class OperacionExcepcion extends Exception{
    public OperacionExcepcion(String mensaje){
        super (mensaje);
    }

}
