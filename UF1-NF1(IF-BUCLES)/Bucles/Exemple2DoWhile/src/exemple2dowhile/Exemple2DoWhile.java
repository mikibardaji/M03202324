/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemple2dowhile;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exemple2DoWhile {

    /**
     * @param args the command line arguments
     * programa que pedira numeros hasta que introduzcas el -1
     * en ese momento parara
     */
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        do
        {
           System.out.print("pon valores, (-1 para terminar)....");
           numero = sc.nextInt(); 
            System.out.println("Has introducido el " + numero);
        }while(numero!=-1);
        System.out.println("Mismo bucle pero con variable booleana");
        
        boolean end = false;
        do
        {
           System.out.print("pon valores, (-1 para terminar)....");
           numero = sc.nextInt();
           if (numero==-1)
           {
               System.out.println("activado");
               end = true;
           }
        //}while(!end);
        }while(end==false);
        
    }
    
}
