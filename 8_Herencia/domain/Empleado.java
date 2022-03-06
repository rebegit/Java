
package domain;

/**
 *
 * @author Rebeca
 */
public class Empleado extends Persona{ //extends e indicar la clase padre para Herencia. No se puede meter varias herencias como en Python
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(String nombre, double sueldo) {
        super(nombre);//llamada al constructor de la clase padre
        this.idEmpleado=++Empleado.contadorEmpleado;
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
