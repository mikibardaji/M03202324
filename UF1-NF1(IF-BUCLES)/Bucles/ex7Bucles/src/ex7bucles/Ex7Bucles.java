/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex7bucles;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex7Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        int cont, cont_posit=0, cont_negativo=0;
        for (cont = 0; cont < 10
                ; cont++) {
            System.out.println("Pon el valor");
            valor = sc.nextInt();
            if(valor>=0)
            {
                cont_posit++;
            }
            else 
            {
                cont_negativo++;
            }
        } //final for
        System.out.println("positivos -->" + cont_posit);     
        System.out.println("negativos -->" + cont_negativo); 
    }
    
}
