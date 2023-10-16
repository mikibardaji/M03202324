/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex11paresyimpares;

/**
 *
 * @author mabardaji
 */
public class EX11ParesYimpares {

    /**
     * Realiza un programa que sume independientemente los pares y los impares de los números
comprendidos entre 100 y 200, y luego muestra por pantalla ambas sumas.
12.
     */
    public static void main(String[] args) {
         //1.-variables contadores vuelta (1...10)
         int cont;
        //2.-variables que cuenta un suceso (contar_positivos)
        //3.-variables para ir acumulando un calculo en cada vuelta
        int suma_pares=0, suma_impares=0;
        //4.interruptor, variable que se activa si sucede algun cosa en concreto
        //5 condicion bucle nota!=-1 nota==-1,
        
        for (cont = 100; cont <= 200; cont++) {
            if (cont%2 == 0)
            { //pares
                suma_pares = suma_pares + cont;
            }
            else
            {
                suma_impares = suma_impares + cont;
            }
        }
        System.out.println("Pares total:" + suma_pares);
        System.out.println("Impares total:" + suma_impares);
        
        
        
    }
    
}
