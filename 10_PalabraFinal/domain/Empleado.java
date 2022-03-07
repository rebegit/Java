
package domain;

/**
 *
 * @author Rebeca
 */
public class Empleado { // extends Persona = DA ERROR
    
    
    /*una variable marcada como final se combina con la palabra static. 
    Para que se pueda llamar solo utilizando el nombre de la clase y no se podrá modificar su valor
    se pone public para que se pueda acceder
    el nombre en mayusculas para diferenciar
    */
    public final static int MI_CONSTANTE=1; //mirar en test
    
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }
}
