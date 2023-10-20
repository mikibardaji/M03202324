/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excalcularedad;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pida la edad y el año en que nos encontramos 
 * y muestre la edad que tenia el usuario en cada año hasta su nacimiento.
 */
public class ExCalcularEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, anyo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon edad... ");
        edad = sc.nextInt();
        System.out.print("Pon anyo actual");
        anyo = sc.nextInt();
        System.out.println("edad - anyo ");
        while (edad>0)
        {
            --edad;
            --anyo;
            System.out.println(edad + "  - " + anyo);
        }
            
                
       
    }
    
}
