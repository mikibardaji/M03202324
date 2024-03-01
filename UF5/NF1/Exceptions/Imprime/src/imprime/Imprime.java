/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprime;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class Imprime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //        try{
        //            imprimePositivo(5);
//            imprimePositivo(-15);
//        }
//        catch(Exception ex)
//        {
//            System.out.println(ex.getMessage());
//        }
        try {
        Gato cat = new Gato("hh", 10);
        } catch (NameTooShortException ex) {
            System.out.println(ex); //toString implementado
        } catch (AgeNotNegativeException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void imprimePositivo(int n) throws Exception
    {
        if (n < 0 )
            throw new Exception("Excepcion valor negativo " + n);
        
        
        System.out.println("Valor correcto " + n);
    }
    
}
