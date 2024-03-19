/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setproves;

import java.util.Objects;

/**
 *
 * @author mabardaji
 */
public class Persona {
    private String nom;
    private int ticket;
    private boolean cita_previa;

    public Persona(String nom, int ticket, boolean cita_previa) {
        this.nom = nom;
        this.ticket = ticket;
        this.cita_previa = cita_previa;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public boolean isCita_previa() {
        return cita_previa;
    }

    public void setCita_previa(boolean cita_previa) {
        this.cita_previa = cita_previa;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append(nom).append(" tiene el numero ").append(ticket);
        sb.append("\n");
        if (cita_previa)
        {
            sb.append(" Tiene cita previa");
        }
        else
        {
            sb.append(" No tiene cita previa");
        }
        
        return sb.toString();
    }

    /**
     * hashcode es necessari per totes les estructures tipus hash
     * es el equivalent a equals
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nom);
        //hash = 79* hash + this.ticket;
        return hash;
    }





    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Persona)) {
            return false;
        }
//        return true;
        final Persona other = (Persona) obj;
        return this.getNom().equalsIgnoreCase(other.getNom());
    }


    
    
    
    
    
}
