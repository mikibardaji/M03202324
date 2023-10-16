/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomexemples;

import java.util.Random;



/**
 *
 * @author mabardaji
 */
public class RandomExemples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("Voy a generar un numero aleatorio del 1 al 100");
            //Math.Random() genera un aleatori de 0 a 1 (el 1 no esta inclos) 
            int max = 25;
            int min = 15;
            int range = max - min + 1;
            System.out.println("valor maximo" + max);
            System.out.println("valor minimo" + min);
            System.out.println("rango de valores" + range);
            int aleatorio = (int)(Math.random()*range) + min;
            
            System.out.println("numero generado--> " + aleatorio);
            System.out.println("******************************");
            Random rd = new Random();
            min = 20;
            range = 13; //quants valors vull 20 al 32 n'hi ha 12 mes el 20
            System.out.println("valor minimo" + min);
            System.out.println("rango de valores" + range);
            aleatorio = rd.nextInt(range)+ min;
            System.out.println("numero generado por random--> " + aleatorio);
                    
                    
            
    }
    
}
