
package com.dominio.mundopc;

/**
 *
 * @author Rebeca
 */

//tiene que ser publico porque se llama desde otro paquete...
public class Orden { 
    private final int idOrden;
    private Ordenador ordenadores[];
    private static int contadorOrdenes;
    private static int MAX_ORDENADORES=10;
    private int contadorOrdenadores;
    
    public Orden(){
        this.idOrden=++Orden.contadorOrdenes;
        this.ordenadores= new Ordenador[Orden.MAX_ORDENADORES];
    }
    
    public void agregarOrdenador(Ordenador ordenador){
        if (this.contadorOrdenadores<Orden.MAX_ORDENADORES){
            this.ordenadores[this.contadorOrdenadores++]=ordenador; //si no ha llegado al max, se va creando ordenadores hasta llegar al maximo
        }else{
            System.out.println("Has superado el límite: "+ Orden.MAX_ORDENADORES);
        }
    }
    public void mostrarOrden(){
        System.out.println("Orden #= " + this.idOrden);
        System.out.println("Ordenadores de la orden #"+ this.idOrden);
        for (int i=0; i<this.contadorOrdenadores; i++){
            System.out.println(this.ordenadores[i]); //como el objeto Ordenador ya tiene el metodo toString se muestran ya todos los datos
        }
    }
}
