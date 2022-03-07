
package test;

import domain.Empleado;

/**
 *
 * @author Rebeca
 */
public class TestFinal {
    public static void main(String[] args) {
        /*Final en variable: una vez que le asigamos valor ya no se puede modificar*/
        final int miVariable=10;
        System.out.println("miVariable = " + miVariable);
        //miVariable=5; da error
        
        //Persona.Mi_CONSTANTE=5; nopermite porque es final
        System.out.println("MI_CONSTANTE = " + Empleado.MI_CONSTANTE);
        
        
        //Si se le quiere asignar una nueva referencia de un objeto NO se puede. SÍ se puede cambiar valor de atributos
        final Empleado empleado1= new Empleado();
        //empleado1= new Empleado(); NO SE PUEDE
        
       empleado1.setNombre("Juan");
       System.out.println("empleado1 = " + empleado1.getNombre());
       empleado1.setNombre("Carlos");
       System.out.println("empleado1 = " + empleado1.getNombre());
        
        
    }
}
