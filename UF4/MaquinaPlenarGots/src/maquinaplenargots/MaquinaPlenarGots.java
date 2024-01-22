/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinaplenargots;

import java.util.Timer;

/**
 *
 * @author mabardaji
 */
public class MaquinaPlenarGots {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Botella bottle = new Botella(300); //1er objecte del tipus botella
        Botella bottle2 = new Botella(250); //2on objecte del tipus botella
        bottle.obrirBotella();
        if(bottle.plenarBotella()==-1)
        {
            System.out.println("Botella cerrada");
        }
        bottle2.plenarBotella();
        
        Got[] todos_vasos = new Got[10];
        for (int i = 0; i < todos_vasos.length; i++) {
            todos_vasos[i] = new Got();
        }
        System.out.println("empiezo ... ");
        //maquina llena vasos
        int cont_vasos=0;
        while (!bottle.isBuit())
        {
            todos_vasos[cont_vasos].omplirGot(bottle.Servir());
            System.out.println("omplo got " + cont_vasos  
                    + " capacitat" + todos_vasos[cont_vasos].getCapacity());
            Thread.sleep(1000);
            if (todos_vasos[cont_vasos].isPle())
            {
                
                cont_vasos++;
                System.out.println("Canvi de got a " + cont_vasos);
                Thread.sleep(1000);
            }
        }
        System.out.println("Canvi de botella");
        bottle2.obrirBotella();
        if(bottle2.plenarBotella()==-1)
        {
            System.out.println("Botella cerrada");
        }
        while (!bottle2.isBuit())
        {
            todos_vasos[cont_vasos].omplirGot(bottle2.Servir());
            System.out.println("omplo got " + cont_vasos  
                    + " capacitat" + todos_vasos[cont_vasos].getCapacity());
            Thread.sleep(1000);
            if (todos_vasos[cont_vasos].isPle())
            {
                
                cont_vasos++;
                System.out.println("Canvi de got a " + cont_vasos);
                Thread.sleep(1000);
            }
        }        
        
         
        
        
    }
    
    public static void basura()
    {
         Botella bottle = new Botella(); //1er objecte del tipus botella
        Got glass = new Got(); //
        int nueva_capacidad = 100;
        System.out.println("capacidad " + bottle.getCapacity());
        System.out.println("cambio capacidad a " + nueva_capacidad);
        bottle.setCapacity(nueva_capacidad);
        System.out.println("capacidad " + bottle.getCapacity());
        nueva_capacidad=300;
        System.out.println("cambio capacidad a " + nueva_capacidad);
        bottle.setCapacity(nueva_capacidad);
        System.out.println("capacidad " + bottle.getCapacity());
        glass.setCapacity(10);
        System.out.println("vaso capacidad" + glass.getCapacity());
    }
    
    public static void Basura2()
    {
                Botella bottle = new Botella(); //1er objecte del tipus botella
        System.out.println("capacidad de la botella recien creada "
                + bottle.getCapacity()+ " cerrada " + bottle.isClosed());
        Botella bottle2 = new Botella(500);
        System.out.println("capacidad de la segunda botella recien creada "
                + bottle2.getCapacity()+ " cerrada " + bottle2.isClosed());
        
    //    Botella bottle3 = new Botella(1500, 1500);
    //    System.out.println("capacidad de la tercera botella recien creada "
    //            + bottle3.getCapacity()+ " cerrada " + bottle3.isClosed());
        System.out.println("Liquido que tienes las 3 botellas"
        + bottle.getLiquid() + "-"+ bottle2.getLiquid() + "-");
        //+ bottle3.getLiquid() + "-");
        System.exit(0);
        Got glass = new Got(); //
        int nueva_capacidad = 100;
        System.out.println("cambio capacidad a " + nueva_capacidad);
        if(bottle.setCapacity(nueva_capacidad)==0)
        {
            System.out.println("capacidad " + bottle.getCapacity());
        }
        else
        {
            System.out.println("no se ha cambiado la capacidad");
        }
        nueva_capacidad = 3000;
        System.out.println("cambio capacidad a " + nueva_capacidad);
        if(bottle.setCapacity(nueva_capacidad)==0)
        {
            System.out.println("capacidad " + bottle.getCapacity());
        }
        else
        {
            System.out.println("no se ha cambiado la capacidad");
        }   
    }
}
