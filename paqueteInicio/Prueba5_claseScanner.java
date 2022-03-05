package paqueteInicio;


import java.util.Scanner;

/**
 *
 * @author Rebeca
 */
public class Prueba5_claseScanner {
     public static void main(String args[]) {
        System.out.println("Escribe tu nombre:");
        Scanner consola = new Scanner(System.in); //in es de input y System es para acceder a la consola
        var usuario = consola.nextLine(); //lee una linea completa de la consola
        
        System.out.println("usuario = " + usuario);
        System.out.println("Escribe el titulo:");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
     }
}
