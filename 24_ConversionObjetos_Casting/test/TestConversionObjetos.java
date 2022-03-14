
package test;
import domain.*;
/**
 *
 * @author Rebeca
 */
public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        empleado =new Escritor ("Juan", 3000, TipoEscritura.CLASICO );
                System.out.println("empleado = " + empleado);
                System.out.println("empleado = " + empleado.obtenerDetalles());
                
        //empleado.getTipoEscritura;
        //no se puede acceder ya que el metodo getTipoEscritura no esta en comun en Escritor y Empleado, solo en Escritor, por tanto: CONVERSION
        
        //downcasting:convierte clase padre empleado a tipo Escritor
        //((Escritor) empleado).getTipoEscritura();
        Escritor escritor =(Escritor) empleado;
        escritor.getTipoEscritura();
        
        //upcasting
        Empleado empleado2= escritor; //no hay que agregar la conversion de manera explicita entre parentesis. 
        //ya que asignar una variable de tipo hija a una de tipo padre el compilador no marca problema
        System.out.println(empleado2.obtenerDetalles());
    }
}
