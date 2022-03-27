
package test;

import com.mysql.cj.protocol.SocksProxySocketFactory;
import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author Rebeca
 */
public class TestManejoPersonas {
    public static void main(String[] args) {
        //bajo acoplamiento y alta cohesion. No es como el anterior proyecto
        PersonaDAO personaDAO = new PersonaDAO();
//      List <Persona> personas = personaDAO.seleccionar(); //se recuperan todos los objetos de tipo persona 
//        
//        /*for (Persona persona: personas){
//            System.out.println("persona = " + persona);
//        }*/
//        
//        personas.forEach(persona -> { //funcion lambda
//            System.out.println("persona = " + persona);
//        });
//        
        
        //Insertando nuvo objeto tipo Persona
        Persona personaNueva = new Persona ("Maria","Cruz","mj@gmail.com","987456555");
        //personaDAO.insertar(personaNueva); //reutilizamos el metodo;
        
        List <Persona> personas = personaDAO.seleccionar(); //se recuperan todos los objetos de tipo persona 
        personas.forEach(persona -> { //funcion lambda
            System.out.println("persona = " + persona);
        });
        System.out.println("*******");
        
        //Modificar objeto Persona existente
        Persona personaModificada = new Persona (5,"Sara", "Alonso", "sa@gmail.com","989652525"); //5 es el id que se quiere modificar
        //personaDAO.actualizar(personaModificada);
        
        personas = personaDAO.seleccionar(); 
        personas.forEach(persona -> { 
            System.out.println("persona = " + persona);
        });
        System.out.println("*******");
        
        //Eliminar
        Persona personaEliminar = new Persona(9);
        personaDAO.eliminar(personaEliminar);
        personas = personaDAO.seleccionar(); 
        personas.forEach(persona -> { 
            System.out.println("persona = " + persona);
        });
        System.out.println("*******");
    }
}
