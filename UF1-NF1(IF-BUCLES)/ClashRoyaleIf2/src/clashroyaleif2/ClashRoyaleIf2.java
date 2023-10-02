/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleif2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ClashRoyaleIf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copes, eleccio;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas copas has conseguido?");
        copes = sc.nextInt();
        System.out.print("Escoge carta...");
        if(copes < 2000)
        {
            System.out.println("Entre mago(0) y mega esbirro(1)");
        }
        else if (copes >= 2000 && copes < 3000)
        {
            System.out.println("Entre bandida(0) y cavallero(1)");
        }
        else if (copes>=3000)
        {
            System.out.println("Entre esqueletos(0) y gigante(1)");
        } 
        System.out.print("opcion? ");
        eleccio = sc.nextInt();
        
        if (eleccio==0)
        {
            if (copes <2000)
            {
                System.out.println("has escogido mago");
            }
             else if (copes >= 2000 && copes < 3000)
             {
                 System.out.println("Has escogido bandida");
             }
            else //if (copes>=3000)
            {
                System.out.println("esqueletos");
            }
        }
        else if (eleccio==1)
        {
            if (copes <2000)
            {
                System.out.println("has escogido megaesbirro");
            }
             else if (copes >= 2000 && copes < 3000)
             {
                 System.out.println("Has escogido cavallero");
             }
            else //if (copes>=3000)
            {
                System.out.println("gigante");
            }
            
        }
        else //opcion no valida
        {
            System.out.println("opcion no valida");
        }
        
        
        
        
        
        
        
       /* if(copes < 2000)
        {
            if (eleccio==0)
            {
                System.out.println("mago");
            }
            else if (eleccio == 1)
            {
                System.out.println("mega esbirro");
            }
            else
            {
                System.out.println("opvion no valida");
            }
               
        }
        else if (copes >= 2000 && copes < 3000)
        {
            System.out.println("Entre bandida(0) y cavallero(1)");
        }
        else if (copes>=3000)
        {
            System.out.println("Entre esqueletos(0) y gigante(1)");
        } */
        
        
        
        
    }
    
}
