/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6arraynvaloresm;

import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros N y M, luego cree un array de tamaño N,
escriba M en todas sus posiciones y lo muestre por pantalla.
 * @author mabardaji
 */
public class Ex6ArrayNValoresM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int N, M;
        int[] valores;
        N = pedirValorPositivo("Pon el tamaño del array");
        M = pedirValorPositivo("Pon el valor de todo el array");
        valores = new int[N];
        llenarConValorArray(valores,M);
        mostrarArray(valores);
    }

    /**
     * Pide al usuari un valor positivo
     * @param frase de entrad que se mostrara antes de pedir
     * @return entero positivo introducido 
     */
    private static int pedirValorPositivo(String frase) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do
        {
            System.out.println(frase);
            valor = sc.nextInt();
        }while(valor<=0);
        return valor;
    }

    /**
     * llena con el valor M todas las posiciones del array
     * @param valores array entrada
     * @param M valor a copiar
     */
    private static void llenarConValorArray(int[] valores, int M) {
        for (int i = 0; i < valores.length; i++) {
            valores[i] = M;
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
    
}
