/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasinterface;

/**
 *
 * @author mabardaji
 */
public class Circulo implements Figura {
    float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float area() {
        return this.PI*radio*radio;
    }

    @Override
    public float perimetro() {
        float peri = 2 * PI * this.radio;
        return peri;
    }
    
    
}
