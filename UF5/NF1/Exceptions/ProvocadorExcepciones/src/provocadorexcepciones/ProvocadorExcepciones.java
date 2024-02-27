/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provocadorexcepciones;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ProvocadorExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        dividirCero();
        //desbordamiento();
        //conversionErronea();
        
    }

    private static void dividirCero() {
        System.out.println("Divisió per 0");
        int a = 5;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon el numero por el cual quieres dividir el " + a);        
        int b = sc.nextInt();
        try
        {
            double divisio =  a/b;
            System.out.println("Resultat " + divisio);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("No puedes dividir por 0 message:" + ex.getMessage());
        }
        finally
        {
            System.out.println("Termina programa finally");
        }
        
        
        
    }

    private static void desbordamiento() {
        int[] numeros = {3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Que posicion del array quieres ver");
        int posicion = sc.nextInt();
        
        System.out.println("En la posicion " + posicion + " hay " + numeros[posicion]);
        
    }

    private static void conversionErronea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero o frase y lo convierot a entero: ");
        String texto = sc.next();
        int num = Integer.parseInt(texto);
        System.out.println("El numero es " + num);
    }
    
}
