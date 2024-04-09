/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AgendaNoms;

import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;
import model.Agenda;



/**
 *
 * @author mabardaji
 */
public class AgendaNomsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //per provar el programa
       boolean exit = false;
       MenuDaw menu = new MenuDaw("Manteniment Agenda ");
       //TO DO declaració variable amb model de dàdes
       Agenda todos = new Agenda();
       addAllOptions(menu); 
       //introDadesProva(/* */);
       int opcio;
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       do
       {
           //mostrar el menu i escollir opcio CASA
          opcio = menu.displayMenu();
          switch(opcio)
            {
                case 1:
                    carregarFitxer();
                    break;
                case 2:  
                    afegirNom();
                    break;
                case 3:  
                    llistarNoms();
                    break;                    
                case 4:    
                    gravarFitxer();
                    break;            
                

                case 5: //Sortir
                    exit = true;
                    break;
            } 
       }while(!exit);
       
       
       
    }

    /**
     * ficar totes les opcions del menú principal
     * @param menu 
     */
    private static void addAllOptions(MenuDaw menu) {
        try {
            menu.addOption("Carregar fitxer de noms");
            menu.addOption("Donar d'alta nom");
            menu.addOption("Llistar noms");
            menu.addOption("Guardar fitxers"); 
            menu.addOption("Sortir");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void introDadesProva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void carregarFitxer() {
            //leer el fichero de datos
            //acumular nombres en una lista
            //pasarle la lista al dao
            
    }

    private static void afegirNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void llistarNoms() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void gravarFitxer() {
        //pido colection DAO (Agenda)
        //recorro colection y grabo cada elemento 
        //en el fichero

    }

    
}
