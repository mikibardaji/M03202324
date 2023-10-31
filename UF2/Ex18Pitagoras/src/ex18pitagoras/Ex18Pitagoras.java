/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex18pitagoras;

/**
 *
 * @author mabardaji
 */
public class Ex18Pitagoras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cateto1,cateto2,hipo;
        //demanr
        
        
        System.out.println(sonTrianguloRectangulo(3, 2, 5));
    }
    
    
    public static boolean sonTrianguloRectangulo(int cateto1, int cateto2, int hipotenusa)
    {
        int calculo1= (cateto1*cateto1) + (cateto2*cateto2);
        int calculo2= hipotenusa*hipotenusa;
        
        //boolean valido = ((cateto1*cateto1) + (cateto2*cateto2) == (hipotenusa*hipotenusa));
        if (calculo1==calculo2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
