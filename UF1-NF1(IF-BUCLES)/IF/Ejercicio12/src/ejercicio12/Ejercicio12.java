/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author mabardaji

 * Dibuja el ordinograma de un programa que lee un número 
 * y me dice si es positivo o negativo, 
 * consideraremos el cero como positivo.
 * 

 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero");
        num1 = sc.nextInt();
        
        if (num1>0)
            {
                System.out.println("Numero es positivo");
            }
        else  if (num1<0)
            {
                System.out.println("Numero es negativo");
            }    
        else //puedo poner else if (num1==1)
            {
                System.out.println("El numero es 0");
            }
            
    }
    
}
