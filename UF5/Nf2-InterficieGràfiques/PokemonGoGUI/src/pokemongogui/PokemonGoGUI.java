/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemongogui;

import BD.DBConnect;
import Vista.MainFrame;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import model.EntrenadorDAO;

/**
 *
 * @author mabardaji
 */
public class PokemonGoGUI {

    /**
     * @param args the command line arguments
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        try {
                            //        PokemonGoGUI app = new PokemonGoGUI();
                //
                //        app.run();
               DBConnect.loadDriver();
                EntrenadorDAO model =new EntrenadorDAO();
                SwingUtilities.invokeLater(() -> {
                    MainFrame window = new MainFrame(model);
                });
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PokemonGoGUI.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

    /**
     * per ara no l'utilitzo
     */
    private void run() {
        try {
            //Una finestra amb 3 menus
            // Init --> Exit
            // Entrenadors --> Alta, Baixa (Implementar )
            // Pokemon --> Alta (no obligatori)
            EntrenadorDAO model = new EntrenadorDAO();
            SwingUtilities.invokeLater(() -> {
                MainFrame window = new MainFrame(model);
            }); 
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
           // JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
}
