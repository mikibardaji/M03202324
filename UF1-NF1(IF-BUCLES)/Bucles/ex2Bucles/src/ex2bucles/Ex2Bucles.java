/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2bucles;

/**
 *
 * @author mabardaji
 */
public class Ex2Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont ;
        System.out.println("Con el for");
        for (cont = 0; cont <= 200; cont = cont+2) {
            System.out.println(cont);
        }
        
        System.out.println("*** while");
        cont = 2;
        while(cont<=200)
        {
            System.out.println(cont);
            cont = cont + 2;
        }
        System.out.println("1 al 200 el contador va de uno en uno pero solo quiero los pares");
        for (cont = 0; cont <= 200; cont = cont+1) {
            if(cont%2==0)
            {
                System.out.println(cont);
            }
            
        }
        
        
        
        
    }
    
}
