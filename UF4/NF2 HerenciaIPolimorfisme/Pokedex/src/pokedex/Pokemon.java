/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author mabardaji
 */
public abstract class Pokemon {
    //abstract no ens permet fer objectes de la clase pokemon (new Pokemon)
    protected String nom;
    private int fuerza_combate;
    protected int life;
    private boolean huida;

    public Pokemon(String nom, int fuerza_combate) {
        this.nom = nom;
        this.fuerza_combate = fuerza_combate;
        huida=false;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getFuerza_combate() {
        return fuerza_combate;
    }

    public void setFuerza_combate(int fuerza_combate) {
        this.fuerza_combate = fuerza_combate;
    }
    
    public void recibirAtaque(int damage) //mismo metodo diferentes 
    { //variables de entrada
        this.life = this.life - damage;
    }
    
    public void recibirAtaque(Pokemon pok) //mismo metodo diferentes 
    { //variables de entrada
        this.life = this.life - pok.ataque();
    }
    
    public boolean escape()
    {
        int min = 1;
        int max = 3;
        int range = (max - min )+ 1;
        int num = (int)(Math.random()*range)+min;
        if (num==1)
        {
            huida = true;
        }
        else
        {
            huida = false;
        }
        return huida;
    
   
}

    
    //metodo OBLIGATORIO PARA TODOS LOS TIPOS DE POKEMON
    public int ataque()
    {
        return 3;
    };
    //no hi ha codi perque serà diferent per tots els tipus de pokemon
    
    @Override
    public String toString() {
        return  "nom=" + nom + ", fuerza_combate=" + fuerza_combate + ", life=" + life + ", huida=" + huida ;
    }
    
    public int getLife() {
        return life;
    }
}
