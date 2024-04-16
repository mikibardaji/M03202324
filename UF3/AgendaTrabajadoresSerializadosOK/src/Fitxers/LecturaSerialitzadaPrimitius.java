/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jepa2698
 */
public class LecturaSerialitzadaPrimitius {
      File ruta_archivo;
    FileInputStream writer;
    DataInputStream fichero;
    
    
     public LecturaSerialitzadaPrimitius (String ruta_relativa) throws FileNotFoundException{
    ruta_archivo = new File (ruta_relativa);
    
    writer = new FileInputStream(ruta_archivo);
    fichero = new DataInputStream(writer);

    
    }
     
     
     public char leerChar() throws IOException{
     
     
     return fichero.readChar();
     }
     public int leerInt() throws IOException,EOFException{
     
     
     return fichero.readInt();
     }
     
     
     public double leerDouble() throws IOException{
     return fichero.readDouble();
     
     }
     
     
     public boolean leerBolean() throws IOException{
     
     return fichero.readBoolean();
     
     }
     
     
     public String LeerString  ()throws IOException{
     
     return fichero.readUTF();
     }
      public void cerrarFicheros() throws IOException{
    
    writer.close();
    fichero.close();
    
    }
    
    
}
