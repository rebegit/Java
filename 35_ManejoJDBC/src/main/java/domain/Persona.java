
package domain;

/**
 *
 * @author Rebeca
 */
//Es entidad,  xq tiene una entidad en la bbdd
//Clase que representa un registro de la tabla Persona de la bbdd
public class Persona {
    private int idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
     
        
    //sobrecargar el constructor solo con atributo idPersona
    public Persona(int idPersona) {
        this.idPersona = idPersona;
    }

    //sin idPersona
    public Persona(String nombre, String apellidos, String email, String telefono) {
        this.nombre = nombre;
        this.apellido = apellidos;
        this.email = email;
        this.telefono = telefono;
    }
    
    //para cuando se modifique
    public Persona(int idPersona, String nombre, String apellidos, String email, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellidos=" + apellido + ", email=" + email + ", telefono=" + telefono + '}';
    }
    
    
}
