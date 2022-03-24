/* 
interface
puede almacenarse en un archivo, bbdd o en cualquier otra forma
 */
package com.peliculas.datos;

import com.peliculas.domain.Pelicula;
import com.peliculas.excepciones.*;
import java.util.List;

/**
 *
 * @author Rebeca
 */
public interface I_AccesoDatos {
    //metodos de la interface
    boolean existe (String nombreRecurso) throws AccesoDatosEx;//revisa si existe recurso y muestra Excepcion. Las interfaces no implementan los metodos, solo definen lo que las clases deben implementar

    List<Pelicula> listar (String nombreRecurso) throws LecturaDatosEx; //retorna lista objetos tipo pelicula
   
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;
    void crear (String nombreRecurso) throws AccesoDatosEx;
    void borrar (String nombreRecurso) throws AccesoDatosEx;
       
    
}
