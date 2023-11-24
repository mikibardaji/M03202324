/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication87;

import java.util.Scanner;

/**
 * Para casa
 * 
 * un array con notas
 * Las notas se deben informar con un aleatorio
 * mostrar todas las notas
 * y calcular la media
 * @author mabardaji
 */
public class ArrayPruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Saber la estatura media de los alumnos de clase
        double altura_alumnos[] = new double[5]; 
        
        //mostrar_array_double(altura_alumnos);
        
        System.out.println("******************");
//        altura_alumnos[0]=1.65;
//        altura_alumnos[1]=1.75;
//        altura_alumnos[2]=2.75;
//        altura_alumnos[3]=1;
//        altura_alumnos[4]=2.05;
        introducirAlturaAlumnos(altura_alumnos);

        
        mostrar_array_double(altura_alumnos);
        double media;
        double suma=0;
        
        for (int index = 0; index < altura_alumnos.length; index++) {
            System.out.println(index + " -> " + altura_alumnos[index]);
            suma = suma + altura_alumnos[index];
        }
        System.out.println("La altura sumada es " + suma);
        media = suma/altura_alumnos.length;
        System.out.println("La media de altura es " + media);
    }

    private static void mostrar_array_double(double[] altura_alumnos) {
        for (int index = 0; index < altura_alumnos.length; index++) {
            System.out.println(index + " -> " + altura_alumnos[index]);
        }
    }

    private static void introducirAlturaAlumnos(double[] altura_alumnos) {
        System.out.println("Introduce la altura de los alumnos y te dire su media");
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < altura_alumnos.length; i++) {
            System.out.print("Pon altura estudiante " + (i+1) + " = ");
            altura_alumnos[i] = sc.nextDouble();
        }
    }
    
}
