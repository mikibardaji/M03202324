/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class ObjetosEscrituraFicheros {
    
        File ruta_archivo;
        FileOutputStream writer;
        ObjectOutputStream fichero_escritura;
        
        
        //constructor

    public ObjetosEscrituraFicheros(String ruta_relativa) throws FileNotFoundException, IOException {
        ruta_archivo = new File(ruta_relativa);
        writer = new FileOutputStream(ruta_archivo);
        fichero_escritura = new ObjectOutputStream(writer);
    }
        
    public void escribirObjeto(Object objeto) throws IOException
    {
        fichero_escritura.writeObject(objeto);
    }
 
    public void escribirListaObjetos(List<Object> objeto) throws IOException 
    {
        fichero_escritura.writeObject(objeto);
    }   
    
        //cerrar Ficheros
        public void cerrarFicheros() throws IOException
        {
            writer.close();
            fichero_escritura.close();
        }        

    
}
