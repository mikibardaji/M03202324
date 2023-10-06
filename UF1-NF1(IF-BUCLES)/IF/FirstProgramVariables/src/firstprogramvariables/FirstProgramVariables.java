/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstprogramvariables;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class FirstProgramVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notaM03=5, notaM02=5, notaM04=5;
        //un objecte que escaneja dades de entrada
        //System.in indico que sigui per consola
        Scanner pantalla = new Scanner(System.in);
        /*
        Informar valor por el usuario
        */
        System.out.println("¿Que nota crees que sacaras en M03?");
        notaM03 = pantalla.nextInt();
        
        //notaM03 = 10;
        System.out.println("¿Que nota crees que sacaras en M02?");
        notaM02 = pantalla.nextInt();
        System.out.println("¿Que nota crees que sacaras en M04?");
        notaM04 = pantalla.nextInt();
        
        System.out.println(notaM02);
        System.out.println("Nota de m03 un ... " + notaM03);
        System.out.println("Nota de m02 un ... " + notaM02);
        System.out.println("Nota de m04 un ... " + notaM04);
        System.out.println("notaM04 ... " + notaM04);
    }
    
}
