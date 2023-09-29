/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15;

import java.util.Scanner;

/**
 * 15.	Dibuja un ordinograma que lea tres números distintos y nos diga cuál es el mayor.
 * @author mabardaji
 */
public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor1, valor2, valor3;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Pon el valor 1..");
        valor1 = sc.nextInt();
        System.out.print("Pon el valor 2..");
        valor2 = sc.nextInt();
        System.out.print("Pon el valor 3..");
        valor3 = sc.nextInt();
        
        if (valor1>=valor2  && valor1>= valor3)
        {
            System.out.println("valor1 es mas grande " + valor1);
        }
        else if (valor2>= valor1 && valor2 >= valor3)
        {
            System.out.println("valor2 es mas grande " + valor2);
        }
        else //if(valor3>=valor1 && valor3 >= valor2)
        {
            System.out.println("valor3 es mas grande " + valor3);
        }
        
        System.out.println("segona forma"
                + "");
        
        if (valor1>=valor2  && valor1>= valor3)
        {
            System.out.println("valor1 es mas grande " + valor1);
        }
        else 
        {
            if (valor2>= valor1 && valor2 >= valor3)
            {
                System.out.println("valor2 es mas grande " + valor2);
            }
            else //if(valor3>=valor1 && valor3 >= valor2)
            {
                System.out.println("valor3 es mas grande " + valor3);
            } 
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
