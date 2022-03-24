/*
implementacion
 */
package com.peliculas.datos;

import com.peliculas.domain.Pelicula;
import com.peliculas.excepciones.*;
import java.io.*;
import java.util.*;


/**
 *
 * @author Rebeca
 */
public class AccesoDatosImpl implements I_AccesoDatos {
//implements all abstrac methods
    @Override
    public boolean existe(String nombreRecurso) { //no se lanza excepcion asiq se quita aunque en interface se puede mantener por si en un futuso se necesita
        var archivo =new File(nombreRecurso);
        return archivo.exists();//si existe archivo. retorna booleano
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
       var archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null; //variable que almacena cada una de las lineas
            linea = entrada.readLine();
            while(linea != null){
                var pelicula = new Pelicula(linea);//creamos objeto de tipo pelicula y ño añadimos al arraylist
                peliculas.add(pelicula);
                linea = entrada.readLine();//si tenemos una nueva liena entonces volvemos a preguntar y se repite
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas:" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas:" + ex.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
       var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());//se anexa la informacion
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: " + pelicula);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new EscrituraDatosEx("Excepcion al escribir peliculas:" + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        String resultado = null; //variable que almacena el resultado. si no se encuentra se retorna la variable con valor null
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            var indice = 1; //saber el indice que estamos leyendo. se indica la linea de la pelicula que se busca
            while (linea != null) {
                if(buscar != null && buscar.equalsIgnoreCase(linea)){ //que la cadena sea diferente de nulo y si es igual a la linea que hemos leido. equalsIgonereCase no afecta a minus y mayus
                    resultado = "Pelicula " + linea + " encontrada en el indice " + indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
        } catch (FileNotFoundException ex) {///no se lanza excepcion asiq se quita aunque en interface se puede mantener por si en un futuso se necesita
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula:" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al buscar pelicula:" + ex.getMessage());
        }

        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        var archivo= new File (nombreRecurso);
        try {
            var salida =new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear archivo:" + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) {
        var archivo= new File (nombreRecurso);
        if(archivo.exists()){
            archivo.delete();
            System.out.println("Se ha borrado el archivo");
        }
        
    }
    
}
