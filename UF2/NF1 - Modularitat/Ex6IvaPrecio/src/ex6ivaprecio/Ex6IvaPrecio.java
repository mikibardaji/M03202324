/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex6ivaprecio;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex6IvaPrecio {

    /**
     * Escribe un programa que pida cinco precios y muestre por pantalla el precio de venta de cada
uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
double precioConIVA(double precio) // Devuelve el precio tras sumarle un 21% de IVA
     */
    public static void main(String[] args) {
        double precio, precioIVA;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce el precio " + i);
            precio = pedirPrecioPositivo();
            precioIVA = precioConIva(precio);
            System.out.println("Precio " + i + " con Iva..." + precioIVA);
        }
    }
    
    
    /**
     * calcula el iva de un precio sin iva y devuelve el total
     * @param precio sin iva
     * @return precio con iva
     */
    public static double precioConIva(double precio)
    {
        double IVA = (precio *0.21);
        precio = precio + IVA;
        return precio;
        
    }
    
    
         /**
     * Pedir un valro al usuari
     * el valor debe ser superior a 0
     * @return valor introducido usuario entero
     */
    public static int pedirPrecioPositivo() {
          Scanner sc = new Scanner(System.in); 
          int num;
          //System.out.println("Edad?");
          do
          {
           System.out.print("El valor debe ser superior a 0: ");
           num = sc.nextInt();
          }while(num<=0);
          return num;
    }
    
}
