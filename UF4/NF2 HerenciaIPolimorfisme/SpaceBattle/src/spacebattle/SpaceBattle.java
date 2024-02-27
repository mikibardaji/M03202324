/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spacebattle;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SpaceBattle {

    /**
     * @param args the command line arguments
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create array with 2 positions  of Spaceship
        ArrayList<SpaceShip> combatientes = new ArrayList<>();
        //call chooseShip 2 times
        SpaceShip s1 = chooseShip();
        SpaceShip s2 = chooseShip();
        combatientes.add(s1);
        combatientes.add(s2);
        //fight
        do{
          combatientes.get(0).attack(combatientes.get(1));
          if (combatientes.get(1).isAlive())
          {
              combatientes.get(1).attack(combatientes.get(0));
          }
        }while(
            combatientes.get(0).isAlive()
         && combatientes.get(1).isAlive()
                );
        
        //say which ship win....
        if (!combatientes.get(0).isAlive())
        {
            System.out.println("Ha ganado " + 
              combatientes.get(1).getName());
        }
        else 
        {
            System.out.println("Ha ganado " + 
              combatientes.get(0).getName());
        }
    }
    
    
    /**
     * choose one of the combatiant Ship
     * @return SpaceShip choose
     */
    private static SpaceShip chooseShip()
    {
        int option=0;
        Scanner sc = new Scanner(System.in);
        SpaceShip atack;
        do
        {
        System.out.println("Choose a ship");
        System.out.println("1.-Hunter");
        System.out.println("2.-Cruiser with 1 Photonic Torpedo");
        System.out.println("3.-Cruiser with 2 Photonic Torpedo");
        System.out.println("4.-Cruiser with 3 Photonic Torpedo");
        option = sc.nextInt();
        }while(option<1 || option>5);
        sc.nextLine();
        System.out.print("Put the name of the ship: ");
        String name = sc.nextLine();
        /*input code*/
        if (option==1)
        {
            atack = new Hunter(name);
        }
        else if (option==2)
        {
            atack = new Cruiser(1, name);
        }
        else if (option==3)
        {
            atack = new Cruiser(2, name);
        }
        else 
        {
            atack = new Cruiser(3, name);
        }
        //Create spaceship choosen with his name
        
        
        //return spaceship choosen
        return atack;
    }  
         
    
}
