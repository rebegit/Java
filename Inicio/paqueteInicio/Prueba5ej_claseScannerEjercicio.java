package paqueteInicio;


import java.util.Scanner;

/*
   Se solicita incluir la siguiente información acerca de un libro:
   titulo
   autor

   Debes imprimir la información en el siguiente formato:

   Proporciona el titulo:
   Proporciona el autor:
   <titulo> fue escrito por <autor>
 */

/**
 *
 * @author Rebeca
 */
public class Prueba5ej_claseScannerEjercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Escribe tu solucion aqui
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
