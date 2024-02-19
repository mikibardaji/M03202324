/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasinterface;

/**
 *
 * @author mabardaji
 */
public class Cuadrado implements Figura{
    float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    
    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return 4*lado;
    }
    
}
