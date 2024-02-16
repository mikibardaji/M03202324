/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokedex;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Pokedex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dragon dragonite = new Dragon("Dragonite", 10);
        Normal ratata = new Normal("Ratata", 15);
        Fuego arcanine = new Fuego("Arcanine",30);
        Fuego charizard = new Fuego("Charizard", 40);
        Dragon dyalga = new Dragon("Dyalga",45);
       
        ArrayList<Pokemon> bag = new ArrayList<>();
        
        bag.add(dyalga);
        bag.add(charizard);
        bag.add(arcanine);
        bag.add(ratata);
        bag.add(dragonite);
        
        System.out.println("Pokemons capturados " + bag.size());
        menu(bag);
        System.out.println("primer pokemon");
        int pos_primer = chooseOption(bag.size()); 
        System.out.println("segundo pokemon ");
        int pos_segundo = chooseOption(bag.size()); 
        
        System.out.println("Combate pokemon " + bag.get(pos_primer).getNom()
        + " VS " + bag.get(pos_segundo).getNom());
        Pokemon primer =  bag.get(pos_primer);
        Pokemon segundo =  bag.get(pos_segundo);
        Scanner sc = new Scanner(System.in);
        while (primer.getLife()>0 && segundo.getLife()>0)
        {
            segundo.recibirAtaque(primer);
            primer.recibirAtaque(segundo);
            System.out.println("Aprieta enter para continuar");
            sc.nextLine(); //pausa
        }
        
        
        
        if (primer.getLife()>0)
        {
            System.out.println(primer.getNom());
        }
        else
        {
             System.out.println(segundo.getNom());
        }
        
    }
    
    private static void menu(ArrayList<Pokemon> bag) {
        System.out.println("Vamos a hacer un combate pokemon");
        System.out.println("tienes que escoger dos combatientes");
        int num=1;
        for (Pokemon pokemon : bag) {
            System.out.println(num + "-" + pokemon.getNom());
            num++;
        }
    }
    
   private static int chooseOption(int size) {
       Scanner sc=new Scanner(System.in);
       int num;
       do
       {
           System.out.print("pon numero del combatiente "); 
           num = sc.nextInt();
       }while(num<1 || num>size);
       return (num-1);
    }
}
