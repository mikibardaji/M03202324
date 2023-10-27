/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex5millaskm;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex5MillasKm {

    /**
     * Escribe un programa que pida un valor entero en millas y muestre su equivalente en kilómetros.
Recuerda que una milla son 1,60934 kilómetros. Implementa y utiliza la función:
     */
    public static void main(String[] args) {
        System.out.println("Pon millas y te las convetira a kilometros.");
        
        int millas = pedirDatoEnteroPositivo();
        
        double kilometros = millas_a_kilometros(millas);
        
        System.out.println(millas + " millas a kilometros es... " + kilometros);
    }
    
    
    //double millas_a_kilometros(int millas) // Devuelve la conversión de millas a kilómetros
    public static double millas_a_kilometros(int millas) 
    {
    final double CONVERSOR_MILLAS = 1.60934;
    double calculo = millas * CONVERSOR_MILLAS;
    
    return calculo;
    }
    
    public static int pedirDatoEnteroPositivo() {
          Scanner sc = new Scanner(System.in); 
          int num;
          do
          {
           System.out.print("El valor debe ser superior a 0... ");
           num = sc.nextInt();
          }while(num<=0);
          return num;
    }

}
