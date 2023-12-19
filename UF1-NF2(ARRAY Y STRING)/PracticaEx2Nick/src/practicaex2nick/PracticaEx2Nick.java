/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaex2nick;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PracticaEx2Nick {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom, cognom;
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Fica el nom: ");
        nom = sc.nextLine();
        System.out.print("Fica el cognom: ");
        cognom = sc.nextLine();
        System.out.println("Ficar el teu any");
        year = sc.nextInt();
        String yearString = Integer.toString(year);
        //yearString = "" + year;
        //yearString = String.valueOf(year);
        
        String nick = nom.substring(0, 3) 
                + cognom.substring(cognom.length()-3) 
                + yearString.substring(yearString.length()-2); 
        System.out.println("nick de jugador: " + nick.toUpperCase());
        
    }
    
}
