/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulomain;

/**
 *
 * @author mabardaji
 */
public class RectanguloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancia de objetos Rectangulo
        Rectangulo rectangulo1 = new Rectangulo(0, 0, 5, 5);
        Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3); // Deber�a mostrar un mensaje de error

        // Mostrar informaci�n inicial de los rect�ngulos
        System.out.println("Informaci�n inicial del Rectangulo 1:");
        rectangulo1.imprimeInformacion();

        System.out.println("\nInformaci�n inicial del Rectangulo 2:");

        // Modificar coordenadas del Rectangulo 1
        rectangulo1.setX1Y1(1, 2);
        rectangulo1.setX2Y2(6, 7);

        // Modificar coordenadas del Rectangulo 2 (incorrectas)
        rectangulo2.setAll(3, 4, 8, 10); // Deber�a mostrar un mensaje de error

        // Mostrar informaci�n despu�s de las modificaciones
        System.out.println("\nInformaci�n despu�s de las modificaciones del Rectangulo 1:");
        rectangulo1.imprimeInformacion();

        // Calcular y mostrar per�metro y �rea
        System.out.println("\nPer�metro del Rectangulo 1: " + rectangulo1.getPerimetro());
        System.out.println("�rea del Rectangulo 1: " + rectangulo1.getArea());
    }
    
}
