/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package appelectrodomesticos;

/**
 *
 * @author mabardaji
 */
public interface Vendible {
    
    //calculo con IVa 
    public double calcularPrecio();
    //si tiene menos de 5 años tiene garantia
    public boolean tieneGarantia();
}
