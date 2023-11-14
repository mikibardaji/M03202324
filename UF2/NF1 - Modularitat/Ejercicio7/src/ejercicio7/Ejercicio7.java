/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

import java.util.Scanner;

/** double perimetroRectangulo(double ancho, double alto) // Devuelve el perímetro
 * double areaRectangulo(double ancho, double alto) // Devuelve el área
 *
 * @author mabardaji
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ancho, alto;
        System.out.println("Pon un ancho: ");
        ancho = pedirDatoEnteroPositivo();
        System.out.println("Pon un alto: ");
        alto = pedirDatoEnteroPositivo();
        double perimetro= perimetroRectangulo(ancho, alto);
        double area= areaRectangulo(ancho, alto);
        mostrarResultado(area, perimetro);
    }
    public static double perimetroRectangulo(double ancho, double alto) 
    {    
        double perimetro = (ancho + alto) *2;
        return perimetro;
    }
    public static double areaRectangulo(double ancho, double alto) 
    {
        double area = ancho*alto;
        return area;
    }
    public static int pedirDatoEnteroPositivo() {
          Scanner sc = new Scanner(System.in); 
          int num;
          do
          {
           System.out.print("El valor superior a 0... ");
           num = sc.nextInt();
          }while(num<=0);
          return num;
    }

    private static void mostrarResultado(double area, double perimetro) {
        System.out.println("El area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
}
