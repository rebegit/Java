
package palabrathis;

/**
 *
 * @author Rebeca
 */


//solo una clase de tipo publico
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona= new Persona("Juan", "Perez");
        System.out.println("persona = " + persona); //muestra: persona = palabrathis.Persona@15aeb7ab (paquete+clase+referencia)
          System.out.println("persona = " + persona.nombre); 
            System.out.println("persona = " + persona.apellido); 
          
    }
}


//se puede utilizar desde otras clases debido a que estamos en el mismo paquete. Es como contemplarlo los atributos como default o package (mas adelante se vera protected o private)
class Persona{ 
    String nombre;
    String apellido;
    
    Persona (String nombre, String apellido){ //ES LO PRIMERO QUE SE EJECUTA, EL CONSTRUCTOR
        //aunque no se vea, hay una llamada de la clase padre usando super() . Es n constructor vacio, no se pasa ningun argumento. es el que se encarga de reservar el espacio de memoria
        //super(); llamada al constructor de la clase Padre(object)
        this.nombre=nombre;
        this.apellido=apellido;
        System.out.println("Objeto persona usando this: " + this);//misma referencia
        
        //Imprimir imprimir=new Imprimir(); es lo mismo que lo de abajo pero ahorrandonos la variable
        new Imprimir().imprimir (this); //pasamos la referencia de tipo persona al metodo
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir = " + persona );//se imprime la referencia dl obejto de la l3
        System.out.println("impresion desde el objeto actual (this) = " + this );//imprime el objeto imprimir(linea 35), no el objeto persona. Ya que es el objeto que se esta ejecutando en este momento (clase imprimir)
        
        /*el operador this va apuntando a los objetos segun los objetos que se estan ejecutando en ese momento*/
    }
}