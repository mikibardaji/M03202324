/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excajasnormalesrarasepicas;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExCajasNormalesRarasEpicas {

    /**
     * abrir cajas que el 60& son normales
     * 30% raras
     * 10% epicas
     * abriremos 100 cajas y miraremos cuantas hemos abierto 
     * de cada tipo
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        int max = 100;
        int min = 1;
        int range = max - min + 1;  
        int numero_correcte;
        numero_correcte= (int)(Math.random()*range) + min;
        int contador;
        int normal=0,rara=0,epica=0;
        
        for (contador = 1; contador <= 100; contador++) {
            
            if (numero_correcte>= 1 && numero_correcte<=60)
            {
                System.out.println("Caja Normal");
                normal++;
            }
            else if(numero_correcte>60 && numero_correcte<=90)
            {
                System.out.println("Caja rara");
                ++rara;
            }
            else
            {
                System.out.println("Caja epica");
                epica = epica + 1;
            }
        } //fi del for
        
        System.out.println("Normales ..... " + normal);
        System.out.println("Rara.......... "+ rara);
        System.out.println("Epica ........ " + epica);            
        
        
        
    }
    
}
