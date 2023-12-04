/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraystrings;

/**
 *
 * @author mabardaji
 */
public class ArrayStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] clases = new String[4];
        //totes les posicions estan a null
//        for (int i = 0; i < clases.length; i++) {
//            clases[i] = new String();
//        }
        clases[0] = "DAW1";
        clases[1] = "DAMW1";
        clases[2] = "DAM1";
        for (int i = 0; i < clases.length; i++) {
            if (clases[i]!=null)
            {
                System.out.println(clases[i]);
            }
            
        }
    }
    
}
