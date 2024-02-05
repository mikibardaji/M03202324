/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamemaster;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
// Clase para representar al jugador
class Player {
    private final String playerId;
    private final String playerName;
    private int gold;
    private List<GameObject> inventory;
    private GameObject[] inventory2; //opcion array que no implementaria
    private final int MAX_OBJECTS = 50;

    public Player(String playerId, String playerName) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.gold = 1; // Inicializar la cantidad de oro a 1
        this.inventory = new ArrayList<>(); //instancio arrayList  sino es NULL
        this.inventory2 = new GameObject[MAX_OBJECTS];
        
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getGold() {
        return gold;
    }

    public List<GameObject> getInventory() {
        return inventory;
    }

    /*La quantitat d'or només pot variar quan es troba objectes durant el joc
    indica que no pot have setter per el atribut or
    */
    
    /**
     * Método para mostrar los detalles del jugador
     */
    public void displayPlayerDetails() {
        System.out.println("ID del Jugador: " + getPlayerId());
        System.out.println("Nom del Jugador: " + getPlayerName());
        System.out.println("Quantitat d'Or: " + getGold());
    }
    
    /**
     * Metodo para mostrar los objetos 
     */
    public void displayObjects()
    {
        for (GameObject item : inventory) {
            item.displayObjectDetails();
        }
    }

    // Método para agregar un objeto al inventario
    public boolean addObjectToInventory(GameObject addItem) {
        //GameObject newItem = new GameObject(name,  TypeObject.valueOf(type), gold);
        boolean add = inventory.add(addItem);
//        int i=0;
//        while (inventory2[i].getGold()!=0)
//        { //busquem la primera posició buida
//            i++;
//        }
//        inventory2[i] = addItem;
        //cont_objetos++;
 
        if (addItem.getType().equalsIgnoreCase("Premi"))
            {
                gold += addItem.getGold();
            }
            else
            {
                gold -= addItem.getGold();
            }
   
        //CalcGold();
        return add;
    }

    /**
     * añade objeto al listado
     * @param name del objeto
     * @param type tipo que es el objeto
     * @param gold dinero que aporta el objeto
     */
    public boolean addObjectToInventory(String name, String type, int gold) {
        GameObject addItem = new GameObject(name,  TypeObject.valueOf(type), gold);
        boolean add = inventory.add(addItem);
        CalcGold();
        return add;
    }    
    
    
    // Método para eliminar un objeto del inventario
    public void removeObjectFromInventory(int index) {
        
        if (index >= 0 && index < inventory.size()) {
            GameObject removedItem = inventory.remove(index);
            if (removedItem.getType().equalsIgnoreCase("Premi"))
            {
                gold -= removedItem.getGold();
            }
            else
            {
                gold += removedItem.getGold();
            }
            
            
            
            
            
            CalcGold();
        } else {
            System.out.println("Posició d'objecte no vàlida.");
        }
    }


    /** 
     * Recalcula cuanto dinero tiene.
     * 
     */
    private void CalcGold()
    {
        this.gold=0;
        for (GameObject objeto : inventory) {
            if (objeto.getType().equalsIgnoreCase("Premi"))
            {
                gold += objeto.getGold();
            }
            else
            {
                gold -= objeto.getGold();
            }
        }
       
  
    }
    
    public boolean mort()
    {
        return gold <= 0;
    }

    @Override
    public String toString() {
        return "Player{" + "playerId=" + playerId + ", playerName=" + playerName + ", gold=" + gold + ", inventory=" + inventory + ", inventory2=" + inventory2 + ", MAX_OBJECTS=" + MAX_OBJECTS + '}';
    }
    
    
    
    
    
    
}

