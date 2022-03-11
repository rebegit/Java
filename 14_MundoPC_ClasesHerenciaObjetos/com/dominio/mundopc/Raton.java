
package com.dominio.mundopc;

/**
 *
 * @author Rebeca
 */
public class Raton extends DispositivoEntrada{
    private final int idRaton;
    private static int contadorRatones;
    
    //automaticamente hay que agregar un constructor de 2 argumentos ya que si la clase padre tiene un constructor de 2 argumentos se llamará a este
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); //llamamos al constructor de la clase padre
        this.idRaton=++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + ","+ super.toString()+'}';//imprime informacion del objeto Raton y los atributos de Dispositivoentrada
    }
    
    
}
