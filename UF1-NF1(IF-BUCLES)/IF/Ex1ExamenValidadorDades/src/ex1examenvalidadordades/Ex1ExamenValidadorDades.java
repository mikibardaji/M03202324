/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1examenvalidadordades;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1ExamenValidadorDades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int dia,mes,any;
       Scanner sc = new Scanner(System.in);
        System.out.println("Ficam el dia ");
        dia = sc.nextInt();
        System.out.println("Ficam el mes ");
        mes = sc.nextInt();
        System.out.println("Ficam el any ");
        any = sc.nextInt();
        boolean incorrecto = false;
        //casos incorrectes
        if (any<1900)
        { //error
            System.out.println("Any introduït incorrecte. ha de ser superior a 1900");
            incorrecto=true;
        }
        if(mes <= 0 || mes >12)
        {
            System.out.println("Mes incorrecte sol val 1-12");
            incorrecto=true;
        }
        if(dia<1 || dia > 31)
        {
            System.out.println("Dia incorrecte sol valid 1-30");
            incorrecto=true;
        }
        
        if(incorrecto==false)
        {
            switch(mes)
            {
                case 2:
                    if (dia>28)
                    {
                        System.out.println("dia no valido para el mes");
                        incorrecto=true;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if (dia>30)
                    {
                        System.out.println("dia no valido para el mes");
                        incorrecto = true;
                    }
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if (dia>31)
                    {
                        System.out.println("dia no valido para el mes");
                        incorrecto = true;
                    }
            }
            
            
            
     
        }
        
        
        
        
        //if (any>=1900 && mes>=1 && mes<=12 && dia>=1 && dia <=30)
        if (incorrecto==false)
        {
            System.out.println("Fecha correcta.... ");
        }
        
        
        
    }
    
}
