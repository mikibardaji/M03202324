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
        final int CAPACIDAD_AGENDA = 10;
        String[] agenda = new String[CAPACIDAD_AGENDA];
        char opcio;
        Scanner sc = new Scanner(System.in);
        cargarAgenda(agenda);
        
        do {
            System.out.println("Aprieta enter para mostrar menu");
            sc.nextLine(); //para i al apretar el enter
            mostrarMenu();
            opcio = obtenirOpcioUsuari();

            switch (opcio) {
                case 'a': //llistar
                    llistarAgenda(agenda);
                    break;
                case 'b': //Afegir nom
                    afegirNomAgenda(agenda);
                    break;
                case 'c':
                    modificarNomAgenda(agenda);
                    break;
                case 'd':
                    //opcio
                    break;
                case 'e':
                    //opcio
                    break;
                case 'f':
                    //opcio
                    //salir=true;
                    break;
                case 'g':
                    //opcio
                    break;
                default:
                    System.out.println("Opció no v?lida. Torna a intentar.");
            }

        } while (opcio!='f');
        System.out.println("finalizando aplicacion");
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

    private static void cargarAgenda(String[] agenda) {
        agenda[0] = "Laura Montesinos";
        agenda[1] = "Samuel Fuente";
        agenda[2] = "Toni Martí";
    }

    
    /**
     * mostrar tots els noms de la agenda
     * no ha de mostrar els null
     * i al final de tot el llistat te que mostrar quants noms ha ensenyat
     * @param agenda conjunt noms
     */
    private static void llistarAgenda(String[] agenda) {
        int i,num_contactos=0;
        for (i = 0; i < agenda.length; i++) {
            if (agenda[i]!=null)
            {
                System.out.println((i+1)+ " - " + agenda[i] );
                num_contactos++;
            }
            //if (agenda[i]==null) no hay mas
            //{ 
            //  i = agenda.length;
            //} //surt del bucle
        }
        System.out.println("Numero de contactos mostrados " + num_contactos);
    }

    /**
     * Demanara un nom per afegir a la agenda
     * Buscar  la primera posició buida (null), i el  fica..
     * Un cop afegida ha d'informar que ho ha fet al usuari.
     * v2.o si han afegit un nom que ja existeix, que informi  i no ho afegeixi
     * @param agenda 
     */
    private static void afegirNomAgenda(String[] agenda) 
    {
        boolean existe=false, afegit=false;
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa el nom a afegir");
        String nom_afegir = sc.nextLine();
        while (!existe && !afegit && index<agenda.length) //afegit==false)
        {
            if(agenda[index]==null) //posició lliure
            {
                agenda[index] = nom_afegir;
                afegit=true; //per sortir del bucle
                System.out.println("Nom afegit...");
            }
            else if(agenda[index].equalsIgnoreCase(nom_afegir))
            {
                System.out.println("Nom ja existeix");
                existe=true;
            }
            index++;
        }
        if(!afegit && !existe)
        {
            System.out.println("No hi ha espai");
        }
        
    }

    /**
     * Demanar un nom a canviar
     * Buscar si existeix
     *    * Si l'ha trobat Demanar el nou nom i el canvia
          * Si ho canvia avisar al usuari
     * Si no ho canvia també ha de avisar
     * si troba un null ja no existeix
     * @param agenda 
     */
    private static void modificarNomAgenda(String[] agenda) {
        
    }
    
}
