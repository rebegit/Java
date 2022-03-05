
package pasoporvalor;

import clases.Persona;

/**
 *
 * @author Rebeca
 */
public class PasoPorReferencia { //importando, con objetos
    
    //lo que almacenan estas variables son referencias a los objetos, no e slo mismo que un tipo primitivo que alamcenan un valor y no almacenan referencias
    //todas las clases heredan de una clase object
    public static void main(String[] args) {
        Persona persona1= new Persona();
        persona1.nombre="Juan";
        System.out.println("persona1 nombre= " + persona1.nombre);
        cambiarValor(persona1); //se cambiara xq va a la memoria Heap y pilla la referencia y cambia el valor
        System.out.println("persona1 nombre= " + persona1.nombre);
        
        //con return
        persona1=cambiarValorReturn(persona1);
        System.out.println("persona1 con return = " + persona1.nombre);
    }
    
    public static void cambiarValor (Persona persona){ //es comun que los argumentos se llamen igual de la clase diferenciandose con mayus y minus
        persona.nombre="Rebeca";
    }
    
    
    //RETURN, siempre va en ultima linea
    public static Persona cambiarValorReturn (Persona persona){ //es comun que los argumentos se llamen igual de la clase diferenciandose con mayus y minus
        if (persona==null){
            return null; //retorna Rebeca
        }
        //persona.nombre="Maria";
        return persona; //si se quita comentario retorna el nombre de Maria
    }
    
    
}
