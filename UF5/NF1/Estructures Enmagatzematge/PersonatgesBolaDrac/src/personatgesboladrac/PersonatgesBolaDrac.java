/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personatgesboladrac;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import menuUtils.MenuDaw;
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
       MenuDaw menu = new MenuDaw("Personatges Bola de drac");
       Cataleg Inventory = new Cataleg();
       int opcio=2;
       // comentat addAllOptions(menu); CASA
       
       //mostrar el menu i escollir opcio CASA
       
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       switch(opcio)
       {
           case 1: //afegir
               addPersonCataleg(Inventory);
               break;
           case 2:    //consultar
               ListAllPerson(Inventory);
               break;
           case 7: //Sortir
       }
    }

    /**
     * ficar totes les opcions del menú principal
     * @param menu 
     */
    private static void addAllOptions(MenuDaw menu) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
                System.out.println("Personatge afegit  Total " + Inventory.getNumPersonatges());
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
        System.out.print("Pon nombre personaje");
        String nombre = sc.nextLine();
        System.out.print("Pon nivel ataque");
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
        //crida al metode que hem retorni tota la llista de personage
        
        //recorrer toda la lista y mostrarla (tosTring Dragonball)
        
        //mostrar cuantos registros he enseñado 
    }
    
}
