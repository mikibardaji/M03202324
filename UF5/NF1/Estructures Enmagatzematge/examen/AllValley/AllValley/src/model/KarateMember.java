/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;
import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class KarateMember {

    private int dorsal;
    private int power;
    private String name;
    private String dojo;

    public KarateMember(int dorsal, String name, String dojo) {
        this.dorsal = dorsal;
        this.name = name;
        this.dojo = dojo;
        Random rd = new Random();
        power = rd.nextInt(50, 101);
    }

    public KarateMember(String name, String dojo) {
        this.name = name;
        this.dojo = dojo;
        Random rd = new Random();
        power = rd.nextInt(50, 101);
    }

    
    
    
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDojo() {
        return dojo;
    }

    public void setDojo(String dojo) {
        this.dojo = dojo;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figther ");
        sb.append(this.name);
        sb.append(" has ");
        sb.append(this.power);
        sb.append(" power.");
        return sb.toString();
        
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof KarateMember)) {
            return false;
        }
        final KarateMember other = (KarateMember) obj;
        if (!this.name.equalsIgnoreCase(other.name)) {
            return false;
        }
        return this.dojo.equalsIgnoreCase(other.dojo);
    }
    
    
    
    
    
    
}
