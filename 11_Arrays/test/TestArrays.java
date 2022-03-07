
package test;

/**
 *
 * @author Rebeca
 */
public class TestArrays {
    public static void main(String[] args) {
        
        //almacenar variables.
        int edades[] = new int[3];
        System.out.println("edades = " + edades); //almacenado
        
        edades[0] = 10;
        System.out.println("edades 0 = " + edades[0]);
        
        //edades[3] = 5; NO SE PUEDE. Hay 3 elementos: 0,1,2 . no existe el 3, da error
        edades[1] = 15;
        edades[2]=4;
        
        for(int i = 0; i < edades.length; i++){ //.length es para saber la longitud del array
            System.out.println("edades elemento " + i + ": " + edades[i]);
        }
        
        
    }
    
}
