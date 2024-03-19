/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testpersona;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class TestPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Persona x = new Persona("x", "43720A09D");
        } catch (InvalidDNIException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
    
}
