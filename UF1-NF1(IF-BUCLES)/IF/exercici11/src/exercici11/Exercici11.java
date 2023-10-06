/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici11;

import java.util.Scanner;

/**
11.	Dibuja el ordinograma de un programa que lee 2 números y muestra el mayor. 
* si son iguales debe decir que son iguales.
* @author mabardaji
* 
 */
public class Exercici11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1,num2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("pon valor1...");
        num1=sc.nextDouble();
        System.out.print("pon valor2...");
        num2=sc.nextDouble();
     
        
        //System.out.println(num1);
        //System.out.println(num2);
        
        if (num1==num2)
        { //true
            System.out.println("Son iguales los valores");
        }
        else if(num1>num2) /*false*/
        { //true
          //  System.out.println("numero1 es mas grande que numero2");
            System.out.println(num1 + " superior a " + num2);
        }
        else //tambe podria ser else if (num2>num1)
        { //num2>num1
            System.out.println(num2 + " es superior a " + num1);
        }
        
        
        
        
    }
    
}
