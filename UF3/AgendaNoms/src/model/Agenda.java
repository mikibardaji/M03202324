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
public class Agenda {
    /*atribut*/
    List<String> listado;
    /*metodes*/

    public Agenda() {
        listado = new ArrayList<>();
    }
    
    public boolean afegirNom(String new_name)
    {
        //TO DO
        //mirar que no existeixi
        // si existeix retornar false
        //sino afegir i retornar
        return true;
    }

    public List<String> getListado() {
        return listado;
    }
    
    
    //TO DO Fa falta el setter?
}
