/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormoneda;

import javax.swing.SwingUtilities;
import model.ConversorModel;
import vista.MainFrame;

/**
 *
 * @author mabardaji
 */
public class ConversorMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ConversorModel model = new ConversorModel();
        SwingUtilities.invokeLater(() -> {
            MainFrame window = new MainFrame(model);
    });
    }
    
}
