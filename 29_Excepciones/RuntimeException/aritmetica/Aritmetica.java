
package aritmetica;

import excepciones.OperacionExcepcion;

/**
 *
 * @author Rebeca
 */
public class Aritmetica {
    //para que no se necesite crear objetos de esta clase= static
    public static int division( int numerador, int denominador){ //NO REPORTA EXCEPTION
        if(denominador ==0){
            throw new OperacionExcepcion("division entre 0");
        }
        return numerador/denominador;
    }
}
