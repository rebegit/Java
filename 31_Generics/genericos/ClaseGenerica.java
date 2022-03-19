
package genericos;

/**
 *
 * @author Rebeca
 */
public class ClaseGenerica <T>{ //indicando un tipo generico
    T objeto;
    
    public ClaseGenerica(T objeto){
        this.objeto=objeto;
    }
    public void obtenerTipo(){
        System.out.println("El tipo T es: "+objeto.getClass().getSimpleName()); 
    }
            
}
