/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4bucles;

import java.util.Scanner;

/**
 *
 * Realiza un programa que muestre los números desde el 1 hasta un número N que se introducirá
por teclado.
 */
public class Ex4Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, cont;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Pon el numero tope(pon uno positivo)..." );
            n = sc.nextInt();
            }while(n<1);
        
        
        for (cont = 1; cont <= n; cont++) {
            if (cont<n)
            {
               System.out.print(cont + "-"); 
            }
            else
            {
                System.out.println(cont);
            }
            
        }
        
    }
    
}
