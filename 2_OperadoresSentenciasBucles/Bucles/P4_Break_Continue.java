
package Bucles;

/**
 *
 * @author Rebeca
 */
public class P4_Break_Continue {
    public static void main(String[] args) {
         for( var contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 != 0){
                continue;//ir a la siguiente iteracion
            }   
            System.out.println("contador = " + contador);
        }
        
        for( var contador2 = 0 ; contador2 < 3 ; contador2++ ){
            if( contador2 % 2 == 0){
                System.out.println("contador2 = " + contador2);
                break;
            }   
        }
    }
}
