
package domain;

/**
 *
 * @author Rebeca
 */

//LAS CLASES HIJAS DEFINEN EL COMPORTAMIENTO DEL METODO DE LA CLASE PADRE
public abstract class FiguraGeometrica {
    protected String tipoFigura;
    
    protected FiguraGeometrica(String tipoFigura){
        this.tipoFigura=tipoFigura;
    }
    
    public abstract void dibujar();//no se abre y cierra parentesis en metodos abstactos

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "tipoFigura=" + tipoFigura + '}';
    }
        
    
}
