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
        // Mostrar información inicial del artículo
        System.out.println("Información inicial del Articulo 1:");
        articulo1.imprimeInformacion();

        // Modificar precio del artículo
        System.out.println("Cambio el precio a  15 ");
        articulo1.setPrecio(15.0);

        // Mostrar información después de la modificación
        System.out.println("\nInformación después de modificar el precio del Articulo 1:");
        articulo1.imprimeInformacion();
        
        System.out.println("cambio el precio a -15 y el set da " + articulo1.setPrecio(-15.0));
        
        // Vender y almacenar unidades
        articulo1.vender(20);
        articulo1.almacenar(30);

        // Mostrar información después de vender y almacenar
        System.out.println("\nInformación después de vender y almacenar unidades del Articulo 1:");
        articulo1.imprimeInformacion();

        // Pruebas con valores erróneos
        Articulo articulo3 = new Articulo("", -5.0, -10, 0); // Debería mostrar un mensaje de error
        articulo1.setNombre(""); // Debería mostrar un mensaje de error
        articulo1.setPrecio(-7.0); // Debería mostrar un mensaje de error
        articulo1.setCuantosQuedan(-15); // Debería mostrar un mensaje de error
        articulo1.vender(60); // Debería mostrar un mensaje de error
        articulo1.almacenar(-5); // Debería mostrar un mensaje de error
    }
    
}
