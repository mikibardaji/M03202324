/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadonombres;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ListadoNombres {

    public static void main(String[] args) {
        //definir estructura de string per 10 noms
        char opcio;

        do {
            mostrarMenu();
            opcio = obtenirOpcioUsuari();

            switch (opcio) {
                case 'a':
                    //opcio
                    break;
                case 'b':
                    //opcio
                    break;
                case 'c':
                    //opcio
                    break;
                case 'd':
                    //opcio
                    break;
                case 'e':
                    //opcio
                    break;
                case 'f':
                    //opcio
                    break;
                case 'g':
                    //opcio
                    break;
                default:
                    System.out.println("Opció no v?lida. Torna a intentar.");
            }

        } while (/*fica opció per continuar dins el bucle*/);
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("a. Llistar noms");
        System.out.println("b. Afegir nom");
        System.out.println("c. Modificar nom");
        System.out.println("d. Cerca en quina posició nom");
        System.out.println("e. Esborrar nom");
        System.out.println("f. Sortir");
        System.out.println("g. Opció a escollir, ficar nom");
    }

    private static char obtenirOpcioUsuari() {
    Scanner scanner = new Scanner(System.in);

    System.out.print ("Selecciona una opció: ");
//recollir lletra i retornar-la
return scanner.next().charAt(0);
}
    
}
