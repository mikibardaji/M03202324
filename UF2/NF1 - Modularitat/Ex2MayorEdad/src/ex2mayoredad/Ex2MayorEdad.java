/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2mayoredad;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex2MayorEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age;
        boolean mayor;
        age = pedirDatoEnteroPositivo();  //funcionalitat 1 pedir dato positivo
        mayor = esMayorEdad(age); //averiguar si eres mayor de edad
        mostrarConsolaMayorEdad(mayor);  //mostrar por consola el resultado
        
    }
    
    
    /**
     * función que dice si una persona es mayor de edad
     * @param edad
     * @return true si es mayor de edad y false si no lo es
     */
    public static boolean esMayorEdad(int edad)
    {
        //boolean mayor=false;
        if (edad>=18)
        {
          //  mayor=true;
            return true;
        }
        else
        {
            return false;
        }
        
        //return mayor;
    }

    /**
     * Pedir un valro al usuari
     * el valor debe ser superior a 0
     * @return valor introducido usuario entero
     */
    public static int pedirDatoEnteroPositivo() {
          Scanner sc = new Scanner(System.in); 
          int num;
          System.out.println("Edad?");
          do
          {
           System.out.println("valor debe ser superior a 0 ");
           num = sc.nextInt();
          }while(num<=0);
          return num;
    }

    /**
     * mostrara la frase si eres mayor de edad o no
     * @param mayor 
     */
    public static void mostrarConsolaMayorEdad(boolean mayor) {
        if(mayor) //mayor==true
        {
            System.out.println("Eres mayor de edad");
        }
        else
        {
            System.out.println("Menor de edad");
        }
    }
    
    
    
    
}
