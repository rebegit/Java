
package test;

import domain.Gerente;

/**
 *
 * @author Rebeca
 */
public class TestSobrescritura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Eduardo", 1000.99, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
    }
}
