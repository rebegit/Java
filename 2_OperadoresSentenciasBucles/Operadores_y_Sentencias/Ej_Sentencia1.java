package Operadores_y_Sentencias;


import java.util.Scanner;

    /*En el siguiente ejercicio se solicita calcular el área y el perímetro de un Rectángulo, para ello deberemos crear las siguientes variables:
    alto (int)
    ancho (int)

    El usuario debe proporcionar los valores de largo y ancho, y después se debe imprimir el resultado en el siguiente formato
    (no usar acentos y respetar los espacios, mayúsculas, minúsculas y saltos de línea):
    Proporciona el alto:
    Proporciona el ancho:
    Area: <area>
    Perimetro: <perimetro>
    
    Las fórmulas para calcular el área y el perímetro de un Rectángulo son:
    Área: alto * ancho
    Perímetro: (alto + ancho) * 2
    */

/**
 *
 * @author Rebeca
 */
public class Ej_Sentencia1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Proporciona alto");
        int alto=Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona ancho");
        int ancho=Integer.parseInt(scanner.nextLine());
        int area= alto*ancho;
        int perimetro=(alto+ancho)*2;
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
        
    }
}
