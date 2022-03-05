
package test;

import dominio.Persona;

/**
 *
 * @author Rebeca
 */
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1= new Persona("Pablo", 5000.00, false); 
         System.out.println("persona1 nombre:" + persona1.getNombre());
        persona1.setNombre("Juan Carlos");
        //persona1.nombre = "Juan Carlos"; YA NO SE PUEDE PORQUE NO ESTA EN EL MISMO PAQUETE
        //System.out.println("nombre:" + persona1.nombre); YA NO SE PUEDE PORQUE NO ESTA EN EL MISMO PAQUETE
        System.out.println("persona1 nombre con cambio:" + persona1.getNombre());
        System.out.println("persona1 sueldo: " + persona1.getSueldo());
        System.out.println("persona1 eliminado:" + persona1.isEliminado());
        
        System.out.println("**********");
        System.out.println("persona1: " +persona1.toString());
        //si esta deifnido el objeto toString en la clase Persona, se puede llamar el metodo de manera automatica (sin poner toString) porque esta en print o println
        System.out.println("persona1: " +persona1);
    }
}
