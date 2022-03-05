package paqueteInicio;


/**
 *
 * @author Rebeca
 */
public class Prueba2_variables {
    public static void main(String args[]){ 
        int miVar=10;
        System.out.println(miVar); //sout para imprimir
        
        miVar=5;
        System.out.println(miVar);
        
        String varCadena= "una cadena";
        System.out.println(varCadena);
        
        //ctrl+espacio para seleccionar variable
        //shift+f6 refrescar
        
        varCadena= "otra cadena diferente";
        System.out.println(varCadena);
        
        //var - indiferencia de tipos en Java. Es necesario estar dentro de un método, como el void main en este caso
        var variable=15;
        System.out.println(variable);
        
        var variableCadena="nueva cadena";
        System.out.println("variableCadena = " + variableCadena); //soutv
        
        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomienda utilizar
        //var #miVariable = 2; no se permite utilizar caracteres especiales
    }
}
