/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personatgesboladrac;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
                case 3: //Sortir
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
                + "1-NEN, 2-SUPERGUERRER, 3-SUPERSAIYANULTRAINSTINTO");
        int evolution = sc.nextInt();
        
        if (evolution==1)
        {
            nuevo = new DragonBallCharacter(nombre, atac, Evolution.NEN, et);
        }
        else if (evolution==2)
        {
            nuevo = new DragonBallCharacter(nombre, atac, Evolution.SUPERGUERRER, et);
        }
        else
        {
            nuevo = new DragonBallCharacter(nombre, atac, Evolution.SUPERSAIYANULTRAINSTINTO, et);
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
    
}
