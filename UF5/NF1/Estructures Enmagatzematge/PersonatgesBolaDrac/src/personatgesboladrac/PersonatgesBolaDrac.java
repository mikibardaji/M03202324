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
import model.DragonBallSortByAtac;
import model.DragonBallSortByNom;
import model.DragonBallSortByTerrestre;
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
//       String nom = Evolution.NEN.toString();
//       int valor = Integer.parseInt(nom);
       Cataleg Inventory = new Cataleg();// cont� la colecci� del model dades
       int opcio=2;
       boolean exit = false;
       addAllOptions(menu); 
       
       introDadesProva(Inventory);
       
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
                case 2:    //nom 
                    ListAllPersonByName(Inventory);
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
                case 7:    //consultar superiorr a fuerza
                    findPersonMoreAttack(Inventory);
                    break;                      
                    
                case 8:    //Modificar fo��a d'atac
                    updateAtacPerson(Inventory);
                    break;  
                case 10:    //llistar per for�a d'atac
                    ListAllPersonByAtac(Inventory);
                    break; 
                case 11:    //llistar primer els terrestre
                    ListAllPersonByTerrestre(Inventory);
                    break; 

                case 12: //Sortir
                    exit = true;
                    break;
            } 
       }while(!exit);
       
       
       
    }

    /**
     * ficar totes les opcions del men� principal
     * @param menu 
     */
    private static void addAllOptions(MenuDaw menu) {
        try {
            //Afegir personatge
            menu.addOption("Afegir personatge");
            menu.addOption("Llistar personatges nom");
            menu.addOption("Consultar personatge nom");
            menu.addOption("Consultar personatge posici�");
            menu.addOption("Borrar personatge per posici�");
            menu.addOption("Borrar personatge per objecte");
            menu.addOption("Consultar persones superin x for�a d'atac");
            menu.addOption("Canviar for�a d'atac");
            menu.addOption("Evolucionar personatge");
            menu.addOption("Llistar personatges atac");
            menu.addOption("Llistar personatges terrestres primer");
            menu.addOption("Sortir");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    
    /**
     * pedira los datos necesarios para crear personaje
     * a�adira el personaje al catalogo si no existe
     * si existe avisara
     * @param Inventory 
     */
    private static void addPersonCataleg(Cataleg Inventory) {
        //pedir datos para crear personaje
        DragonBallCharacter person = CreateDragonBallCharacter();
        try {
            //a�adir al catalogo Inventory
            if (Inventory.afegirCharacter(person)) //C reate
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

    private static void ListAllPersonByName(Cataleg Inventory) {
        //crida al metode que hem retorni tota la llista de personatges
        List<DragonBallCharacter> all = Inventory.getAllCharacters();
        //recorrer toda la lista y mostrarla (tosTring Dragonball)
        int cont=1;
        //al cridar al sort necessito passar-li el criteri d'ordenaci�
        //al fer new DragonBallSortByNom() li estic dient que agafi el compare d'aquesta classe 
        //all.sort(new DragonBallSortByNom());
        all.sort(new DragonBallSortByNom());
        for (DragonBallCharacter character : all) {
            System.out.println(cont + " " + character); //toString ja no fa falta res m�s
            System.out.println("*******************");
            cont++; //numero de listado
        }

        //mostrar cuantos registros he ense�ado 
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
            System.out.println("No existe ning�n personaje con este nombre-->" + name);
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
            System.out.println("No existe ning�n personaje en la posici�n -->" + pos);
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
            System.out.println("No existe ning�n personaje en la posici�n -->" + search);
        }
        
    }
    
    
   

    private static void removePersonPosition(Cataleg Inventory) {
            //to do Vista
            //ask for the position
            Scanner sc = new Scanner(System.in);
            System.out.println("Cual es la posici�n del personaje a borrar");
            int posic = sc.nextInt();
            //call metod to remove in Cataleg by position (removeByPosition)
            DragonBallCharacter delete = Inventory.removeByPosition(posic);
            if (delete!=null)
            {
                System.out.println("Personaje borrado " + delete);
            }
   
      else
            {
                System.out.println("Posicion no valida");
            }
            
            //if delete output delete
            //if not output don't delete
    }

    private static void removePerson(Cataleg Inventory) {
            //to do
            //ask for all the atributs of equals of  DragonBallCharacter
            //create a variable dragonball
            DragonBallCharacter delete = pedirDatosPersonajeBuscar();
            //call metod to remove in Cataleg by Object (removeCharacter)
            boolean deleteOk=Inventory.removeCharacter(delete);
            if (deleteOk)
            {
                System.out.println("Borrado " + delete);
            }
            else
            {
                System.out.println("No existe " + delete);
            }
           
        
    }
    
    private static void introDadesProva(Cataleg Inventory) {
        try{
            Inventory.afegirCharacter(new DragonBallCharacter("goku",10,Evolution.NEN,true));
            Inventory.afegirCharacter(new DragonBallCharacter("goku",50,Evolution.SUPERGUERRER,true));
            Inventory.afegirCharacter(new DragonBallCharacter("Follet tortuga",15,Evolution.SUPERGUERRER,true));
            Inventory.afegirCharacter(new DragonBallCharacter("Vegeta",20,Evolution.SUPERSAIYAN,false));
            Inventory.afegirCharacter(new DragonBallCharacter("Krilin",25,Evolution.NEN,true));
            Inventory.afegirCharacter(new DragonBallCharacter("Yamsha",10,Evolution.NEN,true));
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
        }
            
            
    }
    
    private static DragonBallCharacter pedirDatosPersonajeBuscar() {
        DragonBallCharacter nuevo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the name of the character? : ");
        String name = sc.nextLine();
        System.out.println ("Que evolucion:"
                + "1-NEN, 2-SUPERGUERRER, 3-SUPERSAIYAN, 4-ULTRAINSTINTO");
        int evolution = sc.nextInt();
            
        if (evolution==1)
        {
            nuevo = new DragonBallCharacter(name, Evolution.NEN);
        }
        else if (evolution==2)
        {
            nuevo = new DragonBallCharacter(name, Evolution.SUPERGUERRER);
        }
        else if (evolution==3)
        {
            nuevo = new DragonBallCharacter(name, Evolution.SUPERSAIYAN);
        }
        else
        {
            nuevo = new DragonBallCharacter(name, Evolution.ULTRAINSTINTO);
        }
        return nuevo;  
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

    /**
     * canviar la for�a d'atac d'un personatge
     * amb el valor que li diguis
     * @param Inventory 
     */ 
     
    private static void updateAtacPerson(Cataleg Inventory) {
        DragonBallCharacter update = pedirDatosPersonajeBuscar();
        Scanner sc = new Scanner(System.in);
        System.out.println("cual es el nuevo valor de ataque");
        int fuerza = sc.nextInt();
        if (Inventory.updateAtack(update,fuerza))
        {
            System.out.println("Se ha cambiado la fuerza " + fuerza);
        }
        else
        {
            System.out.println("Cambio no realizado personaje existente");
        }
        

    }

    /**
     * a partir de una fuerza pedida al usuario
     * mostrara todos los personajes que superen esa fuerza
     * @param Inventory 
     */
    private static void findPersonMoreAttack(Cataleg Inventory) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el valor de atauqne");
        int fuerza = sc.nextInt();
        List<DragonBallCharacter> selection=Inventory.findPersonByForze(fuerza);
        
        for (int i = 0; i < selection.size(); i++) {
            System.out.println((i+1) + "-" + selection.get(i));
        }
        System.out.println("Personas mostradas" + selection.size());
    }

    private static void ListAllPersonByAtac(Cataleg Inventory) {
         
        List<DragonBallCharacter> all = Inventory.getAllCharacters();
        int cont=1;
        all.sort(new DragonBallSortByAtac());
        for (DragonBallCharacter character : all) {
            System.out.println(cont + " " + character); //toString ja no fa falta res m�s
            System.out.println("*******************");
            cont++; //numero de listado
        } 
        System.out.println("Personajes mostrados: " + all.size()); 
    }
    
    private static void ListAllPersonByTerrestre(Cataleg Inventory) {
         
        List<DragonBallCharacter> all = Inventory.getAllCharacters();
        int cont=1;
        all.sort(new DragonBallSortByTerrestre());
        for (DragonBallCharacter character : all) {
            System.out.println(cont + " " + character); //toString ja no fa falta res m�s
            System.out.println("*******************");
            cont++; //numero de listado
        } 
        System.out.println("Personajes mostrados: " + all.size()); 
    }
}
