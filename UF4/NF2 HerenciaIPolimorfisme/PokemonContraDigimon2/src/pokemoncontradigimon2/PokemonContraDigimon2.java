/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pokemoncontradigimon2;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PokemonContraDigimon2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Pikachu", 500);
        Digimon digimon1 = new Digimon("agumon");
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("ataque de " + pokemon1.getName());
            int ataque_pokemon = pokemon1.atacar();
            digimon1.rebreAtac(ataque_pokemon);
            System.out.println(digimon1);
            System.out.println("**********************");
            System.out.println("ataque de " + digimon1.getName());
            int ataque_digimon = digimon1.atacar();
            pokemon1.rebraAtac(ataque_digimon);
            System.out.println(pokemon1);
            System.out.println("enter para continuar");
            sc.nextLine(); //pausa
        }while(!(pokemon1.getLife_points()==0 || digimon1.getLife_points()==0));
        
        if (pokemon1.getLife_points()>0)
        {
            System.out.println("Gano " + pokemon1.getName());
        }
        else if (digimon1.getLife_points()>0)
        {
            System.out.println("Gano " + digimon1.getName());
        }
        else
        {
            System.out.println("empate");
        }
    }
    
}
