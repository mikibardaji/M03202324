/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package allValley;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;
import model.DuplicatePlayerException;
import model.KarateTournee;
import model.KarateMember;
import model.MoreRegistrationsAllowedException;
import model.SortByPower;


/**
 *
 * @author mabardaji
 */
public class AllValleyMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //per provar el programa
       boolean exit = false;
       MenuDaw menu = new MenuDaw(" ");
       //TO DO declaració variable amb model de dàdes
       KarateTournee competicion = new KarateTournee("2024");
       addAllOptions(menu); 
       introDadesProva(competicion);
       int opcio;
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       do
       {
           //mostrar el menu i escollir opcio CASA
          opcio = menu.displayMenu();
          switch(opcio)
            {
                case 1: //afegir
                    afegirLuchador(competicion);
                    break;
                case 2:    //eliminar
                    borrarLuchador(competicion);
                    break;
                case 3:    //indicar lluitador que perd
                    pierdeLuchador(competicion);
                    break;                    
                case 4:    //llistar per mes forts
                    listByPower(competicion);
                    break;            
                case 5:    //Llistar tots els lluitadors d'un dojo
                    listByDojo(competicion);
                    break;  
                

                case 6: //Sortir
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
             menu.addOption("Afegir lluitador");
             menu.addOption("Borrar Lluitador");
             menu.addOption("Lluitador perd");
             menu.addOption("Mostrar lluitadors ordenats per més forts.");
             menu.addOption("Mostrar lluitadors dojo");
            menu.addOption("Sortir");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void introDadesProva(KarateTournee competicion) {
        try {
            competicion.addFighter(new KarateMember("1","dojo1"));
            competicion.addFighter(new KarateMember("2","dojo2"));
            competicion.addFighter(new KarateMember("3","dojo1"));
            competicion.addFighter(new KarateMember("4","dojo2"));
        } catch (MoreRegistrationsAllowedException ex) {
            System.out.println(ex.getMessage());
        } catch (DuplicatePlayerException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    private static void afegirLuchador(KarateTournee competicion) {
        
        try {
            KarateMember add = crearPlayer();
            //competicion.addFighter(add);
            if (competicion.addFighter(add))
            {
                System.out.println("Luchador añadido ... " + competicion.getPlayers());
            }
            else
            {
                System.out.println("No se ha podido añadir");
            }
        } catch (MoreRegistrationsAllowedException ex) {
            System.out.println(ex.getMessage());
        } catch (DuplicatePlayerException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    private static KarateMember crearPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon nombre");
        String name = sc.nextLine();
        System.out.println("Pon dojo");
        String dojo = sc.nextLine();
        KarateMember player = new KarateMember(name, dojo);
        return player;
    }

    private static void borrarLuchador(KarateTournee competicion) {
             KarateMember delete = crearPlayer();
             if (competicion.removeFighter(delete))
             {
                 System.out.println("Luchador borrado..." + competicion.getPlayers());
             }
             else
             {
                 System.out.println("Luchador no existia ");
             }
    }

    private static void pierdeLuchador(KarateTournee competicion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("numero dorsal");
        int dorsal  = sc.nextInt();
        if (competicion.lostFighter(dorsal))
        {
            System.out.println("Luchador eliminado");
        }
        else
        {
            System.out.println("Luchador no existe ");
        }
    }

    private static void listByPower(KarateTournee competicion) {
        List<KarateMember> lista = competicion.getLista();
        lista.sort(new SortByPower());
        for (KarateMember karateMember : lista) {
            System.out.println(karateMember);
        }
        System.out.println("Numero de jugadores " + lista.size());
       
    }

    private static void listByDojo(KarateTournee competicion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dojo?");
        String dojo  = sc.nextLine();
        List<KarateMember> lista = competicion.playerByDojo(dojo);
        for (KarateMember karateMember : lista) {
            System.out.println(karateMember);
        }
        System.out.println("Numero de jugadores " + lista.size());
        
        
    }

    
}
