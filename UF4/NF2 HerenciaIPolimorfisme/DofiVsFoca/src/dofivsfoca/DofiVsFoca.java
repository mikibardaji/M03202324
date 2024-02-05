/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dofivsfoca;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class DofiVsFoca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dofi dolphin = crearDelfin();
        Foca seal = crearFoca();
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la distancia que quieras que sea la carrera");
        int metros = sc.nextInt();
        int vueltas=0;
        while (dolphin.getDistancia_recorreguda()< metros
                && seal.getDistancia_recorreguda() < metros)
        {
            dolphin.sprint();
            seal.sprint();
            vueltas++;
            if (vueltas%6==0)
            {
                seal.aumentarResistencia(1);
            }
        }
        
        
        if (dolphin.getDistancia_recorreguda()>= metros)
        {
            System.out.println("Ganador delfin");
        }
        else
        {
            System.out.println("Ganador foca ");
        }
    }

    private static Dofi crearDelfin() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon raza delfin ");
        String raza = sc.nextLine();
        System.out.println("Pon edad delfin ");
        int edad = sc.nextInt();
        //sc.nextLine();
        Dofi del = new Dofi(edad, raza);
        return del;
    }

    private static Foca crearFoca() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon edad foca ");
        int edad = sc.nextInt();
        System.out.println("Pon peso foca ");
        int peso = sc.nextInt();
        Foca seal = new Foca(peso, edad);
        return seal;
    }
    
}
