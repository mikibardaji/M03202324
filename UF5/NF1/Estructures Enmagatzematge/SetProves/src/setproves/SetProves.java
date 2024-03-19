/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setproves;

import java.util.LinkedHashSet;
import java.util.Set;

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
       Set<Persona> DAW1 = new LinkedHashSet<>();
       Set<Persona> DAM =  new LinkedHashSet<>();
       //al primer afegiu 3 persones
       DAW1.add(new Persona("Jose", 0, true));
       DAW1.add(new Persona("Alvaro", 0, true));
       DAW1.add(new Persona("Ahsan", 10, true));
       //al segon afegiu 3 mes, una de les quals ha de ser una del primer grup
       DAM.add(new Persona("Josep", 0, true));
       DAM.add(new Persona("AdrianD", 0, true));
       DAM.add(new Persona("Alvaro", 5, true));
       //les persones son iguals si tenen el mateix nom
       
       //
       System.out.println("Union de conjunts addAll");
        DAW1.addAll(DAM);
        for (Persona people : DAW1) {
            System.out.println(people);
        }
        System.exit(0);
       
       
       //union
        System.out.println("Tots els estudiants");
        DAM.retainAll(DAW1); //intersect els alumnes 
        for (Persona people : DAM) {
            System.out.println(people.getNom());
        }
        System.exit(0);
       //interseccion duplicats
        
        
       //minus retainAll
       
       
       //pruebasSetInteger(); 
        
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
