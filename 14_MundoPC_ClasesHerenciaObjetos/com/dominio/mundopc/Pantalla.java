
package com.dominio.mundopc;

/**
 *
 * @author Rebeca
 */
public class Pantalla {
    private final int idPantalla;//para tener identificador unico por cada objeto creado
    private String marca;
    private double tamanio; //puede dar error el uso de ñ
    private static int contadorPantallas;
    
    private Pantalla(){ //constructor provado vacio que se encarga de inicializar la variable
         this.idPantalla=++Pantalla.contadorPantallas;
    }
    public Pantalla(String marca, double tamanio){
        this(); // se llama a constructor privado para que se inicialice idPantalla
        this.marca=marca;
        this.tamanio=tamanio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

   //get de idPantalla
    public int getIdPantalla(){
        return this.idPantalla;
    }

    @Override
    public String toString() {
        return "Pantalla{" + "idPantalla=" + idPantalla + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }

    
}
