package Operadores_y_Sentencias;


import java.util.Scanner;

/*
    Solicitar al usuario dos valores:
    numero1 (int)
    numero2 (int)

    Se debe imprimir el mayor de los dos números (la salida debe ser identica a la que sigue):
    Proporciona el numero1:
    Proporciona el numero2:
    El numero mayor es:
    <numeroMayor>
*/

/**
 *
 * @author Rebeca
 */
public class Ej_Sentencia2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduce numero 1");
        int num1 =Integer.parseInt(scanner.nextLine());
        System.out.println("Introduce numero 2");
        int num2 =Integer.parseInt(scanner.nextLine());
        
        if (num1>num2){
            System.out.println("El numero mayor es \n" +num1);
        }else{
            System.out.println("El numero mayor es \n" +num2);
        }
                
        System.out.println("------------");
        //otra forma con ternario
        System.out.println("El numero mayor es: ");
        System.out.println(num1>num2?num1:num2);
    }
}
