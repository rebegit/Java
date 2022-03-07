
package test;

import domain.Persona;

/**
 *
 * @author Rebeca
 */
public class TestMatrices {
    public static void main(String[] args) {
        //una declaracion
        int edades[][]= new int [3][2]; //3 lineas x 2 columnas
        System.out.println("edades = " + edades);
        
        edades[0][0]=5;
        edades[0][1]=2;
        edades[1][0]=4;
        edades[1][1]=8;
        
        System.out.println("edades 0-0 = " + edades[0][0]);
        System.out.println("edades 1-1 = " + edades[1][1]);
        
        //se iteran con el ciclo for anidado. Primero por lineas y luego por columnas
        for (int linea=0; linea<edades.length; linea++){
            for (int col=0; col<edades[linea].length; col++){
                System.out.println("edad "+linea+"-"+col+": "+edades[linea][col]);
            }
        }
        System.out.println("--------------");
        
        //otra declaracion
        String frutas[][]={{"naranja","limon"},{"platano","uva"},{"mora","fresa","pera"}}; //no tienen por que ser cuadradas =2,2,3
        for (int linea=0; linea<frutas.length; linea++){
            for (int col=0; col<frutas[linea].length; col++){
                System.out.println("fruta "+linea+"-"+col+": "+frutas[linea][col]);
            }
        }
        
        
        Persona personas[][]= new Persona [2][3];
        personas[0][0]=new Persona ("Juan");
        personas[0][1]=new Persona ("Rodrigo");
        personas[0][2]=new Persona ("Pepe");
        personas[1][0]=new Persona ("Juana");
        personas[1][1]=new Persona ("Rodriga");
        personas[1][2]=new Persona ("Pepa");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz [][]){
        for (int linea=0; linea<matriz.length; linea++){
            for (int col=0; col<matriz[linea].length; col++){
                System.out.println("matriz "+linea+"-"+col+": "+matriz[linea][col]);
            }
        }
    }

}