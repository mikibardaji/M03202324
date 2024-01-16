/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemon;

import java.util.Scanner;

/**
 *
 * @author usuari
 */
public class Pokemon {

    public static void main(String[] args) {
        String[] tiposPokemon = {
                "Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma", "Fuego", "Hada", "Hielo",
                "Lucha", "Normal", "Planta", "Psiquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador"
        };

       double[][] efectividadesPokemon = {  
        /*ACERO   AGUA   BICHO   DRAGON   ELÉC   FANT   FUEGO   HADA   HIELO   LUCHA   NORMAL   PLANTA   PSI   ROCA   SINIE  TIERRA   VENENO   VOLADOR   */
        { 0.5   , 0.5  ,   1   ,   1    , 0.5  ,  1   ,  0.5   ,  2  ,   2   ,   1   ,    1    ,   1   ,  1   ,  2  ,   1   ,   1   ,    1   ,   1},   //ACERO
        {  1    , 0.5  ,   1   ,  0.5   ,  1   ,  1   ,   2    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   2   ,    1   ,   1},   //AGUA
        { 0.5   ,  1   ,   1   ,   1    ,  1   , 0.5  ,  0.5   , 0.5 ,   1   ,  0.5  ,    1    ,   2   ,  2   ,  1  ,   2   ,   1   ,   0.5  ,  0.5},  //BICHO
        { 0.5   ,  1   ,   1   ,   2    ,  1   ,  1   ,   1    ,  0  ,   1   ,   1   ,    1    ,   1   ,  1   ,  1  ,   1   ,   1   ,    1   ,   1},   // DRAGÓN
        {  1    ,  2   ,   1   ,  0.5   , 0.5  ,  1   ,   1    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  1  ,   1   ,   0   ,    1   ,   2},   // ELÉCTRICO
        {  1    ,  1   ,   1   ,   1    ,  1   ,  2   ,   1    ,  1  ,   1   ,   1   ,    0    ,   1   ,  2   ,  1  ,  0.5  ,   1   ,    1   ,   1},   // FANTASMA
        {  2    , 0.5  ,   2   ,  0.5   ,  1   ,  1   ,  0.5   ,  1  ,   2   ,   1   ,    1    ,   2   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1},   // FUEGO
        { 0.5   ,  1   ,   1   ,   2    ,  1   ,  1   ,  0.5   ,  1  ,   1   ,   2   ,    1    ,   1   ,  1   ,  1  ,   2   ,   1   ,   0.5  ,   1},   // HADA
        { 0.5   , 0.5  ,   1   ,   2    ,  1   ,  1   ,  0.5   ,  1  ,  0.5  ,   1   ,    1    ,   2   ,  1   ,  1  ,   1   ,   2   ,    1   ,   2},   // HIELO
        {  2    ,  1   ,  0.5  ,   1    ,  1   ,  0   ,   1    , 0.5 ,   2   ,   1   ,    2    ,   1   , 0.5  ,  2  ,   2   ,   1   ,   0.5  ,  0.5},  // LUCHA
        { 0.5   ,  1   ,   1   ,   1    ,  1   ,  0   ,   1    ,  1  ,   1   ,   1   ,    1    ,   1   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1},   // NORMAL
        { 0.5   ,  2   ,  0.5  ,  0.5   ,  1   ,  1   ,  0.5   ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   2   ,   0.5  ,  0.5},  // PLANTA
        { 0.5   ,  1   ,   1   ,   1    ,  1   ,  1   ,   1    ,  1  ,   1   ,   2   ,    1    ,   1   , 0.5  ,  1  ,   0   ,   1   ,    2   ,   1},   // PSÍQUICO
        { 0.5   ,  1   ,   2   ,   1    ,  1   ,  1   ,   2    ,  1  ,   2   ,  0.5  ,    1    ,   1   ,  1   ,  1  ,   1   ,  0.5  ,    1   ,   2},   // ROCA
        {  1    ,  1   ,   1   ,   1    ,  1   ,  2   ,   1    , 0.5 ,   1   ,  0.5  ,    1    ,   1   ,  2   ,  1  ,  0.5  ,   1   ,    1   ,   1},   // SINIESTRO
        {  2    ,  1   ,  0.5  ,   1    ,  2   ,  1   ,   2    ,  1  ,   1   ,   1   ,    1    ,  0.5  ,  1   ,  2  ,   1   ,   1   ,    2   ,   0},   // TIERRA
        {  0    ,  1   ,   1   ,   1    ,  1   , 0.5  ,   1    ,  2  ,   1   ,   1   ,    1    ,   2   ,  1   , 0.5 ,   1   ,  0.5  ,   0.5  ,   1},   // VENENO
        { 0.5   ,  1   ,   2   ,   1    , 0.5  ,  1   ,   1    ,  1  ,   1   ,   2   ,    1    ,   2   ,  1   , 0.5 ,   1   ,   1   ,    1   ,   1}    // VOLADOR
    };
        
        int opcio;
        do {
            
            opcio = escollirOpció(); 

            switch (opcio) {
                case 1:
                    mostrarTiposPokemon(tiposPokemon);
                    break;
                case 2:
                    mostrarTipoPokemonEnPosicion(tiposPokemon);
                    break;
                case 3:
                    mostrarAtaquesPorTipo(tiposPokemon,efectividadesPokemon);  //indexTipusPokemon
                    break;
                case 4:
                    mostrarDebilitatsPorTipo(tiposPokemon,efectividadesPokemon); //indexTipusPokemon
                    break;
                case 5:
                    mostrarForcaAtac(tiposPokemon,efectividadesPokemon); //indexTipusPokemon
                    break;
                case 6:
                    mostrarAtaquesConForca(tiposPokemon,efectividadesPokemon);
                    break;
                case 7:
                    sortir();
                    break;
                default:
                    System.out.println("Opció no v?lida. Si us plau, selecciona una opció v?lida.");
            }
        }while(opcio!=7);
    }

    
    /**
     * Buscara la posició del index on es troba el pokemon buscat
     * @param tiposPokemon Llistat de tots els pokemons
     * @param nom_buscat nom que busca
     * @return el index on es troba el nom buscat, sino el troba, retornar -1.
     */
    public static int indexTipusPokemon(String[] tiposPokemon, String nom_buscat)
    {
        for (int i = 0; i < tiposPokemon.length; i++) {
            if (tiposPokemon[i].equalsIgnoreCase(nom_buscat))
            {
                return i;
            }
        }
        return -1;
    }
    
    /**
     * Mostrara tots els tipus de pokemon existents
     */
    private static void mostrarTiposPokemon(String[] tiposPokemon) {
        for (int i = 0; i < tiposPokemon.length; i++) {
            System.out.println(i + "-" + tiposPokemon[i]);
        }
    }

    /**
     * Dins la funció demanara el numero de posició i mostrara
     * per pantalla quin tipus de pokemon ocupa aquesta posició.
     */
    private static void mostrarTipoPokemonEnPosicion(String[] tiposPokemon) {
        Scanner sc = new Scanner(System.in);
        int pos;
        do
        {
            System.out.println("Pon la posición que quieres de pokemon  y te dire que tipo es ");
            pos= sc.nextInt();
        }while(pos>tiposPokemon.length);
        System.out.println("En esa posicion esta " + tiposPokemon[pos-1].toUpperCase());
    }

    /**
     * Demanara al usuari el tipus de pokemon que vol veure
     * i llistara tots els valors dels atacs que fa
     * Si pot ser el valor i al tipus que li fa
     * exemple Si ha ficat Bicho
     * 0,5 Acero
        1    Agua
        1 Bicho
        1 Dragon

     */
    private static void mostrarAtaquesPorTipo(String[] tiposPokemon, double[][] efectividadesPokemon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el tipo y te dire todos sus ataques");
        String tipo_atacante = sc.nextLine();
        int fila = indexTipusPokemon(tiposPokemon, tipo_atacante);
        if (fila!=-1)
        {
            for (int colum = 0; colum < efectividadesPokemon[fila].length; colum++) 
            {
            System.out.println("Al tipo " + tiposPokemon[colum].toUpperCase()
                    + " le ataca con fuerza " + efectividadesPokemon[fila][colum]);
            }
        }
        else
        {
            System.out.println("Tipo introducido inexistente ");
        }
    }

    /**
     * Demanara al usuari el tipus de pokemon, aquí s’haur? de cridar 
     * a la funció indexCategoria, per a partir del nom 
     * fica’t saber quina posició vols. 
     * 
     * En aquest cas sol s’ha de mostrar els tipus de pokemon que ataquen amb 2, 
     * al tipus que hem fica’t. Imagineu que hem fica’t Agua, pues hauria de 
     * mostrar sol el nom de 2, Eléctrico y Planta.
     */
    private static void mostrarDebilitatsPorTipo(String[] tiposPokemon, double[][] efectividadesPokemon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el tipo y te dire sus debilidades");
        String tipo_atacante = sc.nextLine();
        int columna = indexTipusPokemon(tiposPokemon, tipo_atacante);
        
        System.out.println("Estos tipos son los que hacen mas da?o a tu pokemon... ");
        for (int fila = 0; fila < efectividadesPokemon.length; fila++) 
        {
            if (efectividadesPokemon[fila][columna]==2)
            {
                System.out.println(tiposPokemon[fila].toUpperCase());
            }
        }
    }

    /**
     * 	Parametres d’entrada el/els arrays que necessitis.
       Demanara l'usuari, els dos tipus de pokémon, que vol, 
       * el primer ser? l’atacant, i el segon el defensor.
       * 
       * Quant hagis fica’t els dos tipus ha de sortir el número amb que ataca. 
       * Exemple si fico, Atacante HIELO, Defensor ACERO, 
       * hauria de mostrar el valor 0,5 pts
     */
    private static void mostrarForcaAtac(String[] tiposPokemon, double[][] efectividadesPokemon) {
         Scanner sc = new Scanner(System.in);
        System.out.println("dime el pokemon atacante");
        String tipo_atacante = sc.nextLine();
        int fila = indexTipusPokemon(tiposPokemon, tipo_atacante);
        System.out.println("dime el pokemon defensor");
        String tipo_defensor = sc.nextLine();
        int columna = indexTipusPokemon(tiposPokemon, tipo_defensor);
        if(fila!=-1 && columna!=-1)
        {
            System.out.println("Pokemon " + tiposPokemon[fila].toUpperCase() + " ataca a " + tiposPokemon[columna].toUpperCase()+
                    " con valor "+ efectividadesPokemon[fila][columna]);
        }
        else
        {
            System.out.println("Tipos introducidos no existentes" + tipo_atacante + "-" + tipo_defensor);
        }
        
    }

    /**
     * Demanara l'usuari, el valor de ataque, que vulguis un numeric amb decimal (0,5, 1, 2).

Te que mostrar tots els atacs de tots els tipus de pokemon, que coincideixin amb el valor indicat. I al final mostrar quants ha mostrat

Exemple: Que ataque quieres mostrar? 2

Anira mostrant
Los ataques con valor dos son 
 ACERO contra HADA
 ACERO contra HIELO
 ACERO contra ROCA
 AGUA contra FUEGO
 AGUA contra ROCA
 …
 
 Número de combinaciones mostradas: 25 (si han sortit 25 linees)
     */
    private static void mostrarAtaquesConForca(String[] tiposPokemon, double[][] efectividadesPokemon) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que valor de quieres buscar");
        double valor_ataque = sc.nextDouble();
        int cont=0;
        for (int fila = 0; fila < efectividadesPokemon.length; fila++) 
        {
            for (int columna = 0; columna < efectividadesPokemon[fila].length; columna++) 
            {
                if (efectividadesPokemon[fila][columna] == valor_ataque)
                {
                    System.out.println(tiposPokemon[fila].toUpperCase() + " contra " + tiposPokemon[columna].toUpperCase());
                    cont++;
                }
            }
        }
        System.out.println("Numero de combinaciones mostradas ... " + cont);
    }

    private static void sortir() {
        System.out.println("Adeu!");
        System.exit(0);
    }

    private static int escollirOpció() {
        Scanner sc = new Scanner(System.in);
            System.out.println("Menú:");
            System.out.println("1.- Mostrar tots els tipus de pokemon.");
            System.out.println("2.- Indicar quin tipus de pokemon es troba a una posició amb concret.");
            System.out.println("3.- Mostrar tots els atacs per un tipus de pokemon.");
            System.out.println("4.- Mostrar totes les debilitats d’un tipus elegit.");
            System.out.println("5.- Mostrar amb quina força ataca un pokemon a un altre.");
            System.out.println("6.- Mostrar tots els atacs amb una força introdu?da.");
            System.out.println("7.- Sortir");

            System.out.print("Selecciona una opció: ");
            int opc=sc.nextInt();
            return opc;
    }
}

    
