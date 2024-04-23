/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author mabardaji
 */
public class ByteLecturaFitxer {
    //2 atributs
    File ruta_archivo;
    FileInputStream fichero_lectura;
    
    //constructor con la ruta relativa
     public ByteLecturaFitxer(String ruta_relativa) throws FileNotFoundException
     {
         ruta_archivo = new File(ruta_relativa);
         fichero_lectura = new FileInputStream(ruta_archivo);
     }
    
    //metodo para leer un byte
    /**
     * 
     * @return un enter que es el byte llegit i -1 si es el EOF
     */
    public int leerByte() throws IOException
    {
        return fichero_lectura.read();
    }
    
    //metodo para cerrare
     public void cerrarFicheros() throws IOException
    {
        fichero_lectura.close();
    }
    
}
