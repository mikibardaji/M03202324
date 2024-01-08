/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1bidimensionals;

/**
 *
 * @author mabardaji
 */
public class Ex1Bidimensionals {

    /**
     * Crea un programa que cree una matriz de tama?o 5x5 que almacene los números del 1 al 25
y luego muestre la matriz por pantalla.
     */
    public static void main(String[] args) {
        final int FILAS = 5;
        final int COLUM = 5;
        int[][] numeros = new int[FILAS][COLUM];
        int contador = 1;
        
        for (int fil = 0; fil < numeros.length; fil++) {
            for (int col = 0; col < numeros[fil].length; col++) { //=fil[0].length
                numeros[fil][col] = contador;
                contador++;
            } 
        }
        
        mostrar_tabla(numeros);
       
              
    }

    private static void mostrar_tabla(int[][] numeros) {
                //mostrar valores del array
        for (int fil = 0; fil < numeros.length; fil++) {
            for (int col = 0; col < numeros[fil].length; col++) { //=fil[0].length
                System.out.print(numeros[fil][col]+"\t");
            } 
            System.out.println(""); //salt de linea
        } 
    }
    
}
