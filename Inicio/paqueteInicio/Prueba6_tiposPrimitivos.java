package paqueteInicio;



/**
 *
 * @author Rebeca
 */
public class Prueba6_tiposPrimitivos {
    public static void main(String args[]) {
        /*
            tipos primitivos enteros: byte, short, int, long
         */
       
     //byte numeroByte =  129; // no te deja xq es de tamaño mayor
        byte numeroByte = (byte) 129; // conversion, indicar que ese valor numerico de tipo entero a typo byte, se mostrara -129 xq es lo q puede soportar, x eso daba error en la anterior linea
        System.out.println("Valor byte:" + numeroByte); 
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE); //las clases se inician con mayusculas
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
        
        short numeroShort = (short)32768; //riesgo de perdida de precision, como el anterior, por eso se mostrará negativo, pierde informacion
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Valor minimo short:" + Short.MIN_VALUE);
        System.out.println("Valor maximo short:" + Short.MAX_VALUE);
        
        int numeroInt = (int)2147483648L; //se cambia a negativo por perdida de informacion
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo int:" + Integer.MIN_VALUE);
        System.out.println("Valor maximo int:" + Integer.MAX_VALUE);
        
        long numeroLong = 922337203685477580L; //es necesario poner una L. si se le añade uno más, se supera y se debe pasar a float o double
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Valor minimo long:" + Long.MIN_VALUE);
        System.out.println("Valor maximo long:" + Long.MAX_VALUE);
        System.out.println("----------------------------------------------------------");
        
         /*
            tipos primitivos de tipo flotante: float y double
        */
        
        float numeroFloat = (float)3.4028235E38D;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo tipo float: " + Float.MIN_VALUE);
        System.out.println("Valor maximo tipo float: " + Float.MAX_VALUE);
        
        double numeroDouble = 1.7976931348623157E308; //Double es el tipo de dato que puede tener los mayores valores
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo tipo double: " + Double.MIN_VALUE);
        System.out.println("Valor maximo tipo double: " + Double.MAX_VALUE);
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        
        /*
            indiferencia de Tipos con Var y tipos Primitivos
        */
        //DEBUG= se pincha fuera a la izquierda y sale linea roja+boton drecho debug file+F8 para pasar de linea+ f5 termina ejecucion
        var numeroEntero = 10;
        System.out.println("numeroEntero = " + numeroEntero);
        
        var numDouble= 10.0;
        System.out.println("numeroDouble = " + numeroDouble);
        
        var numFloat = 10.0F; //sin la F del final se reconoceria como tipo Double
        System.out.println("numeroFloat = " + numeroFloat);
    }
}
