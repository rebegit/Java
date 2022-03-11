
package enumeracion;

/**
 *
 * @author Rebeca
 */
public enum Continentes {
    AFRICA(53),//53 paises por ejemplo
    //puede haber mas atributos definidos: AFRICA(53, "1.2 billones")
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    private final int paises;
    
    //se define un constructor igual que la enumeracion

    private Continentes(int paises) {
        this.paises = paises;
    }
    
    //como es set no se puede moficiar el valor, solo se puede recuperar. 
    public int getPaises(){
        return this.paises;
    }
     
}
