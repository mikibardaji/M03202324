/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class Cataleg {
    List<DragonBallCharacter> personatges;

    public Cataleg() {
        personatges = new ArrayList<>();
    }
    //metodes per manipular la llista
    
    public boolean afegirCharacter(DragonBallCharacter add_person) 
            throws DuplicateCharacterException
    {
        boolean afegit;
        
        if (!personatges.contains(add_person))
        {
            afegit = personatges.add(add_person);
        }
        else
        {
            //que hago?
            //afegit = false
            throw new DuplicateCharacterException();
        }
        
        
        return afegit;
    }
    
    
    public int getNumCharacter()
    {
        return personatges.size();
    }
    
    public List<DragonBallCharacter> getAllCharacter()
    {
        
    }
    
    public void removePersonatge(DragonBallCharacter delete_person)
    {
        //mirar si tiene que ser void o devolver algo
    }
}
