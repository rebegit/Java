
package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author Rebeca
 */
public class TestManejoUsuarios {
     public static void main(String[] args) {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        //Ejecutando el listado de usuarios
        System.out.println("SELECCIONAR:");
        List<Usuario> usuarios = usuarioDAO.select();
        for(Usuario usuario: usuarios){
            System.out.println("Usuario:" + usuario);
        }System.out.println("****");
        
        //Insertamos un nuevo usuario
        System.out.println("AÑADIR:");
        Usuario usuario = new Usuario("carlos.juarez", "123");
        usuarioDAO.insert(usuario);
        usuarios = usuarioDAO.select();
        for(Usuario usr: usuarios){
            System.out.println("Usuario:" + usr);
        }System.out.println("*****");
        
        //Modificamos un usuario existente
        System.out.println("MODIFICAR:");
        Usuario usuariomod = new Usuario(4, "carlos.juarez","456");
        usuarioDAO.update(usuariomod);
        usuarios = usuarioDAO.select();
        for(Usuario usu: usuarios){
            System.out.println("Usuario:" + usu);
        }System.out.println("*****");
        
        //Eliminacion
        System.out.println("ELIMINAR:");
        Usuario usuarioelim = new Usuario(7);
        usuarioDAO.delete(usuarioelim);
        usuarios = usuarioDAO.select();
        for(Usuario usuelim: usuarios){
            System.out.println("Usuario:" + usuelim);
        }System.out.println("*****");
    }
}
