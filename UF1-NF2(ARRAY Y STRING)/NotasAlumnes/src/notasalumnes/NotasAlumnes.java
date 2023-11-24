/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasalumnes;

/**
 *
 * @author mabardaji
 */
public class NotasAlumnes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int notas_alumnos[] = new int[5];
        int valorInventado = 7;
         System.out.println("valor inventado principio main " + valorInventado);
        //inicialitzar les notes
        introducirNotas(notas_alumnos, valorInventado);
        mostrar_array_int(notas_alumnos);
        System.out.println("valor inventado main " + valorInventado);
        
        double media = calcularMediaNotas(notas_alumnos);
        System.out.println("La nota media es" + media);
    }

    /**
     * funcion que llena todas las notas con un aleatorio del 1 al 10
     * @param notas_alumnos array donde guardare las notas
     */
    private static void introducirNotas(int[] notas_alumnos, int valorInventado) {
        int max = 10, min=0,range;
        range = max-min + 1;
        for (int index = 0; index < notas_alumnos.length; index++) {
            notas_alumnos[index] = (int)(Math.random()*range)+ min;
        }
        valorInventado = 9;
        System.out.println("valor inventando en funcion " + valorInventado);
    }
    
    /**
     * muestra todo el contenido del array
     * @param valores  array qye vamos a mostrar
     */
    private static void mostrar_array_int(int[] valores) {
        System.out.println("mostrando array");
        for (int index = 0; index < valores.length; index++) 
        {
            System.out.println(index + " -> " + valores[index]);
        }
    }

    private static double calcularMediaNotas(int[] notas_alumnos) {
        double media;
        int suma=0;
        System.out.println("calculando media");
        for (int index = 0; index < notas_alumnos.length; index++) 
        {
            System.out.println(index + " -> " + notas_alumnos[index]);
            suma = suma + notas_alumnos[index];
        }
        
        media = (double) suma/notas_alumnos.length;
        return media;
    }
    
}
