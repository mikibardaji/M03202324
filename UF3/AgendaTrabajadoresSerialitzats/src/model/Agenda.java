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
public class Agenda { //DAO
    /*atribut*/
    List<String> listado;
    /*metodes*/

    public Agenda() {
        listado = new ArrayList<>();
    }
    
    public boolean afegirNom(String new_name)
    {
        if (!listado.contains(new_name))
        {
            listado.add(new_name);
            return true;
        }
        else
        {
            return false;
        }
        
    }

    public List<String> getListado() {
        return listado;
    }
    
    
    //TO DO Fa falta el setter?

    public void setListado(List<String> listado) {
        this.listado = listado;
    }
}
