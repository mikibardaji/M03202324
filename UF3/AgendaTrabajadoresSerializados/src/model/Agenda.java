/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import Fitxers.EscrituraSerializadaPrimitius;
import Fitxers.LecturaSerialitzadaPrimitius;
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
    public boolean cargarTrabajadoresFichero(String ruta_fichero) 
            throws IOException, EOFException
    {
        int cont =0;
        LecturaSerialitzadaPrimitius entry_file = null;
    
            //leer el fichero de datos
           
                entry_file=
             new LecturaSerialitzadaPrimitius(ruta_fichero);
            //acumular nombres en una lista
            
            //opcio 1 comentada
            //carregarUtilitzantList(entry_file, todos);
            
            String nombre_leido;
            int edad;
            double salari;
            Trabajador tra = null;
            
            //bucle i  tinc que pensar la condició
            do{
                nombre_leido = entry_file.LeerString();
                edad = entry_file.leerInt();
                salari = entry_file.leerDouble();
                tra = new Trabajador(nombre_leido, edad, salari);
                listado.add(tra);
                cont++;
            }   
             while(true);

    }
    
    public void salvarDatosFichero(String ruta) throws FileNotFoundException, IOException
    {
          EscrituraSerializadaPrimitius escribir =
   new EscrituraSerializadaPrimitius(ruta);
        
        
        
            for (Trabajador treballador : listado) {
                escribir.grabarString(treballador.getNombre());
                escribir.grabarInt(treballador.getEdad());
                escribir.grabarDouble(treballador.getSalari());
            }
        escribir.cerrarFicheros();
        
        
        
    }
    
}
