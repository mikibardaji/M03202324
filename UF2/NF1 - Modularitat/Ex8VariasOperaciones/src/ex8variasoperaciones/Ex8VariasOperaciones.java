/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex8variasoperaciones;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex8VariasOperaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        
        valor = pedirDatoEnteroPositivo();
        int suma = suma1aN(valor);
        System.out.println("La suma de 1 a " + valor + " es " + suma);
        double mitad = intermedio1aN(valor);
        System.out.println("La mitad es " + mitad);
        float multi = producto1aN(valor);
        System.out.println("La multiplicación de 1 a " + valor + " es " + multi);    
        
        
    }
    
    public static int pedirDatoEnteroPositivo() {
          Scanner sc = new Scanner(System.in); 
          int num;
          do
          {
           System.out.print("El valor superior a 0... ");
           num = sc.nextInt();
          }while(num<=0);
          return num;
    }
    
    //int suma1aN(int n) // Devuelve la suma de enteros de 1 a n
    public static int suma1aN(int n)
    {
        int i;
        int acum_suma=0;
        for (i = 1; i < n; i++) {
            acum_suma = acum_suma + i;
            //acum_suma += i;
        }
        return acum_suma;
    }
    
    /**
     * encuentra el valor medio de 1 a N
     * @param n
     * @return mitad
     */
    public static double intermedio1aN(int n) 
    {
        double mitad = (n)/2;
        return mitad;
    }
    
    public static float producto1aN(int n)
    {
        float producto=1; //valor neutre de la multiplicació
        for (int i = 1; i <= n; i++) {
            producto =producto * i;
        }
        return producto;
    }
}
