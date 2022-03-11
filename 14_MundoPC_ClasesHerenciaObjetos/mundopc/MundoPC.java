
package mundopc;

import com.dominio.mundopc.*;


/**
 *
 * @author Rebeca
 */
public class MundoPC {
    public static void main(String[] args) {
         Pantalla pantallaHP = new Pantalla("HP", 13);
         Teclado tecladoHP =new Teclado ("bluetooth", "HP");
         Raton ratonHP= new Raton("bluetooth", "HP");
         Ordenador ordenadorHP= new Ordenador("Nuevo Ordenador HP", pantallaHP, tecladoHP, ratonHP);
         
         Pantalla pantallaGamer = new Pantalla("Gamer", 34);
         Teclado tecladoGamer =new Teclado ("bluetooth", "Gamer");
         Raton ratonGamer= new Raton("bluetooth", "Gamer");
         Ordenador ordenadorGamer= new Ordenador("Nuevo Ordenador Gamer", pantallaGamer, tecladoHP, ratonGamer);
         
         Orden orden1= new Orden();
         orden1.agregarOrdenador(ordenadorHP);
         orden1.agregarOrdenador(ordenadorGamer);
         
         orden1.mostrarOrden();
    }
}
