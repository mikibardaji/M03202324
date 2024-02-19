/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clashroyalecofres;

/**
 *
 * @author mabardaji
 */
public class Carta {
    private NombreCarta Name;
    private int elixir;
    private int arena;
    private int num_cartas;

    public Carta(int num_cartas) {
        // falta codi per trobar la carta aleatoria
        int posicion = asignarCartaAleatoria(); 
        this.elixir = posicion%9;
        asignarArena(posicion);
        this.num_cartas = num_cartas;
    }

    
    public NombreCarta getName() {
        return Name;
    }

    public int getElixir() {
        return elixir;
    }

    public void setElixir(int elixir) {
        this.elixir = elixir;
    }

    public int getArena() {
        return arena;
    }

    public int getNum_cartas() {
        return num_cartas;
    }

    @Override
    public String toString() {
        return num_cartas + " de " + Name.toString() + " necesita elixir=" + elixir + " se encuentra en la  arena " + arena ;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Carta)) {
            return false;
        }
        final Carta other = (Carta) obj;
        return this.Name.toString().equalsIgnoreCase(other.Name.toString());
    }

    private void asignarArena(int posicion) {
        this.arena = posicion;
        if (posicion==7)
        {
            this.arena = 10;
        }
        else if (posicion ==8)
        {
            this.arena = 13;
        }
    }

    private int asignarCartaAleatoria() {
        NombreCarta[] todos = NombreCarta.values();
        int min=0;
        int max = todos.length;
        int range = (max - min)+min;
        int posicion = (int)(Math.random()*range)+min;
        System.out.println(todos[posicion].name());
        Name = todos[posicion];
        return posicion;
    }
    
    
    
    
}
