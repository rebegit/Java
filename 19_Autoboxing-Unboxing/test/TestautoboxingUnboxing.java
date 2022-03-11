package test;

/**
 *
 * @author Rebeca
 */
/*
* tiene que ver con los tipos primitivos. Cada uno de los tipos primitivos tienen una Clase Wrapper o Envolvente del tipo primitivo
int - Integer
long - Long
float - Float
double - Double
boolean - bOOLEAN
byte - Byte
char - Character
short - Short
se usan las clases envolventes en lugar de los tipos porque las clases contienen atributos y metodos. los tipos primitivos solo tienen un valor, es lo mejor para hacer calculos.
*/
public class TestautoboxingUnboxing {
    public static void main(String[] args) {
        
        //AUTOBOXING
        //int entero= 10;
        Integer entero1= 10; //ya es un objeto
        System.out.println("entero1 = " + entero1);
        System.out.println("entero1 = " + entero1.toString()); //es una cadena para hacer concatenaciones
        System.out.println("entero1 double= " + entero1.doubleValue()); //lo convertimos a double
    
    
        //UNBOXING
       int entero2= entero1; //se extrae al otro
        System.out.println("entero2 = " + entero2);
    }
}
