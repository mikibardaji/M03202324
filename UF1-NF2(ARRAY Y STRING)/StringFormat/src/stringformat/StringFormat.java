/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stringformat;

/**
 *
 * @author mabardaji
 */
public class StringFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //dona valors del 0 al 1 no inclos
        double valor_aleatorio;
        for (int i = 0; i < 10; i++) {
            valor_aleatorio= (Math.random());
            System.out.println(valor_aleatorio);
            System.out.println(String.format(valor_aleatorio + " redondeo a %.2f - %.3f",valor_aleatorio, valor_aleatorio));
        }
        
    }
    
}
