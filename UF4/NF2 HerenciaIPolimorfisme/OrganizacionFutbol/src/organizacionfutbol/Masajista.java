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
    private String titulación;
    protected static final int SALARIO_MINIMO=500;
    public Masajista(String titulación, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.titulación = titulación;
        salario = SALARIO_MINIMO;
    }
    

    public void darMasaje()
    {
        System.out.println("Estoy dando un masaje   ...");
    }

    public String getTitulación() {
        return titulación;
    }
    
    
}
