
package domain;

/**
 *
 * @author Rebeca
 */
public class Gerente extends Empleado{
        
        private String departamento;
        
        public Gerente (String nombre, double sueldo, String departamento){
            super(nombre, sueldo); // para que reciba los parametros de la clase padre
            this.departamento= departamento;
        }
        
    //se sobrescribe el metodo de la clase padre
    @Override //ponerlo para idnicar  que es una anotacion, modifica de cierta manera el comportamiento del metodo. Indica que el metodo esta siendo sobrescrito desde clase padre
    public String obtenerDetalles(){
        return super.obtenerDetalles()+ ", departamento: "+ this.departamento;
    }    
}
