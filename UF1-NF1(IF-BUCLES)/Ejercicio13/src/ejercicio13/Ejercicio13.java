/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 * 
 * 13.	Dibuja un ordinograma de un programa que lee dos números 
 * y los visualiza en orden ascendente.
 * @author mabardaji
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el valor numero 1");
        num1 = sc.nextInt();
        System.out.println("Pon el valor numero 2");
        num2 = sc.nextInt();

/* COMO RECOGER VARIOS VALORES EN UNA SOLA LINEA*/
//        System.out.println("Pon dos numeros separados por un espacio");
//        num1 = sc.nextInt();
//        num2 = sc.nextInt();
//        System.out.println(num1 + "-" + num2);
         System.out.println("primer else if sense cap else");
         if(num1>num2)
         { //cierto que num1>num2
             System.out.println("***" + num2 + " < " + num1);
         }
         else if (num1<num2)
         { //falso que num1>num2 --- > num2>=num1
             System.out.println("->" + num1 + " < " + num2);
         }
         else if (num1==num2)
         {
             System.out.println(num1);
         }

         System.out.println("segon else if amb  sol else ");
         if(num1>num2)
         { //cierto que num1>num2
             System.out.println(num2 + " < " + num1);
         }
         else if (num1<num2)
         { //falso que num1>num2 --- > num2>=num1
             System.out.println(num1 + " < " + num2);
         }
         else 
         {
             System.out.println(num1);
         }
         
         System.out.println("****** If anidado dentro de un else ****");
         if(num1>num2)
         { //cierto que num1>num2
             System.out.println(num2 + " < " + num1);
         }
         else 
         {
            if (num1<num2)
            { //falso que num1>num2 --- > num2>=num1
                System.out.println(num1 + " < " + num2);
            }
            else 
            {
                System.out.println(num1);
            }
         }  
    }
    
}
