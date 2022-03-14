
package test;

import domain.*;

/**
 *
 * @author Rebeca
 */


//EL POLIMORFISMO SE COMPRUEBA EN TIEMPO DE EJECUCIÓN, NO DESDE COMPILADOR
public class TestSobrescritura {
    public static void main(String[] args) {
        Empleado empleado= new Empleado("Juan", 5000);
        //System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        imprimir(empleado);
        
        //Gerente gerente1 = new Gerente("Eduardo", 1000.99, "Sistemas");
        //!!!!!
        empleado = new Gerente("Eduardo", 1000.99, "Sistemas"); //se puede usar la variable empleado ya que es de tipo padre y por tanto puede almacenar referencias de objeto de tipo hijo
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(empleado);
    }
    
    //polimorfismo: se ejecuta con un mismo tipo diferentes metodos de diferentes tipos ej: clase padre o hija. MULTIPLES FORMAS EN TIEMPO DE EJECUCION
    //se necesita que los metodos obtenerDetalles se llamen igual para poder aplicar el polimorfismo
    //si el metodo de clase padre es protected en la clase hija no puede ser mas restrictivo(entonces, podria ser protected, default o public)
    public static void imprimir(Empleado empleado){ //debe de ser estatico ya que lo mando a llamr desde el metodo main
        System.out.println("empleado = " + empleado.obtenerDetalles());
        //se imprime la informacion de la clase padre e hija. el metodo que se va ejecutar es del tipo de la referencia que ha recibido la variable, que en este caso es la de tipo Empleado
    }
    
}
