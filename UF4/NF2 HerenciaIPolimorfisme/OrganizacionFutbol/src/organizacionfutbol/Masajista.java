/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizacionfutbol;

import static organizacionfutbol.Equipo.SALARIO_MINIMO;

/**
 *
 * @author mabardaji
 */
public class Masajista extends EquipoFutbol{
    private String titulaci�n;
    protected static final int SALARIO_MINIMO=500;
    public Masajista(String titulaci�n, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.titulaci�n = titulaci�n;
        salario = SALARIO_MINIMO;
    }
    

    public void darMasaje()
    {
        System.out.println("Estoy dando un masaje   ...");
    }

    public String getTitulaci�n() {
        return titulaci�n;
    }
    
    
}
