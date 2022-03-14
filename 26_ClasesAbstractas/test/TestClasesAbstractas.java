
package test;

import domain.*;

/**
 *
 * @author Rebeca
 */
public class TestClasesAbstractas {
    public static void main(String[] args) {
        //FiguraGeometrica figura = new FiguraGeometrica(); //da error porq la clase es abstacta por tanto no puede ser instanciada: no se puede crear objetos. Solo se puede trabajar con las clase shijas
        //a veces se ponen abstactas las clases para no crear objetos de esa clase
    
        FiguraGeometrica figura = new Rectangulo("Rectangulo"); //se podria pasar cualquier informacion para el tipo de figura
        //se puede asignar un tipo hijo a un tipo padre
        figura.dibujar();
        
        /*CONCEPTOS:
        polimorfismo porque coge el metodo de la clase hija en vez de la clase padre (ademas de que no se puede en la de padre al ser abstracto)
        upcasting: se asigna una referencia de tipo hijo a un tipo padre
        se implementa un metodo a partir de un metodo abstacto en clase padre
        */
    }
}
