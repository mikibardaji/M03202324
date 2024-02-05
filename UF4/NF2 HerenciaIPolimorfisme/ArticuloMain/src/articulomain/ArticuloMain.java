/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package articulomain;

/**
 *
 * @author mabardaji
 */
public class ArticuloMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instancia de objeto Articulo
        Articulo articulo1 = new Articulo("Pijama", 10.0, 50, 0.04);
        Articulo articulo2 = new Articulo("Pijama", 10.0, 50, 0.4);
        // Mostrar informaci�n inicial del art�culo
        System.out.println("Informaci�n inicial del Articulo 1:");
        articulo1.imprimeInformacion();

        // Modificar precio del art�culo
        System.out.println("Cambio el precio a  15 ");
        articulo1.setPrecio(15.0);

        // Mostrar informaci�n despu�s de la modificaci�n
        System.out.println("\nInformaci�n despu�s de modificar el precio del Articulo 1:");
        articulo1.imprimeInformacion();
        
        System.out.println("cambio el precio a -15 y el set da " + articulo1.setPrecio(-15.0));
        
        // Vender y almacenar unidades
        articulo1.vender(20);
        articulo1.almacenar(30);

        // Mostrar informaci�n despu�s de vender y almacenar
        System.out.println("\nInformaci�n despu�s de vender y almacenar unidades del Articulo 1:");
        articulo1.imprimeInformacion();

        // Pruebas con valores err�neos
        Articulo articulo3 = new Articulo("", -5.0, -10, 0); // Deber�a mostrar un mensaje de error
        articulo1.setNombre(""); // Deber�a mostrar un mensaje de error
        articulo1.setPrecio(-7.0); // Deber�a mostrar un mensaje de error
        articulo1.setCuantosQuedan(-15); // Deber�a mostrar un mensaje de error
        articulo1.vender(60); // Deber�a mostrar un mensaje de error
        articulo1.almacenar(-5); // Deber�a mostrar un mensaje de error
    }
    
}
