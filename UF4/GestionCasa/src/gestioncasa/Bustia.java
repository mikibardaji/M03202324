/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncasa;

/**
 *
 * @author mabardaji
 */
public class Bustia {
    private final double alto;
    private final double ancho;
    private boolean bandera;

    public Bustia() {
        alto=0;
        ancho=0;
    }

    
    public Bustia(double alto, double ancho) {
        if (FuncionesConstruccion.metrosPositivo(alto) && FuncionesConstruccion.metrosPositivo(ancho))
        {
            this.alto = alto;
            this.ancho = ancho;
            this.bandera = false;
        }
        else
        {
            System.err.println("Alto y ancho deben ser positivos " +
                    ancho + " * " + alto);
            this.alto = 0; //al ser final deben inicializarse si o si
            this.ancho = 0;//al ser final deben inicializarse si o si 
        }
        
    }
    
    /**
     * es un getter pero llamado isCartas
     * @return 
     */
    public boolean isCartas()
    {
        return bandera;
//        if (bandera)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
    }

    
    public void cartero()
    {
        this.bandera=true;
    }
    
    public void recogerCorreo()
    {
        this.bandera = false;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }
    
    
}
