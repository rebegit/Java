
package Bucles;

/**
 *
 * @author Rebeca
 */
public class P5_EtiquetasLabels { 
    //va hacia un lugar especifico del programa. No es conveniente porque puede romper con la lógica del programa. es mas útil cuando hay for anidados
    public static void main(String[] args) {
        inicio: 
        for( var contador = 0 ; contador < 3 ; contador++ ){
            if( contador % 2 != 0){
                continue inicio;//ir a la linea de codigo de la etiqueta
            }   
            System.out.println("contador = " + contador);
        }
    }
}
