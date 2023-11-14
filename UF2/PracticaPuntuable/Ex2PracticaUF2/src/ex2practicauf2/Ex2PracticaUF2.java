/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2practicauf2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2PracticaUF2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon tu sueldo bruto: ");
        double bruto =  sc.nextDouble();
        double retencio = calculPercentatgeIRPF(bruto);
        double neto = calculRetencio(bruto, retencio);
        mostrarResultats(neto);
    }
    
    
    //calculPercentatgeIRPF(double sou_brut) que retorni el percentatge de retenció 
    //que s?aplicarà al treballador en funció del seu sou brut i els valors de la taula anterior.
    /*Fins a 9.999?
2%
De 10.000? a 14.999?
11,5%
De 15.000? a 29.999?
15%
De 30.000? a 44.999?
18,5%
A partir de 45.000?
22%

*/
    public static double calculPercentatgeIRPF(double sou_brut)
    {
        double porciento=0;
        if(sou_brut<=9999)
        {
            porciento = 2;
        }
        else if(sou_brut>=10000 && sou_brut<=14999)
        {
            porciento=11.5;
        }
        else if(sou_brut>=15000 && sou_brut<=29999)
        {
            porciento=15;
        }
        else if(sou_brut>=30000 && sou_brut<=44999)
        {
            porciento=18.5;
        }
        else 
        {
            porciento=22;
        }
        return porciento;
    }

    
    public static double  calculRetencio(double sou_brut,double retencio)
    {
        System.out.println("Sou brut = " + sou_brut + " tu retencio es de" + retencio + "%");
        double descompte = (double)(sou_brut*retencio)/100;
        double sou_net = sou_brut - descompte;
        return sou_net;
    }
           
    public static void  mostrarResultats(double sou_net) 
    {
        double sou_net12= (double)sou_net/12;
        System.out.println("Sou de 12 pagues = " + sou_net12);
        double sou_net14= (double)sou_net/14;
        System.out.println("Sou de 14 pagues = " + sou_net14);
    }
}
