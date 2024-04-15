/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class LineaEscrituraFitxer {
    File ruta_archivo; //objecte file necessari
    FileWriter writer;
    BufferedWriter fichero; //el file el llegire linea a linea
    
    public LineaEscrituraFitxer(String ruta_relativa) throws FileNotFoundException, IOException
    {
        ruta_archivo = new File(ruta_relativa);
        writer = new FileWriter(ruta_archivo);
        fichero = new BufferedWriter(writer);
    }    
    
    
    public void escribirLinea(String texto) throws IOException
    {
        fichero.write(texto);
    }
    
    
    public void cerrarFicheros() throws IOException
    {
        writer.close();
        fichero.close();
    }
}
