/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf2pe1penaltis;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class UF2Pe1Penaltis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int golJ=0, golM=0, ronda=0;
        String costat_jugador, costat_maquina;
       
        do
        {
            costat_jugador = triarCostatJugador();
            mostrar_lado_texto(costat_jugador);
            costat_maquina = triarCostatMaquina(); 
            System.out.println("Maquina hace de portero ******");
            mostrar_lado_texto(costat_maquina);
            if (esGol(costat_maquina, costat_jugador))
            {
                golJ++;
            }
            Marcador(golJ, golM);
       
            costat_maquina = triarCostatMaquina(); 
            System.out.println("Maquina xuta ******");
            //mostrar_lado_texto(costat_maquina);
            costat_jugador = triarCostatJugador();
            mostrar_lado_texto(costat_jugador);
            
            if (esGol(costat_jugador, costat_maquina))
            {
                golM++;
            }
            Marcador(golJ, golM);
            ronda++;
        }while(continuarJugant(golJ, golM, ronda));
        
        
        if (golJ>golM)
        {
            System.out.println("Has guanyat");
        }
        else if (golJ<golM)
        {
            System.out.println("Has perdut");
        }
        else
        {
            System.out.println("Empat");
        }
//        System.out.println(triarCostatMaquina());
//        System.out.println(triarCostatJugador());
       
    }
    
    
    public static String triarCostatMaquina()
    {
        int min = 0, max = 2, range=max-min+1, valor;
        String tirada="";
        
        //(0,75 pts)int min = 7, max = 9, range=max-min+1, list, valor=0;
        //(0,5 pts)int min = 0, max = 2, range=max-min+1, list, valor=0;
        valor =  (int)(Math.random()*range)+min;
        
        switch(valor)
        {
            case 0:
              tirada = "Esquerra";
              break;
            case 1:
              tirada = "Dreta";
              break;
            case 2:
              tirada = "Centre";
              break;
        }
        
        return tirada;
    }
    
    public static String triarCostatJugador()
    {
        Scanner sc = new Scanner(System.in);
        String costatValor = "";
        do
        {
            System.out.println("Escoge Esquerra/Dreta/Centre)? ");
            costatValor = sc.nextLine();
            
        }while(!(costatValor.equalsIgnoreCase("Esquerra")
                || costatValor.equalsIgnoreCase("Dreta")
                || costatValor.equalsIgnoreCase("Centre")));
        return costatValor;
    }
    
    public static void  mostrar_lado_texto(String lado)
    {
        System.out.println("Ha tirado a " + lado);
    }
    
    public static void  mostrar_lado_texto_entero(int lado)
    {
        switch (lado) {
            case 7:
                System.out.println("Ha tirat a esquerra");
                break;
            case 8:
                System.out.println("Ha tirat a dreta");
                break;
            case 9:
                System.out.println("Ha tirat a centre");
                break;
            default: 
                break;
        }
    }
    
    public static boolean esGol(String portero, String tirador)
    {
        if (portero.equalsIgnoreCase(tirador))
        {
            System.out.println("Parada!!!!");
            return false;
        }
        else 
        {
            System.out.println("GOOOOOOOOOLLL!!!!!");
            return true;
        }
    }
    
    
    public static void Marcador(int golJ, int golM)
    {
        System.out.println("*****************");
        System.out.println("Gol Jugador=" + golJ);
        System.out.println("Gol Maquina=" + golM);
        System.out.println("*****************");
    }
    
    public static boolean continuarJugant(int golJ, int golM, int ronda)
    {
        int diferencia_gols ;
        if (golM>golJ)
        {
            diferencia_gols = golM - golJ;
        }
        else
        {
            diferencia_gols = golJ - golM;
        }
        
        int rondes_restants = 5 - ronda;
        if (diferencia_gols>rondes_restants || ronda==5)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
