/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personatgesboladrac;

import java.util.List;
import java.util.Scanner;
import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;
import model.Cataleg;
import model.DragonBallCharacter;
import model.DuplicateCharacterException;
import model.Evolution;

/**
 *
 * @author mabardaji
 */
public class PersonatgesBolaDrac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //per provar el programa
       pintarIntro();
       MenuDaw menu = new MenuDaw("Personatges Bola de drac");
       Cataleg Inventory = new Cataleg();
       int opcio=2;
       boolean exit = false;
       addAllOptions(menu); 
       
       
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       do
       {
           //mostrar el menu i escollir opcio CASA
          opcio = menu.displayMenu();
          switch(opcio)
            {
                case 1: //afegir
                    addPersonCataleg(Inventory);
                    break;
                case 2:    //consultar
                    ListAllPerson(Inventory);
                    break;
                case 3:    //consultar per nom
                    findPersonName(Inventory);
                    break;                    
                case 4:    //consultar per nom
                    findPersonPosition(Inventory);
                    break;            
                case 5:    //consultar per nom
                    removePersonPosition(Inventory);
                    break;  
                case 6:    //consultar per nom
                    removePerson(Inventory);
                    break;  

                case 8: //Sortir
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
            //Afegir personatge
            menu.addOption("Afegir personatge");
            menu.addOption("Llistar personatges");
            menu.addOption("Consultar personatge nom");
            menu.addOption("Consultar personatge posició");
            menu.addOption("Borrar personatge per posició");
            menu.addOption("Borrar personatge per objecte");
            menu.addOption("Consultar persones superin x força d'atac");
            menu.addOption("Evolucionar personatge");
            menu.addOption("Sortir");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    
    /**
     * pedira los datos necesarios para crear personaje
     * añadira el personaje al catalogo si no existe
     * si existe avisara
     * @param Inventory 
     */
    private static void addPersonCataleg(Cataleg Inventory) {
        //pedir datos para crear personaje
        DragonBallCharacter person = CreateDragonBallCharacter();
        try {
            //añadir al catalogo Inventory
            if (Inventory.afegirCharacter(person))
            {
                System.out.println("Personatge afegit  Total " + Inventory.getNumCharacter());
            }
            else
            {
                System.out.println("Personatge no afegit");
            }
        } catch (DuplicateCharacterException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    private static DragonBallCharacter CreateDragonBallCharacter() {
        DragonBallCharacter nuevo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon nombre personaje: ");
        String nombre = sc.nextLine();
        System.out.print("Pon nivel ataque: ");
        int atac = sc.nextInt();
        System.out.print("Es terrestre (1-Si/2-No)");
        int terrestre = sc.nextInt();
        boolean et;
        if (terrestre==1)
        {
            et = true;
        }
        else
        {
            et = false;
        }
        System.out.println ("Que evolucion:"
                + "1-NEN, 2-SUPERGUERRER, 3-SUPERSAIYAN, 4-ULTRAINSTINTO");
        int evolution = sc.nextInt();
        
        if (evolution==1)
        {
            nuevo = new DragonBallCharacter(nombre, atac, Evolution.NEN, et);
        }
        else if (evolution==2)
        {
            nuevo = new DragonBallCharacter(nombre, atac, Evolution.SUPERGUERRER, et);
        }
        else if (evolution==3)
        {
            nuevo = new DragonBallCharacter(nombre, atac, Evolution.SUPERSAIYAN, et);
        }
        else
        {
            nuevo = new DragonBallCharacter(nombre, atac, Evolution.ULTRAINSTINTO, et);
        }
        return nuevo;
    }

    private static void ListAllPerson(Cataleg Inventory) {
        //crida al metode que hem retorni tota la llista de personatges
        List<DragonBallCharacter> all = Inventory.getAllCharacters();
        //recorrer toda la lista y mostrarla (tosTring Dragonball)
        int cont=1;
        for (DragonBallCharacter character : all) {
            System.out.println(cont + " " + character); //toString ja no fa falta res més
            System.out.println("*******************");
        }
        //mostrar cuantos registros he enseñado 
        System.out.println("Personajes mostrados: " + all.size()); 
    }


    private static void findPersonName(Cataleg Inventory) {
        //interaccio usuari fitxer main
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the name of the character? : ");
        String name = sc.nextLine();
        
        List<DragonBallCharacter> list_found = Inventory.findByName(name);
        if (list_found!=null)
        {
            //interaccio usuari sortida pantalla main
            for (DragonBallCharacter person : list_found) {
                System.out.println(person);
            }
            System.out.println("Personajes encontrados " + list_found.size());
        }
        else
        {
            System.out.println("No existe ningún personaje con este nombre-->" + name);
        }
        
        
        
//        if (found!=null)
//        {
//            System.out.println("Personaje encontrado");
//            System.out.println(found);
//        }
    }

    private static void findPersonPosition(Cataleg Inventory) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the position of the character? : ");
        int pos = sc.nextInt();
        DragonBallCharacter find = Inventory.findByPosition(pos); //model dades
        if (find!= null)
        {
            System.out.println("Personaje encontrado");
            System.out.println(find);
        }
        else
        {
            System.out.println("No existe ningún personaje en la posición -->" + pos);
        }
        
    }
    
    private static void findPerson(Cataleg Inventory) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the name of the character? : ");
        String name = sc.nextLine();
        System.out.println("Put the evolution of the character? : ");
        String evolution =sc.nextLine();
        Evolution evol = Evolution.valueOf(evolution);
        
        
        
        DragonBallCharacter search = new DragonBallCharacter(name, evol);
        //els altres atributs no m'importen del search 
        DragonBallCharacter find = Inventory.findByPerson(search);
        if (find!= null)
        {
            System.out.println("Personaje encontrado");
            System.out.println(find);
        }
        else
        {
            System.out.println("No existe ningún personaje en la posición -->" + search);
        }
        
    }
    
    
    private static void pintarIntro() {
        System.out.println("              ___     -._");
        System.out.println("            `-. \"\"\"--._ `-.");
        System.out.println("               `.      \"-. `.");
        System.out.println(" _____           `.       `\\");
        System.out.println("`-.   \"\"\"---.._    \\        `\\");
        System.out.println("   `-.         \"-.  \\         `\\");
        System.out.println("      `.          `-.\\          \\_.-\"\"\"\"\"--._");
        System.out.println("        `.           `                          \"-.    __....-------...");
        System.out.println("          `.                                       `.    __....-------...");
        System.out.println("            `.                                       `--\"\"\"\"\"---..._");
        System.out.println("__...._       \"\"                                         `--\"\"\"\"\"---..._");
        System.out.println("`-.      \"\"\"--`           /       ,-'/|     ,                   _..-\"" );
        System.out.println("   `-.                 , /|     ,'  / |   ,'|    ,|        _..-\"");
        System.out.println("      `.              /|| |    /   / |  ,'  |  ,' /        ----\"\"\"\"\"\"_`-");
        System.out.println("        `.            ( \\  \\      |  | /   | ,'  //                 _.-\"");
        System.out.println("          `.        .'-\\/\"" + "\"\\ |  '  | /  .-/'\"`'\\' //            _.-\"");
        System.out.println("    /'`.____`-.  ,'" + "\"\\  ''''?-.V`.   |/ .'..-P''''  /\"`.     _.-\"");
        System.out.println("   '(   `.-._\"" + "\"  ||(?|    /'" + "   >.\\  ' /.<   `\\    |P)||_..-\"" + "___.....---");
        System.out.println("     `.   `. \"-._ \\ ('   |     `8      8'     |   `) /\"\"\"\"" + "    _\".\"\"");
        System.out.println("       `.   `.   `." + "`.b|   `.__            __.'   |d.'  __...--\"");
        System.out.println("         `.   `.   \".`-  .---      ,-.     ---.  -'.-\"" );
        System.out.println("           `.   `.   \"\"|      -._      _.-      |\"");
        System.out.println("             `.  .-\"`.  `.       `\"\"\"'       ,'");
        System.out.println("               `/     `.. \"\"--..__    __..--\"\"");
        System.out.println("                `.      /7.--|    \"\"\"\"    |--.__");
        System.out.println("                  ..--\"| (  /'            `\\  ` \"\"--..");
        System.out.println("               .-" + "\"      \\\\  |\"\"--.    .--\"\"|          \"-.");
        System.out.println("              <.         \\\\  `.    -." + "    ,'       ,'     >");
        System.out.println("             (P'`.        `%,  `.      ," + "         /,' .-\"\"?)");
        System.out.println("             P    `. \\" + "      `%,  `.  ,'         /' .'     \\");
        System.out.println("            | --\"" + "  _\\||       `%,  `'          /.-'   .    )");
        //System.out.println("            |       `-.--..   `%..--\"\"\"\"\" + "\"--.'       \"-  |");
    }

    private static void removePersonPosition(Cataleg Inventory) {
            //to do
            //ask for the position
            //call metod to remove in Cataleg by position (removeByPosition)
            //if delete output delete
            //if not output don't delete
    }

    private static void removePerson(Cataleg Inventory) {
            //to do
            //ask for all the atributs of equals of  DragonBallCharacter
            //create a variable dragonball
            //call metod to remove in Cataleg by Object (removeCharacter)
            //if delete output delete
            //if not output don't delete
        
    }
    
}
