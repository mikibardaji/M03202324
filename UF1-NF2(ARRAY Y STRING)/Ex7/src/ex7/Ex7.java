/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7;

import java.util.Scanner;

/**
 * Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
todos los valores desde P hasta Q, y lo muestre por pantalla.
 * @author mabardaji
 */
public class Ex7 {

    /**
     * Crea un programa que pida dos valores enteros P y Q, luego cree un array que contenga
todos los valores desde P hasta Q, y lo muestre por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int P, Q;
        P = pedirValorPositivo("Pon el primer valor");
        Q = pedirValorPositivo("Pon el segundo valor");
        int tamanyo = calcularTamanyoArray(P,Q);
        int[] valores = new int[tamanyo];
        llenarArray(valores,P,Q);
        mostrarArray(valores);
    }
    
    
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
     * calcular diferencia entre 2 valores
     * @param P valo1
     * @param Q valor2
     * @return diferencia
     */
    private static int calcularTamanyoArray(int P, int Q) {
        if (P>Q)
        {
            return (P-Q+1);
        }
        else
        {
            return (Q-P+1);
        }
    }

    /**
     * Llena array con los valores del valor mas peque?o hasta el grande
     * @param valores array
     * @param P valor1
     * @param Q valor2
     */
    private static void llenarArray(int[] valores, int P, int Q) {
        int min;
        if (P>Q)
        {
            min = Q;
        }
        else
        {
            min = P;
        }
        
        for (int i = 0; i < valores.length; i++) {
            valores[i]=min;
            min++;
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
    

