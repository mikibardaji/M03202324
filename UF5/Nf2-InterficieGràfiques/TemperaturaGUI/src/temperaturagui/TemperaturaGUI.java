/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package temperaturagui;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

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
         JFrame window = new JFrame("Temperatura ");
         window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
         
         Container pane = window.getContentPane();
        //disposició dels components dintre aquest panel contenidor
        pane.setLayout(new GridLayout(3, 2));
        
        
        JLabel etiqueta = new JLabel("Pon temperatura");
        JRadioButton radio1 = new JRadioButton("Celsius");
        JRadioButton radio2 = new JRadioButton("Farenheit");
        JRadioButton radio3 = new JRadioButton("Kelvin");
        JButton calcular = new JButton("Convertir");
        JTextField entrada = new JTextField();
        
        
        pane.add(etiqueta);
        pane.add(radio1);
        pane.add(entrada);
        pane.add(radio2);
        pane.add(calcular);
        pane.add(radio3);
        
        window.setSize(200, 200);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.setResizable(false);
        
    }
    
}
