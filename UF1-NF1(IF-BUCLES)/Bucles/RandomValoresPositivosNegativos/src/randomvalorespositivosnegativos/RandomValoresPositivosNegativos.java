/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package randomvalorespositivosnegativos;

/**
 *
 * @author mabardaji
 */
public class RandomValoresPositivosNegativos {

    /**
     * dara valores random pero incluyendo negativos
     * valores random del -100 a 100
     */
    public static void main(String[] args) {
        int max = 201;
        int min = 1;
        int range = max - min + 1;  
        int numero_correcte, num_cambiado_positivo_negativo;
        int mayor=100;
        System.out.println("Valores aleatorios del -100 al 100");
        for (int i = 0; i < 10; i++) {
            numero_correcte= (int)(Math.random()*range) + min;
            num_cambiado_positivo_negativo = numero_correcte - (mayor+1);
            System.out.println(numero_correcte + " <---> " + num_cambiado_positivo_negativo);
        }
    
    }
    
}
