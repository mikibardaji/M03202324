/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10 {

    /**
     * Crea un programa para realizar cálculos relacionados con la altura (en metros) de personas. 
     * Pedirá un valor N y luego almacenará en un array N alturas introducidas por teclado. 
     * Luego mostrará la altura media, máxima y mínima así como 
     * cuántas personas miden por encima y por debajo de la media.
     */
    public static void main(String[] args) {
        int numero = pedirValorPositivo("Pon un numero positivo");
        int[] alturas = new int[numero];
        llenarValores(alturas);
        mostrarArray(alturas);
        int minimo = calcularMinimo(alturas);
        int maximo = calcularMaximo(alturas);
        double media = calcularMediaAltura(alturas);
        System.out.println("Valor mínimo: " + minimo);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor media: " + media);
        encontrarCuantosSuperanMedia(alturas,media);
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

    private static void llenarValores(int[] alturas) {
        int max = 150;
        int min = 1;
        int range = (max - min ) + min;
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = (int)(Math.random()*range) + min;
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

    /**
     * Encuentra el valor minino de todos los valores del array
     * @param alturas
     * @return minimo
     */    
        
    private static int calcularMinimo(int[] alturas) {
        int min = alturas[0];
        for (int indice = 0; indice < alturas.length; indice++) {
            if (alturas[indice]<min)
            {
                min = alturas[indice];
            }
        }
        return min;
    }
    
    /**
     * Encuentra el valor maximo de todos los valores del array
     * @param alturas
     * @return minimo
     */    
        
    private static int calcularMaximo(int[] alturas) {
        int max = alturas[0];
        for (int indice = 0; indice < alturas.length; indice++) {
            if (alturas[indice]>max)
            {
                max = alturas[indice];
            }
        }
        return max;
    }

    private static double calcularMediaAltura(int[] alturas) {
        int suma=0;
        
        for (int indice = 0; indice < alturas.length; indice++) {
            suma = suma + alturas[indice];
        }
        double media = (double) (suma/alturas.length);
        return media;
    }

    /** 
     * Encuentra el numero de valores que superan la media y cuantos no la superan
     * @param alturas
     * @param media 
     */
    private static void encontrarCuantosSuperanMedia(int[] alturas, double media) {
        int cont_supera=0;
        int cont_debajo=0;
        
        for (int index = 0; index < alturas.length; index++) {
            if(alturas[index]> media)
            {
                cont_supera++;
            }
            else if(alturas[index]< media)
            {
                cont_debajo++;
            }
            
        }
        
        System.out.println("Registros que superan la media: " + cont_supera);
        System.out.println("Registros que no superan la media: " + cont_debajo);
        
    }
}
