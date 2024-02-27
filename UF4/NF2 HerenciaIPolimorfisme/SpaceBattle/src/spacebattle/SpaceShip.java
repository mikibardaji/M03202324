/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spacebattle;

import java.util.Objects;
import static spacebattle.Cruiser.PAIN_FACTOR;

/**
 *
 * @author mabardaji
 */
public abstract class SpaceShip implements SpaceFighter{
    protected String name;
    protected double energy;
    protected boolean alive; //correcte fica true
    protected int num_shield; //mig correcte
    protected final static int NUM_SHIELD=3;

    public SpaceShip(String name, double energy) {
        this.name = name;
        this.energy = energy;
        this.num_shield = NUM_SHIELD;
        alive=true;
        //NUM_SHIELD=3; si no fos final podriem assignar valor aquí
    }

    public String getName() {
        return name;
    }

    public double getEnergy() {
        return energy;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getNum_shield() {
        return num_shield;
    }

    public static int getShieldEnergy() {
        return NUM_SHIELD;
    }

    public double attackLaser(int max_attack)
    {
        int min=1;
        int max = max_attack;
        int range = (max-min)+1;
        double aleatori = (Math.random()*range)+ min;
        return aleatori;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof SpaceShip)) {
            return false;
        }
        final SpaceShip other = (SpaceShip) obj;
        return this.name.equalsIgnoreCase(other.name);
    }
    
    public abstract void stateInfo();
    
    public abstract void attacInfo(double valor);

    @Override
    public  void receiveAttack(double force)
    {
        double dany_real = force * PAIN_FACTOR;
        if (this.num_shield>0)
        {
            dany_real = dany_real/2;
            num_shield--;
            System.out.println("Aun tengo escudos , recibo la mitad " + dany_real);
        }
        this.energy = this.energy-dany_real;
        if (this.energy<0)
        {
            alive = false;
        }
        stateInfo();
    }
    
    
}
