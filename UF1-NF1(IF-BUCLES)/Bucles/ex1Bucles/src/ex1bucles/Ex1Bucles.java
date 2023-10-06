/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1bucles;

/**
 *
 * @author mabardaji
 */
public class Ex1Bucles {

    /**
     * @param args the command line arguments
     * Realiza un programa que muestre por pantalla los 20 primeros números naturales (1, 2, 3... 20).
     */
    public static void main(String[] args) {
        int cont;
        System.out.println("cuenta con for");
        for (cont = 1; cont <= 20; cont++) {
            System.out.println(cont);   
        }
        System.out.println("cuenta con while");
        cont=1;
        while (cont<=20)
        {
            System.out.println(cont);
            cont = cont + 1;
        }
        System.out.println("cuenta con do while");
        cont=1;
        do
        {
            System.out.println(cont);
            cont = cont + 1;
        }while(cont<=20);
    }
    
}
