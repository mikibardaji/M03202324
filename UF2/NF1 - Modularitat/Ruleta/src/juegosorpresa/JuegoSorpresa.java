/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegosorpresa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class JuegoSorpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int money=100; //funcio que s'executa un sol cop per demanar diners
        int numero_apostado, dinero_apostado, num_bola, dinero_ganado;
        char quiero_jugar;
        do{
                numero_apostado=pedirNumero();
                dinero_apostado=pedirDineroApuesta(money);
                System.out.println(numero_apostado + " dinero->" + dinero_apostado );
                num_bola=caidaBola();
                pintaAsteriscos(num_bola);
                if (eresGanador(num_bola, numero_apostado))
                {// true he ganado
                    dinero_ganado= ganancias(dinero_apostado, numero_apostado);
                    money += dinero_ganado;
                    System.out.println("Ganaste tienes ...." + money);
                }
                else
                {//he perdido dinero apostado
                    money -= dinero_apostado;
                    System.out.println("Perdiste te queda ...." + money);
                }
                quiero_jugar=seguirJugando();
        }while(puedesJugar(quiero_jugar, money));
        
        if(money<=0)
        {
            System.out.println("perdiste todo");
        }
        else
        {
            System.out.println("te vas a casa con " + money);
        }
    }
 
    
    /**
     * pedira un numero al usuario que tiene que estar entre 1 y 38 si no, no lo devolvera
     * Mostrara la frase "apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)
     * 
     * @return entero valido
     */
    
    public static int pedirNumero()
    {
        Scanner sc = new Scanner(System.in);
         int apuesta;
         do{
             System.out.println("Apuesta por un numero del 1 al 36 , o elige 37(impar) o 38(par)");
             apuesta = sc.nextInt();
         }while(!(apuesta>=1 && apuesta<=38));
         return apuesta;
    }
    
    /**S
     * Simulara la caida de la bola, sera un valor aleatorio entre 1 y 36
     * @return 
     */
    public static int caidaBola()
    {
        int max=36;
        int min = 1;
        int range = max-min + 1;
        int valorDado = (int)Math.floor(Math.random()*range+min);
        return valorDado;
    }
    
    /**
     * Si la respuesta de entrada es igual a s y el dinero es positivo, la función decide que es cierto que puede seguir jugando
     * Si algun caso no se cumple, no puede
     * @param respuesta escogida por el jugador
     * @param dinero dinero disponible.
     * @return true si puede seguir jugando, false si no
     */
    public static boolean puedesJugar(char respuesta, int dinero)
    {
        if ((respuesta =='s' || respuesta == 'S') && dinero>0)
        {
            return true;
        }
        else
            return false;
    }
    
    /**
     * Calcula las ganancias, de la apuesta 1) Si el numero apostado es entre 1 y 36 sera el dinero apostado multiplicado por 35, 
     * 2) si el numero apostado es 37 o 38 sera el doble del dinero_apostado.
     * @param dinero_apostado
     * @param num_apostado
     * @return 
     */
    public static int ganancias(int dinero_apostado, int num_apostado)
    {
        if (num_apostado>=1 &&  num_apostado<=36)
        {
            return dinero_apostado*35;
        }
        else if (num_apostado>=37 &&  num_apostado<=38)
        {
            return dinero_apostado*2;
        }
        else
        {
            return 0;
        }
        
    }
    
    /**
     * Dentro se pedira el dinero que quiere apostar, y devolvera el dinero siempre que sea valido positivo y no superior al dinero de la cartera
     * @param dinero_disponible dinero que tiene en la cartera el usuario
     * @return dinero apostado valido
     */
     public static int pedirDineroApuesta(int dinero_disponible)
     {
         Scanner sc = new Scanner(System.in);
         int apuesta;
         do{
             System.out.println("Cuantos quieres apostar, tienes... " + dinero_disponible);
             apuesta = sc.nextInt();
         }while(apuesta>dinero_disponible || apuesta<0);
         //}while(!(apuesta>0 && apuesta<=dinero_disponible));
         return apuesta;
     }
     
         /**
     * comprueba si has ganado tu apuesta ... 
     * Ganas si bola es igual a num_apostado
     * Tambien ganas si num_apostado es 37 y la bola es impar
     * Tambien ganas si num_apostado es 38 y la bola es un numero par
     * @param bola
     * @param num_apostado
     * @return true si has ganado, false en cualquier otro caso
     */
    public static boolean eresGanador(int bola, int num_apostado)
    {
        if (bola==num_apostado)
        {
            return true;
        }
        else if ((bola%2!=0) && num_apostado==37) //impar
            {
            return true;
            }
        else if ((bola%2==0) && num_apostado==38) //par
            {
            return true;
            }
        else
            return false;   
    }
    
     
    /**
     * * Dentro preguntara "Quieres seguir jugando(S/N)
     * Devolvera la respuesta siempre que sea valida, valido solo es si pone s , n en mayusculas o minusculas
     * Si no pone respuesta valida debe seguir preguntando
     * @return respuesta (valida
     */
    
     public static char seguirJugando()
     {
         Scanner sc = new Scanner(System.in);
         char respuesta;
         boolean salir=false;
         do
         {
             System.out.println("Quieres seguir jugando (s/S/n/N)");
             respuesta = sc.next().charAt(0);
             if (respuesta=='s' || respuesta=='S' || respuesta=='n' || respuesta=='N')
             {
                 salir = true;
             }
         }while (!salir);
         return respuesta;
     }
     
      /**
      * funcion que pinta tantos asteriscos en una linea como el valor num, al acabar los asterisco, pinta un - y el valor del num
      * @param num numero de asteriscos a pintar
      */
     public static void pintaAsteriscos(int num)
     {
         for (int i = 1; i <= num; i++) {
             System.out.print("*");
         }
         System.out.println("=" + num);
     }
    
}
    
