/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturagui;

/**
 *
 * @author mabardaji
 */
public class TemperaturaGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                createAndShowGUIGridLayout();
            }

        });
    }
    
    private static void createAndShowGUIGridLayout()
    {
        //etiqueta temperatura - Radiobutton Celsius
        //cuadre text          - RadioButton Farenheit
        //boto convertir       - RadioButton Kelvin
    }
    
}
