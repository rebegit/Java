package Operadores_y_Sentencias;


import java.util.Scanner;

    /*
        El usuario proporcionará un valor entre 0 y 10.
        Si está entre 9 y 10: imprimir una A
        Si está entre 8 y menor a 9: imprimir una B
        Si está entre 7 y menor a 8: imprimir una C
        Si está entre 6 y menor a 7: imprimir una D
        Si está entre 0 y menor a 6: imprimir una F
        cualquier otro valor debe imprimir: Valor desconocido
        Por ejemplo:
        Proporciona un valor entre 0 y 10:
        A
    */

/**
 *
 * @author Rebeca
 */
public class EjercicioSentencias {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Introduce calificacion");
        int calificacion = Integer.parseInt(scanner.nextLine());
        //Si esta entre 9 y 10 imprimir: A
        if (calificacion >= 9 && calificacion <= 10)
            System.out.println("A");
        //Si esta entre  8 y menor a 9 imprimir: B
        else if(calificacion >= 8 && calificacion < 9)
            System.out.println("B");
        //Si esta entre 7 y menor a 8 imprimir: C
        else if(calificacion >= 7 && calificacion < 8)
            System.out.println("C");
        //Si esta entre 6 y menor a 7 imprimir: D
        else if(calificacion >= 6 && calificacion < 7)
            System.out.println("D");
        //Si esta entre 0 y menor a 6 imprimir: F
        else if(calificacion >= 0 && calificacion < 6)
            System.out.println("F");
        //Si no esta en el rago, imprimir: Valor desconocido
        else
            System.out.println("Valor desconocido");
    }
}
