
package test;

import genericos.ClaseGenerica;

/**
 *
 * @author Rebeca
 */
public class TestGenerics {
    public static void main(String[] args) {
        ClaseGenerica<Integer> objetoInt= new ClaseGenerica(15);//tiene que ser ñla cñase envolvente equivalente: int=Integer
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString= new ClaseGenerica("Juan");// tienen que ser tipos compatibles
        objetoString.obtenerTipo();
    }
}
