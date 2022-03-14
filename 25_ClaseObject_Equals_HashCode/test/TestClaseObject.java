
package test;

import domain.Empleado;

/**
 *
 * @author Rebeca
 */
public class TestClaseObject {
    public static void main(String[] args) {
    
        //Empleado empleado1 =new Empleado("Juan", 5000);
        Empleado empleado1 =new Empleado("juan", 5000);
        Empleado empleado2 =new Empleado("Juan", 5000);

        //se compara referencia
        if(empleado1 == empleado2){
           System.out.println("Tienen la misma referencia en memoria");
        }else{
            System.out.println("tienen distinta referencia en memoria");
        }
        
        //se compara contenido
        if (empleado1.equals(empleado2)){
            System.out.println("Los objetos son iguales en contenido");
        } else{
            System.out.println("Los objetos son distintos en contenido");
        }
        
        // se compara usando valor entero. si equals es verdadero el valor hashcode debe de ser igual
        if (empleado1.hashCode()==empleado2.hashCode()){
            System.out.println("El valor hashcode es igual");
        } else{
            System.out.println("El valor hashcode es distinto");
        }
        
    }
}
