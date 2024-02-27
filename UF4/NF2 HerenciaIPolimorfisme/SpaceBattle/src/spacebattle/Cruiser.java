/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacebattle;

import static spacebattle.Hunter.PAIN_FACTOR;

/**
 *
 * @author mabardaji
 */
public class Cruiser extends SpaceShip{
    private int numPhotonTorpedo;
    final  int INITIAL_ENERGY=100;
    
    final static int MAX_LASER_ENERGY_ATTACK = 40;
    final static double PAIN_FACTOR = 0.20;
    final static int TORPEDO_FORCE = 50;

    public Cruiser(int numPhotonTorpedo, String name) {
        super(name, 100);
        this.numPhotonTorpedo = numPhotonTorpedo;
    }

    public int getNumPhotonTorpedo() {
        return numPhotonTorpedo;
    }
    
    public int getLaserGunEnergy()
    {
        return this.MAX_LASER_ENERGY_ATTACK;
    }

    @Override
    public void stateInfo() {
        if (this.energy>0)
        {
            System.out.println("Cruiser " + name +  " te vida i "
            + " energia=" + energy);
        }
        else
        {
            System.out.println("Cruiser " + name +  " l'han derribat  ");
        }
    }

    @Override
    public void attack(SpaceShip enemy) {
        Weapon[] lista = Weapon.values();
        int max_armas = lista.length;
        //decido con que ataco
        int arma = (int)this.attackLaser(max_armas)-1;
        double ataque;
        if (lista[arma].name().equalsIgnoreCase("LASER_GUN"))
        {
            ataque = this.attackLaser(this.MAX_LASER_ENERGY_ATTACK); 
            System.out.println("Ataco con laser");
        }
        else
        {
            ataque = this.TORPEDO_FORCE;
            System.out.println("Ataco con torpedo");
        }
        
        attacInfo(ataque);
        enemy.receiveAttack(ataque);
        
    }

    @Override
    public void attacInfo(double valor) {
        System.out.println("Cruiser " + name + " valor de ataque " + valor);
    }



    
    
    
}
