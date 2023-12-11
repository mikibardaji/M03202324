/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6_llenararraymultiples;

import java.util.Scanner;

/**
 *Crea un array unidimensional donde tu le indiques el tama?o por teclado y crea una función/método que rellene el array o 
 * arreglo con los múltiplos de un número pedido por teclado. 
 * Por ejemplo, si defino un array de tama?o 5 y elijo un 3 en la función, 
 * el array contendrá 3, 6, 9, 12, 15.Muestralos por pantalla usando otra función distinta.
 * @author mabardaji
 */
public class Ex6_llenarArrayMultiples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Define tama?o array");
        int tamanyo = sc.nextInt();
        int[] multiples = new int[tamanyo];
        int multiplicador = pedirMultiple();
        llenarArrayMultiples(multiples, multiplicador);
        mostrarArray(multiples);
    }

    private static int pedirMultiple() {
       Scanner sc = new Scanner(System.in);
        System.out.println("Define que multiple quieres? ");
        int multplie = sc.nextInt(); 
        return multplie;
    }

    /**
     * Llena todas las posicones con valores multiples del indicado
     * @param multiples arrray 
     * @param multiplicador el multiple deseados
     */
    private static void llenarArrayMultiples(int[] multiples, int multiplicador) {
            for (int i = 0; i < multiples.length; i++) 
            {
                multiples[i] = multiplicador * (i+1);
            }
        
        //otra opcion para rellenarlo 
            multiples[0] = multiplicador;
            int indice=1; //0 ya esta lleno
            int cont = 2;
            while (indice < multiples.length)
            {
                multiples[indice] = multiplicador*cont;
                cont++;
                indice++;
            }
    }

    private static void mostrarArray(int[] multiples) {
        System.out.println("los multiples son ... ");
        for (int i = 0; i < multiples.length; i++) {
            System.out.println(multiples[i]);
        }
        System.out.println("");
    }
    
}
