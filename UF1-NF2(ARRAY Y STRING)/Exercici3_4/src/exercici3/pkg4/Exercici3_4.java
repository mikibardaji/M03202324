/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici3.pkg4;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici3_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int TAMANY = 10;
        int[] valores = new int[TAMANY];
        
        introducirDatos(valores);
        mostrarArray(valores);
        encontrarMaximoMinim(valores);
        sumarPositivosNegativos(valores);
        
    }

    /**
     * el usuario informa todos los valores del array
     * @param valores array con valores
     */
    private static void introducirDatos(int[] valores) {
        System.out.println("Introduce datos");
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Pon dato " + (i+1) + " = ");
            valores[i] = sc.nextInt();
        }
    }

    private static void mostrarArray(int[] valores) {
        System.out.println("mostrando array");
        for (int index = 0; index < valores.length; index++) 
        {
            System.out.println(index + " -> " + valores[index]);
        }
    }

    /**
     * muestra el valor mas grande y pequeño de todos los del arrya de entrada
     * @param valores 
     */
    private static void encontrarMaximoMinim(int[] valores) {
        int max, min;
        max=valores[0];
        min=valores[0];
        for (int i = 0; i < valores.length; i++) {
            System.out.println("indice " + i + " valor posicion  " + valores[i]);
            if(valores[i]>max)
            {
                max = valores[i];
                System.out.println("Canvi el maximo a " + max);
            }
            else if(valores[i]<min)
            {
                min = valores[i];
                System.out.println("Canvi el minimo a " + min);
            } 
        }
        System.out.println("valor maximo leido " + max);
        System.out.println("valor minimo leido " + min);
    }

    private static void sumarPositivosNegativos(int[] valores) {
        int positivos=0;
        int negativos=0;
        int cont_pos=0,cont_neg=0;
        
        for (int i = 0; i < valores.length; i++) {
            if (valores[i]<0)
            {
                negativos = negativos + valores[i];
                cont_neg++;
            }
            else if(valores[i]>0)
            {
                positivos = positivos + valores[i];
                cont_pos++;
            }
        }
        
        System.out.println("Hay " + cont_pos + " positivos que suman " + positivos);
        System.out.println("Hay " + cont_neg + " negativos que suman " + negativos);
        
    }
    
}
