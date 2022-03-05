
package clases;

/**
 *
 * @author Rebeca
 */
public class Persona { //si pulsamos control y luego nos ponemos encima de la clase, aparece Extendes (herencia) porque la estamos importando a otra
 //Atributos de la clase
    public String nombre; //se pone public para para que se acceda desde otro paquete. No es buena práctica, mejor encapsulamiento que se ve más adelante.
    public String apellido;
    
    //Metodos de la clase
    public void desplegarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        
    }
   
}
