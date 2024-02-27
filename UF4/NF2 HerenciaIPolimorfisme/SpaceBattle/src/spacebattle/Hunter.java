/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacebattle;

/**
 *
 * @author mabardaji
 */
public class Hunter extends SpaceShip{
    final static int INITIAL_ENERGY=150;
    //final static int NUM_SHIELD=3;
    final static int MAX_LASER_ENERGY_ATTACK = 35;
    final static double PAIN_FACTOR = 0.25; 

    public Hunter(String name) {
        super(name, 150);
    }

    @Override
    public void stateInfo() {
        if (this.energy>0)
        {
            System.out.println("Hunter " + name +  " te vida i "
            + " energia=" + energy);
        }
        else
        {
            System.out.println("Cruiser " + name +  " l'han derribat  ");
        }
    }
    
    
    public int getLaserGunEnergy()
    {
        return this.MAX_LASER_ENERGY_ATTACK;
    }

    @Override
    public void attack(SpaceShip enemy) {
        double ataque = this.attackLaser(this.MAX_LASER_ENERGY_ATTACK);
        attacInfo(ataque);
        enemy.receiveAttack(ataque);
    }



    @Override
    public void attacInfo(double valor) {
        System.out.println("Hunter " + name + " valor de ataque " + valor);
    }
    
    
    
}
