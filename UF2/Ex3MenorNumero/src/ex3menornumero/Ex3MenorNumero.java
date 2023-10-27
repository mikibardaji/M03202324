/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3menornumero;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3MenorNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Pon valor 1");
        num1=pedirDatoEnteroPositivo();
        System.out.println("Pon valor 2");
        num2=pedirDatoEnteroPositivo();
        int mostrarMinimo = minimo(num1, num2);
        System.out.println("El más pequeño es " + mostrarMinimo);
        
    }
    
    /**
     * funcion que devuelve el valor mas pequeño entre a y b
     * @param a
     * @param b
     * @return valor más pequeño
     */
    public static int minimo(int a, int b)
    {
        int minimo=0;
        if(a>b)
        {
            minimo=b;
        }
        else
        {
            minimo=a;
        }
        return minimo;
    }
     
    
     /**
     * Pedir un valro al usuari
     * el valor debe ser superior a 0
     * @return valor introducido usuario entero
     */
    public static int pedirDatoEnteroPositivo() {
          Scanner sc = new Scanner(System.in); 
          int num;
          //System.out.println("Edad?");
          do
          {
           System.out.print("El valor debe ser superior a 0: ");
           num = sc.nextInt();
          }while(num<=0);
          return num;
    }
}
