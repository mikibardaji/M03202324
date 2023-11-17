/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package turrorecursiu;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class TurroRecursiu {

    /**
     * S'acosta el Nadal i el vostre professor ja est� pensant, amb la quantitat de torr�
de xocolata que es menjar�!.
Per� clar li preocupa la seva l�nia, i s?ha informat
a la revista HOLA, que cada tros t� 91
calories, , ell es menja cada dia de festa 4!, el
tercer dia com �s sent culpable, nom�s menja 1,
per� despr�s recau i torna als dies seg�ents a 4.
O sigui sempre menja 4 trossos sempre excepte
cada 3 dies que en menja 1.
Feu un programa recursiu, per calcular el
nombre de calories que ha menjat fins al dia que
li indiquis.
     */
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Pon el dia y te dire cuanto llevas comido... ");
        int dia = sc.nextInt();
        System.out.println("Llevas " + contar_trozos(dia) + " trozos ");
         System.out.println("Llevas " + contar_calorias(dia) + " calor�as ");
    }
    
    
    public static int contar_trozos(int dia)
    {
        if (dia==1) /*1 minimo puede haber mas^*/
        {
            return 4;
        }
        //caso recursivo 1 minimo pero puede haber mas*/
        else if (dia%3==0)
        {
            return 1 + contar_trozos(dia-1);
        }
        else //no multiple de 3
        {
            return 4 + contar_trozos(dia-1);
        }
    }
    
    public static int contar_calorias(int dia)
    {
        if (dia==0) /*1 minimo puede haber mas^*/
        {
            return 0;
        } 
        else if (dia%3==0)
        {
         return (1*91) + contar_calorias(dia-1);
        }
        else
        {
            return (4*91) + contar_calorias(dia-1);
        }
    }
}
