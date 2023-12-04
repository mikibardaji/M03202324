/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ahorcado;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ahorcado {

    /**
     * Consisteix que un jugador pensa una paraula i el altre ha d'anar dient lletres fins adivinarlo o quedar penjat.

El programa demanara inicialment la paraula i la guardara a un String.

Despres creara un array de char de la mateixa longitud de la paraula escrita e inicializar a guions '-', aquest array. Hi ha una funció a la teoria que et passa un String a un array de chars

En cada torn :

En cada torn es mostrara tot el array , amb els _ o les lletres encertades.
Es demanara una lletra.
Es buscara al String en quina posició hi es la lletra i si existeix, es ficar? aquella lletra a la posició del array de char (teniu en compte que aquella lletra pot apareixer més d'un cop)
Aquesta busqueda implementeu-la buscant-la al String, no al array de char (que també es podria fer).
Tindras fins a 6 vides, quant et quedis sense vides, acaba el joc. o si encertes (cada errada es pintara un penjat diferent, podeu utilitzar la funció que esta adjuntada al document).
El joc acaba, quant no et queda vides, o si no queden lletres per descubir o sigui que no hi ha guions...
S'han de fer en funcions.

 
     * 
     * 
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //El programa demanara inicialment la paraula 
        String palabra = pedirPalabra();
        char letra_buscar;
        boolean acabado=false;
        int vidas = 6;
        //Despres creara un array de char de la mateixa longitud de la paraula escrita
        //pasa el string a un array de char
        char[] letras = palabra.toCharArray();
        
//        char[] letras2 = new char[palabra.length()];
//        for (int i = 0; i < palabra.length(); i++) {
//            letras2[i] = palabra.charAt(i);
//        }
        //inicializar a guions '-',
        inicialitzarGuions(letras); 
        do
        {
            mostrarArray(letras);
            //pides una letra
            letra_buscar = pedirLetra();
            //Es buscara al String en quina posició hi es la lletra 
            //i si existeix, es ficar? aquella lletra a 
            //la posició del array de char (teniu en compte que aquella lletra pot apareixer més d'un cop)
            if (!EncontrarLetra(palabra,letra_buscar,letras))
            {
                vidas--;
                dibujar(vidas);
            }
            acabado = palabraAcertada(letras);
        }while(vidas>0 && !acabado);
        if (acabado)
        {
            System.out.println("Ganaste");
            mostrarArray(letras);
        }
       //}while(vidas>0 && acabado==false);
    }
    
    private static String pedirPalabra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fica la paraua a adivinar");
        String word = sc.nextLine();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        
        
        return word.toUpperCase();
    }

    /**
     * fica totes les posiciones del array a -
     * @param letras 
     */
    private static void inicialitzarGuions(char[] letras) {
        for (int i = 0; i < letras.length; i++) {
            letras[i] = '-';
        }
              
    }

    private static void mostrarArray(char[] letras) {
        System.out.println("Te quedan estas letras por adivinar");
        for (int i = 0; i < letras.length; i++) {
            System.out.print(letras[i]);
        }
        System.out.println("");
    }

    /**
     * pide la letra siguiente a buscar en el ahorcado
     * @return 
     */
    private static char pedirLetra() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon la letra que quieres");
        char letra = sc.nextLine().charAt(0);
        letra = Character.toString(letra).toLowerCase().charAt(0);
        return letra;
    }

    /**
     * /Es buscara al String en quina posició hi es la lletra 
        //i si existeix, es ficar? aquella lletra a 
        //la posició del array de char (teniu en compte que aquella lletra pot apareixer més d'un cop)
     * @param palabra string que contiene la palabra
     * @param letra_buscar letra del usuari
     * @param letras palabra con guiones
     * @return true si ha encontrado la letra false si no.
     */
    private static boolean EncontrarLetra(String palabra, 
        char letra_buscar, char[] letras) {
        boolean trobat = false;
        for (int i = 0; i < palabra.length(); i++) {
            if(letra_buscar==palabra.charAt(i))
            {
                letras[i] = letra_buscar;
                trobat = true;
            }
        }
        return trobat;
    }
    
private static void dibujar(int vidas) {
        switch (vidas) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j < 10; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j < 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 0:
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j < 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("aprieta enter para continuar te quedan " + vidas + " vidas") ;
        sc.nextLine();
    }    

    private static boolean palabraAcertada(char[] letras) {
        //boolean no=true;
        for (int i = 0; i < letras.length; i++) {
            if(letras[i] == '-')
            {
                //no=false
                return false;
            }
        }
        //return no;
        return true;
    }
    
    
    
    
}
