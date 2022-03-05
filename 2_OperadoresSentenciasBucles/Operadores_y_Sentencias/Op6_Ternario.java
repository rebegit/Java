package Operadores_y_Sentencias;


/**
 *
 * @author Rebeca
 */
public class Op6_Ternario {
     public static void main(String args[]) {
        //si la expresion se cumple, se muestra lo primero y sino, lo segundo
        var resultado = (1 > 2) ? "verdadero" : "falso";        
        System.out.println("resultado = " + resultado);
        
        var numero = 9;
        resultado = (numero % 2 == 0) ? "numero par" : "numero impar";
        System.out.println("resultado = " + resultado);
    }
}
