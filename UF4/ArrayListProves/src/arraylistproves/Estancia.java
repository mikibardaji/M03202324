/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistproves;

import java.util.Objects;

/**
 *
 * @author mabardaji
 */
public class Estancia {
    private String tipus;
    private double ample;
    private double alt;
    //private double superficie;atribut es pot calcular amb els alttres
    private int num_finestres;

    public Estancia()
    {
        
    }

    public Estancia(String tipus) {
        this.tipus = tipus;
    }
    
    
    
    
//    public Estancia(Lugar tipus, double ample, double alt, int num_finestres) 
//    {
//        if(metrosPositivo(ample) && metrosPositivo(alt))
//        {
//            this.tipus = tipus;
//            this.ample = ample;
//            this.alt = alt;
//            this.num_finestres = num_finestres;
//        }
//        else
//        {
//            System.err.println("Medidas no positivas" + ample + "-" + alt);
//        }    
//    }
    public Estancia(String tipus, double ample, double alt, int num_finestres) {
        if(metrosPositivo(ample) && metrosPositivo(alt))
        {
            this.tipus = tipus;
            this.ample = ample;
            this.alt = alt;
            this.num_finestres = num_finestres;
        }
        else
        {
            System.err.println("Medidas no positivas" + ample + "-" + alt);
        }
        
    }

    private boolean metrosPositivo(double metros) {
        return metros > 0;
    }
    
    /**
     * 
     * @param ample_nou
     * @param alt_nou
     * @return -1 si las medidas no son correcteas y positivas
     */
    public int Obras(int ample_nou, int alt_nou)
    {
        if(metrosPositivo(ample_nou) && metrosPositivo(alt_nou))
        {
            this.ample = ample_nou;
            this.alt = alt_nou;
            //superficie =this.ample * this.alt
            return 0;
        }
        else
        {
            return -1;
        }
    }
    
    public double superficieEstancia()
    {
        return ample*alt;
    }

    public int getNum_finestres() {
        return num_finestres;
    }

    public String getTipus() {
        return tipus;
    }

    @Override
    public String toString() {
        //return "Estancia{" + "tipus=" + tipus + ", ample=" + ample + ", alt=" + alt + ", num_finestres=" + num_finestres + '}';
        return "Nom habitació: " + tipus + ", superficie=" + this.superficieEstancia();
    }



//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) { //misma dirección memoria, es igual
//            return true;
//        }
//        if (obj == null) { //si vale null no es igual
//            return false;
//        }
//        if (!(obj instanceof Estancia)) {
//            return false;
//        }
//        final Estancia other = (Estancia) obj;
//        return this.tipus.equalsIgnoreCase(other.tipus);
//    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Estancia)) {
            return false;
        }
        final Estancia other = (Estancia) obj;
        if (this.ample != other.ample) {
            return false;
        }
        if (this.alt != other.alt) {
            return false;
        }
        return this.tipus.equalsIgnoreCase(other.tipus);
    }
  
    
    
    
    
    
    
    
}
