/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Fitxers.ObjetosEscrituraFicheros;
import Fitxers.ObjectoLecturaFicheros;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class Agenda { //DAO
    /*atribut*/
    List <Trabajador> listado;
    /*metodes*/

    public Agenda() {
        listado = new ArrayList<>();
    }
    
    public boolean afegirTrabajador(Trabajador worker)
    {
        if (!listado.contains(worker))
        {
            listado.add(worker);
            return true;
        }
        else
        {
            return false;
        }
        
    }

    public List<Trabajador> getListado() {
        return listado;
    }
    
    
    //TO DO Fa falta el setter?

    public void setListado(List<Trabajador> listado) {
        this.listado = listado;
    }
    
    //carregar d'un fitxer d'entrada tots els treballadors
    public boolean cargarTrabajadoresFichero(String ruta_fichero) throws IOException, ClassNotFoundException 
           
    {
       ObjectoLecturaFicheros fichero = new ObjectoLecturaFicheros(ruta_fichero);
       Object obj;
       do
       {
        obj = fichero.leerObjeto();
         if (obj!= null && obj instanceof Trabajador)
         {
             Trabajador tr = (Trabajador) obj;
             //listado.add(tr);
             this.afegirTrabajador(tr);
         }

       }while(obj!=null);
        
       return true;
    }
    
    public void salvarDatosFichero(String ruta) throws IOException 
    {
        ObjetosEscrituraFicheros fichero = new ObjetosEscrituraFicheros(ruta);
        
        //guardar de uno en uno
        for (Trabajador worker : listado) {
            fichero.escribirObjeto(worker);
        }
        fichero.cerrarFicheros();
        
    }
    
    
    /*
    Grabe en un fichero objetos, solo los trabajadores mayores de edad
    y que retorne cuantos ha grabado
    */
       public int salvarDatosFicheroMayores(String ruta) throws IOException 
    {
        ObjetosEscrituraFicheros fichero = new ObjetosEscrituraFicheros(ruta);
        int cont=0;
        //guardar de uno en uno
        for (Trabajador worker : listado) {
            if(worker.getEdad()>18){
            fichero.escribirObjeto(worker);
            cont++;
            }
        
                
            
        }
        fichero.cerrarFicheros();
        return cont;
    }
    
    
/*
    public void salvarTodosDatosFichero(String ruta) throws IOException 
    {
        ObjetosEscrituraFicheros fichero = new ObjetosEscrituraFicheros(ruta);
        
        //guardar de uno en uno
        List<Object> listadoObjeto;
        
        
        fichero.escribirListaObjetos(listado);

        fichero.cerrarFicheros();
        
    }
*/
    
}
