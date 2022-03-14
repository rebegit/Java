
package paquete1;

//import paquete1.Clase1; lo comento porque lo cambio a paquete1 para prueba de Default o Package

import paquete1.*;


/**
 *
 * @author Rebeca
 */



//DEFAULT O PACKAGE
//public class ClaseHijaDefault_Private extends Clase1 {
//    
//    public ClaseHijaDefault(){
//        super();
//        this.atributoDefault = "Modificacion atributo default";
//        System.out.println("atributoDefault = " + this.atributoDefault);
//        this.metodoDefault();
//    }
//}

//PRIVATE
public class ClaseHijaDefault_Private extends Clase1 {

    public ClaseHijaDefault_Private(String argumento) {
        super("Publico"); //se manda cualquier parametro para que se use el constructor publico 
        //this.atributoPrivado = "Modificacion atributo privado";
        //this.metodoPrivado();
    }
    
}