/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appelectrodomesticos;

/**
 *
 * @author mabardaji
 */
public final class RadioReceptor extends Electrodomestico{
    
    private String color;

    public RadioReceptor(String color, double voltajeUso, double precio_sin_iva, double anyo_compra) {
        super(voltajeUso, precio_sin_iva, anyo_compra);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    
}
