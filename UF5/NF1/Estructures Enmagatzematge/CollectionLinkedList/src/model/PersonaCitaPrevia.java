/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Comparator;

/**
 *
 * @author mabardaji
 */
public class PersonaCitaPrevia implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1.isCita_previa()==o2.isCita_previa())
        {
            return o1.getTicket()-o2.getTicket();
        }
        else if (o1.isCita_previa())
        {
            return -1; //el mes petit
        }
        else
        {
            return +1;
        }
           
    }


    
}
