/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex17;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Crea un programa que pida al usuario 20 valores enteros e introduzca los 10 primeros en un
array y los 10 últimos en otro array. Por último, comparará ambos arrays y le dirá al usuario
si son iguales o no.
 * @author mabardaji
 */
public class Ex17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int TAMANY=10;
        int[] valor1 = new int[TAMANY];
        int[] valor2 = new int[TAMANY];
        System.out.println("primer array");
        ponerValores(valor1);
        System.out.println("segundo array");
        ponerValores(valor2);
        sonIguales(valor1,valor2);
    }

    public static void ponerValores(int[] valores) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < valores.length; i++) {
            System.out.print("pon un valor " + i + " = ");
            valores[i] = sc.nextInt();
        }
    }

    
    private static void sonIguales(int[] valor1, int[] valor2) {
        if (Arrays.equals(valor1,valor2))
            System.out.println("iguales"); // si es una sola linea es pot ficar sense {}
        else
            System.out.println("diferentes");
    }
    
}
