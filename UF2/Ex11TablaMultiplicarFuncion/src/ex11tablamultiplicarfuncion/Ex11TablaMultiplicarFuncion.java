/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11tablamultiplicarfuncion;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex11TablaMultiplicarFuncion {

    /**
     * Realiza un programa que escriba la tabla de multiplicar de un número introducido por teclado.
Para ello implementa una función que reciba como parámetro un número entero y muestre por
pantalla la tabla de multiplicar de dicho número.
     */
    public static void main(String[] args) {
        int num2;
        System.out.println("Que tabla quieres saber? ");
        num2=pedirNumeroMultiplicarValido();
        TablaMultiplicar(num2);         
    }
    
    /**
     * Muestra por consola toda la tabla de multiplicar del numero introducido
     * @param num2  numero introducido
     */
    public static void TablaMultiplicar(int num2)
    {
        int resultado;
        for (int num1 = 0; num1 < 11; num1++) {
            resultado = num1*num2;
            System.out.println(num1 + "*" + num2 + " = " + resultado);
        }
    }
    
    public static int pedirNumeroMultiplicarValido() {
          Scanner sc = new Scanner(System.in); 
          int num;
          do
          {
           System.out.print("El valor debe estar entre 1 y 10... ");
           num = sc.nextInt();
          }while(num<=0 || num>10);
          return num;
    }
    
}
