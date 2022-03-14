
package domain;
/**
 *
 * @author Rebeca
 */

//Polimorfismo: se necesita tener el concepto de herencia y haber sobrescrito desde clase hija un metodo de la clase padre 
//Polimorfismo significa múltiples comportamientos

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
    
    
}
