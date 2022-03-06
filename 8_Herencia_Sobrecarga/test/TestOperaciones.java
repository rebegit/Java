
package test;

import operaciones.Operaciones;

/**
 *
 * @author Rebeca
 */
public class TestOperaciones {
    public static void main(String[] args) {
        var resultado1= Operaciones.sumar(5, 3) ;
        System.out.println("resultado1 = " + resultado1);
        
        var resultado2= Operaciones.sumar(5.77, 3.00) ;
        System.out.println("resultado2 = " + resultado2);
        
        var resultado3= Operaciones.sumar(3, 5L) ; //se ejecuta el double ya que soporta el Long
        System.out.println("resultado3 = " + resultado3);
    }
}
