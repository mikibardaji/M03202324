/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programaleecaracteresenteros;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ProgramaLeeCaracteresEnteros {

    /**
     * @param args the command line arguments
     * te va a pedir a que clase vas (A/B/C)
     * y te va a pedir una edad
     * a la clase A van los adultos
     * y a la clase B o la C van los menores de edad
     * el programa tiene que comprobar que estas en la clase correcta
     * 
     */
    public static void main(String[] args) {
        int edad;
        char clase; //Character
        Scanner sc = new Scanner(System.in);
        System.out.print("A que clase vas?   ");
        clase = sc.next().charAt(0); //para recoger un caracter
        System.out.println("Vas al grupo " + clase);
        System.out.print("Que edad tienes?");
        edad = sc.nextInt();
        System.out.println("Tienes " + edad + " años");
        
        if (clase=='A' && edad>=18)
        {
            System.out.println("vas a la clase correcte" + clase);
        }
        else if ((clase=='B' || clase=='C') && edad < 18)
        {
            System.out.println("vas a la clase correcte" + clase);
        }
//        else if ( clase=='C' && edad < 18)
//        {
//            System.out.println("vas a la clase correcte" + clase);
//        }
        else
        {
            System.out.println("Por tus datos y edad no debes ir a esta clase"
            + "edad:" + edad + " clase " + clase);
            //comprobar edad y que te dijera a que clase te tocaria ir
            
        }
            
    }
    
}
