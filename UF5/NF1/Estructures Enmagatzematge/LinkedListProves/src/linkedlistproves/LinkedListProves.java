/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlistproves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class LinkedListProves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //List<Integer> lista = new ArrayList<>();
        LinkedList<Integer> lista = new LinkedList<>();
        //Integer no es int
        lista.add(3); //NO ES UN INT , ES UN OBJECTE INTEGER AMB VALOR 3
        lista.add(5);
        lista.add(2);
        lista.add(15);
        for (Integer numero : lista) {
            System.out.println("->" + numero);
        }
        
        lista.remove(2);
        System.out.println("************");
        for (Integer numero : lista) {
            System.out.println("->" + numero);
        }
        
        System.out.println("El primero es " + lista.peekFirst());
        System.out.println("El ultimo es " + lista.peekLast());
        lista.addFirst(0);
        System.out.println("El primero es " + lista.peekFirst());
        System.out.println("El ultimo es " + lista.peekLast());
        lista.removeFirst();
        System.out.println("El primero es " + lista.peekFirst());
        System.out.println("El ultimo es " + lista.peekLast());
    }
    
}
