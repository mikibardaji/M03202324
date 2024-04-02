/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testficheroscaracteres;

import Fitxers.CaracterEscrituraFitxer;
import Fitxers.CaracterLecturaFitxer;
import Fitxers.FinalFicheroException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class TestFicherosCaracteres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            CaracterLecturaFitxer fitxer_tractar = new CaracterLecturaFitxer("ficheros/lectura.txt");
            CaracterEscrituraFitxer fitxer_escriure = new CaracterEscrituraFitxer("ficheros/copia.txt");
            boolean lectura = true;
            
            while (lectura) //(lectura==true)
            {
                try{
                    char letra_leida = fitxer_tractar.leerCaracter();
                    System.out.println("He leido el caracter " + letra_leida);
                    fitxer_escriure.escribirCaracter(letra_leida);
                }
                catch(FinalFicheroException ex)
                { //final del fitxer, no es un error
                    fitxer_tractar.cerrarFicheros();
                    fitxer_escriure.cerrarFicheros();
                    System.out.println("Hecha la copia");
                    lectura = false; //marco final de fichero
                }
            }
            //fitxer_tractar.cerrarFicheros(); //per que al llegir un sol caracter no entra al catch
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no existe");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
        
        
    }
    
}
