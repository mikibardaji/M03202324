/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.SQLException;

/**
 *
 * @author mabardaji
 */
public class ModeloDatos {
    EntrenadorDAO entrenador;
    PokemonDAO pokemon;
    CapturaDAO captura;

    public ModeloDatos() throws SQLException {
        entrenador = new EntrenadorDAO();
        pokemon = new PokemonDAO();
        captura = new CapturaDAO();
    }

    public EntrenadorDAO getEntrenador() {
        return entrenador;
    }

    public PokemonDAO getPokemon() {
        return pokemon;
    }

    public CapturaDAO getCaptura() {
        return captura;
    }
    
    
}
