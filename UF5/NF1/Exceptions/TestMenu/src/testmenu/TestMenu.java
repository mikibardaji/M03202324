/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testmenu;

import menuUtils.OptionDuplicateException;
import menuUtils.MenuDaw;
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
            menu_daw.addOption("Manager");
            menu_daw.addOption("Stadistics");
            menu_daw.displayMenu();
            menu_daw.RemoveOptionByIndex(2);
            menu_daw.displayMenu();
            menu_daw.Remove("Settings");
            menu_daw.displayMenu();
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
