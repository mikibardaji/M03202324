/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasolar;

/**
 *
 * @author mabardaji
 */
public class Astros {
    private String nombre;
    private double radio_ecuatorial;
    private int tiempo_rotacion;
    private double masa;

    public Astros(String nombre, double radio_ecuatorial, int tiempo_rotacion, double masa) {
        this.nombre = nombre;
        this.radio_ecuatorial = radio_ecuatorial;
        this.tiempo_rotacion = tiempo_rotacion;
        this.masa = masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio_ecuatorial() {
        return radio_ecuatorial;
    }

    public void setRadio_ecuatorial(double radio_ecuatorial) {
        this.radio_ecuatorial = radio_ecuatorial;
    }

    public int getTiempo_rotacion() {
        return tiempo_rotacion;
    }

    public void setTiempo_rotacion(int tiempo_rotacion) {
        this.tiempo_rotacion = tiempo_rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    @Override
    public String toString() {
        return "El Astro " + nombre + ", su radio es " + radio_ecuatorial + ", y tarda " + tiempo_rotacion + " en dar la vuelta sobre si mismo, y pesa " + masa + '}';
    }
    
    
}
