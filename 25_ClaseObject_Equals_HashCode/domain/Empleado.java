
package domain;

import java.util.Objects;

/**
 *
 * @author Rebeca
 */

//EQUALS Y HASHCODE AL FINAL

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

    @Override
    public int hashCode() { //hace un calculo apra generar un valor de tipo entero lo mas unico posible. El calculo varia en IDES e implementaciones
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.sueldo) ^ (Double.doubleToLongBits(this.sueldo) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) { //devuelve true o false
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) { //tipo de la clase
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.sueldo) != Double.doubleToLongBits(other.sueldo)) { //cast de tipo object a la clase hija comparando atributos
            return false;
        }
        return Objects.equals(this.nombre, other.nombre); //comprueba dos valores apra ver si son iguales, compara contenidos
    }
    
    
}
