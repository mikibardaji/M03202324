/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bitlles;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Bitlles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("quantes fileres hi ha ");
        int files = sc.nextInt();
        int num_bitlles = bitlles(files);
        System.out.println("numero bitlles " + num_bitlles);
    }
    
    public static int bitlles(int fileres)
    {
        //caso base
        if (fileres==0)
        {
            return 0;
        }
//        else if (fileres==1)
//        {
//            return 1;
//        }
        else  //caso recursivo
        { //posiblecalculo(fileres) operador(+/-/*//) 
            //crida recursiva apropants al base
            int calculo = fileres + bitlles(fileres-1);
            return calculo;
        }
    }
}
