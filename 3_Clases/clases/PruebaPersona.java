
package clases;

/**
 *
 * @author Rebeca
 */
public class PruebaPersona {
    //el metodo main podemos hacerlo desde la clase Persona, no tiene por que hacerse en otro archivo. Es recomendable que esté en otro archivo
    public static void main(String[] args) {
        //un objeto es una instancia de una clase, y obtenemos atributos y métodos de la clase. Cada obejto es una instancia
        Persona persona1;//declaramos una variable de tipo persona    
        persona1=new Persona();
        persona1.nombre="Maria Jesus";
        persona1.apellido="Cruz";
        persona1.desplegarInformacion();
        System.out.println("-------------");
        
        Persona persona2=new Persona();
        System.out.println("persona2 = " + persona2); //se imprime nombre paquete+nombreclase+@+valorReferenciaObjeto
        System.out.println("persona1 = " + persona1); //tienen diferentes referencias al imprimirlo
        System.out.println("-------------");
        persona2.desplegarInformacion();
        persona2.nombre="Ricardo";
        persona2.apellido="Gutierrez";
        persona2.desplegarInformacion();

    }
}
