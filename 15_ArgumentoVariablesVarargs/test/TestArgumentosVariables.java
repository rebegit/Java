
package test;

/**
 *
 * @author Rebeca
 */

/* ARGUMENTOS VARIABLES: es cuando pasamos un argumento hacia un metodo*/

public class TestArgumentosVariables {
    public static void main(String[] args) { //para poder ejecutar nuestra clase
        imprimirNumeros(5,8,9);
        imprimirNumeros(1,2);
        System.out.println("***");
        variosParametros("Rebeca", 2,4,33);
    }
    
/* privado porque solo se usa en esta clase. Como se usa desde el main que es estatico, tambien sera estatico el metodo. void porque no devuelve nada*/
    private static void imprimirNumeros(int...numeros){ //tipo+TRES PUNTOS SIGNIFICA QUE RECIBIMOS ARGUMENTOS VARIABLES, NO SE SABE CON EXACTITUD LA CANTIDAD
                                                        //la diferencia on arrays es que no se sabe la cantidad que se le pasa a este metodo. Se trata igual que un array
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento: "+ numeros[i]);
        }                                            
    }
    
    //el ultimo argumento del metodo tiene que ser el argumento variable
    private static void variosParametros(String nombre, int...numeros){ 
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
        }                                            
    }

