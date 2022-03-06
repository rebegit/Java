
package test;

import domain.Cliente;
import domain.Empleado;
import java.util.Date;

/**
 *
 * @author Rebeca
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1= new Empleado("Juan", 500.0);
        System.out.println("empleado1 = " + empleado1);
        var fecha= new Date();
        Cliente cliente1= new Cliente(fecha,true,"Susana", 'F',27,"C/Estadio nº20");
        System.out.println("cliente1 = " + cliente1);
    }
}
