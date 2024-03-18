/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setproves;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author mabardaji
 */
public class SetProves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //crear 2 conjunts de persones
       //al primer afegiu 3 persones
       //al segon afegiu 3 mes, una de les quals ha de ser una del primer grup
       //les persones son iguals si tenen el mateix nom
       //union
       
       
       //interseccion duplicats
        
        
       //minus retainAll
       
       
       pruebasSetInteger(); 
        
    }

    private static void pruebasSetInteger() {
       Set<Integer> numerosMore20 = new LinkedHashSet<>();
       Set<Integer> numerosOdd = new LinkedHashSet<>();
       //afegir objectes
       
       numerosMore20.add(25);
       numerosMore20.add(27);
       numerosMore20.add(117);
       numerosMore20.add(22);
       
       numerosOdd.add(3);
       numerosOdd.add(53);
       numerosOdd.add(27);
       numerosOdd.add(43);
       
       
       for (Integer numero : numerosMore20) {
            System.out.println(numero);
        }
        System.out.println("****************");
        numerosMore20.add(17);
        numerosMore20.add(117);
        numerosMore20.add(22);
        for (Integer numero : numerosMore20) {
            System.out.println(numero);
        }
        //union es al primer conjunt afegir-li tots els membres del altre conjunt
        //sense duplicats
        System.out.println("Union de conjunts addAll");
        numerosMore20.addAll(numerosOdd);
        for (Integer numero : numerosMore20) {
            System.out.println(numero);
        }
        System.exit(0);
        
        
        
        //guarda sol els numeros duplicats 
        System.out.println("Interseccion 2 conjuntos");
        numerosMore20.retainAll(numerosOdd); //intersecció 
        for (Integer numero : numerosMore20) {
            System.out.println(numero);
        }
        System.exit(0);
        
        //eliminar elementos que estan en los dos
        numerosMore20.removeAll(numerosOdd);
        System.out.println("Eliminado duplicados");
        for (Integer numero : numerosMore20) {
            System.out.println(numero);
        }
        
       
    }
    
}
