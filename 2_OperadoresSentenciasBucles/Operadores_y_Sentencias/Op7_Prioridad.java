package Operadores_y_Sentencias;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rebeca
 */
public class Op7_Prioridad {
    public static void main(String args[]) {
        var x = 5;
        var y = 10;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("-----------------------------------------");
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;//4 + ((5*6)/3)
        System.out.println("resultado = " + resultado);//14
        
        resultado = (4 + 5) * 6 / 3; //9*2
        System.out.println("resultado = " + resultado);
    }
}
