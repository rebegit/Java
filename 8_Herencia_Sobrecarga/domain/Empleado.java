
package domain;

/**
 *
 * @author Rebeca
 */
public class Empleado extends Persona{ //extends e indicar la clase padre para Herencia. No se puede meter varias herencias como en Python
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    
    public Empleado(){ //para ver sobrecarga y llamada con this en vez de super(super comentado abajo)
        this.idEmpleado=++Empleado.contadorEmpleado; //de manera interna se llama al constructor con argumentos al constructor vacio
        /* this es para llamada interna de constructores
            super es para llamar a clase padre  segun el numero de argumentos
        */
    }
    
    public Empleado(String nombre, double sueldo) {
        //super(nombre);//llamada al constructor de la clase padre
        
        this(); //llamamos al constructor vacio de la clase Empleado. Como ya no se puede inicializar con super (quitandolo con comentario), se hace de la siguiente forma con nombre:
        this.nombre=nombre;//accediendo a atributo de clase padre
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    /*se crea un objeto de la clase StringBuilder y se usa el metodo append en vez del + para concatenar
    Se puede modificar internamente los valores, con String no se puede*/
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado); //añadimos this.para acceder a los atributps de la clase
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(", nombre=").append(this.nombre);
        //sb.append(", nombre=").append(this.getNombre()); otra opcion pero es peor
        sb.append(",").append(super.toString()); //super accede a la clase padre
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
    
    
}
