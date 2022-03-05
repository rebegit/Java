
package pasoporvalor;

/**
 *
 * @author Rebeca
 */
public class PasoPorValor {
    public static void main(String[] args) {
        var x=10;
        System.out.println("x = " + x);
        cambioValor(x);
         System.out.println("x nuevo valor = " + x); //es el mismo, no cambia a diferencia de si fuera un objeto (mirar PasoPorReferencia
    }
    
    //como estamos dentro de un metodo estatico todos los metodos que llamemos a llamar desde el metodo main tienen que ser estaticos
    //recibe una copia del valor primitivo
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1=16;
        System.out.println("arg1 = " + arg1);
    }
    
    
}
