/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listadonombres;

import java.util.Scanner;

/**
 * Crea una llista de noms que gestionarem amb un menú, amb les seguents opcions
 *Llistar noms (mostrar? tots els noms fins al moment)
 * Afegir nom(Afegira a la part final el nom que afegeixis)
* Modificar nom(Buscara el nom i el substituira pel nou que introdueixis)
 *Cerca en quina posició nom(Posaras el nom a buscar i retornar la posició en que es troba a la llista)
* Esborrar nom(opció f?cil, quant trobes la posició la deixes en blanc, i despres llistar noms , no te que mostrar les posicions en blanc. 2ona opcioó mes correcta quant troba el nom, va copiant les posicions segunts de tal manera que es mouen totes una posició cap a la esquerra la 3 passa a la 2, la 4 a la 3.)
 * @author mabardaji
 */
public class ListadoNUMEROS {

    public static void main(String[] args) {
        //definir estructura de string per 10 noms
        final int CAPACIDAD_AGENDA = 10;
        int[] llistat = new int[CAPACIDAD_AGENDA];
        //totes les posicions valen 0 (double, float, int)
        char opcio;
        Scanner sc = new Scanner(System.in);
        //inicializarAgenda(llistat); ficar-ho tot a blanc i desapareix null
        cargarAgenda(llistat);
        
        do {
            System.out.println("Aprieta enter para mostrar menu");
            sc.nextLine(); //para i al apretar el enter
            mostrarMenu();
            opcio = obtenirOpcioUsuari();

            switch (opcio) {
                case 'a': //llistar
                    llistarAgenda(llistat);
                    break;
                case 'b': //Afegir nom
                    afegirNomAgenda(llistat);
                    break;
                case 'c':
                    modificarNomAgenda(llistat);
                    break;
                case 'd':
                    posicioNom(llistat);
                    break;
                case 'e':
                    eliminarNom(llistat);
                    break;
                case 'f':
                    System.out.println("sortir");
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

    private static void cargarAgenda(int[] agenda) {
        agenda[0] = 1;
        agenda[1] = 5;
        agenda[2] = 25;
    }

    
    /**
     * mostrar tots els noms de la llistat
 no ha de mostrar els null
 i al final de tot el llistat te que mostrar quants noms ha ensenyat
     * @param agenda conjunt noms
     */
    private static void llistarAgenda(int[] agenda) {
        int i,num_contactos=0;
        for (i = 0; i < agenda.length; i++) {
            if (agenda[i]!=0)
            {
                System.out.println((i+1)+ " - " + agenda[i] );
                num_contactos++;
            }
            //if (llistat[i]==null) no hay mas
            //{ 
            //  i = llistat.length;
            //} //surt del bucle
        }
        System.out.println("Numeros  mostrados " + num_contactos);
    }

    /**
     * Demanara un nom per afegir a la agenda
     * Buscar  la primera posició buida (null), i el  fica..
     * Un cop afegida ha d'informar que ho ha fet al usuari.
     * v2.o si han afegit un nom que ja existeix, que informi  i no ho afegeixi
     * @param agenda 
     */
    private static void afegirNomAgenda(int[] agenda) 
    {
        boolean existe=false, afegit=false;
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa el numero a afegir");
        int numero_afegir = sc.nextInt();
        while (!existe && !afegit && index<agenda.length) //afegit==false)
        {
            if(agenda[index]==0) //posició lliure
            {
                agenda[index] = numero_afegir;
                afegit=true; //per sortir del bucle
                System.out.println("Nom afegit...");
            }
            else if(agenda[index]==numero_afegir)
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
    private static void modificarNomAgenda(int[] agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa el numero a canviar");
        int  nou,nom = sc.nextInt();
        boolean canviat=false;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i]!=0)
            {
                if(agenda[i]==nom)
                {//l'he trobat
                    System.out.println("Posa el numero nou");
                    nou = sc.nextInt();
                    agenda[i] = nou;
                    System.out.println("numero canviat");
                    canviat=true;
                    i=agenda.length; //per sortir del for
                }
            }
                
            
        }
        if(!canviat)
        {
            System.out.println("El numero no existeix");
        }
    }

    private static void inicializarAgenda(int[] agenda) {
        for (int i = 0; i < agenda.length; i++) {
            //agenda[i] = -1;
            agenda[i]= 0;
        }
    }

    /**
     * trobar el nom i dir-me en quina posició esta
     * si no hi es, tambe dir-ho
     * @param agenda 
     */
    private static void posicioNom(int[] agenda) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa el nom a trobar");
        int nou,nom = sc.nextInt();
        boolean trobat=false;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i]!=0)
            {
                if(agenda[i]==nom)
                {//l'he trobat
                    System.out.println("Es troba a la posició..." + (i+1));
                    trobat=true;
                    i=agenda.length; //per sortir del for
                }

            } 
        }
        if(!trobat)
        {
            System.out.println("El nom no existeix");
        }
    }

    private static void eliminarNom(int[] agenda) {
        boolean existe=false;
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Posa el nom a borrar");
        int numero_eliminar = sc.nextInt();
        while (!existe && index<agenda.length) //afegit==false)
        {
            if(agenda[index]!=0) //posició lliure
            {
               if(agenda[index]==numero_eliminar)
                {
                    agenda[index]=0;
                    moureTotEndavant(agenda,index);
                    existe=true;
                }
            }
             
            index++;
        }
    }

    private static void moureTotEndavant(int[] agenda, int index) {
        for (; index < agenda.length; index++) {
            if (index!= (agenda.length-1))
            {
                agenda[index] = agenda[index+1]; //copiar la informació
            //de la següent posició a l'actual
            }
            else
            { //index == llistat.lenght-1 (ultima posició array)
                agenda[index] = 0;
            }
        }
    }
    
}
