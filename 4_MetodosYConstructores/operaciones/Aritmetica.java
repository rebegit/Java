
package operaciones;

/**
 *
 * @author Rebeca
 */
public class Aritmetica {
    //clase mayuscula
    //atributo o metodo minuscula  
    
    //Atributos de la clase
    int a;
    int b;

    //Metodo
    public void sumar(){ //para acceder a este metodo desde otras clases. Cuando se pone void no regresa ninguna información
        int resultado = a + b;
        System.out.println("resultado sumar= " + resultado);
    } 
    public void multiplicar(){ 
        int resultado = a * b;
        System.out.println("resultado multiplicar= " + resultado);
    } 
    
     public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return a + b;
    }
    
    public int multiplicarConRetorno(){
//        int resultado = a * b;
//        return resultado;
        return a * b;
    }
    
    public int sumarConArgumentos(int arg1, int arg2){ //argumentos o parametros
        a = arg1; //se puede usar this, se usa en el siguiente metodo con el de multiplicar
        b = arg2;
        //return a + b;
        return sumarConRetorno();
    }
    
    public int multiplicarConArgumentos(int a, int b){ 
        //el argumento lo llamo igual que el atributo de la clase, por eos puede causar confusión y por ello utilizamos this
        this.a = a; //solo existe dentro de esta clase y apunta al objeto que se ejecuta en ese momento. Quiere decir que es un atributo de nuestra clase; no es una variable local
        this.b = b; //El argumento b se asigna al atributo this.b
        return this.multiplicarConRetorno();
    }
    
}
