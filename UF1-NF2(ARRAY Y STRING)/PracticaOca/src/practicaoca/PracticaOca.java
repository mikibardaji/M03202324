/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaoca;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PracticaOca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tauler = new int[20];
        inicialitzarTauler(tauler);
        marcarCasellaOca(tauler);
        marcarMort(tauler);
        mostrarTaulerInicial(tauler);
        Scanner sc = new Scanner(System.in);
        System.out.println("pausa...");
        sc.nextLine();
        int pos_fitxa = 1;
        do{
            int dado = tiradaDau();
            System.out.println("Dado---" + dado);
            pos_fitxa = pos_fitxa+dado;
            if (pos_fitxa> tauler.length)
            {
                pos_fitxa= tauler.length;
            }
            pos_fitxa = moureFitxa(tauler, pos_fitxa);
            System.out.println("posicio fitxa" + pos_fitxa);
            mostrarFitxa(tauler, pos_fitxa);
            System.out.println("pausa...");
            sc.nextLine();
        }while(heGuanyat(tauler, pos_fitxa)==0);
        if (heGuanyat(tauler, pos_fitxa)==1)
        {
            System.out.println("has guanyat");
        }
        else
        {
            System.out.println("Has caigut a la mort");
        }
            
       // mostrarTaulerInicial(tauler);
        
    }
    
    
    /**
     * Inicialitzar tauler (0,25pts)
        Par?metres d’entrada , array d’enters tauler
        No retorna res.
        Fica totes les posicions del array a 0
     */
    private static void inicialitzarTauler(int[] tauler)
    {
        for (int i = 0; i < tauler.length; i++) {
            tauler[i] = 0;
        }
        
    }
    
    /*
    MarcarCasellaOca(0,75pts)
Par?metres d’entrada , array d’enters tauler
No retorna res.
Fica a totes les posicions múltiples de 5, el valor de 1 (s’ha de fer amb un bucle aquesta col·locació, sino no ser? v?lid)
    */
    
    private static void marcarCasellaOca(int[] tauler)
    {
        for (int i = 0; i < tauler.length; i++) {
            if((i+1)%5==0)
            {
                tauler[i] = 1;
            }
        }
    }
    
    /**
     * MarcarMort(0,75 pts)
        Par?metres d’entrada , array d’enters tauler
        No retorna res.
        Fica a una posició aleatoria, del array amb el valor 2. 
        La posició aleatoria te que estar entre el valor mig del número de caselles del array y el número de caselles del array, el array no sabem quant medeix, pero tenim una funció que ens ho diu 
        (Exemple si arribes un array de 20 posicions, la posició mínima a la que podria colocar-se el 2 seria la meitat (10) i el valor m?xim, pues la última posició del array
     */
    
    private static void marcarMort(int[] tauler) 
    {
        //opcio 1
        Random rand = new Random();
        int posicion_aleatoria = rand.nextInt(tauler.length/2,tauler.length);
        //opcio 2
        int MAX = tauler.length;
        int MIN = tauler.length/2;
        int range = MAX-MIN+1;
        posicion_aleatoria = (int)(Math.random()*range)+MIN;
        posicion_aleatoria--;
        //part comuna
        tauler[posicion_aleatoria] = 2;
    }
    
    /**
     * Par?metres d’entrada , array d’enters tauler
No retorna res.
És pot mostrar el tauler de dues formes.
Opció 0,5 pts, mostrar el tauler tota amb una linea simplement amb els valors que hi ha guardats dins el array separats per un guió
		0-0-0-0-1-0-0-0-0-1-0-0-0-0-1-0-0-0-0-1-0-0-2-0-1

Opció 1 pts - Mostrar el tauler(array) pero amb les posicions que siguin 0, és mostri un espai
Exemple *-*-*-*-1-*-*-*-*-1-*-*-*-*-1-*-*-*-*-1-*-*-*-*-1

     */
    private static void mostrarTaulerInicial(int[] tauler)
    {
            for (int posicio = 0; posicio < tauler.length; posicio++) {
                if (tauler[posicio]==0)
                {
                    System.out.print("*-");
                }
                else
                {
                    System.out.print(tauler[posicio]+"-"); 
                }    
            }
            System.out.println("");//saltar la linea
    }
    
    private static void mostrarFitxa(int[] tauler, int posicio_fitxa)
    {
            for (int posicio = 0; posicio < tauler.length; posicio++) {
                if((posicio) == (posicio_fitxa-1))
                        {
                            System.out.print("X-");
                        }        
                if (tauler[posicio]==0)
                {
                    System.out.print("*-");
                }
                else
                {
                    System.out.print(tauler[posicio]+"-"); 
                }
                  
            }  
            System.out.println("");//saltar linea
    }
    
    /**
     * tiradaDau(0,25 pts)
no te par?metres d’entrada
Retorna un valor aleatori del 1 al 6.

     */
    public static int tiradaDau()
    {
        int MAX = 6;
        int MIN = 1;
        int range = MAX-MIN+1;
        int dado = (int)(Math.random()*range)+MIN;
        return dado;
    }
    
 
    public static int heGuanyat(int[] tauler, int posicio_fitxa)
    {
        if (posicio_fitxa==tauler.length)
        {//final fitxa
            return 1;
        }
        else if (tauler[posicio_fitxa]==2)
        {
            return -1;
        }
        else
        {
            return 0;
        }
            
    }
    
    /**
     * MoureFitxa(1 pts)
	Par?metres d’entrada: array d’enter tauler, un enter posició.
	Retorna un enter que ser? la posició on és troba la fitxa.
	Per comprovar el valor de la posició recordeu que sempre haureu de mirar la posició -1 rebuda…
Si la casella que comproves te un 0 retornes el mateix valor de la posició rebut. (si has rebut un 7, retornara un 7)
	Si a la casella de la posició hi ha un 1, la funció ha de seguir a partir d’aquella posició fins trobar la següent posició que té el 1, i retornar? aquella posició. (si has rebut un 10 i havia un 1 , busques a partir del 10 la següent casella amb un 1, i si és per exemple la 14, retornes la 14) . Si al buscar el següent valor arribes al final del array retornes la última posició del array
recordeu que son caselles d’un tauler i si la posició del array que s’ha trobat és 14, el valor que ha de retornar és 15… Perqu? no existeix la casella 0 al joc. Si a

     */
    public static int moureFitxa(int[] tauler, int posicio_fitxa)
    {
        if (tauler[posicio_fitxa-1] == 0 ||  tauler[posicio_fitxa-1]==2)
        {
            return posicio_fitxa;
        }
        else if (tauler[posicio_fitxa-1] == 1)
        {//busco la seguent casella amb 1
            for (int i = posicio_fitxa; i < tauler.length; i++) {
                if(tauler[i]==1)
                {
                    return (i+1);
                }
            }
            return tauler.length; //he arribat al final i no havia oca, per tant he acabat
        }
        return 0;
    }
}
