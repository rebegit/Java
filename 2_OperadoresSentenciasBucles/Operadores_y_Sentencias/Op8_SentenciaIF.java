package Operadores_y_Sentencias;


/**
 *
 * @author Rebeca
 */
public class Op8_SentenciaIF {
    public static void main(String args[]) {
        var condicion = true;

        if (condicion) {
            System.out.println("Condicion verdadera");
        } else {
            System.out.println("Condicion falsa");
        }
        
        System.out.println("--------------------------");
        
        
         var numero = 5;
        var numeroTexto = "Numero desconocido";
        
        if( numero == 1 ){
            numeroTexto = "Numero uno";
        }
        else if( numero == 2 ){
            numeroTexto = "Numero dos";
        }    
        else if( numero == 3 ){
            numeroTexto = "Numero tres";
        }
        else if( numero == 4){
            numeroTexto = "Numero cuatro";
        }
        else{
            numeroTexto = "Numero no encontrado";
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
    }
}
