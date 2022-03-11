
package com.dominio.mundopc;

/**
 *
 * @author Rebeca
 */
public class Ordenador {
    private final int idOrdenador;
    private String nombre;
    private Pantalla monitor; //relación de agregación. Es decir, los objetos de tipo Pantalla pueden existir sin necesidad de objetos de tipo Ordenador
    private Teclado teclado;
    private Raton raton;
    
    private static int contadorOrdenador;
    
    private Ordenador(){
        this.idOrdenador=++Ordenador.contadorOrdenador;
    }
    public Ordenador(String nombre, Pantalla monitor, Teclado teclado, Raton raton){
        this();
        this.nombre=nombre;
        this.monitor=monitor;
        this.teclado=teclado;
        this.raton=raton;
    }
    
    //getters and setters: todos menos el atributo estático y set computadora porque solo es 1 y no se modifica
    public int getIdOrdenador() {
        return idOrdenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pantalla getMonitor() {
        return monitor;
    }

    public void setMonitor(Pantalla monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Ordenador{" + "idOrdenador=" + idOrdenador + ", nombre=" + nombre + ", monitor=" + monitor + ", teclado=" + teclado + ", raton=" + raton + '}';
    }
}
