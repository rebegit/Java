
package domain;

/**
 *
 * @author Rebeca
 */
public class Jardinero extends Empleado {
    /*Como el metodo de la clase padre Empleado se marcó como final nos indica que no podemos sobreescribir el metodo imprimir*/
    public void imprimir(){ 
        System.out.println("Metodo imprimir desde clase hija");
    }
}
