/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1_examen;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1_examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int premium,locals,mercadillo;
        int precio_premium, precio_locals, precio_mercadillo;
        Scanner sc = new Scanner(System.in);
        final int PRECIO_PREMIUM = 20, PRECIO_LOCALS=15, PRECIO_MERCADILLO=7;
        System.out.print("Cuantos productos premium compras?");
        premium = sc.nextInt();
        System.out.print("Cuantos productos locales compras?");
        locals = sc.nextInt();
        System.out.print("Cuantos productos mercadillo compras?");
        mercadillo = sc.nextInt();
        
        precio_premium = premium * PRECIO_PREMIUM;
        precio_locals = locals * PRECIO_LOCALS;
        precio_mercadillo = mercadillo * PRECIO_MERCADILLO;
        
        double total = precio_locals + precio_mercadillo + precio_premium;
        int prod_total = premium + locals + mercadillo;
        boolean descuento = false;
        if (prod_total>5)
        {
            total = total * 0.85;
            descuento = true;
        }
        
        if (total>200)
        {
            if (premium>0)
            {
                total = total - PRECIO_PREMIUM;
            }
            else if (locals>0)
            {
                total = total - PRECIO_LOCALS;
            }
            else
            {
                total = total - PRECIO_MERCADILLO;
            }
        }
        
        System.out.println("Total Premium..." + precio_premium);
        System.out.println("Total locals..." + precio_locals);
        System.out.println("Total mercadillo..." + precio_mercadillo);
        if (descuento == true)
        {
            System.out.println("Se aplica descuento .... SI");
        }
        else
        {
            System.out.println("Se aplica descuento..... NO");
        }
        
        System.out.println("precio total...... " + total);
            
        
        
    }
    
}
