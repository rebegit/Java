package test;

//import com.dominio.*;
//import com.dominio.Utileria;
//import static com.dominio.Utileria.imprimir;

/**
 *
 * @author Rebeca
 */

public class TestUtileria {
    public static void main(String[] args) {
        
        //diferentes formas de usar metodo estatico imprimir de otro paquete:
        //Utileria.imprimir("Saludos");
        //imprimir("Adios");
        mx.com.dominio.Utileria.imprimir("adios");
    }
}
