/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mabardaji
 */
public class DAODivisa {
     Map<String, Double> divisas;
     final int MAX_DIVISAS = 10;
     //Map<String, Divisa> divisas;
    public DAODivisa() {
        divisas = new HashMap<>();
    }
     
    public Double altaDivisa(String moneda, Double cambio) throws MaxDivisiException
    {
        //Validació DAO!!! no del objecte
        if (divisas.size()<10)
        {
        return divisas.put(moneda, cambio);
        }
        else
        {
            throw new MaxDivisiException(MAX_DIVISAS);
        }
    }
    
    public Double altaDivisa(Divisa nueva) throws MaxDivisiException
    {
        if (divisas.size()<10)
        {
        return divisas.put(nueva.getNombre(), nueva.getCambio());
        }
        else
        {
            throw new MaxDivisiException(MAX_DIVISAS);
        }
    }

    public Map<String, Double> getDivisas() {
        return divisas;
    }

    /**
     * devuelve el cambio actual para la divisa que queremos
     * @param nombre_divisa a consultar
     * @return cambio solicitado o null si no existe
     */
    
    public Double devuelveCambioDivisa(String nombre_divisa) {
            return divisas.get(nombre_divisa);    
    }

    /**
     * borra la pareja key , value que quieras
     * @param nombre_divisa key
     * @return value double que es un cambio y si no lo encuentra null
     */
    public Double bajaDivisa(String nombre_divisa) {
            return divisas.remove(nombre_divisa);
    }

    /**
     * modifica el cambio de la divisa
     * @param nombre_divisa divisa a cambiar
     * @param nuevo_valor nuevo cambio
     * @return antiguo cambio si existia o null si no existe
     */
    public Double cambiarDivisa(String nombre_divisa, Double nuevo_valor) {
        return divisas.replace(nombre_divisa, nuevo_valor);
    }
     
    
    
}
