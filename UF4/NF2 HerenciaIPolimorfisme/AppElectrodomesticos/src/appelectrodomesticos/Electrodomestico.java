/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appelectrodomesticos;

import java.time.LocalDate;

/**
 *
 * @author mabardaji
 */
public abstract class Electrodomestico implements Vendible{
    private double voltajeUso;
    private double precio_sin_iva;
    private double anyo_compra;

    public Electrodomestico(double voltajeUso, double precio_sin_iva, double anyo_compra) {
        this.voltajeUso = voltajeUso;
        this.precio_sin_iva = precio_sin_iva;
        this.anyo_compra = anyo_compra;
    }
    
    
    
    public void ConectarEnchufe()
    {
        //codi
    }

    @Override
    public double calcularPrecio()
    {
        double precio_con_iva = precio_sin_iva * 1.21;
        return precio_con_iva;
    };

    @Override
    public boolean tieneGarantia()
    {
        LocalDate ahora = LocalDate.now();
        int anyo = ahora.getYear();
        
        return (Math.abs(anyo - anyo_compra) < 5);
        //buscar codi de obtener año actual
    };
    
    
    
}
