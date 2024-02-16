/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;

/**
 *
 * @author mabardaji
 */
public class Planeta extends Astros{
    private int distancia_sol;
    private int orbita_sol;
    private boolean tiene_satelite;

    public Planeta(int distancia_sol, int orbita_sol, boolean tiene_satelite, String nombre, double radio_ecuatorial, int tiempo_rotacion, double masa) {
        super(nombre, radio_ecuatorial, tiempo_rotacion, masa);
        this.distancia_sol = distancia_sol;
        this.orbita_sol = orbita_sol;
        this.tiene_satelite = tiene_satelite;
    }

    public int getDistancia_sol() {
        return distancia_sol;
    }

    public void setDistancia_sol(int distancia_sol) {
        this.distancia_sol = distancia_sol;
    }

    public int getOrbita_sol() {
        return orbita_sol;
    }

    public void setOrbita_sol(int orbita_sol) {
        this.orbita_sol = orbita_sol;
    }

    public boolean isTiene_satelite() {
        return tiene_satelite;
    }

    public void setTiene_satelite(boolean tiene_satelite) {
        this.tiene_satelite = tiene_satelite;
    }

    @Override
    public String toString() {
        return "Planeta " + this.getNombre() + " su distancia al sol=" + distancia_sol + ", orbita_sol=" + orbita_sol + ", tiene_satelite=" + tiene_satelite ;
    }
    
    
    
}
