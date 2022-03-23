
package manejoarchivos;

import java.io.*;//io=imput/output
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Rebeca
 */
public class ManejoArchivos {
    //se agregan metodos estaticos para no tener encesidad de crear objeto de la clase
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo); //se crea un objeto de tipo File en memoria
        try { //se mete de manera automatica el try catch al escribir la linea de abajo
            //para guardar arhivo en disco:
            PrintWriter salida= new PrintWriter(archivo); //hay que meter excepcion!!
            salida.close();//se crea archivo
            System.out.println("Se ha creado el archivo!!!!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo); 
        try { 
            PrintWriter salida= new PrintWriter(archivo); 
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha escrito al archivo!!!!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void anexarArchivo(String nombreArchivo, String contenido){
        File archivo = new File(nombreArchivo); 
        try { 
            PrintWriter salida= new PrintWriter(new FileWriter(archivo, true)); //si es true dice que se anexa informacion. //añadir el catch nuevo
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha anexado informacion al archivo!!!!");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);        }
    }
    
    public static void leerArchivo(String nombreArchivo){
        var archivo= new File(nombreArchivo);
        try {
            BufferedReader entrada= new BufferedReader( new FileReader(archivo));//se pueden leer lineas completas del archivo ya que FileReader no lee lineas completas
            var lectura= entrada.readLine();
            //para leer linea a linea
            while(lectura!=null){
                System.out.println("lectura = " + lectura);
                lectura=entrada.readLine();
            }
            entrada.close();//para que se cierre el flujo
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);        
        } catch (IOException ex) {
            ex.printStackTrace(System.out);      
        }
    }
}
