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
public class KarateTournee {
    /*atribut*/
    private List<KarateMember> lista ;
    private String season;
    private final int MAX_PLAYERS = 16;
    /*metodes*/

    public KarateTournee(String season) {
        lista = new ArrayList<>();
        this.season = season;
    }

    public List<KarateMember> getLista() {
        return lista;
    }

    public void setLista(List<KarateMember> lista) {
        this.lista = lista;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    
    public boolean addFighter(KarateMember player) 
            throws MoreRegistrationsAllowedException, DuplicatePlayerException
    { //player te name i dojo informat i el power
        int num_dorsal = lista.size()+1;
        player.setDorsal(num_dorsal);
        if(num_dorsal<= MAX_PLAYERS)
        { //ok
            if (!lista.contains(player))
            {// lo añado
               return lista.add(player);
               //return player;
               
            }
            else
            { //duplicat
               throw new DuplicatePlayerException();
            }
        }
        else
        {
            throw new MoreRegistrationsAllowedException();
        }
        
        
    }
            
    public int getPlayers()
    {
        return lista.size();
    }
    
    
    public boolean removeFighter(KarateMember delete)
    {
        return lista.remove(delete); //equals 
    }
    
    public boolean lostFighter(int dorsal)
    {
        for (KarateMember luchador : lista) {
            if(luchador.getDorsal()==dorsal)
            {
                lista.remove(luchador);
                return true;
            }
        }
        //fa el mateix
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getDorsal() == dorsal)
            {
                lista.remove(i);
                return true;
            }
        }
        return false;
    }
    
    
    public List<KarateMember> playerByDojo(String dojo)
    {
       List<KarateMember> dojo_list = new ArrayList<>();
        for (KarateMember player : lista) {
            //System.out.println(player.getDojo() + "-" + dojo);
            if (player.getDojo().equalsIgnoreCase(dojo))
            {
              //  System.out.println("afegit");
                dojo_list.add(player);
            }
        }
       return dojo_list; 
    }
}
