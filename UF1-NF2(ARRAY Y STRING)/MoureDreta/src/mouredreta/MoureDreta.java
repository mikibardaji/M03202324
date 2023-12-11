/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mouredreta;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class MoureDreta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros= new int[5];
        int[] numeros1= {4,2,7,1,5};
        plenarNumeros(numeros);
        mostrarArray(numeros);
        System.out.println("muevo a la derecha");
        moureDreta(numeros);
        mostrarArray(numeros);
    }

    /**
     * denar valors usuari i ficar-?os al array
     * @param numeros 
     */
    private static void plenarNumeros(int[] numeros) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("pon valor " + (i+1));
            numeros[i] =sc.nextInt();
        }
    }

    private static void mostrarArray(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"-" );
        }
        System.out.println("");
    }

    /**
     * mou tots els valors del array, una posició dreta(superior 0 a 1, 1 al 2)
     * @param numeros 
     */
    private static void moureDreta(int[] numeros) {
        int ultimo=numeros[numeros.length-1]; //ultimo numero
        for (int i = numeros.length-1; i > 0; i--) {
            
            numeros[i]=numeros[i-1];
        }
        numeros[0]=ultimo;
    }
    
}
