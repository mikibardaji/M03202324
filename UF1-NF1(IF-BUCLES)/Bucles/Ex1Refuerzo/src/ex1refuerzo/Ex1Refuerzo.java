/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1refuerzo;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1Refuerzo {

    /**
     * Llegir un nombre i indicar si és positiu o negatiu. El procés es repetirà fins que s'introdueixi un 0.
        Programes molt similars amb petites variacions:
             *Demanar nombres fins que es teclegi el 0, i mostrar quants números s'han introduït fins aquell moment
             *Demanar nombres fins que es teclegi un 0, mostrar la suma de tots els números introduïts fins aquest moment.
     */
    public static void main(String[] args) {
        int numero_introducido;
        Scanner sc = new Scanner(System.in);
        //variable contador (vueltas)
        int cont_num=0;
        //1.-variables contadores vuelta (1...10)
        
        //2.-variables que cuenta un suceso (contar_positivos)
        
        //3.-variables para ir acumulando un calculo en cada vuelta
        int acu_numeros=0;
        //4.interruptor, variable que se activa si sucede algun cosa en concreto

        
        do{
            //pedir numero
            System.out.println("pon un numero");
            numero_introducido = sc.nextInt();
            if(numero_introducido!=0)
            {
                cont_num++;
            }
            acu_numeros = acu_numeros + numero_introducido;
                    
            //detectar positivo
            if (numero_introducido>0)
            {
                System.out.println("Positivo");
            }//detecar negativo
            else if (numero_introducido<0)
            {
                 System.out.println("Negativo");
            }
        }while(numero_introducido!=0); //pas 5 final o no? repito instrucciones o no
        
        System.out.println("Has puesto " + cont_num + " numeros") ;
        System.out.println("La suma de todos los nuneros son " + acu_numeros);
    }
    
}
