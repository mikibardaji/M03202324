/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex19;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex19 {

  public static void main(String[] args) {
    final int JUGADORES= 2;
    int [] puntuaciones = new int [JUGADORES];
    introducirPuntuaciones(puntuaciones);
    mostrarPuntuacionDescendente(puntuaciones);
  }
public static void introducirPuntuaciones( int [] puntuaciones) {
    Scanner sc = new Scanner(System.in);
    int i=0;
    System.out.println("Introduce solo valores enetre 1000 y 2800");
    for ( i = 0; i < puntuaciones.length; i++) {
        do{
            System.out.print("Introduce la puntuacion del jugador " + (i+1) + " ");
            puntuaciones[i] = sc.nextInt();
        }while(puntuaciones[i]<1000 || puntuaciones[i]>2800);
    }
  
}
  public static void mostrarPuntuacionDescendente( int [] puntuaciones) {
    Arrays.sort(puntuaciones);
    int cont = 1;
    System.out.println("Las puntuaciones ordenadas son: " );
    for (int i = puntuaciones.length - 1; i>= 0; i--) {
        System.out.println("Jugador " + cont + " : " + puntuaciones[i]);
        cont++;
    }
    
    int puntuaciones_ordenadas[] = new int[2];
    int pos_final = puntuaciones.length-1;
    for (int i = 0; i < puntuaciones.length; i++) {
          puntuaciones_ordenadas[i] = puntuaciones[pos_final-i];
      }
    cont=1;
      for (int i = 0; i < puntuaciones_ordenadas.length; i++) {
          System.out.println("Jugador " + cont + " : " + puntuaciones_ordenadas[i]);
        cont++;
      }
    
    
    
  }
    
}
