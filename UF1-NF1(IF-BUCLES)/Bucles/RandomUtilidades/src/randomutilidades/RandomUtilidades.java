/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomutilidades;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class RandomUtilidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num_usuari, intentos=0;
        int max = 2;
        int min = 1;
        int range = max - min + 1;  
        int numero_correcte; 
        int cont_creus=0;
        do{
            numero_correcte = (int)(Math.random()*range) + min;
            //simular tirar moneda cara o creu
            if (numero_correcte==1)
            {
                System.out.println("Cara");
            }
            else
            {
                System.out.println("Creu" );
                cont_creus ++;
            }
        } while(cont_creus<3); //1 cara continua
        
    }
    
}
