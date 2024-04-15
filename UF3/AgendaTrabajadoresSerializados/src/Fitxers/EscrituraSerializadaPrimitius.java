/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jepa2698
 */
public class EscrituraSerializadaPrimitius {
    File ruta_archivo;
    FileOutputStream writer;
    DataOutputStream fichero;
    
    
    public EscrituraSerializadaPrimitius (String ruta_relativa) throws FileNotFoundException{
    ruta_archivo = new File (ruta_relativa);
    
    writer = new FileOutputStream(ruta_archivo);
    fichero = new DataOutputStream(writer);

    
    }
    
    public void cerrarFicheros() throws IOException{
    
    writer.close();
    fichero.close();
    
    }
    
    
    
    
    
    //metodo pàra grabar un char 
    public  void grabarChar(int character) throws IOException{
    
        fichero.writeChar( character);
    
    
    
    }
    
    //metodo para grabar un int 
    
     public  void grabarInt(int number) throws IOException{
    
        fichero.writeInt(number);
    
    
    
    }

    
    //metodo para grabar un double
     
     
      public  void grabarDouble(double number) throws IOException{
    
        fichero.writeDouble(number);
    
    
    
    }
     
    
    
    //metodo para grabar un boolean 
      
      
      
       public  void grabarBoolean(boolean b) throws IOException{
    
        fichero.writeBoolean(b);
    
    
    
    }
    
    
    //metodo para grabar un string
    
        public  void grabarString(String str) throws IOException{
    
        fichero.writeUTF(str);
    
    
    
    }
    
    
    
}
