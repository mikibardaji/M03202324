/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinaexpendedora;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class MaquinaExpendedora {

      public static void main(String[] args) {
        int opcio;
        String[][] nombresGolosinas = {
            {"KitKat", "Chicles de fresa", "Lacasitos", "Palotes"},
            {"Kinder Bueno", "Bolsa variada Haribo", "Chetoos", "Twix"},
            {"Kinder Bueno", "M&M'S", "Papa Delta", "Chicles de menta"},
            {"Lacasitos", "Crunch", "Milkybar", "KitKat"}
             };
        
        double[][] precio = {
            {1.1, 0.8, 1.5, 0.9},
            {1.8, 1, 1.2, 1},
            {1.8, 1.3, 1.2, 0.8},
            {1.5, 1.1, 1.1, 1.1}
        };
        int[][] existencia = new int[4][4];
        llenarMaquina(existencia);
        int venta,total_ventas=0;
        do{
        opcio= menu();
        switch(opcio){
            case 1:
                venta=pedirGolosina(nombresGolosinas,existencia,precio);
                total_ventas += venta;
                break;              
            case 4:
                mostrarExistencias(existencia, nombresGolosinas);
                break;
            case 2:
                mostrarGolosinas(nombresGolosinas);
                break;  
            case 3:
                reponerGolosinas(existencia, nombresGolosinas);
                break; 
            case 0:
                System.out.println("saliendo... han comprado " + total_ventas);
                break;
            default:
                break;
        }
        
        
        }while(opcio!=0); //sortir opció del menú
        
    }

    private static int menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("1.- Demanar llaminadura");
        System.out.println("2.- Mostra llaminadures-columna elegida");
        System.out.println("3.- Omplir llaminadures");
        System.out.println("4.- Mostrar existencies maquina");
        System.out.println("0.- Apagar m?quina");
        System.out.println("Escull opció");
        
        int opcion = sc.nextInt();
        
        //aqui falta demanar la opci? i uqe si no es correcta torni a demanar-la
        
        //retornar opci? escollida
        return opcion;
    }

    /**
     * pongo todas las existencias a 5
     * @param existencia 
     */
    private static void llenarMaquina(int[][] existencia) {
        for (int filas = 0; filas < existencia.length; filas++) {
            for (int columnas = 0; columnas < existencia[0].length; columnas++) {
                existencia[filas][columnas] = 5;
            }
        }

    }

    private static void mostrarExistencias(int[][] existencia, String[][] nombresGolosinas) {
        for (int filas = 0; filas < existencia.length; filas++) {
            for (int columnas = 0; columnas < existencia[0].length; columnas++) {
                System.out.print(nombresGolosinas[filas][columnas] + "-"+  existencia[filas][columnas] + "\t");
            }
            System.out.println(""); //salto linea
        }
    }

    /**
     * mostrara todas las golosinas de las columnas que elija...
     * @param nombresGolosinas 
     */
    private static void mostrarGolosinas(String[][] nombresGolosinas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que columna de golosinas quieres mostrar");
        int columna = sc.nextInt();
        
        
        for (int filas = 0; filas < nombresGolosinas.length; filas++) {
            System.out.println(nombresGolosinas[filas][columna]);
        }
    }

    private static int pedirGolosina(String[][] nombresGolosinas, int[][] existencia, double[][] precio) {
         Scanner sc = new Scanner(System.in);
         mostrarExistencias(existencia, nombresGolosinas);
         System.out.println("Pon la fila que quieres");
         int fila  = sc.nextInt();
         System.out.println("Pon la columna que quieres");
         int columna  = sc.nextInt();
         
         if (fila<nombresGolosinas.length && columna < nombresGolosinas[0].length)
             {
                if (existencia[fila][columna]>0)
                { //que nos queda productos
                   System.out.println("Te ha salido... " + nombresGolosinas[fila][columna]); 
                   System.out.println("Precio ... " + precio[fila][columna] + "€"); 
                   existencia[fila][columna]--;
                   System.out.println("Quedan.... " + existencia[fila][columna]);
                   return 1; //1 vendida
                }
                else
                {
                    System.out.println("No nos queda... " + nombresGolosinas[fila][columna]);
                    return 0; // no hay venta
                }
        }
        else
         {
             System.out.println("colimna o fila incorrecta");
             return 0;
         }
    }
    
    
    /** CASA
     * mostrar el nombre de todas las golosinas que tengan el precio indicado de entrada
     */
    public static void mostrarGolosinasPrecio()//(/*   */,int precio)
    {
        
    }
    
    /** CASA
     * calcular el precio de todas las golosinas de la maquina
     * @return dinero gastado para comprarlas
     */
    public static int calcularPrecioTodasGolosinas()
    {
        return 0;
    }

    
    /**
     * aumenta 5 productos a las existencias
     * 2 opciones coordenadas
     *         o con el nombre de la golosina
     * @param existencia
     * @param nombresGolosinas 
     */
    private static void reponerGolosinas(int[][] existencia, String[][] nombresGolosinas) {
        Scanner sc = new Scanner(System.in);
        String password = "123", user;
        do
        {
            System.out.println("Introdueix contrasenya");
            user = sc.nextLine();    
        }while(!password.equals(user));
//        System.out.println("Pon la fila que quieres");
//        int fila = sc.nextInt();
//        System.out.println("Pon la columna");
//        int columna = sc.nextInt();
//        System.out.println("Quantes vols afegir");
//        int anyadir = sc.nextInt();
//        
//        existencia[fila][columna] += anyadir;
//        System.out.println("Ahora hay... "+ existencia[fila][columna]);
        System.out.println("Que golosinas quieres reponer 5 existencias");
        String nombre_golosina = sc.nextLine();
        boolean encontrado = false;
        for (int fila = 0; fila < nombresGolosinas.length; fila++) {
            for (int col = 0; col < nombresGolosinas[0].length; col++) {
                if (nombresGolosinas[fila][col].equalsIgnoreCase(nombre_golosina))
                {//si la encuentro
                    existencia[fila][col] += 5;
                    System.out.println("reponiendo 5 producots");
                    encontrado = true;
                }
            }
        }
        if(!encontrado)
        {
            System.out.println("Golosina no existe");
        }
        
        
        
        
       
    }
}
