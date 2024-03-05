/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmenu;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class TestMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            MenuDaw menu_daw = new MenuDaw("FIFA 23");
            menu_daw.addOption("Settings");
            menu_daw.addOption("Play");
            System.out.println(menu_daw); //toString
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
