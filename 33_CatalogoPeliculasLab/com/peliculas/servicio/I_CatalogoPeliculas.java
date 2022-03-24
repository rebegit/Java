
package com.peliculas.servicio;

/**SERVICIO O NEGOCIO. tiene que ver con el uso de la palicacion, no con el acceso a datos como la otra
 *
 * @author Rebeca
 */
public interface I_CatalogoPeliculas {
    String NOMBRE_RECURSO= "peliculas.txt";
    void agregarPelicula(String nombrePelicula);
    void listarPeliculas();
    void buscarPelicula(String buscar);
    void iniciarCatalogoPeliculas();
}
