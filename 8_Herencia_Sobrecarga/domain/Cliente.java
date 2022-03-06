
package domain;

import java.util.Date;

/**
 *
 * @author Rebeca
 */
public class Cliente extends Persona{
        private int idCliente;
        private Date fechaRegistro;
        private boolean vip;
        private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion); //llamamos constructor de la clase padre
        this.idCliente=++Cliente.contadorCliente;
        this.fechaRegistro= fechaRegistro;
        this.vip= vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }

    //el setIdCliente no lo tenemos xq no se utiliza ya que no se va aodificar ese atributo una vez que se ha inicializado. se encarna el constructor para añadir el valor

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente= ").append(idCliente);
        sb.append(", fechaRegistro= ").append(fechaRegistro);
        sb.append(", vip= ").append(vip);
        sb.append(",").append(super.toString()); //imprimimos valores de clase hija y los de la clase padre
        sb.append('}');
        return sb.toString();
    }
         
         
         
         
         
         
         
}
