
package accesodatos;

/**
 *
 * @author Rebeca
 */
//HERENCIA= por caracteristicas // INTERFACE= por comportamiento
//new-java interface
//se nombra con i delante para distinguir que es unna interface
//al no ser una clase no extendemos de ninguna clase(no clase object), pero si puede tener interfaces hijas que hereden

//con las interfaces se abstrae el comportamiento(funciones, metodos)
public interface I_AccesoDatos {
    int MAX_REGISTROS=10;
    
    //metodo abstacto, por tanto no lleva cuerpo
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}
