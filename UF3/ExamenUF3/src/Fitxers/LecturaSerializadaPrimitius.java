/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class LecturaSerializadaPrimitius {
    
    File ruta_archivo;
    FileInputStream writer;
    DataInputStream fichero;
    
    
    public LecturaSerializadaPrimitius(String ruta_relativa) throws FileNotFoundException {
        ruta_archivo = new File(ruta_relativa);
        writer = new FileInputStream(ruta_archivo);
        fichero = new DataInputStream(writer);
    }
    
    public char leerChar() throws IOException
    {
        return fichero.readChar();
    }
    
    public int  leerInt() throws IOException, EOFException
    {
        return fichero.readInt();
    }
    
    
    public double leerDouble() throws IOException
    {
        return fichero.readDouble();
    }
    
    public boolean leerBoolean() throws IOException
    {
        return fichero.readBoolean();
    }    
    
    public String leerLinea() throws IOException 
    {
        return fichero.readUTF();
    }
        
    public void cerrarFicheros() throws IOException
    {
        writer.close();
        fichero.close();
    }
    
    
}
