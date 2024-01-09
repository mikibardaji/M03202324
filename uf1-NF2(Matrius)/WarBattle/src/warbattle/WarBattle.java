/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warbattle;
import java.util.Scanner;

/**
 *
 * @author bardaji
 */
public class WarBattle {


    /**
     * Función principal que inicia el juego.
     */
    public static void main(String[] args) {
        char[][] tablero = new char[10][10];
        Scanner scanner = new Scanner(System.in);
        inicializarTablero(tablero);
        mostrarTablero(tablero);
       
        colocarBarcos(tablero);
        
        mostrarTablero(tablero);
        System.exit(0);
        int opcion;
        boolean tocado=false;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tocado = jugarTurno(tablero);
                    if(tocado)
                    {
                        System.out.println("TOCADO!");
                        
                    }
                    else
                    {
                        System.out.println("AGUA");
                    }
                    break;
                case 2:
                    System.out.println("?Gracias por jugar!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 2);
    }

    /**
     * Inicializa el tablero con agua ('~').
     */
    private static void inicializarTablero(char[][] tablero) {
            for (int fila = 0; fila < tablero.length; fila++) 
            {
                for (int col = 0; col < tablero[fila].length; col++) {
                    tablero[fila][col] = '~';
                }
            }
    }

    /**
     * Coloca los barcos en el tablero según las especificaciones del usuario.
     */
    private static void colocarBarcos(char[][] tablero) {
        final int barcosDe1=4,barcosDe2=3,barcosDe3=2,barcosDe4=1;
        
         // Colocar barcos de longitud 1
        //colocarBarcosDeLongitud(1, barcosDe1, tablero);

        // Colocar barcos de longitud 2
        colocarBarcosDeLongitud(2, barcosDe2,tablero);

        // Colocar barcos de longitud 3
        //colocarBarcosDeLongitud(0, 0, tablero);

        // Colocar barcos de longitud 4
        //colocarBarcosDeLongitud(0, 0, tablero);
    }

    /**
     * Muestra el tablero actual tal como se muestre
     * Se debe mostar de la siguiente forma
     *   0 1 2 3 4 5 6 7
     * 0 ~ ~ ~ ~ ~ ~ ~ ~ 
     * 1 ~ ~ ~ ~ ~ ~ ~ ~
     * ..
     * 7 ~ ~ ~ ~ ~ ~ ~ ~
     */
    private static void mostrarTablero(char[][] tablero) {
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
         for (int fila = 0; fila < tablero.length; fila++) 
            {
                System.out.print(fila+" "); //al inici pinto el numero fila
                for (int col = 0; col < tablero[fila].length; col++) {
                    System.out.print(tablero[fila][col]+" ");
                }
                System.out.println("");
            }
   
    }

    /**
     * Muestra el menú de opciones.
     */
    private static void mostrarMenu() {
        System.out.println("\nMenú:");
        System.out.println("1. Disparar");
        System.out.println("2. Salir");
        System.out.print("Selecciona una opción: ");
    }

    /**
     * Procesa el turno del jugador, permitiéndole disparar a una coordenada.
     * Si en la coordenada, hay un barco, marca el barco con una X y devuelve true.
     * Si no hay devuelve 0 y devuelve false
     */
    private static boolean jugarTurno(char[][] tablero) {
        // Implementa la lógica para que el jugador dispare a una coordenada
        // y muestre si ha tocado un barco o no.
        int[] coordenadas_tiro = pedirTiro(tablero.length, tablero[0].length);
        
        if(disparoTocadoAgua(coordenadas_tiro,tablero))
        {
            ponerMarca(coordenadas_tiro,tablero,'X'); //x es Tocado
        }
        else
        {
            ponerMarca(coordenadas_tiro,tablero,'O'); //O es Tocado
        }
        
        return true;//cambiar a lo que sea correcto
    }
    
     /**
     * Coloca barcos de una longitud específica en el tablero.
     * Dentro pide la coordenada, tanto fila , como columna
     * Ademas pide sentido 1.- Abajo, 2 Derecha
     * @param longitud La longitud del barco.
     * @param cantidad La cantidad de barcos de esa longitud a colocar.
     */
    private static void colocarBarcosDeLongitud(int longitud, int cantidad, char[][] tablero) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nColocar barco de longitud " + longitud);
            System.out.print("Ingrese la fila: ");
            
            int fila = sc.nextInt(); //cumplimentar
            System.out.print("Ingrese la columnas: ");
            int columna = sc.nextInt();//cumplimentar

            System.out.print("Seleccione la orientación (1. Abajo / 2. Derecha): ");
            int orientacion = sc.nextInt();//cumplimentar

            if (colocarBarco(fila, columna, longitud, orientacion,tablero)) {
                mostrarTablero(tablero);
            } else {
                System.out.println("No hay espacio suficiente en esa dirección. Intenta de nuevo.");
                i--;  // Restar 1 al contador para repetir el intento y así el i++ quede igual
            }
        }
    }
    
    /**
     * Coloca un barco en el tablero en la dirección especificada.
     * @param fila La fila inicial del barco.
     * @param columna La columna inicial del barco.
     * @param longitud La longitud del barco.
     * @param orientacion La orientación del barco (1. Abajo / 2. Derecha).
     * return true si ha colocado el barco, false lo contrario porque ha comprobado 
     * que por la longitud y dirección no cabría
     * El barco se marcara con una B
     * No comprueba si se pone encima de otro barco aunque estaria bien hacerlo
     */
    private static boolean colocarBarco(int fila, int columna, int longitud, int orientacion, char[][] tablero) {
        boolean cabe=hayEspacioSuficiente(fila,columna,longitud,orientacion,tablero);
        if (cabe)
        {
            if(orientacion==1)  //abajo 
            {//voy a poner b's
                for (int i = 1; i <= longitud; i++) {
                    tablero[fila][columna] = 'B';
                    fila++;
                }   
            }
            if (orientacion==2) //derecha
            {
                for (int i = 1; i <= longitud; i++) {
                    tablero[fila][columna] = 'B';
                    columna++; 
                }
            }
            return cabe;
        }
        else //no hay espacio
        {
            return cabe;
        }
        
        
    }

    /**
     * pide datos de tiro, los datos tienen que estar dentro de los limites
     * @param fila_maxima
     * @param columna_maxima
     * @return un array con 2 posiciones, la primera es la fila y la segunda la columna.
     */
    private static int[] pedirTiro(int fila_maxima, int columna_maxima) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * comprueba si en las coordenadas, hay algun barco
     * @param coordenadas_tiro, contiena la fila y columna del disparo
     * @param tablero 
     * return true si es que si
     */
    private static boolean disparoTocadoAgua(int[] coordenadas_tiro, char[][] tablero) {
     return true;   
    }

    /**
     * Pone una marca, en el tablero en la posición indicada por coordenas de tiro
     * @param coordenadas_tiro
     * @param tablero
     * @param marca que se pondra en la coordenada especificada 
     */
    private static void ponerMarca(int[] coordenadas_tiro, char[][] tablero, char marca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static boolean hayEspacioSuficiente(int fila, int columna, int longitud, int orientacion, char[][] tablero) {
        int casillas_libres;
        if (orientacion==1) //abajo
        {
            casillas_libres = tablero.length - fila;
            if (casillas_libres>= longitud)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else if (orientacion==2) //derecha
        {
            casillas_libres = tablero[fila].length - columna;
            if (casillas_libres>= longitud)
            {
                return true;
            }
            else
            {
                return false;
            }            
        }
        return true;
    }
}

    


