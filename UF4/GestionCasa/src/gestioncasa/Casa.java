/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncasa;

/**
 *
 * @author mabardaji
 */
public class Casa {
    
    private Estancia[] compartimentos;
    private int num_estancias;
    private Bustia buzon;
    private Hipoteca mortgage;

    public Casa()
    {
        compartimentos = new Estancia[4];
        inicializarEstancia();
        num_estancias=0;
        buzon = new Bustia();
        //opcion 1 hipoteca a 0
        mortgage = new Hipoteca(0,0);
        //no poner la linea superior ^
        //mortgage = null;
    }
    
    
    public Casa(Estancia compartimento, Bustia buzon, Hipoteca mortgage) {
        this.compartimentos[0] = compartimento;
        num_estancias = 1;
        this.buzon = buzon;
        this.mortgage = mortgage;
    }

    private void inicializarEstancia() {
        for (int i = 0; i < this.compartimentos.length ; i++) {
            this.compartimentos[i] = new Estancia();
        }
    }
    
    public void afegirBustia(Bustia add)
    {
        this.buzon = add;
    }
    
    public void afegirHipoteca(Hipoteca add)
    {
        this.mortgage = add; 
    }
    
    /**
     * 
     * @param add
     * @return el numero de habitaicones que tienes
     */
   
    public int afegirEstancia(Estancia add)
    {
        //bucle preguntado por la superficie == 0 
        //canviarlo a esta
        this.compartimentos[num_estancias] = add;
        num_estancias++;
        return num_estancias;
    }
    
    public void afegirEstancia(String nombre, int alto, int ancho, int ventanas)
    {
        this.compartimentos[num_estancias] = 
                new Estancia(nombre, ancho, alto, ventanas);
        num_estancias++;
        
    }
     
    public double superficieTotalCasa()
    {
        double acum_metros_casa= 0;
        for (int i = 0; i < num_estancias; i++) {
            acum_metros_casa = acum_metros_casa 
                    + compartimentos[i].superficieEstancia();  
        }
        return acum_metros_casa;
        //for each 
        //for (Estancia habitacion : compartimentos) {
        //    acum_metros_casa = acum_metros_casa 
        //            + habitacion.superficieEstancia();
        //}  
    }
    
    /**
     * 
     * @return  el numero de ventanas que tiene la casa
     */
    public int numVentanasCasa()
    {
        int numero_ventanas=0;
        for (int i = 0; i < compartimentos.length; i++) {
            numero_ventanas += compartimentos[i].getNum_finestres();
        }
        return numero_ventanas;  
    }

    public int getNum_estancias() {
        return num_estancias;
    }

    public Estancia[] getCompartimentos() {
        return compartimentos;
    }
    
}
