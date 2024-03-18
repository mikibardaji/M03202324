/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.LinkedList;

/**
 *
 * @author mabardaji
 */
public class DAOPersona {
    //Data Acces Object (cataleg) 
    LinkedList<Persona> cola;

    public DAOPersona() {
        this.cola = new LinkedList<>();
    }

    /**
     * afegira la persona a la cua
     * pero li assignara la posició que li toqui
     * basant-se amb la gent que estigui a la cua
     * @param afegir 
     */
    public void afegirPersona(Persona afegir) 
    {    
        int ticket = cola.size()+1; //se quanta gemt hi ha 
        afegir.setTicket(ticket);
        cola.addLast(afegir);
        cola.sort(new PersonaCitaPrevia()); //ordena despres d'afegir
    }

    /**
     * coger la priemra persona de la cola 
     * devolver los datos
     * y sacarla de la cola
     */
    public Persona AtenderPersona() {
        return cola.pollFirst(); //retornar i borrar
    }

    public LinkedList<Persona> getColaEntera() {
        return cola;
    }

    public Persona treurePersona() {
        return cola.pollLast();
    }
    
    
}
