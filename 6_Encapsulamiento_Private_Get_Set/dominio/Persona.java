
package dominio;

/**
 *
 * @author Rebeca
 */
public class Persona {
    //modificador private para que otras clases incluyendo las del mismo paquete no puedan acceder ni modificar directamente los atributos de esta clase
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre; //con operador this accedemos a los atributos de la clase
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }
    
    public String getNombre(){ //recuperar
        return this.nombre;
    }
    
    public void setNombre(String nombre){ //modificar. se recibe el parametro y se modifica el atributo.
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public boolean isEliminado(){ //en los boolean se usa is en vez de get
        return this.eliminado;
    }
    
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    
    //toString nos imprime el estado del objeto en cualquier momento. Nos imprime los valores de cada uno de los atributos del objeto
    //convierte en una cadena cada uno de los atributos de la clase
    public String toString(){
        return "Persona [nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
    }
}
