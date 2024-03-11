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
    
    /**
     * devuelve todos los persones introducidos
     * @return personatges
     */
    public List<DragonBallCharacter> getAllCharacters()
    {
        return personatges;
    }
    
    public List<DragonBallCharacter> getAllTerrestreCharacters(boolean et)
    {
        List<DragonBallCharacter> terrestre = new ArrayList<>();
        //recorrer personatges i si son el valor de et, afegirlos a terrestre
        
        
        return terrestre;
    } 
    
    public void removePersonatge(DragonBallCharacter delete_person)
    {
        //mirar si tiene que ser void o devolver algo
    }
    
    
    /**
     * Busca el 1er personage que coincide por el nombre
     * @param name del personaje a buscar
     * @return DragonBallCharater encontrado , null si no existe
     */
    public List<DragonBallCharacter> findByName(String name)
    {
        List<DragonBallCharacter> list_name= new ArrayList<>();
        for (DragonBallCharacter person : personatges) {
            if (person.getNom().equalsIgnoreCase(name))
            {
                list_name.add(person); //en pot afegir m�s d'una
            }
        }
        
        if (list_name.size()>=0)
        {
            return list_name;
        }
        else
            return null; //doesn't exist
    }
    
    /**
     * devuelve el personaje por su posicion en la lista
     * @param pos 
     * @return person de la posici�n o null si no es una posici�n correcta
     */
    public DragonBallCharacter findByPosition(int pos)
    {
        if (pos>=1 && pos <= personatges.size())
        {
            return personatges.get(pos-1);
        }
        else
            return null;
        
    }
    
    /**
     * Busca un personaje si existe en la lista
     * @param person DragonballCharacter a encontrar
     * @return DragonBallcharacter encontrado, -1 si no existre
     */
    public DragonBallCharacter findByDragonBall(DragonBallCharacter person)
    {
        int pos = personatges.indexOf(person);
        if (pos!= -1)
        {
            return personatges.get(pos);
        }
        else
            return null; //doesn't exist
    }

    public DragonBallCharacter findByPerson(DragonBallCharacter search) {
        //search te informat el name i evolution
        //que son els camps importants del Equals
        int posicio_objecte = personatges.indexOf(search); //gracies al equals 
        //el pot trobar
        if (posicio_objecte!=-1)
        {
            return personatges.get(posicio_objecte);
        }
        else
        {
            return null;
        }
    }
    
    
}
