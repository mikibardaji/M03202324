/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestioncasa;

/**
 *
 * @author mabardaji
 */
public class Hipoteca {
    private double cantidad_debe;
    private int anyos;

    public Hipoteca(double cantidad_debe, int anyos) {
        this.cantidad_debe = cantidad_debe;
        this.anyos = anyos;
    }

    public double getCantidad_debe() {
        return cantidad_debe;
    }

    public void setCantidad_debe(double cantidad_debe) {
        this.cantidad_debe = cantidad_debe;
    }

    public int getAnyos() {
        return anyos;
    }

    public void setAnyos(int anyos) {
        this.anyos = anyos;
    }
    
    public double cuotaAnual()
    {
        double couta = (double) this.getCantidad_debe() / this.getAnyos();
        return couta;
    }
    
    /**
     * devuelve la cantidad a pagar cada mes de la cuota
     * @return 
     */
    public double coutaMensual()
    {
        double cuota = this.cuotaAnual();
        double cuota_mensual = (double)(cuota /12);
        return cuota_mensual;
    }
    
    /**
     * 
     * @param cuota_amortizacion
     * @return la cantidad que queda por pagar
     * -1 si no ha amortizado nada porque la cuota de entrada
     * es erronea )negativa o mayor que lo que debemos)
     */
    public double amortizar(double cuota_amortizacion)
    {
        if (cuota_amortizacion<=cantidad_debe
                && cuota_amortizacion>0)
        {
            this.cantidad_debe -= cuota_amortizacion;
            return this.cantidad_debe;
        }
        else
        {
            return -1;
        }
    }
    
    /**
     * 
     * @param anyos adelantas hipoteca
     * @return anyos que te quedan por pagar
     * -1 si no has podido amortizar por error entrada
     */
    public double amortizar_meses(int anyos)
    {
        if (anyos>0)
        {
            this.anyos -= anyos;
            return this.anyos;
        }
        else
        {
            return -1;
        }
        
    }
    
}
