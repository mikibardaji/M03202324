/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fitxers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author mabardaji
 */
public class CaracterEscrituraFitxer {
    File ruta_archivo; //objecte file necessari
    FileWriter fichero; //el tipus com tractarem el file Lectura(reader) character 

    public CaracterEscrituraFitxer(String ruta_relativa) throws IOException {
        //deixa preparat el arxiu
        ruta_archivo = new File(ruta_relativa);
        fichero = new FileWriter(ruta_archivo);        
    }
    
    public void cerrarFicheros() throws IOException
    {
        fichero.close();
    }


    public void escribirCaracter(int letra) throws IOException
    {
        fichero.write(letra);
    }
    
    
}
