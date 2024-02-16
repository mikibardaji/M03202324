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
    private int monedas;
    private ArrayList<Carta> lista;

    public CofreGenerico() {
        lista = new ArrayList<>();
    }
    
    /**
     * cada abertura es diferente
     */
    protected abstract void obrirCofre();
    
    protected void mostrarCofre()
    {
        System.out.println("Numero monedas: " + monedas);
        System.out.println("Cartas");
        for (Carta carta : lista) {
            System.out.println(carta);
        }
    }
    
    
}
