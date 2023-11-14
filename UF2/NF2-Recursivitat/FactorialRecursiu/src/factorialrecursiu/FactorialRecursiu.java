/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialrecursiu;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class FactorialRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Pon un numero y te calculare su factorial");
        System.out.println("Pon un numero su fibonnacci");
        int valor = sc.nextInt();
        //int total_factorial = factorial(valor);
        //System.out.println(valor + "! = " + total_factorial);
        int total_fibonacci = fibonacci(valor);
        System.out.println("fibonacci("+valor+")="+ total_fibonacci);
    }
    
    
    public static int factorial(int numero) throws InterruptedException
    {
        /*caso base (1 o mes)
        if (numero<=1)
        {         return 1;         }
        */
        if (numero==1)
        {
            System.out.println("Caso base--> " + numero + " retorno 1");
            Thread.sleep(1000);
            return 1;
        }
        else if (numero==0)
        {
            System.out.println("Caso base--> " + numero  + " retorno 1");
            Thread.sleep(1000);
            return 1;
        }
        /*caso recursiu (1 o mes), quant
        torno a cridar a la mateixa funció
        la/les variables, son les mateixes però 
        el valor ha canviat apropant-se al cas recursiu 
        */
        else if (numero>1)
        { /* (variable o calculo) (signo operacion(+/-/ * //) crida mateixa funció
                amb els valors de les variables canviat */
            System.out.println("Caso recursiu--> " + numero);
            Thread.sleep(1000);
            int calculo = numero * factorial(numero-1);
            System.out.println("he hecho el calculo para " + numero +
                    " y devuelve " + calculo);
            Thread.sleep(1000);
            return calculo; /** podriem eliminar calculo i ficar return 
             * return numero * factorial(numero-1);
             */
        }
        return 0;
    }

    /**
     * calcula fibonacci de forma recursiva
     * @param valor del que quieres obtener el fibonaccio
     * @return 
     */
    private static int fibonacci(int valor) throws InterruptedException {
            /*caso base*/
            if (valor==0)
            {
                System.out.println("Caso base--> " + valor + " retorno 0");
            Thread.sleep(1000);
                return 0;
            }
            else if (valor==1)
            {
                System.out.println("Caso base--> " + valor + " retorno 1");
            Thread.sleep(1000);
                return 1;
            }
            /* caso recursivo*/
            //else if(!((valor==0) && (valor==1)))
            else /*NO LLAMARE CON NEGATIVO*/
                    {
                        System.out.println("fibonacci de " + valor
                        + " llamare a fibonacci de " + (valor-1) + " y "
                        + (valor-2));
                         Thread.sleep(4000);
                        int calculo = fibonacci(valor-1) + fibonacci(valor-2);
                        System.out.println("con valor " + valor + " el "
                                + "fibonacci es " + calculo);
                           Thread.sleep(4000);
                        return calculo;
                    }
    }
    
}
