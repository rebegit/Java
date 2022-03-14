package paquete1;

import paquete1.Clase1;


/**
 *
 * @author Rebeca
 */


//DEFAULT O PROTECTED
//public class TestModificadoresAccesoDefault_Private{
//    public static void main(String[] args) {
//        Clase1 clase1 = new Clase1(); //no hace extends de ninguna clase, solo esta en el mismo paquete
//        clase1.atributoDefault = "Cambio desde la prueba";
//        System.out.println("clase1 atributo default = " + clase1.atributoDefault);
//        clase1.metodoDefault();
//    }
//}

//PRIVATE
public class TestModificadoresAccesoDefault_Private{
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("Publico");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
        clase1.setAtributoPrivado("cambio valor atributo");
        System.out.println("clase1 = " + clase1.getAtributoPrivado());
    }
}