/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class ByteEscrituraFitxer {
    //2 atributs
     File ruta_archivo;
    FileOutputStream fichero_escritura;

    public ByteEscrituraFitxer(String ruta_relativa) throws FileNotFoundException {
        ruta_archivo = new File(ruta_relativa);
        fichero_escritura = new FileOutputStream(ruta_archivo);
    }
    
    
    public void escribirByte(int bit) throws IOException
    {
        fichero_escritura.write(bit);
    }
    
    
        //metodo para cerrare
     public void cerrarFicheros() throws IOException
    {
        fichero_escritura.close();
    }
    
}
