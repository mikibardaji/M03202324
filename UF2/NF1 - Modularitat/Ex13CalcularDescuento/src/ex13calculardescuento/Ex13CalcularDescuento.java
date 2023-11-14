/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex13calculardescuento;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex13CalcularDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double precioReal, precioPagado;
        System.out.println("Pon precio real");
        precioReal = pedirDatoDoublePositivo();
        System.out.println("Pon precio pagado... ");
        precioPagado = pedirDatoDoublePositivo();
        
        double x = calcularDescuento(precioReal, precioPagado);
        System.out.println("Tu descuento es de " + x + "%");
    }
    
    
    /**
     * le pasemos ambos valores y nos devuelva el descuento
     * @param precioSinDescuento
     * @param precioConDescuento
     * @return 
     */
    public static double calcularDescuento(double precioSinDescuento, double precioConDescuento)
    {
        double descuento = 100 - (precioConDescuento*100)/precioSinDescuento;
        
        return descuento;
    }
    
    
     /**
     * Pedir un valro al usuari
     * el valor debe ser superior a 0
     * @return valor introducido usuario entero
     */
    public static double pedirDatoDoublePositivo() {
          Scanner sc = new Scanner(System.in); 
          double num;
          //System.out.println("Edad?");
          do
          {
           System.out.print("El valor debe ser superior a 0: ");
           num = sc.nextDouble();
          }while(num<=0);
          return num;
    }
}
