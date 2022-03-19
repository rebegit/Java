
import java.util.*;



/**
 *
 * @author Rebeca
 */
public class TestColecciones_ListSetMap {
    public static void main(String[] args) {
        
        //COLECCIONES LISTA MANTIENEN ORDEN, LAS DE SET NO
        //las clases set y list ijmplementan el metodo add porque heredan de Collection que lo tiene
        //si no interesa guardar el orden, mejor hacer con Set puesto que la soperaciones son ams rapidas
        //en el tipo List se pueden duplicar elementos y en el Set no
      
        System.out.println("LISTA:");
        List miLista= new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Jueves");
        
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
        Set miSet= new HashSet(); // no garantiza que se respete el orden;
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Jueves");  //¡LO DESHACE PORQUE NO PUEDEN ESTAR DUPLICADOS LOS ELEMENTOS!
        imprimir(miSet);
        
        System.out.println("MAP:");
        Map miMapa= new HashMap();
        miMapa.put("valor1", "Juan"); //se agrega llave y valor. no tiene por que ser String
        miMapa.put("valor2", "Rosa");
        miMapa.put("valor3", "Rodrigo");
        
        String elemento = (String)miMapa.get("valor1"); //hay que convertirlo porque devuelve un tipo Objeto
        System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet()); //se imprimen los Set, por eso no se garantiza el orden
        imprimir(miMapa.values()); // se imprimen los valores
        
    }
    
    //POLIMORFISMO
    public static void imprimir(Collection coleccion){
//        for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
        System.out.println("--------");
        coleccion.forEach(elemento -> { 
            System.out.println("elemento= "+elemento);
        });
        System.out.println("--------");
    }
}
