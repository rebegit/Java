package test;

import domain.Persona;

/**
 *
 * @author Rebeca
 */
public class TestForEach {
    public static void main(String[] args) {
        //for each simplifca la forma del array
        
        int edades[]={4,5,8,2,6};
         System.out.println("****FOR*****");
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edad: "+edades[i]);
        }
        
        
        //se define variable del tipo del array. Despues se pone el nombre del array que se quiere iterar
        //no se tiene un indice, para eos un foreach
        System.out.println("****FOR EACH*****");
        for( int edad: edades)
            System.out.println("edad: "+edad);
        
        
        //OBJETOS
        Persona personas[]= {new Persona("Juan"), new Persona("Ruben"), new Persona ("Maria")};
        for(Persona persona:personas){ //tipo:array
            System.out.println("persona = " + persona);
            
        }
        
    }
}
