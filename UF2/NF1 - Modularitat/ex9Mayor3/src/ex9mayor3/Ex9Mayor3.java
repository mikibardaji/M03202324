/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9mayor3;

import java.util.Scanner;

/**
 *
 * Realiza un programa que pida introducir tres valores enteros y nos diga cuál de ellos es el más
elevado. Impleméntalo creando únicamente una función a la que le pasemos dos valores (no
tres) y nos devuelva el máximo de los dos valores.
 */
public class Ex9Mayor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1,num2,num3;
        System.out.println("Pon primer valor");
        num1=pedirDatoEntero();
        System.out.println("Pon segundo valor");
        num2=pedirDatoEntero();
        System.out.println("Pon tercer valor");
        num3=pedirDatoEntero();
        
        
        int max = mayorDe2(num1, num2);
        //max el valor mas grande entre num1 i num2
        int maximoTotal = mayorDe2(max, num3);
        
        System.out.println("El mas grande es " + maximoTotal);
    }
    
    /**
     * funcion que averigua que numero es mayor
     * @param num1
     * @param num2
     * @return entero con el valor mayor
     */
    
    public static int mayorDe2(int num1, int num2)
    {
        if (num1>num2)
        {
            return num1;
        }
        else
        {
            return num2;
        }
    }
    
         /**
     * Pedir un valro al usuari
     * 
     * @return valor introducido usuario entero
     */
    public static int pedirDatoEntero() {
          Scanner sc = new Scanner(System.in); 
          System.out.println("Pon un valor entero");
          int num;
          num = sc.nextInt();
          return num;
    }    
    
    
    
}
