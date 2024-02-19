/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasinterface;

/**
 *
 * @author mabardaji
 */
public class Rectangulo implements Figura{
    float base;
    float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    
    @Override
    public float area() {
            return base*altura;
    }

    @Override
    public float perimetro() {
        return (base*2) + (altura*2);
    }
    
    
}
