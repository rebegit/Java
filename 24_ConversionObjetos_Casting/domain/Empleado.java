
package domain;
/**
 *
 * @author Rebeca
 */

public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre= nombre;
        this.sueldo=sueldo;
    }
    
    public String obtenerDetalles(){
        return "nombre: "+ this.nombre +  ", sueldo: "+ this.sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //toString para que no se vea solo la referencia en memoria al imprimir, sino tb los atirbutos de la clase
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }
    
    
}
