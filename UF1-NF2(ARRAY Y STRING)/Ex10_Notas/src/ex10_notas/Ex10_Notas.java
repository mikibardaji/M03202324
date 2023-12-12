/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10_notas;

import java.util.Scanner;

/**
 * Un alumno tiene las notas siguientes conseguidas en una serie de pruebas : 5, 6, 8, 7. 
 * El peso de cada prueba en la nota final es 0.15 , 0.2 , 0.4 y 0.25 respectivamente. 
 * Crea dos arrays diferentes con estos valores y calcula la nota final. (
 * Hay que multiplicar cada nota por su peso y sumarlo todo ).
 * @author mabardaji
 */
public class Ex10_Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[] notas = new double[4];
        double[] peso = new double[4];
        inicializarPeso(peso);
        ponerNotas(notas);
        double nota_final= calcularNotaFinal(peso, notas);
        mostrarNota(nota_final);
    }

    /**
     * Se inicializa cada una de las notas con el peso final de la asignatura
     *  El peso de cada prueba en la nota final es 0.15 , 0.2 , 0.4 y 0.25 
     * @param peso 
     */
    private static void inicializarPeso(double[] peso) {
        peso[0] = 0.15;
        peso[1] = 0.2;
        peso[2] = 0.4;
        peso[3] = 0.25;
    }

    /**
     * pido las notas sacadas al usuario y las guardamos en un array
     * @param notas arrayt con las notas sacadas
     */
    private static void ponerNotas(double[] notas) {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < notas.length; i++) {
                System.out.println("Nota " + (i+1));
                notas[i] = sc.nextDouble();
        }
    }

    /**
     * 
     * @param peso
     * @param notas 
     */
    private static double calcularNotaFinal(double[] peso, double[] notas) {
        double nota_peso;
        double nota_final_acum=0;
        for (int i = 0; i < notas.length; i++) {
            nota_peso = peso[i]*notas[i];
            nota_final_acum = nota_final_acum + nota_peso;
        }
        return nota_final_acum;
    }

    private static void mostrarNota(double nota_final) {
        System.out.println("Tu nota es " + nota_final);
    }
    
}
