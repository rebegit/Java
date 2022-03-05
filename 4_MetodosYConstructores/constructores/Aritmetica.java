package constructores;

/**
 *
 * @author Rebeca
 */
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;

     /*
    Si las clases no tienen definido ningun constructor, se crea uno por defecto llamado igual que la clase de manera automatica. 
    Por ese motivo, se crean objetos aun sin haberse creado un constructor en esta clase
    */
        
    //Constructor vacio. 
    //se crea de manera automatica siempre que no se tenga definido otro constructor. Si se elimina este en Prueba Aritmetica dara un error porque hay objetos creados con este constructor
    public Aritmetica(){ //no retornan ningun tipo de dato y pueden recibir o no argumentos
        System.out.println("Ejecutando constructor");
    }
    
    //sobrecarga de constructores:1 o más constructores. es para crear objetos desde un inicio asignando valores u omitiendo valores.
    //constructor vacio= omitiendo valores
    
    public Aritmetica(int a, int arg2){ //si se usa var no se puede porque esta permitido para definir argumentos de un metodo
        //a=a; esto no se puede porque coge el argumento que recibe dle metodo y no con el de la clase, por eso hay qu eponer this o tener otro nombre 
        this.a=a;
        b=arg2;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    
    //Metodo
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    } 
    
    public int sumarConRetorno(){
//        int resultado = a + b;
//        return resultado;
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;//El argumento a se asigna al atributo this.a
        this.b = b;
        //return a + b;
        return this.sumarConRetorno();
    }
    
}
