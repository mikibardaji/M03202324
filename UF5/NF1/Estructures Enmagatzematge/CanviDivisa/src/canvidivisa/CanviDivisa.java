/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canvidivisa;

import java.util.List;
import java.util.Scanner;
import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;

/**
 *
 * @author mabardaji
 */
public class CanviDivisa {

/**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MenuDaw menu = new MenuDaw("Oficina Canvi Divises");
       
        //TO DO falta definir la variable que conte el DAO!!!!!
       // conté la colecció del model dades
       int opcio;
       boolean exit = false;
       addAllOptions(menu); 
       
      // introDadesProva(gestio_cua);
       
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       do
       {
           //mostrar el menu i escollir opcio CASA
          opcio = menu.displayMenu();
          switch(opcio)
            {
                case 2: //afegir
                    
                    break;
                case 3:    //consultar
                    
                    break;
                case 6:    //consultar per nom
                    
                    break;                    
                case 4:    //consultar per nom
                   
                    break;             
                case 5:    //consultar per nom
                  
                    break; 
                case 1: //Sortir
                    exit = true;
                    break;
            } 
       }while(!exit);
    }
    
    
    private static void addAllOptions(MenuDaw menu) {
        try {
            //Afegir personatge
            menu.addOption("Sortir");
            menu.addOption("Alta Divisa");
            menu.addOption("Canvi Divisa"); //desapareix la priemra cua
            menu.addOption("Llistar Divises");
            menu.addOption("Consultar Divisa");
            menu.addOption("Borrar Divisa");
            
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    
    private static void introDadesProva() {
    
    }


    
}
