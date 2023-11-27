/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9encontrarvalorn;

import java.util.Scanner;

/**
 * Crea un programa que cree un array de enteros de tama?o 100 y lo rellene con valores
enteros aleatorios entre 1 y 10 (utiliza 1 + Math.random()*10). Luego pedirá un valor N y
mostrará en qué posiciones del array aparece N.
 * @author mabardaji
 */
public class EX9EncontrarValorN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] valores = new int[100];
        int valor_buscado;
        llenarAleatorio1al10(valores);
        mostrarArray(valores);
        valor_buscado = pedirValorEntre1y10("pon un numero entre 1 y 10");
        encontrarPosicionesValor(valores,valor_buscado);
    }

    private static void llenarAleatorio1al10(int[] valores) {
        int max = 10;
        int min = 1;
        int range = (max - min ) + min;
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random()*range) + min;
        }
        
    }

    
    /**
     * mostrar todos los valores del array
     * @param valores array de entrada
     */
    private static void mostrarArray(int[] valores) {
         for (int i = 0; i < valores.length; i++){
             System.out.println(i + " - " + valores[i]);
        }
    }
    
        private static int pedirValorEntre1y10(String frase) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do
        {
            System.out.println(frase);
            valor = sc.nextInt();
        }while(valor<=0 || valor >10);
        return valor;
    }

    /**
    * función que encuentra todas las posiciones donde esta el valor que buscamos
    * @param valores todos los valores posibles
    * @param valor_buscado el valor que queremos encontrar
    */
    private static void encontrarPosicionesValor(int[] valores, int valor_buscado) {
        int cont=0; 
        for (int i = 0; i < valores.length; i++){
             if (valores[i]==valor_buscado)
             {
                 System.out.println("El " + valor_buscado + " se encuentra en la posición " + i);
                 cont++;
             }
        }   
        System.out.println("Se ha encontrado " + cont + " veces...");
    }
    
    
    
    
}
