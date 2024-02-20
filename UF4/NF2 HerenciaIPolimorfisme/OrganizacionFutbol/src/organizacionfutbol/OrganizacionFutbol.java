/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package organizacionfutbol;

import java.util.ArrayList;

/**
 *
 * @author mabardaji
 */
public class OrganizacionFutbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador j1 = new Jugador(10, 10, "jugador10", 10);
        Jugador j2 = new Jugador(20, 20, "jugador20", 20);
        Jugador j3 = new Jugador(30, 30, "jugador30", 30);
        Entrenador trainer = new Entrenador(40, "entrenador 40", 40);
        Masajista mas = new Masajista("GS", 5, "masajista 50", 50);
        Presidente presi = new Presidente(60, 60, "Presidente", 60);
        
        ArrayList<EquipoFutbol> todos = new ArrayList<>();
        todos.add(j1);
        todos.add(j2);
        todos.add(j3);
        todos.add(trainer);
        todos.add(mas);
        todos.add(presi);
        
        //todos viajan
        for (EquipoFutbol persona_concreta : todos) {
            persona_concreta.viajar();
        }
        System.out.println("***********");
                
        //concentrados 
        for (EquipoFutbol persona_concreta : todos) {
            persona_concreta.concentrarse();
        }
        
        //dia entreno
        for (EquipoFutbol todo : todos) {
            if (todo instanceof Jugador)
            {
                Jugador aux = (Jugador) todo;
                aux.entrenar();
            }
            else if (todo instanceof Entrenador)
            {
                Entrenador aux = (Entrenador) todo;
                aux.entrenar();
            }
            else
            {
                System.out.println(todo.getNombre() + "  no entreno ");
            }
                 
        }
        
    }
    
}
