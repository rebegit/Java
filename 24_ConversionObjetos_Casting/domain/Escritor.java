
package domain;

import domain.Empleado;

/**
 *
 * @author Rebeca
 */
public class Escritor extends Empleado {
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura=tipoEscritura;     
    }

    @Override //indico que estoy sbrescribiendo el metodo de la clase padre
    public String obtenerDetalles(){
    return super.obtenerDetalles()+", tipoEscritura:" +tipoEscritura.getDescripcion();
    }

    //toString para que no se vea solo la referencia en memoria al imprimir, sino tb los atirbutos de la clase
    @Override
    public String toString() {
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}'+ " "+ super.toString(); //super para la info de la clase padre: nombre y sueldo
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
