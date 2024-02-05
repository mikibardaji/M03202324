/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dofivsfoca;

/**
 *
 * @author mabardaji
 */
public class Foca {
    private int pes;
    private final int edad;
    private int resistencia;
    private int distancia_recorreguda;
    
//Sol es podrà crear FOQUES, passant-los d’entrada el pes i la edat. 
    //Les foques com a màxim viuen 35 anys, per tant no hem de 
    //poder crear foques més grans i el pes no pot passar de 90,
    //si alguna d’aquestes dades és superior a la creació , 
    //és deixarà l'atribut amb el valor màxim permes
    //i s’informara per consola, 
    //en aquest mateix moment es ficara la resistencia a 3. 
    //Els altres atributs s’inicialitzen amb el valor coherent 
    //al moment de creació.

    public Foca(int pes, int edad) {
        if (edad > 35)
        {
            System.out.println("Edad incorrecta " + edad);
            this.edad = 35;
        }
        else
        {
            this.edad = edad;
        }
        
        this.setPes(pes);
        
        this.distancia_recorreguda=0;
        this.resistencia=3;
    }

    public void setPes(int pes) {
        if (pes>90)
        {
            System.out.println("pes incorrecte " + pes);
            this.pes = 90;            
        }
        else
        {
            this.pes = pes;
        }
    }

    public int getPes() {
        return pes;
    }

    public int getEdad() {
        return edad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }

    public void aumentarResistencia(int mas_resistencia)
    {
        this.resistencia += mas_resistencia;
        System.out.println("ha aumentado la resistencia");
    }
    
    public void sprint()
    {
        int sprint_actual = this.edad * (200 - this.pes); // és calcula multiplicant l’edat, pel resultat de restar 200 menys el pes de la foca
        if (this.resistencia>0)
        {
        //A aquest càlcul, si la foca, encara té resistencia, 
            //es multiplica per 2, 
            //pero la resistencia cada cop és decrementa en 1.
            sprint_actual = sprint_actual*2;
            resistencia--;
        }
        this.distancia_recorreguda += sprint_actual;
        System.out.println("Foca ha recorregut " + this.distancia_recorreguda);
    }

    @Override
    public String toString() {
        return "Foca pesa " + pes + " kg, edad=" + edad + " años, resistencia=" + resistencia ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { //lugar memoria
            return true;
        }
        if (obj == null) { //si es null 
            return false;
        }
        if (obj instanceof Foca) { //si no es clase foca
            return false;
        }
        final Foca other = (Foca) obj;
        if (this.pes != other.pes) {
            return false;
        }
        return this.edad == other.edad;
    }
    }




    
    
    
    
}
