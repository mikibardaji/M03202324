/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinanumero;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class AdivinaNumero {

    /**
     * Programa que piensa un numero del 1 al 20
     * y el usuario va introduciendo numeros hasta adivinarlo
     * si no lo adivina debe dar pista "mayor" o menor
     */
    public static void main(String[] args) {
        // 1 pas. el programa pensa un numero del 1 al 20(numero_correcte)
        // 2 pas . Opcional ens el mostra
        // 3 pas demanar un numero (num_usuari)
        // 4 pas comprovar si el numero del usuari es major (tornar al pas 3)
        //         comprovar si el numero usuari es menor (tornar al pas 3)
        //         comprovar si es igual (imprimir sortir bucle i acabar)
        Scanner sc = new Scanner(System.in);
        int num_usuari;
        int max = 20;
        int min = 1;
        int range = max - min + 1;  
        int numero_correcte = (int)(Math.random()*range) + min;
        System.out.println("He pensat el " + numero_correcte);
        do{
        System.out.println("Pon un valor del " + min + " al " + max);
        num_usuari = sc.nextInt();
        
            if (num_usuari>numero_correcte)
            {
                System.out.println("tu numero es mayor");
            }
            else if (num_usuari<numero_correcte)
            {
                System.out.println("tu numero es menor");
            }
            else
            {
                System.out.println("Es correcto");
            }
        }while(num_usuari!=numero_correcte);
    }
    
}
