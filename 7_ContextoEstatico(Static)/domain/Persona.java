
package domain;

/**
 *
 * @author Rebeca
 */
public class Persona {

    private int idPersona; //identificador unico por cada objeto creado
    private String nombre;
    private static int contadorPersonas; //se asocia con la clase y no con los objetos, por eso se podra ir incrementando el idPersona
    /*si no fuera static, la variable del contador persona se reinicia con cada objeto que se crea,
    por tanto, static es una variable que se asocia con la clase y no con los objetos*/
    
    public Persona(String nombre){
        this.nombre=nombre;
        //Incrementar el contador por cada objeto nuevo
    //this.contadorPersonas++; //no se recomienda porque es una variable de tipo static. Ya que se asocian con la clase. Por tanto se usa la referencia de la clase:
    
    Persona.contadorPersonas++;//es opcional poner el nombre de la clase Persona para acceder al atributo estatico, pero se recomienda para que no se confunda con variable local. El this es para atributos no estáticos
    //asigamos el nuevo valor a la variable idPersona
    this.idPersona= Persona.contadorPersonas;
    }

    //click derecho-insert code-getters and setters, toString....
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override //anotacion, agrega informacion extra. indica que se esta sobrescribiendo
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
}
