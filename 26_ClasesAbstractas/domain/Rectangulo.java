
package domain;

/**
 *
 * @author Rebeca
 */
public class Rectangulo extends FiguraGeometrica {
    //se  tienen que implementar todos los metodo abstractos o definir esta clase como 
    
    public Rectangulo(String tipoFigura){
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se imprime un: " + this.getClass().getSimpleName()); //getClass para el tipo de la clase y el getSimpleName para imprimir el nombre de la clase
    }
}

