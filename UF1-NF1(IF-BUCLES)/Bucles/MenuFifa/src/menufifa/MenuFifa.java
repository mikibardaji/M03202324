/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menufifa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class MenuFifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char opcion;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do{
        System.out.println("****MENU FIFA ***********");
        System.out.println("*  A- Jugar partido     *");
        System.out.println("*  B- Entrenar          *");
        System.out.println("*  C- Jugar Online      *");
        System.out.println("*  D- Salir             *");
        System.out.print("*  Escoge opcion: ");
        opcion = sc.next().charAt(0);
        switch (opcion)
        {
            case 'A':
            case 'a':    
                System.out.println("Estas jugando");
                break;
            case 'B':
            case 'b':    
                System.out.println("Estas entrenando");
                break;
            case 'C':
            case 'c':    
                System.out.println("Jugando online");
                break;
            case 'D':
            case 'd':
                System.out.println("Salir");
                salir = true;
                break;
        }
        }while(!salir);
        
        
      
    }
    
}
