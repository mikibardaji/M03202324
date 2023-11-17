/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroalrevesrecursivo;

import java.util.Scanner;

/**
 * Programar un algoritme recursiu que permeti invertir un número. 
 * Exemple: Entrada: 123 -- Sortida: 321. Pista, 
 * cada cop has de tenir el residu d'una divisió d'un numero.
 * @author mabardaji
 */
public class NumeroAlRevesRecursivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero y lo escribire al reves");
        int numero = sc.nextInt();
        numeroRevesRecursivo(numero);
    }
    
    
    public static void numeroRevesRecursivo(int num)
    {
        if (num<10)
            {
                System.out.println(num);
            }
        else
        {
            System.out.print((num%10));
            numeroRevesRecursivo(num/10);
        }
        
    }
    
}
