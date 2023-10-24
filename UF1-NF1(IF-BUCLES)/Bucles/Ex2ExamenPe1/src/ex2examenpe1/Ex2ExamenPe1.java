/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2examenpe1;

import java.util.Scanner;

/**
 * Realitzar un programa que demani a l'usuari quant mesura de llarg i ample cada habitaci� de casa i 
 * anir� sumant els metros quadrats de cada habitaci� fins que s'indiqui que no hi ha m�s habitacions 
 * (quan posi una n en maj�scula o min�scula). 
 * Els metres quadrats d�una habitaci� �s calculen de multiplicar (llarg x ample)

 * @author mabardaji
 */
public class Ex2ExamenPe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        double metrosCuadradosTotales = 0,largo,ancho,metrosCuadrados;

        char respuesta;
        
        do
        {
            System.out.print("Largo habitaci�n:");
            largo = sc.nextDouble();
            System.out.print("Ancho habitaci�n:");
            ancho = sc.nextDouble();
            metrosCuadrados = largo * ancho;
            System.out.println("habitacion de " + metrosCuadrados);
            metrosCuadradosTotales += metrosCuadrados;
            
            System.out.println("Tienes mas habitaciones? (s/n)");
            respuesta = sc.next().charAt(0);
        }while(respuesta!='n' && respuesta != 'N' );
    //}while(!(respuesta=='n' || respuesta == 'N' ));
        
        System.out.println("Tu piso mide ..." + metrosCuadradosTotales);
    }
    
}
