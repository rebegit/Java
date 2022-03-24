
package com.peliculas.excepciones;

/**
 *
 * @author Rebeca
 */
public class AccesoDatosEx extends Exception{ //si fuera RuntimeException el compilador no nos obliga a procesar la excepcion
    public AccesoDatosEx(String mensaje){
        super(mensaje); //el mensaje se propaga a la clase padre para inicializar el constructor de la clase padre Excepction
    }
}
