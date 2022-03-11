
package test;

import domain.Persona;

/**
 *
 * @author Rebeca
 */
public class testBloquesInicializacion {
    public static void main(String[] args) {
        Persona persona1 =new Persona();
        //run= se ejecutan los bloques y el cosntructor
        
        System.out.println("persona1 = " + persona1);
        System.out.println("");
        Persona persona2 =new Persona();
        System.out.println("persona2 = " + persona2);

    }
}
