/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exaugmentsou;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExAugmentSou {

    /**
     * @param args the command line arguments
     * Enunciat : https://docs.google.com/document/d/1yO0P32ihquxk9Sa1mV0X5we98D-4H3z9z6P-0WBq0Iw/edit?usp=sharing
     */
    public static void main(String[] args) {
        double sou;
        Scanner sc = new Scanner(System.in);
        double augment;
        System.out.println("Sou que tens ");
        sou = sc.nextDouble();
        final double AUMENTO1 = 12,AUMENTO2 = 10,AUMENTO3 = 8,AUMENTO4 = 6;
        final double MINIMO_SUELDO = 18000;
        
        if (sou < MINIMO_SUELDO)
            {
                augment = (sou * AUMENTO1)/100;
                //sou = sou + augment;
            }
        else if (sou>= MINIMO_SUELDO && sou <= 30000)
            {
                augment = (sou * AUMENTO2)/100;
                //sou = sou + augment;
            }
        else if (sou> 30000 && sou < 45000)
            {
                augment = (sou * AUMENTO3)/100;
                //sou = sou + augment;
            }
        else
            {
                augment = (sou * AUMENTO4)/100;
                //sou = sou + augment;
            }    
    
        System.out.println("Tu sueldo de " + sou + " aumentara en " + augment);
        sou = sou + augment;
        System.out.println("Tu nuevo sueldo es " + sou);
    }
}
