
import java.util.*;



/**
 *
 * @author Rebeca
 */
public class TestColeccionesGenericas {
    public static void main(String[] args) {
        
       //toda la API de Collection soporta tipos genericos
      
        System.out.println("LISTA:");
        List<String> miLista= new ArrayList<>(); //lo ideal es indicar el tipo que vamos a trabajar en nuestra lista
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Jueves");
        //tambien se puede recuperar:
        String dia =miLista.get(0);
        System.out.println("dia = " + dia);
        
        for (Object elemento: miLista){ //bombilla porque recomienda usar funciones FLECHA o tambien llamadas lambda
            System.out.println(elemento); 
        }
        System.out.println("****");
        miLista.forEach(elemento -> { //ES LO MISMO QUE FOREACH
            System.out.println(elemento);
        });
        
        
        imprimir(miLista);
        
        //-------------------------
        System.out.println("SET:");
        Set <String> miSet= new HashSet<>(); // no garantiza que se respete el orden;
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Jueves");  //¡LO DESHACE PORQUE NO PUEDEN ESTAR DUPLICADOS LOS ELEMENTOS!
        imprimir(miSet);
        
        System.out.println("MAP:");
        Map<String,String> miMapa= new HashMap<>(); //pueden ser de diferente tipo la llave y el valor
        miMapa.put("valor1", "Juan"); //se agrega llave y valor. no tiene por que ser String
        miMapa.put("valor2", "Rosa");
        miMapa.put("valor3", "Rodrigo");        
        miMapa.put("valor3", "Carlos");//se cambia el valor al ser set, no se agrega

        
        String elementoMapa = (String)miMapa.get("valor1"); //hay que convertirlo porque devuelve un tipo Objeto
        System.out.println("elementoMapa = " + elementoMapa);
        imprimir(miMapa.keySet()); //se imprimen los Set, por eso no se garantiza el orden
        imprimir(miMapa.values()); // se imprimen los valores
        
    }
    
    //POLIMORFISMO
    public static void imprimir(Collection<String> coleccion){//!!! Se puede indicar que trabaje con colecciones de tipo STRING u otro tipo
//  public static void imprimir(Collection<Object> coleccion){ //por si se quiere más generico. Tb quitando <Object>
// Si se indica que es de tipo<String> tiene metodos propios como concat... por tanto se recomienda  establecer el tipo para que no haya que hacer conversiones despues

//        for(String elemento: coleccion){ //ya puede ser String y no Object!!!
//            System.out.println("elemento = " + elemento);
//        }
        System.out.println("--------");
        coleccion.forEach(elemento -> { 
            System.out.println("elemento= "+elemento);
        });
        System.out.println("--------");
    }
}
