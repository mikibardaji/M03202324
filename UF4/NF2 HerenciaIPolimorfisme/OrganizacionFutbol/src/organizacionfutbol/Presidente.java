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
public class Presidente extends EquipoFutbol{
    private int anyos_cargo;
    protected static final int SALARIO_MINIMO=1500;
    public Presidente(int anyos_cargo, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.anyos_cargo = anyos_cargo;
        salario = SALARIO_MINIMO;
    }

    @Override
    public void viajar() {
        super.viajar(); 
        System.out.println("Yo viajo en primera...");
    }
    

    public void irPalcoPartido()
    {
        System.out.println("Estoy en el palco y saludo a la afición");  
    }
    
    public void tratarContrato(EquipoFutbol persona)
    {
        if (persona instanceof Jugador)
        {
            System.out.println("Si vols cobrar més has de fer gols");
        }
        else if(persona instanceof Entrenador)
        {
            System.out.println("El equip ha dejugar més bé");
        }
        else if (persona instanceof Masajista)
        {
            System.out.println("Si es lesionen et foto fora");
        }
    }

    public int getAnyos_cargo() {
        return anyos_cargo;
    }
    
    
}
