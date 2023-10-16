/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2vocales;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2Vocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char caracter;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon una letra");
        caracter = sc.next().charAt(0);
        //if else if
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o'|| caracter == 'u')
        {
            System.out.println("Vocal minuscula");
        }
        else
        {
            if (caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O'|| caracter == 'U')
            {
                System.out.println("Vocal mAJuscula");
            }
            else
            {
                System.out.println("consonante");
            }
            
            
            
            
            
            
        }
        
        //switch
        switch(caracter)
        {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                 System.out.println("Vocal minuscula");
                 break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                 System.out.println("Vocal mAJuscula");
                 break;   
            default:
                 System.out.println("consonante");
                break;   
        }
    }
    
}
