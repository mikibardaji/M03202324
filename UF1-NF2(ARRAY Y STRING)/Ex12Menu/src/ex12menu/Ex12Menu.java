/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12menu;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex12Menu {

    /**
     * . Crea un programa que cree un array de 10 enteros y luego muestre el siguiente menú con
distintas opciones:
*       a. Mostrar valores.
        b. Introducir valor.
        c. Salir.
* La opción ‘a’ mostrará todos los valores por pantalla. 
* La opción ‘b’ pedirá un valor V y una
posición P, luego escribirá V en la posición P del array. El menú se repetirá indefinidamente hasta
que el usuario elija la opción ‘c’ que terminará el programa.
     */
    public static void main(String[] args) {
        final int TAMANY = 10;
        char opcion;
        int[] valores = new int[TAMANY];
        
        do
        {
        opcion = escogerOpcionMenu();
        switch(opcion)
            {
            case 'c':
                System.out.println("Saliendo...");
                break;
            case 'a':
                mostrarArray(valores);
                break;
            case 'b':
                introducirValorPosicion(valores);
                break;
            }
        
        }while(opcion!='c');
    }

    private static char escogerOpcionMenu() {
        char opcion;
        Scanner sc = new Scanner(System.in);
        do
        {
        System.out.println("a. Mostrar valores. \n" +
                            "b. Introducir valor. \n" +
                            "c. Salir. ");
        opcion = sc.next().charAt(0);
        }while (!(opcion=='a' || opcion == 'b' || opcion=='c'));
        return opcion;
    }
    
     /**
     * mostrar todos los valores del array
     * @param valores array de entrada
     */
    private static void mostrarArray(int[] valores) {
         for (int i = 0; i < valores.length; i++){
             System.out.println("posicion" + i + " - " + valores[i]);
        }
    }

    /**
     * 
     * @param valores 
     */
    private static void introducirValorPosicion(int[] valores) {
       int valor = pedirValorPositivo("Pon un valor");
       int posicion = pedirValorPosicion(valores.length);
       valores[posicion] = valor;
       System.out.println("Posicion cambiada valor");
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
     * pedir posicion que no debe superar a length y no debe ser menor que 0
     * @param length
     * @return 
     */
    private static int pedirValorPosicion(int length) {
        Scanner sc = new Scanner(System.in);
        int valor;
        do
        {
            System.out.println("Pon la posición entre 0 y " + (length-1));
            valor = sc.nextInt();
        }while(valor<0 || valor>=length);
        
        return valor;
    }
    
}
