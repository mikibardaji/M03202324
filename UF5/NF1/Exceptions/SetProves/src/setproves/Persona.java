/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package setproves;

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
    
    
    
    
    
}
