/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyaleif;

import java.util.Scanner;

/**
 * exercici clash royale 
 * (https://docs.google.com/document/d/1ySU7DEE5shkag2UKmpCdT_ld5telowmlvcKoptnqQxc/edit?usp=sharing)
 * @author mabardaji
 */
public class ClashRoyaleIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int copes, eleccio;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas copas has conseguido?");
        copes = sc.nextInt();
        if (copes<2000)
        {
            System.out.println("Escoge entre mago(0) i mega esbirro(1)");
            eleccio = sc.nextInt();
            if (eleccio==1)
            {
                System.out.println("Escogido megaesbirro");
            }
            else if (eleccio==0)
            {
                System.out.println("Escogido mago Electrico");
            }
            else
            {
                System.out.println("Opcion no valida");
            }
        }
        else if (copes>=2000 && copes < 3000) //
        { //bandida o cavallero
            System.out.println("Escoge entre bandida(0) i cavallero(1)");
            eleccio = sc.nextInt();
            if (eleccio==1)
            {
                System.out.println("Escogido cavallero");
            }
            else if (eleccio==0)
            {
                System.out.println("Escogido bandida");
            }
            else
            {
                System.out.println("Opcion no valida");
            }  
        }
        else if (copes >= 3000) //
        {
             System.out.println("Escoge entre esqueletos(0) i gigante(1)");
             eleccio = sc.nextInt();
             if (eleccio==1)
            {
                System.out.println("Escogido gigante");
            }
            else if (eleccio==0)
            {
                System.out.println("Escogido esqueletos");
            }
            else
            {
                System.out.println("Opcion no valida");
            }  
        }
    }
    
}
