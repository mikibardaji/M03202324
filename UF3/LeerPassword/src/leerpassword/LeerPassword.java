/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leerpassword;

import Fitxers.LineaLecturaFitxer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class LeerPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            String user = pedirDato("Pon usuario");
            String password = pedirDato("Pon password");
            String ruta_inicial = "ficheros/";
            String extension = ".txt";
            String ruta = ruta_inicial +user + extension;
            System.out.println(ruta);
            
            LineaLecturaFitxer fichero =
                    new LineaLecturaFitxer(ruta);
        
            String password_fichero = fichero.leerLinea();
            if (password_fichero.equals(password))
            {
                System.out.println("Ok");
            }
            else
            {
                System.out.println("Password incorrecto");
            }
            
            fichero.cerrarFicheros();
        
        
        } catch (FileNotFoundException ex) {
            System.out.println("Usuarui introducido no existente");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());            
            ex.printStackTrace();
        }
        
        
    }
    
    public static String pedirDato(String frase)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        String respuesta = sc.nextLine();
        return respuesta;
    }
}
