/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizacionfutbol;

/**
 *
 * @author mabardaji
 */
public class Jugador extends Equipo{
    private int goles;

    public Jugador(int goles, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.goles = goles;
    }


    @Override
    public void entrenar() {
        System.out.println(this.nombre +" entreno haciendo rondo");
    }

    public void jugarPartido()
    {
        System.out.println(this.nombre + " soy jugador y juego el partido por " + salario + "€");
        salario += 1000;
    }

    public int getGoles() {
        return goles;
    }
    
    
}
