/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex21;

import java.util.Scanner;

/**
 *
 * Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo
oportuno. Implementa las funciones:
int menu() // Muestra el menú y devuelve el número elegido
double pideRadio() // Pide que se introduzca el radio y lo devuelve
double circunferencia(double r) // Calcula la circunferencia y la devuelve
double area(double r) // Calcula el área y la devuelve
 */
public class Ex21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = menu();
        double longitud,radio,area;
        System.out.println("opción escogida " + opcion);
        radio = pideRadio();
        if(opcion==1)
        {
            longitud=CircunferenciaLongitud(radio);
            System.out.println("Longitud circunferencia--->" + longitud);
        }
        else if(opcion==2)
        {
            area = area(radio);
            System.out.println("Area circunferencia " + area);
        }

    }
    
    public static int menu()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Longitud Circumferencia");
        System.out.println("2. Area Circumferencia");
        int opcion;
        do
        {
            System.out.print("Elige opción(1/2): ");
            opcion = sc.nextInt();
            if (opcion<=0 || opcion > 2)
            {
                System.out.println("Solo valido 1 o 2");
            }
        }while(opcion<=0 || opcion > 2);
        return opcion;
    }
    
    /**
     * 
     * @return radio valido
     */
    public static double pideRadio()
    {
        Scanner sc = new Scanner(System.in);
        double radio;
        do
        {
            System.out.print("Introduce radio");
            System.out.print("...Valor positivo ");
            radio = sc.nextDouble();
        }while(radio<=0);
        return radio;
    }
    
    public static double CircunferenciaLongitud(double radio)
    {
        final double pi=3.14;
        double longitud=pi*radio*2;
        return longitud;
    }
    
    public static double area(double r)
    {
        final double pi=3.14;
        double area = 0;
        area = r*r*pi;
        //area = r*r*Math.PI;
        return area;
    }
}
