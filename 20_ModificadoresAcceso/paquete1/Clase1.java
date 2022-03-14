
package paquete1;

/**
 *
 * @author Rebeca
 */

/*public= la clase puede ser utiliza en otra clase en el mismo paquete o en otro externo
Se accede a cada uno de los elementos desde otra clase sin restricciones: atributos, metodos, constructores

protected: No a las clases. se podra acceder desde las clases hijas. Se puede usar desde otras clases en otros paquetes

default o package: la clase hija definida fuera del paquete de la clase padre no puede usarse. Dentor del mismo paquete

private: no funciona en clases. el atributo privado quiere decir que no se puede modificar su valor desde otras clases
LO MAS RECOMENDABLE ES ENCAPSULAR POR CUMPLETO LOS ATRIBUTOS: USAR MODIFICADOR PRIVATE. SI SE QUIERE USAR HERENCIA, LO MEJOR ES PROTECTED
*/


//PUBLIC + PROTECTED
//public class Clase1 {
//    public String atirbutoPublico ="Valor atributo publico";
//    
//    protected String atirbutoProtected ="Valor atributo protected";
//    
//    public Clase1(String argumento){
//        System.out.println("Constructor Publico"); //funciona. se manda a llamar cuanso se crea el objeto
//    }
//    
//    protected Clase1(){
//        
//    }
//    public void metodoPublico(){
//        System.out.println("Metodo publico");
//    }
//    
//    protected void metodoProtected(){
//        System.out.println("Metodo protected");
//    }
//}


//DEFAULT O PACKAGE
//class Clase1 { //default o package
//    String atributoDefault = "Valor atributo default";
//    
//    Clase1(){
//        System.out.println("Constructor default");
//    } 
//    
//    void metodoDefault(){
//        System.out.println("Metodo default");
//    }
//}



//PRIVADO
class Clase1 {
    private String atributoPrivado = "Valor atributo privado";
    
    private Clase1(){
        System.out.println("Constructor privado");
    } 
    
    public Clase1(String argumento){ //cosntructor publico para crear objetos de la clase y que se vean las diferencias del constructor vacio
        this();
        System.out.println("Constructor publico");
    }
    
    private void metodoPrivado(){
        System.out.println("Metodo privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
}