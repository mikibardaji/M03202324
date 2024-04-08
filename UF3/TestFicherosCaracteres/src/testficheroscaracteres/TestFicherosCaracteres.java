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
        
        
        //copia_fichero_leerCaracter();
        copia_fichero_leerCaracterCodigoAscii();
        concatenar2Archivos();
        
    }

    private static void copia_fichero_leerCaracter() {
        try {
            CaracterLecturaFitxer fitxer_tractar = new CaracterLecturaFitxer("ficheros/lectura.txt");
            CaracterEscrituraFitxer fitxer_escriure = new CaracterEscrituraFitxer("ficheros/copia.txt");
            boolean lectura = true;
            
            while (lectura) //(lectura==true)
            {
                try{
                    char letra_leida = fitxer_tractar.leerCaracter();
                     if (letra_leida == 'a'
                            || letra_leida == 'e'
                            || letra_leida == 'i'
                            || letra_leida == 'A')
                    {
                    fitxer_escriure.escribirCaracter(letra_leida);
                    }
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

    private static void copia_fichero_leerCaracterCodigoAscii() {
        try {
            CaracterLecturaFitxer fitxer_tractar = new CaracterLecturaFitxer("ficheros/lectura.txt");
            CaracterEscrituraFitxer fitxer_escriure = new CaracterEscrituraFitxer("ficheros/copia.txt");
            int codigo=0;
            
            while (codigo!=-1) //(lectura==true)
            {
                
                    codigo = fitxer_tractar.leerCaracterCodigoAscii();
                    char letra = (char) codigo;
                    if (letra == 'a'
                            || letra == 'e'
                            || letra == 'i'
                            || letra == 'A')
                    {
                    fitxer_escriure.escribirCaracter(letra);
                    }
                
            }
            fitxer_tractar.cerrarFicheros();
            fitxer_escriure.cerrarFicheros();
         
            //fitxer_tractar.cerrarFicheros(); //per que al llegir un sol caracter no entra al catch
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no existe");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 

    }
    
    private static void concatFicheros()  {
       
         try {
             
         CaracterLecturaFitxer fitxer1 = new CaracterLecturaFitxer("ficheros/fichero1.txt");
         CaracterLecturaFitxer fitxer2 = new CaracterLecturaFitxer("ficheros/fichero2.txt");
         CaracterEscrituraFitxer fitxer_escriure = new CaracterEscrituraFitxer("ficheros/ficheroconcat.txt");
         
            boolean lecturaF1 = true;
           
            while (lecturaF1) //(lectura==true)
            {
                try{

                    char letra_leida = fitxer1.leerCaracter();
                    System.out.println("He leido el caracter " + letra_leida);
                    fitxer_escriure.escribirCaracter(letra_leida);

                }
                catch(FinalFicheroException ex)
                { //final del fitxer, no es un error
                    fitxer1.cerrarFicheros();
                    System.out.println("Hecha la copia del fichero1");
                    lecturaF1 = false; //marco final de fichero
                }
               
            }
            boolean lecturaF2 = true;
            while (lecturaF2) //(lectura==true)
            {
                try{

                    char letra_leida = fitxer2.leerCaracter();
                    System.out.println("He leido el caracter " + letra_leida);
                    fitxer_escriure.escribirCaracter(letra_leida);

                }
                catch(FinalFicheroException ex)
                { //final del fitxer, no es un error
                    fitxer2.cerrarFicheros();
                    fitxer_escriure.cerrarFicheros();
                    System.out.println("Hecha la copia del fichero2");
                    lecturaF2 = false; //marco final de fichero
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
