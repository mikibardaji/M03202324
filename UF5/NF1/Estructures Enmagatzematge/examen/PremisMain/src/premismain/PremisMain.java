/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package premismain;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PremisMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, Integer> premis = new HashMap<>();
        
        loadAwards(premis);
        showAwards(premis);
        requestAwards(premis);
        requestAwardsByMoney(premis);
    }

    private static void loadAwards(Map<String, Integer> premis) {
        premis.put("Campio",4000);
        premis.put("SotsCampio",2000);
        premis.put("Semifinal",1000);
        premis.put("Quarts",300);
        premis.put("Vuitens",0);
        System.out.println("Premis ficants");
        
    }

    private static void showAwards(Map<String, Integer> premis) {
        System.out.println("Llistat premis");
        for (Map.Entry<String, Integer> dada: premis.entrySet()) {
            System.out.println(dada.getKey() + "--" + dada.getValue() + "€") ;
        }
    }

    private static void requestAwards(Map<String, Integer> premis) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A quina posició has quedat");
        String posicion = sc.nextLine();
        
        int premio = premis.get(posicion);
        System.out.println("Has guanyat... " + premio);
    }

    private static void requestAwardsByMoney(Map<String, Integer> premis) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quant has guanyat? ");
            int dinero = sc.nextInt();

            for (Map.Entry<String, Integer> dada: premis.entrySet()) {
                if (dada.getValue() == dinero )
                {
                    System.out.println("Has quedat " + dada.getKey());
                }
        }
    }
    
}
