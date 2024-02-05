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
        Rectangulo rectangulo2 = new Rectangulo(7, 9, 2, 3); // Debería mostrar un mensaje de error

        // Mostrar información inicial de los rectángulos
        System.out.println("Información inicial del Rectangulo 1:");
        rectangulo1.imprimeInformacion();

        System.out.println("\nInformación inicial del Rectangulo 2:");

        // Modificar coordenadas del Rectangulo 1
        rectangulo1.setX1Y1(1, 2);
        rectangulo1.setX2Y2(6, 7);

        // Modificar coordenadas del Rectangulo 2 (incorrectas)
        rectangulo2.setAll(3, 4, 8, 10); // Debería mostrar un mensaje de error

        // Mostrar información después de las modificaciones
        System.out.println("\nInformación después de las modificaciones del Rectangulo 1:");
        rectangulo1.imprimeInformacion();

        // Calcular y mostrar perímetro y área
        System.out.println("\nPerímetro del Rectangulo 1: " + rectangulo1.getPerimetro());
        System.out.println("Área del Rectangulo 1: " + rectangulo1.getArea());
    }
    
}
