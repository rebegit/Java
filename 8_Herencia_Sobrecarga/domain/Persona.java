
package domain;

/**
 *
 * @author Rebeca
 */
public class Persona {
    /*privado no se hereda a las clases hijas
    protected las clases hijas pueden
    default o package dentro del mismo paquete
    public cualquiera; no es buena practica
    */
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;

    
    //sobrecarga de constructores es que hay mas de 1 constructor, aqui hay 3 de Persona
    public Persona() {
    }
    
    public Persona(String nombre){
        this.nombre= nombre;
    }

    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//    @Override // indica que se sobrescribe el comportamiento del metodo toString de la clase padre= clase Object
//    public String toString() {
//        return "Persona{" + "nombre= " + nombre + ", genero= " + genero + ", edad= " + edad + ", direccion= " + direccion + '}';
//    }
    
    /*el codigo de arriba lo comento ya que voy a poner un toString con append para ver la direccion de memoria*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre= ").append(nombre);
        sb.append(", genero= ").append(genero);
        sb.append(", edad= ").append(edad);
        sb.append(", direccion= ").append(direccion);
        sb.append(',').append(super.toString()); //metodo toString de la clase padre, como no hay mas que la de Persona, es la clase Object. Imprime direccion de memoria de los objetos
        sb.append('}');
        return sb.toString();
    }
    
}
