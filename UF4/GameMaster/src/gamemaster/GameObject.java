/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gamemaster;

/**
 *
 * @author mabardaji
 */
// Clase para representar los objetos del jugador
class GameObject {
    private String name;
    private TypeObject type;
    private int gold;

    public GameObject(String name, TypeObject type, int gold) {
        if (gold>0)
        {
            this.name = name;
            this.type = type;
            this.gold = gold;
        }
        else
        {
            System.out.println("Objeto debe tener el valor de oro positivo");
        }
        
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type.name();
    }

    public int getGold() {
        return gold;
    }
    
    public void displayObjectDetails()
    {
            System.out.print("Nom: " + this.getName() + ", Tipus: " + this.getType() + ", Quantitat d'Or: " );
            if (this.getType().equalsIgnoreCase("Premi"))
            {
                System.out.println(this.getGold());
            }
            else
            {
                 System.out.println("-" + this.getGold());
            }
    }

    @Override
    public String toString() {
        return "GameObject{" + "name=" + name + ", type=" + type + ", gold=" + gold + '}';
    }
    
    
    
}
