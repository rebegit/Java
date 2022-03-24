
package com.peliculas.servicio;

import com.peliculas.datos.*;
import com.peliculas.domain.*;
import com.peliculas.excepciones.AccesoDatosEx;
import com.peliculas.excepciones.LecturaDatosEx;


/**Implementa la interface de I_CatalogoPeliculas
 *
 * @author Rebeca
 */
public class CatalogoPeliculasImpl implements I_CatalogoPeliculas{
    
    private final I_AccesoDatos datos; //INTERFACE

    public CatalogoPeliculasImpl() { //inicializa variable de datos
        this.datos= new AccesoDatosImpl(); //se puede usar otra implementacion si hubiera otra. IMPLEMENTACION
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula= new Pelicula(nombrePelicula);
        boolean anexar=false;
        try { 
            anexar= datos.existe(NOMBRE_RECURSO); //el metodo exsite tiene un try-catch en I_AccesoDatos, por eso requiere aqui un try-catch
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out); //se imprime la lista de errores
        }
    }

    @Override
    public void listarPeliculas() {
        try {
            var peliculas =this.datos.listar(NOMBRE_RECURSO);
            for (var pelicula:peliculas){
                System.out.println("pelicula = " + pelicula);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de acceso a datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPelicula(String buscar) {
        String resultado= null;
        try {
            resultado= this.datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx ex) {
          System.out.println("Error de acceso a datos");
          ex.printStackTrace(System.out);  
        }
        System.out.println("resultado = " + resultado + " -> no se encuentra le pelicula"); //si no se encuentra imprime null
    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)){ //si existe, borramos el catalogo y luego lo creamos
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            }else{
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error al iniciar catalogo de peliculas");
            ex.printStackTrace(System.out);  
        }
    }
    
}
