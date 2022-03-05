package paqueteInicio;


import java.util.Scanner;

/**
 *
 * @author Rebeca
 */
public class Prueba8_ConversionTiposPrimitivos {
    public static void main(String[] args) {
         //Convertir tipo String a un tipo int
        var edad = Integer.parseInt("20");
        var edad2 = "20";
        System.out.println("edad = " + (edad + 1));
        System.out.println("edad2 = " + (edad2+1)); //es la cadena 201
        
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor 
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad:");
        edad = Integer.parseInt( consola.nextLine() );//si se introduce un string da error
        System.out.println("edad = " + edad);
        
        System.out.println("---------------------------");
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var caracter = "hola".charAt(1); //selecciona la posicion 1, se empieza a contar por 0
        System.out.println("caracter = " + caracter);
        
        System.out.println("Proporciona una frase o letra:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
        
        
    }
}
