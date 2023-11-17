/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virustriplexrecursiu;

import java.util.Scanner;

/**
 *
 * Uns estudiants de epidèmies, han trobat el virus que han anomenat TRIPLEX, no
s?han matat gaire a pensar el nom, es un virus que cada dia es divideix entre 3 ( o
sigui on hi havia un al dia següent hi ha 3), i així successivament cada dia de
cada virus en surten 3, han demanat a un programador de DAW que els hi faci un
programa que dientli el dia sapigui quants virus hi ha a la mostra.
Si al programa diuen el dia 4, el programa retornarà que hi ha 27 virus a la
mostra.

 */
public class VirusTriplexRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Pon que dia estas investigando y te digo los virus");
        int dia = sc.nextInt();
        System.out.println("En el dia " + dia + " hay " + virusTriplex(dia) + " virus.") ;
    }
    
    public static int virusTriplex(int dia)
    {
        if (dia==1)
        {
            return 1; //virus
        }
        else 
        {
            return 3*virusTriplex(dia-1);
        }
        
    }
    
    
}
