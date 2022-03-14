
package test;

import domain.*;

/**
 *
 * @author Rebeca
 */

//INSTANCEOF= saber de que tipo es la referencia a la que esta apuntando cierta variable
// tambien sirve para convertir un tipo de dato para tener metodos o variables de tipo hija
public class TestInstanceOf {
    public static void main(String[] args) {
        Empleado empleado= new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Eduardo", 1000.99, "Sistemas"); //
        determinarTipo(empleado);
       
    }
   
  
   public static void determinarTipo(Empleado empleado){ 
       //primero clases hijas y al final clases padre ya que las padres siempre contiene hijas
        if (empleado instanceof Gerente){
            System.out.println("INSTANCIA DE TIPO GERENTE");
           //!!! conversion
           Gerente gerente= (Gerente) empleado; //que la variable apunte en memoria del tipo de la clase que interesa, en este caso el tipo Gerente que es la clase hija
           System.out.println("gerente = " + gerente.getDepartamento()); //conversion de tipo ya que el metodo no esta en esa clase
           //((Gerente) empleado).getDepartamento();
        
        } else if (empleado instanceof Empleado){
            System.out.println("INSTANCIA DE TIPO EMPLEADO");
            System.out.println("empleado = " + empleado.getNombre());
        } else if (empleado instanceof Object){
            System.out.println("INSTANCIA DE TIPO OBJETC");
            empleado.toString();
        }
   }
    
}
