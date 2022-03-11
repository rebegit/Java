package test;

import enumeracion.Continentes;
import enumeracion.Dias;

/**
 *
 * @author Rebeca
 */
public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: "+Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);
        System.out.println("********");
        System.out.println("Continente nº4: "+Continentes.AMERICA);
        System.out.println("Numero de paises en el 4º continente: "+Continentes.AMERICA.getPaises());
    }
    
    public static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("primer dia");
                break;
            case MARTES:
                System.out.println("segundo dia");
                break;
            case MIERCOLES:
                System.out.println("tercer dia");
                break;
            default:
                
           
        }
    }
}
