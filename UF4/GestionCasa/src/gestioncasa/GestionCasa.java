/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestioncasa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class GestionCasa {

public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear la casa
        Casa miCasa = new Casa();

        int opcion;
        do {
           
            opcion = escogerOpcionMenu();
            
            switch (opcion) {
                case 1:
                    // Añadir nueva estancia
                    Estancia nueva = pedirDatosEstancia();
                    int rooms = miCasa.afegirEstancia(nueva);
                    System.out.println("Habitaciones total:" + rooms);
                    break;

                case 2:
                    Bustia nuevaBustia = pedirDatosBustia();
                    miCasa.afegirBustia(nuevaBustia);
                    break;

                case 3:         
                    Hipoteca nuevaHipoteca = pedirDatosHipoteca();
                    miCasa.afegirHipoteca(nuevaHipoteca);
                    break;

                case 4:
//                    // Amortizar dinero de la Hipoteca
//                    System.out.print("Introduce la cantidad a amortizar: ");
//                    double cantidadAmortizar = scanner.nextDouble();
//                    double nuevaDeuda = miCasa.amortizarHipoteca(cantidadAmortizar);
//                    if (nuevaDeuda != -1) {
//                        System.out.println("Amortización realizada correctamente. Deuda restante: " + nuevaDeuda);
//                    } else {
//                        System.out.println("Error al amortizar. Verifica la cantidad introducida.");
//                    }
//                    break;

                case 5:
                    // Mostrar superficie total de la casa
                    double superficieTotal = miCasa.superficieTotalCasa();
                    System.out.println("La superficie total de la casa es: " + superficieTotal + " metros cuadrados.");
                    break;
                case 6:
                    mostrarNombreHabitaciones(miCasa);
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }

        } while (opcion != 0);
    }

    private static int escogerOpcionMenu() {
        Scanner scanner = new Scanner(System.in);
        
         // Menú
            System.out.println("Menú:");
            System.out.println("1. Añadir nueva estancia");
            System.out.println("2. Añadir nueva Bustia");
            System.out.println("3. Añadir nueva Hipoteca");
            System.out.println("4. Amortizar dinero de la Hipoteca");
            System.out.println("5. Mostrar superficie total de la casa");
            System.out.println("6. Mostrar nombre habitaciones");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            return opcion;    
    }

    private static Bustia pedirDatosBustia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los detalles de la nueva Bustia:");
        System.out.print("Alto: ");
        double altoBustia = scanner.nextDouble();
        System.out.print("Ancho: ");
        double anchoBustia = scanner.nextDouble();
        Bustia nuevaBustia = new Bustia(altoBustia, anchoBustia);
        return nuevaBustia;
        
    }

    private static Hipoteca pedirDatosHipoteca() {
        Scanner scanner = new Scanner(System.in);
        // Añadir nueva Hipoteca
                    System.out.println("Introduce los detalles de la nueva Hipoteca:");
                    System.out.print("Cantidad a deber: ");
                    double cantidadDeber = scanner.nextDouble();
                    System.out.print("Número de años: ");
                    int numAnyos = scanner.nextInt();
                    Hipoteca nuevaHipoteca = new Hipoteca(cantidadDeber, numAnyos);
                    return nuevaHipoteca;
    }

    private static Estancia pedirDatosEstancia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce los detalles de tu habitaicon:");
        System.out.println("Nombre");
        String nombre = scanner.nextLine();
        System.out.print("Alto: ");
        double altoHabitacion = scanner.nextDouble();
        System.out.print("Ancho: ");
        double anchoHabitacion = scanner.nextDouble();
            System.out.print("Ventanas: ");
        int ventana = scanner.nextInt();
        Estancia nuevaEstancia = new Estancia(nombre, anchoHabitacion, altoHabitacion, ventana);
        return nuevaEstancia;
    }

    private static void mostrarNombreHabitaciones(Casa miCasa) {
        
        Estancia[] todas = miCasa.getCompartimentos();
        for (int i = 0; i < miCasa.getNum_estancias(); i++) {
            System.out.println(i + " "+ todas[i].getTipus().name());
            
        }
    }


    
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Bustia buzon = new Bustia(23, 10);
//        Casa house = new Casa();
//        house.afegirEstancia("baño", 23, 5, 2);
//        Estancia kitchen = new Estancia("cocina", 10, 10, 1);
//        house.afegirEstancia(kitchen);
//    }
    
}
