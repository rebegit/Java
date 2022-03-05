
package operaciones;

/**
 *
 * @author Rebeca
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        
        aritmetica1.sumar();
        System.out.println("----------");
        aritmetica1.multiplicar();
        System.out.println("----------");
        int resultadosum = aritmetica1.sumarConRetorno(); //F7 para ver el metodo de la clase, luego F8 para regresar y seguir
        System.out.println("resultado retorno = " + resultadosum);
        System.out.println("----------");
        int resultadomulti = aritmetica1.multiplicarConRetorno();
        System.out.println("resultado retorno = " + resultadomulti);
        
        
        System.out.println("----------");
        var resultadoArgsum = aritmetica1.sumarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultadoArgsum);
        System.out.println("----------");
        var resultadoArgmul = aritmetica1.multiplicarConArgumentos(5, 8);
        System.out.println("resultado usando argumentos = " + resultadoArgmul);
    }
}
