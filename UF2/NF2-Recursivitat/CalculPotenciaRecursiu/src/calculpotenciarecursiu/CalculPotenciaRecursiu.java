/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculpotenciarecursiu;

import java.util.Scanner;

/**
 *
 * Programa que calculi un numero elevat a una potencia , 
 * tots dos valors demanats al usuari, de forma recursiva.
 */
public class CalculPotenciaRecursiu {

    /**
     * Programa que calculi un numero elevat a una potencia , 
     * tots dos valors demanats al usuari, de forma recursiva.
     */
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Pon la base");
        int base = sc.nextInt();
        System.out.println("Pon el exponente");
        int exponente = sc.nextInt();
        System.out.println("potencia " + potencia(base,exponente));
    }
    
    
    public static int suma_pars(int num)
    {
        if (num%2!=0)
        {
            return -1;
        }
        else if(num==0)
        {
            return num; //es 0
        }
        else
        {
            int calculo = num+suma_pars(num-2);
            return calculo;
        }
    }
    
    public static int potencia(int base, int exp)
    {
        //caso base exp sigui 0
        /*if (exp==1)
        {
            return base;
        }
        else */
        if (exp==0)
        {
            return 1;
        }
        //caso recursiu 3.3.3.3 base*base*base* 
        // 3^5 = 3 * 3^4
        // 3^4 = 3 * 3^3
        // 3^3 = 3 * 3^2
        else 
        {
            return base * potencia(base, exp-1);
        }
    }
}
