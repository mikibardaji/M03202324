/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class EscrituraSerializadaPrimitius {
    
    File ruta_archivo;
    FileOutputStream writer;
    DataOutputStream fichero;

    public EscrituraSerializadaPrimitius(String ruta_relativa) throws FileNotFoundException {
        ruta_archivo = new File(ruta_relativa);
        writer = new FileOutputStream(ruta_archivo);
        fichero = new DataOutputStream(writer);
    }
    
    //metodo para grabar un char
    public void escribirCaracter(int letra) throws IOException
    {
        fichero.writeChar(letra);
    }
    
    //metodo para grabar un int
    public void escribirInt(int num) throws IOException
    {
        fichero.writeInt(num);
    }
    
    //petodo para grabar double
    public void escribirDouble(double num) throws IOException
    {
        fichero.writeDouble(num);
    }    
    
    //metodo para grabar un boolean
    public void escribirBoolean(boolean cierto) throws IOException
    {
        fichero.writeBoolean(cierto);
    }    
    
    //metodo para grar un string 
    public void escribirString(String frase) throws IOException
    {
        fichero.writeUTF(frase);
    }
    
    
    
    public void cerrarFicheros() throws IOException
    {
        writer.close();
        fichero.close();
    }
    
}
