/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedirvalor;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PedirValor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        a = pedirDatoEntero();
        int resultado = dimeSigno(a);
        mostrarSalida(resultado);
    }
    
    
    /**
     * averigua signo valor
     * @param a
     * @return Devuelve -1 si es negativo, 0 si es igual a 0, 1 si es positivo
     */
    public static int dimeSigno(int a)
    {
        int resultado;
        if (a<0)
        {
            resultado= -1;
        }
        else if(a==0)
        {
            resultado = 0;
        }
        else
        {
            resultado = 1;
        }
        return resultado;
    }
    
    
         /**
     * Pedir un valro al usuari
     * 
     * @return valor introducido usuario entero
     */
    public static int pedirDatoEntero() {
          Scanner sc = new Scanner(System.in); 
          System.out.println("Pon un valor entero");
          int num;
          num = sc.nextInt();
          return num;
    }

    /**
     * muestra si es positivo, negativo o 0 por consola
     * @param resultado valor entrado
     */
    public static void mostrarSalida(int resultado) {
        if (resultado==-1)
        {
            System.out.println("Tu valor es negativo");
        }
        else if (resultado==0)
        {
            System.out.println("Tu valor es 0");
        }
        else {
            System.out.println("Tu valor es positivo");
        }
    }
    
}
