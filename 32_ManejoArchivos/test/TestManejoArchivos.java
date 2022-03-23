
package test;

import static manejoarchivos.ManejoArchivos.*;

/**
 *
 * @author Rebeca
 */
public class TestManejoArchivos {
    public static void main(String[] args) {
        var nombreArchivo= "prueba.txt";
        /*RUTAS
        windows: c:\\carpeta\\prueba.txt
        mac o linux: /carpeta/prueba.txt
        */
        crearArchivo(nombreArchivo);
        escribirArchivo(nombreArchivo, "Hola desde Java. Se esta escribiendo un archivo");
        escribirArchivo(nombreArchivo, "Se esta sobrescribiendo");
        
        anexarArchivo(nombreArchivo, "Nueva informacion");
        leerArchivo(nombreArchivo);
    }
}
