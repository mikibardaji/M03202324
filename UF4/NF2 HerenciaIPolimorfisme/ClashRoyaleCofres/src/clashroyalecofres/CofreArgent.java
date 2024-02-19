/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clashroyalecofres;

/**
 *
 * @author mabardaji
 */
public class CofreArgent extends CofreGenerico{

    @Override
    protected void obrirCofre() {
        this.monedas = this.generarMonedas(105, 120);
        do
        {
           Carta card = new Carta(3);
            //if (lista.indexOf(card)>=0) //
            if (!lista.contains(card))//funciona si
            {//tenemos el equals implementado
                lista.add(card);
            } 
            else
            {
                System.out.println("Carta repetida ");
            }
        }while(lista.size()<2);
       
    }
    
}
