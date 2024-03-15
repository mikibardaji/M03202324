/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 *
 * @author mabardaji
 */
public class DragonBallSortByNom implements Comparator<DragonBallCharacter>{

    @Override
    public int compare(DragonBallCharacter o1, DragonBallCharacter o2) {
        //name
        int comparador = o1.getNom().toUpperCase().compareTo(o2.getNom().toUpperCase());
        //aprofitem que estem comparant String clase de java 
        //i ella ja te definida el metode compareTo
        return comparador;
        
    }
    
}
