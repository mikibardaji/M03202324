/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex;

/**
 *
 * @author mabardaji
 */
public final class Normal extends Pokemon{

    public Normal(String nom, int fuerza_combate) {
        super(nom, fuerza_combate);
        this.life = 750;
    }

    @Override
    public int ataque() {
        if (!this.escape())
        {
            System.out.println("Ataque arañazo!!! .... ");
            int num=150;
            return num;
        }
        else
            return 0; 
    }

    @Override
    public void recibirAtaque(Pokemon pok) {
                //en funcion de que tipo es el pokemon atacante
        //va a recibir mas daño
        //al dragon le afecta mas el tipo dragon y hielo
        int ataque;
        if (pok instanceof Fuego)
        { 
           ataque =   pok.ataque()*2;
        }
        else
        {
            ataque = pok.ataque();
        }
        System.out.println(this.nom + " Recibo ataque " + ataque);
        this.life = this.life - ataque;
    }
    
}
