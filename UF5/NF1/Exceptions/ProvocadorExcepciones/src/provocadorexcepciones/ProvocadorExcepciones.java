/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provocadorexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class ProvocadorExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
        dividirCero();
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Valor no numerico " + ex.getMessage() );
            ex.printStackTrace();
        }
        catch(ArithmeticException ex)
        {
            System.out.println("No puedes dividir por 0 message:" + ex.getMessage());
        } catch (InterruptedException ex) {
            System.out.println("Exception interrumpida");
        }
        //desbordamiento();
        //conversionErronea();
        
    }

    private static void dividirCero() throws  InputMismatchException, ArithmeticException, InterruptedException{
        System.out.println("Divisió per 0");
        int a = 5;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pon el numero por el cual quieres dividir el " + a);        
        //try
        //{
            int b = sc.nextInt();
                    
 
            double divisio =  a/b;
                               println("Resultat " + divisio);
            Thread.sleep(100);

     

//            System.out.println("Excepcion ocurruda" + ex.getMessage());
//        }
//        finally
//        {
//            System.out.println("Termina programa finally");
//        }
//        
        
        
    }

    private static void desbordamiento() {
        int[] numeros = {3,4,5,6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Que posicion del array quieres ver");
        int posicion=0;
        boolean correcto=true;
        do{
            try{
                posicion = sc.nextInt();

                System.out.println("En la posicion " + posicion + " hay " + numeros[posicion]);
                correcto=true;
            }catch(ArrayIndexOutOfBoundsException pepe)
            {
                System.out.println("posición no existente " + posicion);
                System.out.println(pepe.getMessage());
                correcto=false;
            }
        }while(!correcto);
        
    }

    private static void conversionErronea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon un numero o frase y lo convierot a entero: ");
        String texto = sc.next();
        try
        {
        int num = Integer.parseInt(texto);
        System.out.println("El numero es " + num);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("no puedo convertir --> " + texto);
        }
        
        System.out.println("dsfdfjlfdwkljfsdklj");
    }
    
}
