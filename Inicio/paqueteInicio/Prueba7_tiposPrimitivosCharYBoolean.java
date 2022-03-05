package paqueteInicio;


/**
 *
 * @author Rebeca
 */
public class Prueba7_tiposPrimitivosCharYBoolean {
    //ver los caracteres Unicode. Hay mas de 140 mil
     public static void main(String args[]) {
         //ver diferencias entre char y var
        char miCaracter = 'a';
        System.out.println("miCaracter = " + miCaracter);
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        
        var varChar1 = '\u0021';
        System.out.println("varChar1 = " + varChar1);
        
        var varCharDecimal2 = 33;
        System.out.println("varCharDecimal2 = " + varCharDecimal2);
        
        var varCharSimbolo3 = '!';
        System.out.println("varCharSimbolo3 = " + varCharSimbolo3);
        
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        int letra = 'A';
        System.out.println("letra = " + letra);
        
         System.out.println("------------------------------------------------");
        
         //BOOLEANOS
       boolean varBoolean = true;
       System.out.println("varBoolean = " + varBoolean);
        
       if(varBoolean){
           System.out.println("La bandera es verdadera");
       } 
       else{
           System.out.println("La bandera es falsa");
       }
       
       var edad = 10;
       //var esAdulto = edad >= 18;
       if( edad >= 18 ){
           System.out.println("Eres mayor de edad");
       }
       else{
           System.out.println("Eres menor de edad");
       }
    }
}
