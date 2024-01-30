/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylistproves;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ArrayListProves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estancia uno = new Estancia("hab1", 1, 1, 1);
        Estancia dos = new Estancia("hab2", 2, 2, 2);
        Estancia tres = new Estancia("hab3", 3, 3, 3);
        //declaració array list
        List<Estancia> listado = new ArrayList();
        //afegir objectes
        System.out.println("añadiendo objetos");
        listado.add(uno);
        listado.add(dos);
        listado.add(tres);
        listado.add(new Estancia("cuatro", 4, 4, 4));
        //saber el numero d'objectes que te
        System.out.println("Has guardado " + listado.size());
        
        //recorrer forma estandar
        for (int i = 0; i < listado.size(); i++) {
            System.out.println(listado.get(i).getTipus());
        }
        //Foreach
        System.out.println("for each");
        for (Estancia room : listado) {
            System.out.println(room.getTipus());
        }
        //borrarem una habitació
        System.out.println("Que habitacion quieres borrar " 
                + listado.size());
        Scanner sc = new Scanner(System.in);
        int num_hab = sc.nextInt();
        System.out.println("Borrando... " + num_hab);
        listado.remove(num_hab-1);
        System.out.println("Habitaciones restantes... " + listado.size());
        
        for (Estancia room : listado) {
            System.out.println(room.getTipus());
        }
        
        
        
        
        
        
    }
    
}
