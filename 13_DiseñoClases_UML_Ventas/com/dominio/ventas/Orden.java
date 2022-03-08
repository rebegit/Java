
package com.dominio.ventas;

/**
 *
 * @author Rebeca
 */
public class Orden {
        private int idOrden;
        private Producto productos[];
        private static int contadorOrdenes;
        private int contadorProductos; //para contar productos que se agregan
        private static final int MAX_PRODUCTOS=10;

    public Orden() {
        this.idOrden=++Orden.contadorOrdenes;
        this.productos=new Producto[Orden.MAX_PRODUCTOS];
    }
        
    public void agregarProducto(Producto producto){
        if(this.contadorProductos<Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++]= producto; //this. es para que se sepa de manera inmediata que son atributos de la clase
        }else{
            System.out.println("¡¡Se ha superado el maximo de productos!! "+ Orden.MAX_PRODUCTOS);
        }
    }
      
    
    public double calcularTotal(){
        double total=0;
        for (int i = 0; i < this.contadorProductos; i++) {
            //Producto producto= this.productos[i];
            //total += producto.getPrecio(); //total=total+producto.getPrecio()
            total += this.productos[i].getPrecio(); /*lo mismo que las dos lineas juntas anteriores en comentario*/
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("***********");
        System.out.println("Id Orden"+this.idOrden);
        double totalOrden= this.calcularTotal();
        System.out.println("total de la Orden = €" + totalOrden);
        System.out.println("Productos de la orden:");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]); //imprime objeto de tipo producto. Debido a que la clase Producto implementa el metodo toString entonces se imprime el detalle del objeto
        }
        System.out.println("***********");
    }
}
