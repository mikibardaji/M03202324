/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class ObjectoLecturaFicheros {
    
    File ruta_archivo;
    FileInputStream reader;
    ObjectInputStream fichero_lectura;

    public ObjectoLecturaFicheros(String ruta_relativa) throws FileNotFoundException, IOException 
    {
        ruta_archivo = new File(ruta_relativa);
        reader = new FileInputStream(ruta_archivo);
        fichero_lectura = new ObjectInputStream(reader);
    }
    
    
    /**
     * 
     * @return devuelve un objeto o null si es el fibal
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public Object leerObjeto() throws IOException, ClassNotFoundException
    {
        return fichero_lectura.readObject();
    }
    
    public List<Object> leerObjetoLista() throws IOException, ClassNotFoundException
    {
        return (List<Object>) fichero_lectura.readObject();
    }    
    
 
    
    public void cerrarFicheros() throws IOException
    {
        reader.close();
        fichero_lectura.close();
    }
    
    
    
    
}
