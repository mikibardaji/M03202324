/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;

/**
 *
 * @author mabardaji
 */
public class Satelite extends Astros{
    private int distancia_planeta;
    private double orbita_planetaria;
    private Planeta planeta_pertenece;

    public Satelite(int distancia_planeta, double orbita_planetaria, Planeta planeta_pertenece, String nombre, double radio_ecuatorial, int tiempo_rotacion, double masa) {
        super(nombre, radio_ecuatorial, tiempo_rotacion, masa);
        this.distancia_planeta = distancia_planeta;
        this.orbita_planetaria = orbita_planetaria;
        this.planeta_pertenece = planeta_pertenece;
    }

    public int getDistancia_planeta() {
        return distancia_planeta;
    }

    public void setDistancia_planeta(int distancia_planeta) {
        this.distancia_planeta = distancia_planeta;
    }

    public double getOrbita_planetaria() {
        return orbita_planetaria;
    }

    public void setOrbita_planetaria(double orbita_planetaria) {
        this.orbita_planetaria = orbita_planetaria;
    }

    public Planeta getPlaneta_pertenece() {
        return planeta_pertenece;
    }

    public void setPlaneta_pertenece(Planeta planeta_pertenece) {
        this.planeta_pertenece = planeta_pertenece;
    }

    @Override
    public String toString() {
        return super.toString() + " Satelite distancia a su planeta " + distancia_planeta + ", orbita_planetaria=" + orbita_planetaria + ", planeta_pertenece=" + planeta_pertenece ;
    }
    
    
    
}
