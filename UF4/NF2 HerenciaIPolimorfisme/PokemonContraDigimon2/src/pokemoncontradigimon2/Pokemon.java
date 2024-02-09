/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemoncontradigimon2;

/**
 *
 * @author mabardaji
 */
public class Pokemon {
    private final String name;
    private int life_points;
    private int combat_points;

    public Pokemon(String name, int life_points) {
        this.name = name;
        if (life_points>1000 || life_points<0)
        {
            this.life_points = 1000;
            System.out.println("Vida incorrecta fico a 1000 -> " + life_points);
        }
        else
        {
            this.life_points = life_points;
        }
        this.combat_points = generarCombatPoint();
    }

    private int generarCombatPoint() {
        int min=100;
        int max=200;
        int rang = (max-min)+1;
        int combat = (int)(Math.random()*rang)+min;
        return combat;
    }

    public void setCombat_points(int combat_points) {
        this.combat_points = combat_points;
    }

    public String getName() {
        return name;
    }

    public int getLife_points() {
        return life_points;
    }

    public int getCombat_points() {
        return combat_points;
    }

    @Override
    public String toString() {
        return "Pokemon se llama " + name + ",  y le queda de vida " + life_points ;
    }
    
    private void critCombat(int atac)
    {
        System.out.println("pokemon a l’atac amb força " + atac);
    }
    
    public boolean rebraAtac(int puntos)
    {
        this.life_points = this.life_points - puntos;
        if(this.life_points<=0)
        {
            this.life_points=0;
            return false;
        }
        else
        {
            //this.life_points -= puntos;
            return true;
        }
    }
    
    
    public int atacar()
    {
        int atac;
        if (this.life_points<100)
        {
            atac = this.combat_points*2;            
        }
        else
        {
            atac = this.combat_points;
        }
        critCombat(atac);
        return atac;
    }
}
