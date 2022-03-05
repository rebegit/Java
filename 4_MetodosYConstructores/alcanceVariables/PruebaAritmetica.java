package alcanceVariables;

public class PruebaAritmetica {
    
    //variables locales= MEMORIA STACK
    //objetos y atributos= MEMORIA HEAP
    public static void main(String[] args) { //¡al ser estatico solo puede llamar a metodos estaticos!
        
        //Variables locales
        //var solo es para variables locales, no para clase ni dentro de argumentos de un metodo
        var a=10;
        var b=2;
        otroMetodo();
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica2 a:" + aritmetica2.a);
        System.out.println("aritmetica2 b:" + aritmetica2.b);
      
    }
    
    //aqui no se puede introducir una variable creada en otro metodo
    public static void otroMetodo(){ //para ser llamado desde el metodo main
        System.out.println("***otro metodo****");
    }
    
    
}
