/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashryaleifchar;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ClashRyaleIfChar {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        int copes;
        char eleccio;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas copas has conseguido?");
        copes = sc.nextInt();
        System.out.print("Escoge carta...");
        if(copes < 2000)
        {
            System.out.println("Entre mago(m) y mega esbirro(e)");
        }
        else if (copes >= 2000 && copes < 3000)
        {
            System.out.println("Entre bandida(b) y cavallero(c)");
        }
        else if (copes>=3000)
        {
            System.out.println("Entre esqueletos(s) y gigante(g)");
        } 
        System.out.print("opcion? ");
        eleccio = sc.next().charAt(0); //un caracter un char
        System.out.println("eleccio--<" + eleccio);
        
        if (eleccio=='s' || eleccio == 'S')
        {
            System.out.println("has escogido esqueletos");
        }
        else if (eleccio=='g' || eleccio == 'G')
        {
            System.out.println("gigante");
        }
        else if (eleccio == 'b' || eleccio == 'B' )
        {
            System.out.println("Bandida");
        }
        else if (eleccio == 'c' || eleccio == 'C' )
        {
            System.out.println("cavallero");
        }
        else if (eleccio == 'm' || eleccio == 'M' )
        {
            //
        }
            
        
        
        
        
    }
    
}
