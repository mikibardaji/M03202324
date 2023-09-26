/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici4;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1, valor2;
        int suma,resta,multi;
        double division;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon valor 1...");
        valor1 = sc.nextInt();
        System.out.print("Pon valor 2...");
        valor2 = sc.nextInt();
        
        suma = valor1 + valor2;
        resta = valor1 - valor2;
        multi = valor1 * valor2;
        //division = valor1/valor2; //la divisió (/) ho retorna com int
      
        System.out.println( valor1 + " + " + valor2 + " = " + suma);
        System.out.println( valor1 + " - " + valor2 + " = " + resta);
        System.out.println( valor1 + " * " + valor2 + " = " + multi);
        
        
        if (valor2 == 0) //igual de 0
        { //si esto es true
            System.out.println("No puedo dividir por 0...");
        }
        else
        { //false valor2 no es 0
            division = (double) valor1/valor2; //(double) casteja el resultat al tipus double
            System.out.println( valor1 + " / " + valor2 + " = " + division);
        }
        
        /*
        menor de 0 o mayor que 0 podria hacver la divisio
        if (valor2<0 || valor2>0)
        {
            division = (double) valor1/valor2; //(double) casteja el resultat al tipus double
            System.out.println( valor1 + " / " + valor2 + " = " + division);
        }
        
        */
        /*
        
         if (valor2 != 0) //diferent de 0
        { //si esto es true
            division = (double) valor1/valor2; //(double) casteja el resultat al tipus double
            System.out.println( valor1 + " / " + valor2 + " = " + division);
        }
        else
        { //false
            System.out.println("No puedo dividir por 0...");
        }*/
        
        
    }
    
}
