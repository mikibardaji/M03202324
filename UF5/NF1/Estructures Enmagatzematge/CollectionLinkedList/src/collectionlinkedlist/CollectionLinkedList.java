/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionlinkedlist;

import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;

/**
 *
 * @author mabardaji
 */
public class CollectionLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuDaw menu = new MenuDaw("Gestio de cues");
       
       // conté la colecció del model dades
       int opcio;
       boolean exit = false;
       addAllOptions(menu); 
       
       //introDadesProva(Inventory);
       
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       do
       {
           //mostrar el menu i escollir opcio CASA
          opcio = menu.displayMenu();
          switch(opcio)
            {
                case 1: //afegir
             
                    break;
                case 2:    //consultar
            
                    break;
                case 3:    //consultar per nom
             
                    break;                    
                case 4:    //consultar per nom
       
                    break;             
                case 5:    //consultar per nom
           
                    break; 
                case 6: //Sortir
                    exit = true;
                    break;
            } 
       }while(!exit);
    }
    
    
    private static void addAllOptions(MenuDaw menu) {
        try {
            //Afegir personatge
            menu.addOption("Afegir cua");
            menu.addOption("Atendre persona");
            menu.addOption("Llistar cua");
            menu.addOption("Llistar cua ordenada");
            menu.addOption("Marxa ultima persona");
            menu.addOption("Sortir");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }
}
