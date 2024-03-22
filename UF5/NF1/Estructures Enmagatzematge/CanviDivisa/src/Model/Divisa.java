/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author mabardaji
 */
public class Divisa {
    String nombre;
    Double cambio;

    public Divisa(String nombre, Double canvio) {
        this.nombre = nombre;
        this.cambio = canvio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getCambio() {
        return cambio;
    }

    public void setCambio(Double canvio) {
        this.cambio = canvio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nombre);
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
        if (!(obj instanceof Divisa)) {
            return false;
        }
        final Divisa other = (Divisa) obj;
        
//        if (!this.cambio.equals(other.cambio))
//        {
//            return false; //com la divisa no es igual
//        }
        return this.nombre.equalsIgnoreCase(other.nombre);
    }

    @Override
    public String toString() {
        return "La divisa " + nombre + " actualmente tiene el cambio " + cambio;
    }
    
    
    
}
