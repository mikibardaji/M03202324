/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici9;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici9 {

    /**
     * @param args the command line arguments
     * Dibuja un ordinograma de un programa 
     * que pide la edad por teclado y 
     * nos muestra el mensaje de “eres mayor de edad” 
     * o el mensaje de “eres menor de edad”.
     */
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Que edad tienes? ");
        edad = sc.nextInt();
     
        if(edad>=18) //NO VA MAI AMB ;
        {
            System.out.println("Eres mayor de edad");
        }
        else //edad < 18
        {
            System.out.println("Eres menor de edad");
        }
        
        
        
    }
    
}
