
package test;

import domain.Persona;

/**
 *
 * @author Rebeca
 */
public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) { //si queremos usar un metodo tb tiene que ser estatico ya que el main es estatico. Un metodo estatico llama a otro metodo estatico
        Persona persona1= new Persona("Juan");
        System.out.println("persona1 = " + persona1);
        Persona persona2= new Persona("Clara");
        System.out.println("persona2 = " + persona2);
        
                
        /*SI NO FUERA STATIC SALDRIA ESTO:
        persona1 = Persona{idPersona=1, nombre=Juan}
        persona2 = Persona{idPersona=1, nombre=Clara}*/
        
      
        System.out.println("*****");
        imprimir(persona1);
        imprimir(persona2);
        
          /*la variable this no puede estar en un metodo estatico, es en el dinamico cuando creamos objetos
        la variable si se crea fuera del metodo estatico tampoco puede ser referenciada dentro de el. Las 3 opciones darian error.
        con el metodo publico getContador si se puede acceder*/
//        this.imprimir;
//        contador=10;
//        this.contador=10;

          
    }
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);    
        }
    
    public int getContador(){ //el metodo al no ser estatico se puede acceder a la variable contador sin problema
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
