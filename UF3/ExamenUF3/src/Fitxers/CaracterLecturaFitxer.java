/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class CaracterLecturaFitxer {
    File ruta_archivo; //objecte file necessari
    FileReader fichero; //el tipus com tractarem el file Lectura(reader) character

    
    public CaracterLecturaFitxer(String ruta_relativa) throws FileNotFoundException {
        //deixa preparat el arxiu
        ruta_archivo = new File(ruta_relativa);
        fichero = new FileReader(ruta_archivo);
    }
    
    //leer siguiente caracter
    public char leerCaracter() throws IOException, FinalFicheroException
    {
        int codigo_ascii = fichero.read();
        if (codigo_ascii==-1)
        { //final fichero
            throw new FinalFicheroException();
        }
        else
        {
            char letra = (char) codigo_ascii;
            return letra;
        }  
    }
    
    /**
     * 
     * @return el siguiente caracter en codigo ascii, o -1 si es final de fichero
     */
    public int leerCaracterCodigoAscii() throws IOException
    {
         int codigo_ascii = fichero.read();
         return codigo_ascii;
    }
    
    
    public void cerrarFicheros() throws IOException
    {
        fichero.close();
    }
    
    
    
    
}
