/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clashroyalecofres;

import java.util.ArrayList;

/**
 *
 * @author mabardaji
 */
public abstract class CofreGenerico {
    protected int monedas;
    protected ArrayList<Carta> lista;

    public CofreGenerico() {
        lista = new ArrayList<>(); //perque no sigui null
    }
    
    /**
     * cada abertura es diferente
     */
    protected abstract void obrirCofre();
    
    protected void mostrarCofre()
    {
        System.out.println("Numero monedas: " + monedas);
        System.out.println("Cartas que tienes: ");
        for (Carta carta : lista) {
            System.out.println(carta);
        }
        System.out.println("Cartas mostradas " + lista.size());
    }

    public int getMonedas() {
        return monedas;
    }

    public ArrayList<Carta> getLista() {
        return lista;
    }
    
    protected int generarMonedas(int min, int max)
    {
        int range = (max - min) + 1;
        int aleatori = (int)(Math.random()*range)+min;
        return aleatori;
    }
}
