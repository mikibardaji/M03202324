/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3amazon;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex3Amazon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n_premium, n_locals, n_mercadillo;
        int total_premium, total_local, total_mercadillo;
        int  numero_productos;
        float descuento,factura_total;
        final int PRECIO_PREMIUM=20,PRECIO_LOCAL = 15, PRECIO_MERCADILLO=7; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos productos premium compras?");
        n_premium = sc.nextInt();
        System.out.println("Cuantos productos locales compras?");
        n_locals = sc.nextInt();
        System.out.println("Cuantos productos mercadillo compras?");
        n_mercadillo = sc.nextInt();
     
        total_premium = n_premium*PRECIO_PREMIUM;
        total_local = n_locals*PRECIO_LOCAL;
        total_mercadillo = n_mercadillo*PRECIO_MERCADILLO;
        numero_productos = n_premium+n_locals+n_mercadillo;
        
        
        
        factura_total = total_local + total_mercadillo + total_premium;
        
        System.out.println("Precios premium    : " + total_premium);
        System.out.println("Precios local      : " + total_local);
        System.out.println("Precios mercadillo : " + total_mercadillo);
        
        if (numero_productos>5)
        {
            descuento = (float)factura_total * 15/100;
            factura_total = factura_total - descuento;
            System.out.println("Descuento 15% SI");
        }
        else
        {
            System.out.println("Descuento 15% NO");
        }

        if (factura_total>200)
        {//uno gratis
            if (n_premium>0)
            {
                factura_total = factura_total - PRECIO_PREMIUM;
            }
            else if (n_locals>0)
            {
                factura_total = factura_total - PRECIO_LOCAL;
            }
            else
            {
                factura_total = factura_total - PRECIO_MERCADILLO;
            }
        }

        System.out.println("Total a pagar      :" + factura_total);
        
        
    }
    
}
