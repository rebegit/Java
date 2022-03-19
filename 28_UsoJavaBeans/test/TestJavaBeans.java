
package test;

import domain.PersonaBean;

/**
 *
 * @author Rebeca
 */
public class TestJavaBeans { //en este orden es buen uso de JavaBeans
    public static void main(String[] args) {
        PersonaBean persona= new PersonaBean(); //constructor vacio
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        
        System.out.println(persona);
        System.out.println("Persona: "+persona.getApellido()+" "+persona.getApellido());
    }
}
