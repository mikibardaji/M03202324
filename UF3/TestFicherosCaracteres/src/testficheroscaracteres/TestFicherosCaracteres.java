/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testficheroscaracteres;

import Fitxers.ByteEscrituraFitxer;
import Fitxers.ByteLecturaFitxer;
import Fitxers.CaracterEscrituraFitxer;
import Fitxers.CaracterLecturaFitxer;
import Fitxers.EscrituraSerializadaPrimitius;
import Fitxers.FinalFicheroException;
import Fitxers.LecturaSerializadaPrimitius;
import java.io.EOFException;
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
        //copia_fichero_leerCaracterCodigoAscii();
        //concatFicherosExercici5();
        //concatenarFicherosLetraALetraExercici6();
        //hacerCopiaFoto();
        grabarDatosPrimitivos();
        leerDatosPrimitivos();
        
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
    
    private static void concatFicherosExercici5()  {
       
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

    private static void concatenarFicherosLetraALetraExercici6()
    {
        try {
            //declarar ficheros
            //lectura o escritura
            CaracterLecturaFitxer fitxer1 = new CaracterLecturaFitxer("ficheros/exer6f1.txt");
            CaracterLecturaFitxer fitxer2 = new CaracterLecturaFitxer("ficheros/exer6f2.txt");
            CaracterEscrituraFitxer sortida = new CaracterEscrituraFitxer("ficheros/exer6sortida.txt",true);
            int lectf1=0,lectf2=0;
            
            while (lectf1!=-1 && lectf2!=-1) //no han llegado final ninguno
            {
                lectf1 = fitxer1.leerCaracterCodigoAscii();
                if (lectf1!=-1)
                {
                    System.out.println("Escribo" + (char) lectf1);
                   sortida.escribirCaracter(lectf1);//escribo
                }
                lectf2 = fitxer2.leerCaracterCodigoAscii();
                if (lectf2!=-1)
                {
                    System.out.println("Escribo" + (char) lectf2);
                   sortida.escribirCaracter(lectf2);//escribo
                }
            }
            //termina el primer fichero
            if (lectf1==-1)
            {
               while(lectf2!=-1) //escribo solo el segundo
               {
                  System.out.println("solo fichero 2 " + (char) lectf2); 
                  lectf2 = fitxer2.leerCaracterCodigoAscii();
                if (lectf2!=-1)
                {
                   sortida.escribirCaracter(lectf2);//escribo
                } 
               }
            }
            if (lectf2==-1)//segundo terminado
            {
               while(lectf1!=-1) //escribo solo el primero
               {
                  lectf1 = fitxer1.leerCaracterCodigoAscii();
                if (lectf1!=-1)
                {
                   System.out.println("solo fichero 1 " + (char) lectf1); 
                   sortida.escribirCaracter(lectf1);//escribo
                } 
               }
            }
            fitxer1.cerrarFicheros();
            fitxer2.cerrarFicheros();
            sortida.cerrarFicheros();
            
        } catch (FileNotFoundException ex) {
            System.out.println("fichero no encontrado" + ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println("Error escritura" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void hacerCopiaFoto() {
        try {
            ByteLecturaFitxer entrada = new ByteLecturaFitxer("ficheros/foto.jpg");
            ByteEscrituraFitxer sortida = new ByteEscrituraFitxer("ficheros/copia_foto.jpg");
            int leido;
            //copiar byte a byte y escriure a la sortida
            do
            {
                leido = entrada.leerByte();
                if (leido!=-1)
                {
                    sortida.escribirByte(leido);
                }
                
            }while(leido!=-1);
            
            
            //tancar fitxers
            entrada.cerrarFicheros();
            sortida.cerrarFicheros();
            //informar usuario
            System.out.println("Copia hecha");
            
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
        
    }

    private static void grabarDatosPrimitivos() {
        try {
            String linea = "HOLAxccdcccv";
            int num = 133;
            boolean cierto = true;
            
            EscrituraSerializadaPrimitius escritura =
                    new EscrituraSerializadaPrimitius("ficheros/datos.txt");
        
            escritura.escribirInt(num);
            escritura.escribirString(linea);
            escritura.escribirBoolean(cierto);

            System.out.println("Datos guardadados");
            escritura.cerrarFicheros();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
  
    }

    private static void leerDatosPrimitivos() {
        LecturaSerializadaPrimitius leer=null;
        try {
            leer =
                    new LecturaSerializadaPrimitius("ficheros/datos.txt");
            
            int num = leer.leerInt();
            System.out.println(num);
            String frase = leer.leerLinea();
            System.out.println(frase);
            boolean cierto = leer.leerBoolean();
            System.out.println(cierto);
            num = leer.leerInt();
            leer.cerrarFicheros();
        } catch (EOFException ex)
        {
            System.out.println("Final fichero");
            try {
                leer.cerrarFicheros();
            } catch (IOException ex1) {
                Logger.getLogger(TestFicherosCaracteres.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
        } 
        catch (FileNotFoundException ex) {
           System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
           System.out.println(ex.getMessage());
            ex.printStackTrace();
        } 
    }
    
}
