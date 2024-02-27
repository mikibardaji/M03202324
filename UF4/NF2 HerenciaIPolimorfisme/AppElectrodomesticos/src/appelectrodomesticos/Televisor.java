/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appelectrodomesticos;

/**
 *
 * @author mabardaji
 */
public class Televisor extends Electrodomestico{
    
    private float ancho;
    private float alto;
    private float fondo;

    public Televisor() {
        super(220,100,2010);
    }

    public Televisor(float ancho, float alto, float fondo, double voltajeUso, double precio_sin_iva, double anyo_compra) {
        super(voltajeUso, precio_sin_iva, anyo_compra);
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
    }
    
    

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    public void setAlto(float alto) {
        this.alto = alto;
    }

    public void setFondo(float fondo) {
        this.fondo = fondo;
    }

    public float getAncho() {
        return ancho;
    }

    public float getAlto() {
        return alto;
    }

    public float getFondo() {
        return fondo;
    }
    
    
    
}
