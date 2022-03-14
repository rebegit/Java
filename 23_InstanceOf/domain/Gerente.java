
package domain;

/**
 *
 * @author Rebeca
 */
public class Gerente extends Empleado{
        
        private String departamento;
        
        public Gerente (String nombre, double sueldo, String departamento){
            super(nombre, sueldo); 
            this.departamento= departamento;
        }
        
    //se sobrescribe el metodo de la clase padre
    @Override //ponerlo para indicar  que es una anotacion,
    public String obtenerDetalles(){
        return super.obtenerDetalles()+ ", departamento: "+ this.departamento;
    }    

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    
}
