/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gamemaster;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class GameMaster {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvingut a RealmQuest!");
        System.out.print("Introdueix l'ID del jugador: ");
        String playerId = scanner.nextLine();
        System.out.print("Introdueix el nom del jugador: ");
        String playerName = scanner.nextLine();

        // Crear un nuevo jugador
        Player player = new Player(playerId, playerName);
        int choice;
        // Menú principal
        do {

            choice = chooseMenu();

            switch (choice) {
                case 1:
                    player.displayPlayerDetails();
                    break;
                case 2:
                    System.out.println("ID del Jugador: " + player.getPlayerId());
                    break;
                case 3:
                    System.out.println("Nom del Jugador: " + player.getPlayerName());
                    break;
                case 4:
                    System.out.println("Quantitat d'Or: " + player.getGold());
                    break;
                case 5:
                    System.out.println("Llista d'Objectes: ");
                    player.displayObjects();
                    break;
                case 6:
                    addItem(player);
                    break;
                case 7:
                    removeItem(player);
                    break;
                case 8:
                    System.out.println("Gràcies per jugar a RealmQuest!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna a intentar-ho.");
            }
        }while (choice!=8);
    }

    private static GameObject crearNuevoObjeto() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Introdueix el nom de l'objecte: ");
            String itemName = scanner.nextLine();
            System.out.print("Introdueix el tipus de l'objecte (premi o castig): ");
            String itemType = scanner.nextLine();
            System.out.print("Introdueix la quantitat d'or de l'objecte: ");
            int itemGold = scanner.nextInt();
            GameObject add = new GameObject(itemName, TypeObject.valueOf(itemType.toUpperCase()), itemGold);
            return add;
    }

    private static void addItem(Player player) {
        if (!player.mort())
                    {
                        GameObject add = crearNuevoObjeto();
                        add.
                        if (add.getGold()>0)
                        {
                           if(player.addObjectToInventory(add))
                            {
                                System.out.println("Objeto añadido");
                            }
                            else
                            {
                                System.out.println("No se pudo añadir");
                            }    
                        }
                        
                    }
        else
            {
            System.out.println("Jugador muerto");
            }
    }

    private static void removeItem(Player player) {
        Scanner scanner = new Scanner(System.in);
        if (!player.mort())
                    {
                    System.out.print("Introdueix la posició de l'objecte a eliminar: ");
                    int indexToRemove = scanner.nextInt();
                    player.removeObjectFromInventory(indexToRemove);
                    System.out.println("Objeto borrado");
                    }
                    else
                    {
                        System.out.println("Jugador muerto");
                    }
    }

    private static int chooseMenu() {
          Scanner scanner = new Scanner(System.in);
            System.out.println("\n----- Menú Principal -----");
            System.out.println("1. Detalls del jugador");
            System.out.println("2. ID del Jugador");
            System.out.println("3. Nom del Jugador");
            System.out.println("4. Quantitat d'Or");
            System.out.println("5. Llista d'Objectes");
            System.out.println("6. Afegir Objecte");
            System.out.println("7. Eliminar Objecte");
            System.out.println("8. Sortir");

            System.out.print("Selecciona una opció: ");
            int choice = scanner.nextInt();
            
            return choice;
    }
    
}
