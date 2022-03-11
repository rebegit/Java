
package domain;

/**
 *
 * @author Rebeca
 */

/*
bloques de inicializacion: se ejecutan antes del constructor de la clase
- ESTATICOS
- NO ESTATICOS (DINAMICOS)
no son comunes pero se deben conocer y saber en que orden funcionan. Lo comun es definir los atributos en el constructor
*/
public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    static { 
        //esto es un bloque d codigo de inicializacion estático. Se ejcuta antes del constructor y del no estatico
        //se ejecuta la primera vez cada vez que se carga en memoria la clase
        System.out.println("EJECUCION BLOQUE ESTATICO");
        ++Persona.contadorPersonas;
        //idPersona=10; esto no s epuede xq esta variable es no estatica
    }
    {
        //esto es un bloque de inicializacion no estatico y se ejecuta antes del constructor de la clase
        //se ejecuta cada vez que se crea un nuevo objeto
        System.out.println("EJECUCION BLOQUE NO ESTÁTICo");
        this.idPersona=Persona.contadorPersonas;
    }
    public Persona(){
        System.out.println("EJECUCION DEL CONSTRUCTOR");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
