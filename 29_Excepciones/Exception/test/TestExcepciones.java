
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/**
 *
 * @author Rebeca
 */
public class TestExcepciones {
    public static void main(String[] args) {
        int resultado=0;
        //para recuèrar el problema
        try{
        resultado =Aritmetica.division(10, 0);
        
        }catch (OperacionExcepcion e) { //pueden haber varios try catch, ordenar de menor a mayor jerarquia
            System.out.println("Ocurrió un error de tipo OperacionException");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrió un error de tipo Exception:"); //Exception es mas generica
            e.printStackTrace(System.out); //se imprime la lista de excepciones xq se puede tener una larga lista
            //system out para comprobar que la salida se manda a la consola
            
            System.out.println(e.getMessage());//para imprimir el mensaje de manera individual
        }finally{ //indica que siempre se va a utilizar este bloque de codigo. Siempre se va a ejecutar
            System.out.println("Se revisó la división entre 0");
        }
        System.out.println("resultado = " + resultado);
        
    }
}
