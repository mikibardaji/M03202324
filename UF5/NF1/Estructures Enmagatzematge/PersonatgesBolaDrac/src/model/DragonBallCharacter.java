/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mabardaji
 */
public class DragonBallCharacter {
    private String nom;
    private int potencia_atac;
    private Evolution nivell_evolucio;
    private boolean terrestre;

    public DragonBallCharacter(String nom, int potencia_atac, Evolution nivell_evolucio, boolean terrestre) {
        this.nom = nom;
        this.potencia_atac = potencia_atac;
        this.nivell_evolucio = nivell_evolucio;
        this.terrestre = terrestre;
    }
    
    public DragonBallCharacter(String nom, int potencia)
    {
        this.nom = nom;
        this.potencia_atac = potencia;
        this.nivell_evolucio =  Evolution.NEN;
        this.terrestre = true;
    }

    public void setNom(String nom) {
        if (nom.length()>0)
        {
            this.nom = nom;
        }
        //llançar una exception propia
    }

    public void setPotencia_atac(int potencia_atac) {
        if (potencia_atac<0)
        {
            this.potencia_atac = potencia_atac;
        }
        //llançar una exception propia
    }

    public void setNivell_evolucio(Evolution nivell_evolucio) {
        this.nivell_evolucio = nivell_evolucio;
    }

    public void setTerrestre(boolean terrestre) {
        this.terrestre = terrestre;
    }

    public String getNom() {
        return nom;
    }

    public boolean isTerrestre() {
        return terrestre;
    }
    
    public int getAtac()
    {
        // multiplicar atac per el numero de evolutio
        //retornar el valor
        return 0;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof DragonBallCharacter)) {
            return false;
        }
        final DragonBallCharacter other = (DragonBallCharacter) obj;
       
        if (!this.nom.equalsIgnoreCase(other.nom))
        {
            return false;
        }
        
        return this.nivell_evolucio.name()
                .equalsIgnoreCase(other.nivell_evolucio.name());
                
       
    }
    
    
    
    
}
