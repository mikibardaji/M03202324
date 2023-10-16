/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10bucles;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10Bucles {

    /**
     * Realiza un programa que lea una secuencia de notas 
     * (con valores que van de 0 a 10) que termina con el valor -1 
     * y nos dice si hubo o no alguna nota con valor 10.
     */
    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        //1.-variables contadores vuelta (1...10)
        //2.-variables que cuenta un suceso (contar_positivos)
        //3.-variables para ir acumulando un calculo en cada vuelta
        //4.interruptor, variable que se activa si sucede algun cosa en concreto
        boolean puesto_10=false;
        //5 condicion bucle nota!=-1 nota==-1, 
        do{
            System.out.println("Pon una nota(-1 para salir)");
            nota = sc.nextInt();
            if (nota == 10)
            {
                puesto_10 = true; //interruptor a true
            }
        }while(nota!=-1);
       //}while!(nota==-1);
        
        if (puesto_10==true)
        {
            System.out.println("Has puesto algun 10");
        }
        else
        {
            System.out.println("No has puesto ningun 10");
        }
        
        
        
        
    }
    
}
