/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package puntomain;

/**
 *
 * @author mabardaji
 */
public class PuntoMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancia de objetos Punto
        Punto punto1 = new Punto(5, 0);
        Punto punto2 = new Punto(10, 10);
        Punto punto3 = new Punto(-3, 7);

        // Mostrar coordenadas iniciales utilizando el método imprime
        System.out.println("Coordenadas iniciales:");
        punto1.imprime();
        punto2.imprime();
        punto3.imprime();

        // Modificar coordenadas utilizando el método setXY
        punto1.setXY(punto1.getX() + 2, punto1.getY() - 3);
        punto2.setXY(punto2.getX() * 2, punto2.getY() + 5);
        punto3.setXY(punto3.getX() - 1, punto3.getY() * 3);

        // Desplazar puntos utilizando el método desplaza
        punto1.desplaza(2, 3);
        punto2.desplaza(-1, 4);
        punto3.desplaza(5, -2);

        // Mostrar coordenadas modificadas utilizando el método imprime
        System.out.println("\nCoordenadas modificadas:");
        punto1.imprime();
        punto2.imprime();
        punto3.imprime();

        // Calcular y mostrar la distancia entre dos puntos utilizando el método distancia
        System.out.println("\nDistancia entre punto1 y punto2: " + punto1.distancia(punto2));
        System.out.println("Distancia entre punto2 y punto3: " + punto2.distancia(punto3));
        System.out.println("Distancia entre punto3 y punto1: " + punto3.distancia(punto1));
    }
    
}
