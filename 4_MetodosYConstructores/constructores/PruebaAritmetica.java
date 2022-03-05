package constructores;

/**
 *
 * @author Rebeca
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
               
        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);
        
        Aritmetica aritmetica3 = new Aritmetica();
        System.out.println("aritmetica3 a:" + aritmetica3.a);
        System.out.println("aritmetica3 b:" + aritmetica3.b);
        
        Aritmetica aritmetica2 = new Aritmetica(5, 8); //control+espacio en los parentesis para saber que va
        System.out.println("aritmetica2 a:" + aritmetica2.a);
        System.out.println("aritmetica2 b:" + aritmetica2.b);
    }
}
