
package operaciones;

/**
 *
 * @author Rebeca
 */
public class Operaciones {
    //sobrecarga es poner 2 o mas metodos que se llaman igual pero la diferencia esta en la cantidad ed argumentos
    public static int sumar (int a, int b){
        System.out.println("sumar (int a, int b)");
        return a+b;
    }
    public static double sumar (double a, double b){
        System.out.println("sumar (double a, double b)");
        return a+b;
    }
}
