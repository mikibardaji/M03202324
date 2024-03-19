/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testhashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author mabardaji
 */
public class TestHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Map<String, Integer> prefijos = new HashMap<>();
       
       prefijos.put("ESP", 34);
       prefijos.put("PAK", 94);
       prefijos.put("MEX", 52);
       prefijos.put("ECU", 593);
       
       
        System.out.println("items puestos " + prefijos.size());
        
        System.out.println("Ecuador tiene el codigo " + prefijos.get("ECU"));
        System.out.println("Ecuador tiene el codigo " + prefijos.get("XXX"));
        
        //recorrer tot el hashmap
        System.out.println("Recupero todas las llaves");
        Set<String> keys = prefijos.keySet();
        for (String clave : keys) {
            System.out.println(clave);
        }
        
        System.out.println("Recorrer tot el hashmap y anar recuperant clave(String) y valor(Integer");
        for(Map.Entry<String,Integer> entrada: prefijos.entrySet())
        {
            System.out.println("Clave[" + entrada.getKey() + "] = " +entrada.getValue());
        }
        
        System.out.println("Borrar una clave ECU");
        prefijos.remove("ECU");
        for(Map.Entry<String,Integer> entrada: prefijos.entrySet())
        {
            System.out.println("Clave[" + entrada.getKey() + "] = " +entrada.getValue());
        }
        System.out.println("Reemplazar valor MEX");
        prefijos.replace("MEX", 53);
        for(Map.Entry<String,Integer> entrada: prefijos.entrySet())
        {
            System.out.println("Clave[" + entrada.getKey() + "] = " +entrada.getValue());
        }
        
        //retornar tots els valors
        Collection<Integer> valores = prefijos.values();
        for (Integer num : valores) {
            System.out.println(num);
        }
    }
    
}
