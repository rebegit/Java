
package test;

import aritmetica.Aritmetica;

/**
 *
 * @author Rebeca
 */

// si utilizamos runtimeException el compilador no obliga a procesar la exception, simplemente se reporta y termina de forma abrupta. Pero el codigo e smucho mas limpio

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado=0;
        resultado =Aritmetica.division(10, 0);
        System.out.println("resultado = " + resultado);
        
    }
}

/*lo ideal es usar try catch de Exception para las excepciones que estemos seguros que puede aparecer
utilizar runtimException para que el codigo quede lo mas limpio posible
*/