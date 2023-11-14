/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1practicauf2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1PracticaUF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldo=10;
        boolean victoria=false;
        boolean estado=false;
        int apuesta,dado1,dado2, premio;
        do
        {       
            apuesta = quantitat_apostada(saldo);
            dado1 = tirada_dau();
            dado2 = tirada_dau();
            mostrar_tirada(dado1, dado2);
            saldo = saldo - apuesta;
            premio = calcular_premi(dado1, dado2, apuesta);
            saldo = saldo + premio;
            estado = seguir_jugant(saldo);
            if(dado1==6 && dado2==6)
            {
                victoria=true;
            }
            if(saldo>30)
            {
                saldo=30;
            }
        }while(estado && !victoria);
        
        System.out.println("te has llevado " + saldo);
        
        //}while(estado==true && victoria==false);
        //mostrar_tirada(5, 2);
    }
    
    /*quantitat_apostada (0,5 pts), funció que rep d?entrada un enter(saldo), 
         i dins demana a l'usuari quants diners vol apostar. 
           Retornarà els diners apostats sempre que sigui una quantitat positiva 
i no superior el saldo d?entrada. En cas contrari, seguirà preguntant.*/
    /**
     * funció que em demana quant vull apostar
     * @param saldo diner maxim a apostar
     * @return diner aposta valida
     */
    public static int quantitat_apostada(int saldo)
    {
        Scanner sc = new Scanner(System.in);
        int aposta;
        do{
            System.out.println("Quant vols apostar tens " + saldo);
            aposta = sc.nextInt();
        }while(aposta<=0 || aposta>saldo);
        return aposta;
    }
    
    /**
     * simula la tirada de una dado entre 1 y 6
     * @return valro dado
     */
    public static int tirada_dau()
    {
        int max=6;
        int min=1;
        int rango= max-min+1;
        int dado = (int)(Math.random()*rango)+min;
        return dado; 
    }
    
    /*ep 2 paràmetres d?entrada tipus int i mostra una pantalla similar a aquesta
     ***************************
     * Dau1: int1 *
     * Dau2: int2 *
     ***************************
    */
    public static void mostrar_tirada(int dado1, int dado2)
    {
        System.out.println("*****************");
        System.out.println("* Dado 1-> " + dado1);
        System.out.println("* Dado 2-> " + dado2);
        System.out.println("*****************");
    }
    
    public static int calcular_premi(int resultat1, int resultat2, int aposta)
    {
        if (resultat1==6  && resultat2==6)
        {
            System.out.println("has multiplicat aposta per 3");
            return (aposta*3);
        }
        else if ( (resultat1+ resultat2)>=10)
        {
            System.out.println("guanyes 4 monedes");
            return (aposta+4);
        }
        else if (resultat1==resultat2)
        {
            System.out.println("recuperes diners");
            return aposta;
        }
        else
        {
            System.out.println("Has perdut");
            return 0;
        }
    }
    
    public static boolean seguir_jugant(int saldo)
    {
        if (saldo<=0 || saldo>=30)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
