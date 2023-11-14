/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clashroyalellenyataire;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ClashRoyaleLlenyataire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        int level_lumberjack = levelLumberJack();
        int damage_lumberjack = damageLlenyataire(level_lumberjack);
        int life_lumberjack = lifeLlenyataire(level_lumberjack);
        int level_tower = levelTorre();
        int damage_tower = damageTorre(level_tower);
        int life_tower = lifeTorre(level_tower);
        Lluita(damage_lumberjack, life_lumberjack, damage_tower, life_tower);
        
    }
    
    
    /**
     * pregunta nivel leñador
     * @return nivel valido leñador 9 al 13
     */
    public static int levelLumberJack()
    {
        Scanner sc = new Scanner(System.in);
        int level;
        do{
            System.out.println("Quin nivell te el llenyataire");
            level = sc.nextInt();
        }while(level<9 || level >13);
        return level;
    }
    /**
     * Preguntar al usuari el nivell, i retornar-te el ?Daño? que produeix cada cop.
     */
    public static  int damageLlenyataire(int level)
    {
        int dany;
        switch (level) {
            case 9:
                dany = 200;
                break;
            case 10:
                dany = 220;
                break;
            case 11:
                dany = 242;
                break;
            case 12:
                dany = 266;
                break;   
            case 13:
                dany = 292;
                break;
            default:
                dany = 0;
                break;
        }
        System.out.println("llenyador fara " + dany);
        return dany;
    }

    public static  int lifeLlenyataire(int level)
    {
        int life;
        switch (level) {
            case 9:
                life = 1060;
                break;
            case 10:
                life = 1166;
                break;
            case 11:
                life = 1200;
                break;
            case 12:
                life = 1250;
                break;   
            case 13:
                life = 1300;
                break;
            default:
                life = 0;
                break;
        }
        System.out.println("llenyador fara " + life);
        return life;
    }
    
    public static int levelTorre()
    {
         int level;
         int max = 14;
         int min = 1;
         int range = max - min + 1;
         level = (int)(Math.random()*range)+min;
         return level;
    }
    
    public static int lifeTorre(int level)
    {
         int life=0;
         switch(level)
         {
             case 1:
                 life = 1400;
                 break;
             case 2:
                 life = 1512;
                 break;
            case 3:
                 life = 1624;
                 break;
             case 4:
                 life = 1750;
                 break;
            case 5:
                 life = 1890;
                 break;
            case 6:
                 life = 2030;
                 break;     
            /*
                 Falta nivellls
                 */
            case 14:
                life = 4032;
                break;
         }
         System.out.println("Vida torre--->" + life);
         return life;
    }

    public static int damageTorre(int level)
    {
         int damage=0;
         switch(level)
         {
             case 1:
                 damage = 50;
                 break;
             case 2:
                 damage = 54;
                 break;
            case 3:
                 damage = 58;
                 break;
             case 4:
                 damage = 62;
                 break;
            case 5:
                 damage = 67;
                 break;
            case 6:
                 damage = 72;
                 break;     
            /*
                 Falta nivellls
                 */
            case 14:
                damage = 144;
                break;
         }
         System.out.println("dany torre--->" + damage);
         return damage;
    }



    
    /**
     * bucle on aniras restant vida de la torre, retorna un contador de cops.
Mostrarà a cada volta la frase ?Leñador ataca con fuerza de valor ? + valor d?atac del llenyataire. 
+ ? . La torre le queda de vida=? + vida_torre 

     * @param damage daño lenñaodr
     * @param lifeTower vida torre
     * @return numero de golpes dados 
     */
    public static void Lluita(int damageLumberjack, int lifeLumberjack,
            int damageTower, int lifeTower) throws InterruptedException
    {
        int hits=0;
        do{
            lifeTower -= damageLumberjack;
            lifeLumberjack -= damageTower;
            if (lifeTower<0) 
            {
                lifeTower=0;
            }
            if (lifeLumberjack<0) 
            {
                lifeLumberjack=0;
            }
            System.out.println("vida leñador "+ lifeLumberjack 
                    + " vida torre " + lifeTower);
            ++hits;
            Thread.sleep(500);
        }while(lifeTower>1 && lifeLumberjack>1);
        
        Guanyador(lifeTower, lifeLumberjack, hits);
        
    }
    
    public static void Guanyador(int lifeTower, int lifeLumberjack, int hits)
    {
        if (lifeTower>lifeLumberjack)
        {
            System.out.println("torre gano con " + hits + " golpes..");
        }
        else
        {
            System.out.println("llenyataire gano con " + hits + " golpes---");
        }
        
    }
}
