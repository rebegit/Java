
package com.dominio.ventas.test;

import com.dominio.ventas.Orden; //con * se importan todas las clases: orden y producto
import com.dominio.ventas.Producto;

/**
 *
 * @author Rebeca
 */
public class VentasTest {
    public static void main(String[] args) {
       Producto producto1= new Producto("camisa" ,50.00);
       Producto producto2= new Producto("pantalon" ,70.00);
       Producto producto3= new Producto("calcetines" ,10.00);
       Producto producto4= new Producto("jersey" ,45.00);
       Producto producto5= new Producto("gorro" ,15.00);
       Producto producto6= new Producto("sudadera" ,70.00);
       Producto producto7= new Producto("abrigo" ,80.00);
       Producto producto8= new Producto("pantalon" ,55.00);
       Producto producto9= new Producto("camiseta" ,40.00);
       Producto producto10= new Producto("calcetines" ,10.00);
       Producto producto11= new Producto("abrigo" ,100.00); //no se mostrará
       
       
       Orden orden1= new Orden();
       orden1.agregarProducto(producto1);
       orden1.agregarProducto(producto2);
       orden1.agregarProducto(producto3);
       orden1.agregarProducto(producto4);
       orden1.agregarProducto(producto5);
       orden1.agregarProducto(producto6);
       orden1.agregarProducto(producto7);
       orden1.agregarProducto(producto8);
       orden1.agregarProducto(producto9);
       orden1.agregarProducto(producto10);
       orden1.agregarProducto(producto11); //no se mostrará
       orden1.mostrarOrden();
       
       
       Orden orden2= new Orden();
       orden2.agregarProducto(producto11);
       orden2.agregarProducto(producto4);
       orden2.agregarProducto(producto2);
       orden2.mostrarOrden();
    }
}
