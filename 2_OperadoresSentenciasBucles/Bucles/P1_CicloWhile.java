package Bucles;


/**
 *
 * @author Rebeca
 */
public class P1_CicloWhile {
    public static void main(String args[]) {
        var contador = 0;
        while( contador < 3 ){ //cuando llegue a 3 no entra en while y termina ejecución
            System.out.println("contador = " + contador);
            contador++;
        }
        
        //debug file (click derecho)+ window-debugging variables= para ver paso a paso como va cambiando a variable en contador
        // new watch (click derecho)= meter expresion= te devuelve true o false si se cumple (ej: contador<2)
    }
}
