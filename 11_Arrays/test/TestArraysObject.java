
package test;

import domain.Persona;

/**
 *
 * @author Rebeca
 */
public class TestArraysObject {
     public static void main(String[] args) {
        Persona personas[] = new Persona[2]; 
        
        //una declaracion
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");
        
        System.out.println("personas 0= " + personas[0]);
        System.out.println("personas 1= " + personas[1]);
        
        System.out.println("-----------");
        for (int i=0; i<personas.length; i++){
            System.out.println("personas indice " +i+"="+ personas[i]);
        }   
        System.out.println("-----------");
        
         //otra declaracion
        String frutas[]={"Piña","Coco", "Naranja", "Platano"};
        for(int i=0; i<frutas.length; i++){
            System.out.println("frutas " +i+"="+ frutas[i]);
        }
        
        
        }
}
     
     
