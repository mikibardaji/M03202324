/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appelectrodomesticos;

/**
 *
 * @author mabardaji
 */
public class AppElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Electrodomestico radio = new RadioReceptor("roja", 80, 100, 2010);
        System.out.println("Precio con iva " + radio.calcularPrecio());
        if (radio.tieneGarantia())
        {
            System.out.println("Esta aún en garantia");
        }
        else
        {
            System.out.println("No tiene");
        }
        
        
        
    }
    
}
