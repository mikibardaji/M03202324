/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesusuario;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class ExcepcionesUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            metodoValoresPequenyos(1);
            metodoValoresPequenyos(15);
        } catch (ExcepcionPropia ex) {
            System.out.println("excepcion capturada " + ex.getMessage());
            System.out.println(ex); //toString
        }
    }
    
    public static void metodoValoresPequenyos(int num) throws ExcepcionPropia
    {
        System.out.println("Metodo llamdo con " + num);
        
        if (num>10)
        {
            throw new ExcepcionPropia("Error excepcion" + num );
        }
        
        System.out.println("Linea final normal sin excepcion");
        
    }
    
}
