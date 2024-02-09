/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemoncontradigimon2;

/**
 *
 * @author mabardaji
 */
public class Digimon {
    private String name;
    private int life_points;
    private boolean shield;

    public Digimon(String name) {
        this.name = name;
        this.life_points = 600;
        this.shield = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLife_points() {
        return life_points;
    }

    public boolean isShield() {
        return shield;
    }
    
    public boolean rebreAtac(int damage)
    {
        if (this.shield) //==true
        {
            damage=0;
            System.out.println("Escudo desactivado");
            this.shield=false;
        }
        this.life_points = this.life_points - damage;
         if(this.life_points<=0)
        {
            this.life_points=0;
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public int atacar()
    {
        int atac = generarCombatPoint();
        System.out.println(name + " digimon ataca amb força " + atac);
        return atac;
    }
    
    private int generarCombatPoint() {
        int min=30;
        int max=200;
        int rang = (max-min)+1;
        int combat = (int)(Math.random()*rang)+min;
        return combat;
    }  

    @Override
    public String toString() {
        if (this.life_points<100)
        {
        return "Digimon " + name + ", vida=" + life_points + " esta a punt de morir";
        }
        else
        {
        return "Digimon " + name + ", vida=" + life_points ;    
        }
       
    }
    
    
    
}
