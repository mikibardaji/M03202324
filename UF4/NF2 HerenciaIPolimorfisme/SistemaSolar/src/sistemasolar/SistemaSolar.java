/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasolar;

import java.util.ArrayList;

/**
 *
 * @author mabardaji
 */
public class SistemaSolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Planeta planet = new Planeta(10, 1, true, "Tierra", 10, 10, 1000);
        Satelite satelit = new Satelite(20, 2, planet, "luna", 2, 2, 20);
        Astros star = new Astros("generico", 10, 20, 30);
        
        ArrayList<Astros> lista = new ArrayList();
        //al ser astros i la característica polimorfisme
        //hem deixara guardar objectes derivats d'astros
        lista.add(star);
        lista.add(planet);
        lista.add(satelit);
        System.out.println("objetos añadidos" + lista.size());
        
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("-----------");
            System.out.println(lista.get(i));
        }
        
        System.out.println("for each");
        for (Astros ast : lista) {
            System.out.println("-----------");
            if (ast instanceof Satelite)
            {
                System.out.println("Esto es un satelite!!!!!");
            }
            else if (ast instanceof Planeta)
            {
                System.out.println("Esto es un planeta!!!!!");
            }
            
            System.out.println(ast);
        }
        
    }
    
}
