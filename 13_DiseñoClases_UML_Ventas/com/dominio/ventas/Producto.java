
package com.dominio.ventas;

/**
 *
 * @author Rebeca
 */
public class Producto {
    private final int idProducto; //para que no se modifique una vez establecido el valor
    private String nombre;
    private double precio;
    
    private static int contadorProductos;
    
    private Producto(){
        this.idProducto=++Producto.contadorProductos;
    }
    public Producto(String nombre, double precio){
        this(); //para llamar al constructor privado de la clase. se obtiene que se inicialice la variable idProducto
        this.nombre=nombre;
        this.precio=precio;
    }
    //getters y setters . En idProducto solo get xq el set no interesa modificar valor, ademas esta declarada como final

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
