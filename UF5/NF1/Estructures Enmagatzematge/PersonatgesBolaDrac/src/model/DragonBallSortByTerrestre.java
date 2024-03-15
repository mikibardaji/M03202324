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
public class DragonBallSortByTerrestre implements Comparator<DragonBallCharacter>{


    @Override
    public int compare(DragonBallCharacter o1, DragonBallCharacter o2) {
        //terrestre sigui mes gran que no terrestre o sigui true mes gran que false
        //+1 si el primer es mes gran , 0 si son igual , i -1 si el primer es més petit
        if (o1.isTerrestre()==o2.isTerrestre())
        { //no es equals perque boolean es primitiu sino, sí.
            return 0;
        }
        else if (o1.isTerrestre()==true)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
    
}
