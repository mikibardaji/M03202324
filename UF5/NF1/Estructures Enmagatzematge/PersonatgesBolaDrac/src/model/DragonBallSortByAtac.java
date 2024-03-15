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
public class DragonBallSortByAtac implements Comparator<DragonBallCharacter>{

    @Override
    public int compare(DragonBallCharacter o1, DragonBallCharacter o2) {
        
        //-1 si el primer es abans, 0 si son iguals, i +1 si el segon s'ha d'rdenar
        //o2.getAtac() i o1.getAtac
        //int comparator = o1.getAtac()*(-1)+ o2.getAtac() ;
        int comparator =   o2.getAtac() - o1.getAtac()  ;
        return comparator;

    }
    
}
