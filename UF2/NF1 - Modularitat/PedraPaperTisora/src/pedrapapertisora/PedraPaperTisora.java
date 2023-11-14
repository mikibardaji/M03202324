/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrapapertisora;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PedraPaperTisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gana, cont_j=0, cont_m=0;
        int eleccion_jugador = jugada();
        int eleccion_maquina = jugada_ordenador();
        System.out.print("El jugador elegió ");
        imp_jugada(eleccion_jugador);
        System.out.print("La maquina elegió ");
        imp_jugada(eleccion_maquina);
        gana = ganador(eleccion_jugador, eleccion_maquina);
        imp_ganador(gana);
        if(gana==1)
        {
            cont_j = aumentar_punto(cont_j);
        }
        else if (gana==2)
        {
            cont_m = aumentar_punto(cont_m);
        }
        marcador(cont_j, cont_m);
        
        //System.out.println(jugada());
        //System.out.println(jugada_ordenador());
        //imp_jugada(2);
        //marcador(3, 2);
    }
    
    /**
     * xxx jugada(): pide al usuario una tirada al jugador 
     * mostrando una frase similar a "que sacas? (0 piedra, 1 papel, 2 tijera)" 
     * Retorna el valor introducido siempre que sea un valor vàlido, 
     * sino debe seguir pidiendo tirada. 
     * No escribe nada cuando eliges, lo hará otra función  0,
     */
     public static int jugada()
     {
         Scanner sc = new Scanner(System.in);
         int pedir;
         do{
            System.out.println("que sacas? (0 piedra, 1 papel, 2 tijera)?");
            pedir = sc.nextInt();
         }while(!(pedir==0 || pedir==1 || pedir==2));
         return pedir;
     }
     
     /**
      * xxx jugada_ordenador(): proporciona un valor aleatoria entre 0 y 2 incluido . 
      * Retorna el valor generado 0,5 ptos
      */
     public static int jugada_ordenador()
     {
         int valor_aleatorio;
         int max = 2;
         int min = 0;
         int range = max - min + 1;
         valor_aleatorio = (int)(Math.random()*range)+min;
         
         return valor_aleatorio;
     }
     
     /**
      * xxx imp_jugada(int choose): imprime por pantalla 
      * la frase "Piedra", "papel" o "tijera" 
      * en función del parametro de entrada (0 piedra, 1 papel, 2 tijera)) 
      */
     public static void imp_jugada(int choose)
     {
        switch (choose) {
            case 0:
                System.out.println("Piedra");
                break;
            case 1:
                System.out.println("Papel");
                break;
            case 2:
                System.out.println("Tijera");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
     }
     
     /**
      * xxx imp_ganador(int ganador): 
      * imprime el ganador de la tirada siguiendo esta regla,  
      * si ganador vale 0 imprimir "hay empate", 
      * si es un 1 imprimir "has ganado", 
      * si es 2 debe imprimi que ha ganado el ordenador  0,5 ptos
      */
     public static void imp_ganador(int ganador)
     {
         switch (ganador) {
             case 0:
                 System.out.println("Empate");
                 break;
             case 1:
                 System.out.println("Has ganado");
                 break;
             case 2:
                 System.out.println("PERDISTE!!!!");
                 break;                 
             default:
                 System.out.println("OPCION NO CORRECTA " + ganador);
                 break; 
         }
     }
     
     /**
      * xxx marcador(int point_player1, int point_player2): 
      * imprime la puntuación de cada jugador 
      * por pantalla 0,5 puntos
      */
     public static void marcador(int point_player1, int point_player2)
     {
         System.out.println("************************");
         System.out.println("Puntuacion jugador 1: "+ point_player1);
         System.out.println("Puntuacion jugador 2: "+ point_player2);
         System.out.println("************************");
     }
     
     /**
      * xxx aumentar_punto(int score), 
      * retorna el valor de entrada aumentado en uno
      */
     public static int aumentar_punto(int score)
     {
         int score_actualizado = score + 1;
         return score_actualizado;
     }
     /**
      * xxx ganador(int choose_player1, int choose_player2): 
      * retorna 0 si hay empate, 
      0* 1 si gana el jugador 1 y 
      * 2 si gana el ordenador
      * Piedra(0), Piedra(0): empate.
        Piedra, Papel: gana papel.
        Piedra, Tijera, gana piedra.
        Papel, papel: empate
        Papel, tijera: gana tijera
        Tijera, tijera: empate.
      */
      public static int ganador(int choose_player1, int choose_player2)
      {
          if (choose_player1==choose_player2)
          {
              return 0; //empate
          }
          else if ((choose_player1==0 && choose_player2==1) //piedra papel
                  || (choose_player1==1 && choose_player2==2) // papel tijera
                  || (choose_player1==2 && choose_player2==0))// tijera piedra
          {
              return 2;
          }
          // else if ((choose_player2==0 && choose_player1==1) //piedra papel
         //         || (choose_player2==1 && choose_player1==2) // papel tijera
          //        || (choose_player2==2 && choose_player1==0))// tijera piedra
          else
          {
              return 1;
          }
      }
      
}
