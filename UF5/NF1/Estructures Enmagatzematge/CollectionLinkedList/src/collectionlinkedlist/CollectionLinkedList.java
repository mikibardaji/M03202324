/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionlinkedlist;

import java.util.List;
import java.util.Scanner;
import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;
import model.DAOPersona;
import model.Persona;
import model.PersonaCitaPrevia;

/**
 *
 * @author mabardaji
 */
public class CollectionLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MenuDaw menu = new MenuDaw("Gestio de cues");
       
        DAOPersona gestio_cua = new DAOPersona();
       // conté la colecció del model dades
       int opcio;
       boolean exit = false;
       addAllOptions(menu); 
       
       introDadesProva(gestio_cua);
       
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       do
       {
           //mostrar el menu i escollir opcio CASA
          opcio = menu.displayMenu();
          switch(opcio)
            {
                case 2: //afegir
                    afegirPersonaCua(gestio_cua);
                    break;
                case 3:    //consultar
                    atendrePersona(gestio_cua);
                    break;
                case 6:    //consultar per nom
                    eliminarUltimaPersona(gestio_cua);
                    break;                    
                case 4:    //consultar per nom
                    listarCola(gestio_cua);
                    break;             
                case 5:    //consultar per nom
                    listarColaOrdenada(gestio_cua);
                    break; 
                case 1: //Sortir
                    exit = true;
                    break;
            } 
       }while(!exit);
    }
    
    
    private static void addAllOptions(MenuDaw menu) {
        try {
            //Afegir personatge
            menu.addOption("Sortir");
            menu.addOption("Afegir cua");
            menu.addOption("Atendre persona"); //desapareix la priemra cua
            menu.addOption("Llistar cua");
            menu.addOption("Llistar cua ordenada");
            menu.addOption("Marxa la ultima persona");
            
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void afegirPersonaCua(DAOPersona gestio_cua) {
        //demanar dades per crear persona
        Persona afegir = createPerson();
        //afegir a la cua
        gestio_cua.afegirPersona(afegir);
        //avisar del resultat
        System.out.println("Persona afegida a la cua " + afegir.getNom() 
                + " posicio " + afegir.getTicket());
    }

    private static Persona createPerson() {
        Persona nueva;
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon nombre persona");
        String nombre = sc.nextLine();
       // System.out.println("Pon ticket");
       // int ticket = sc.nextInt();
        //sc.nextLine(); //limpia enter
        System.out.println("Tenia cita concertada (Si/No)");
        String si_no = sc.nextLine();
        
        if (si_no.equalsIgnoreCase("Si"))
        {
            nueva = new Persona(nombre, 0, true);
        }
        else
        {
            nueva = new Persona(nombre, 0, false);
        }
        
        return nueva;
        
    }

    private static void introDadesProva(DAOPersona gestio_cua) {
        gestio_cua.afegirPersona(new Persona("Jose",0,true));
        gestio_cua.afegirPersona(new Persona("Jeremy",0,false));
        gestio_cua.afegirPersona(new Persona("Gillian",0,false));
        gestio_cua.afegirPersona(new Persona("Javier",0,true));
    }

    private static void atendrePersona(DAOPersona gestio_cua) {
        Persona atendida = gestio_cua.AtenderPersona();
        System.out.println("Le toca a " + atendida);
    }

    private static void listarCola(DAOPersona gestio_cua) {
        List<Persona> todos = gestio_cua.getColaEntera();
        for (Persona people : todos) {
            System.out.println(people);
        }
        System.out.println("Personas en cola " + todos.size());
        
    }

    /**
     * treu la ultima persona que esta a la cua
     * @param gestio_cua 
     */
    private static void eliminarUltimaPersona(DAOPersona gestio_cua) {
        Persona marxa = gestio_cua.treurePersona();
        if (marxa!=null)
        {
            System.out.println("Ha marxat " + marxa.getNom());
        }
        else
        {
            System.out.println("No hi havia gent a la cua");
        }
    }

    private static void listarColaOrdenada(DAOPersona gestio_cua) {
        List<Persona> todos = gestio_cua.getColaEntera();
        todos.sort(new PersonaCitaPrevia());
        for (Persona people : todos) {
            System.out.println(people);
        }
        System.out.println("Personas en cola " + todos.size());
    }
}
