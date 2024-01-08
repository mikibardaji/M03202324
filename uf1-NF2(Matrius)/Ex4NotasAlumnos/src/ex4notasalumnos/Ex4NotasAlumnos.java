/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex4notasalumnos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 Necesitamos crear un programa para almacenar las notas de 4 alumnos (llamados “Alumno
1”, “Alumno 2”, etc.) y 5 asignaturas. El usuario introducirá las notas por teclado y luego el
programa mostrará la nota mínima, máxima y media de cada alumno.
 */
public class Ex4NotasAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int ALUMNES_FIL = 4;
        final int NOTES_COL = 5;
        int[][] notas = new int [ALUMNES_FIL][NOTES_COL];
        introducirNotasAleatorias(notas);
        mostrarNotasAlumnos(notas);
        encontrarMinimaMaximaMediaCadaAlumno(notas);
        
        
    }

    private static void introducirNotasAleatorias(int[][] notas) {
        Random rd = new Random();
        for (int alumnos = 0; alumnos < notas.length; alumnos++) {
            
            for (int notas_modulo = 0; notas_modulo < notas[0].length; notas_modulo++) {
                notas[alumnos][notas_modulo] = rd.nextInt(0, 11);
            }
            
        }
    }
    
    private static void mostrarNotasAlumnos(int[][] numeros) {
                //mostrar valores del array
        for (int fil = 0; fil < numeros.length; fil++) {
            System.out.print("Alumno " + (fil+1) + "-> \t");
            for (int col = 0; col < numeros[fil].length; col++) { //=fil[0].length
                System.out.print(numeros[fil][col]+"\t");
            } 
            System.out.println(""); //salt de linea
        } 
    }

    /**
     * funcion que busca/muestra que nota es la minima para cada alumno
     * la nota maxima para cada alumno
     * y la media de sus notas
     * @param notas de todos los alumnos
     */
    
    private static void encontrarMinimaMaximaMediaCadaAlumno(int[][] notas) {
        int min, max; //por cada alumno
        int notas_acum=0;
        double media;
        Scanner sc = new Scanner(System.in);
        for (int alumno = 0; alumno < notas.length; alumno++) {
            min = notas[alumno][0]; //la primera
            max = notas[alumno][0]; //laprimera 
            notas_acum=0;
            for (int modulo = 0; modulo < notas[alumno].length; modulo++) {
                notas_acum = notas_acum + notas[alumno][modulo]; //guardo y acumulo la nota
                if(min > notas[alumno][modulo])
                { //modifico min por el valor actual de la posicion
                    min = notas[alumno][modulo];
                }
                else if (max < notas[alumno][modulo])
                {
                    max = notas[alumno][modulo];
                }
            }//termino las columnas(notas)
            
            media = (double)notas_acum/notas[alumno].length;
            System.out.println("nota minima alumno " + (alumno+1) + "-" + min );
            System.out.println("nota maxima alumno " + (alumno+1) + "-" +  max );
            System.out.println("nota media  alumno " + (alumno+1) + "-" +  media );
            System.out.println("Pulsa enter para ver el siguiente alumno");
            sc.nextLine(); //pausa
        }
        
    }
}
