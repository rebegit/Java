package domain;

import java.io.Serializable;



/**
 *
 * @author Rebeca
 */

//para que sea javabeans= serializable, atributos privados, constructor vacio y publico al menos, getters and setters. El resto es opcional
public class PersonaBean implements Serializable{
    //es la transformación de un objeto en una secuencia de bytes que pueden ser posteriormente leídos para reconstruir el objeto original
    //signifcia que se conveierta el objeto a 0 y 1, y cuando se recibe del otro lado del servidor se aplica la Deserializacion
    
    private String nombre;
    private String apellido;

    public PersonaBean() {
    }

    public PersonaBean(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "PersonaBean{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
}
