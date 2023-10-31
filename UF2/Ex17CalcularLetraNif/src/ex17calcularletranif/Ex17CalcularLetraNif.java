/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex17calcularletranif;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex17CalcularLetraNif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Escribe tu DNI");
        int DNI = pedirDatoEnteroPositivo();
        char letra= calcularLetraDNI(DNI);
        System.out.println(letra);
    }
    
    public static char calcularLetraDNI(int DNI)
    {
        int resto = DNI%23;
        char letraDNI=' ';
        switch(resto)
        {
            case 0:
                letraDNI ='T';
                break;
            case 1:
                letraDNI ='R';
                break;
            case 2:
                letraDNI ='W';
                break;
            case 15:
                letraDNI ='S';
                break;            
                /*..*/
        }
        return letraDNI;
    }
    
    
     /**
     * Pedir un valro al usuari
     * el valor debe ser superior a 0
     * @return valor introducido usuario entero
     */
    public static int pedirDatoEnteroPositivo() {
          Scanner sc = new Scanner(System.in); 
          int num;
          //System.out.println("Edad?");
          do
          {
           System.out.print("El valor debe ser superior a 0: ");
           num = sc.nextInt();
          }while(num<=0);
          return num;
    }    
    
}
