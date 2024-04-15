/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AgendaNoms;

import Fitxers.LineaEscrituraFitxer;
import Fitxers.LineaLecturaFitxer;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;
import model.Agenda;



/**
 *
 * @author mabardaji
 */
public class AgendaNomsMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //per provar el programa
       boolean exit = false;
       MenuDaw menu = new MenuDaw("Manteniment Agenda ");
       //TO DO declaració variable amb model de dàdes
       Agenda todos = new Agenda();
       addAllOptions(menu); 
       //introDadesProva(/* */);
       int opcio;
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       do
       {
           //mostrar el menu i escollir opcio CASA
          opcio = menu.displayMenu();
          switch(opcio)
            {
                case 1:
                    carregarFitxer(todos);
                    break;
                case 2:  
                    afegirNom(todos);
                    break;
                case 3:  
                    llistarNoms(todos);
                    break;                    
                case 4:    
                    gravarFitxer(todos);
                    break;            
                case 5:
                    gravarNombresNoExistentesEntrada(todos);
                    break;
                case 6: //Sortir
                    exit = true;
                    break;
            } 
       }while(!exit);
       
       
       
    }

    /**
     * ficar totes les opcions del menú principal
     * @param menu 
     */
    private static void addAllOptions(MenuDaw menu) {
        try {
            menu.addOption("Carregar fitxer de noms");
            menu.addOption("Donar d'alta nom");
            menu.addOption("Llistar noms");
            menu.addOption("Guardar fitxers"); 
            menu.addOption("Guardar nombres intrudocidos y no existnetes en el fichero de entrada"); 
            menu.addOption("Sortir");
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    private static void introDadesProva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * lee de un fichero de entrada todos los nombres existentes
     * y los carga en el DAO (agenda)
     * @param todos 
     */
    private static void carregarFitxer(Agenda todos) {
        
        try {
            //leer el fichero de datos
            LineaLecturaFitxer entry_file = new LineaLecturaFitxer("ficheros/nombres.txt");
            //acumular nombres en una lista
            
            //opcio 1 comentada
            //carregarUtilitzantList(entry_file, todos);
            
            String nombre_leido;
            //bucle i  tinc que pensar la condició
            do{
                nombre_leido = entry_file.leerLinea();
                if (nombre_leido!=null)
                {
                        if(!todos.afegirNom(nombre_leido))
                        {
                            System.out.println("Nombre repetido " + nombre_leido + " no cargado");
                        }
                }
            }while(nombre_leido!=null);
            
            //fi bucle
           // entry_file.cerrarFicheros();
            //pasarle la lista al dao
           // todos.setListado(names_file);
            //informar usuario
            System.out.println("Fichero cargado  con "
            + todos.getListado().size());
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
            
    }

    private static void afegirNom(Agenda todos) {
        //interaccio usuari si es necessari
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon nombre a añadir");
        String nuevo_nombre = sc.nextLine();
        //interaccio dao
        boolean insertado = todos.afegirNom(nuevo_nombre);
        
        //interacció usuari (si es obligatori)
        if(insertado)
        {
            System.out.println("Nombre añadido...");
        }
        else
        {
            System.out.println("Nombre repetido");
        }
    }

    private static void llistarNoms(Agenda todos) {
        //interaccio usuari (si es necessari)
        
        //interaccio amb DAO
        List<String> nombres = todos.getListado();
        //interacció o mostrar resultat a usuari
        int cont=1;
        for (String name : nombres) {
            System.out.println(cont + "-" + name);
            cont++;
        }
        System.out.println("Nombres listados " + nombres.size());
    }

    private static void gravarFitxer(Agenda todos) {
        try {
            //pido colection DAO (Agenda)
            List<String> nombres_grabar = todos.getListado();
            //declaro fichero de escritura
            LineaEscrituraFitxer output_file = new LineaEscrituraFitxer("ficheros/nombres.txt");
            //recorro colection y grabo cada elemento en el fichero de salida
            for (String nombre_leido : nombres_grabar) {
                //gravar en la salida
                output_file.escribirLinea(nombre_leido+"\n");
            }
            //en el fichero
            output_file.cerrarFicheros();
            //cierro fichero
            System.out.println("Grabados en el fichero de salida"
            + nombres_grabar.size());
            //informo usuari
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

    private static void carregarUtilitzantList(LineaLecturaFitxer entry_file, Agenda todos) {
            try{
            List<String> names_file = new ArrayList();
            String nombre_leido;
            //bucle i  tinc que pensar la condició
            do{
                
                    nombre_leido = entry_file.leerLinea();
                    if (nombre_leido!=null)
                    {
                        names_file.add(nombre_leido);
                    }
               
            }while(nombre_leido!=null);
            
             } catch (IOException ex) {
                    Logger.getLogger(AgendaNomsMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            
    }

    private static void gravarNombresNoExistentesEntrada(Agenda todos) {
        try {
            //opcio mas facil
            
            //leer todo el fichero de entrada y cargarlo en una coleccion
            List<String> nombres_fichero = leerFicheroEntrada(); //fichero de entrada
            
            //leer nombre a nombre en la agenda, y mirar si esta en la coleccion del fichero
            LineaEscrituraFitxer salida = new LineaEscrituraFitxer("ficheros/nombres_sesion.txt");
            //si esta, no lo grabo en la salida
            int cont=0;
            for (String nombre : todos.getListado()) {
                if (!nombres_fichero.contains(nombre))
                {
                    salida.escribirLinea(nombre);
                    cont++;
                }
            }
            //informar usuario
            System.out.println("Nombres guardados ... " + cont );
            //cerrar ficheros
            salida.cerrarFicheros();

        } catch (IOException ex) {
            Logger.getLogger(AgendaNomsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private static List<String> leerFicheroEntrada() {
        List<String> fichero_entrada=new ArrayList();
         try {
            //leer el fichero de datos
            LineaLecturaFitxer entry_file = new LineaLecturaFitxer("ficheros/nombres.txt");
            //acumular nombres en una lista
            
            //opcio 1 comentada
            //carregarUtilitzantList(entry_file, todos);
            
            String nombre_leido;
            //bucle i  tinc que pensar la condició
            do{
                nombre_leido = entry_file.leerLinea();
                if (nombre_leido!=null)
                {
                        if(!fichero_entrada.add(nombre_leido))
                        {
                            System.out.println("Nombre repetido " + nombre_leido + " no cargado");
                        }
                }
            }while(nombre_leido!=null);
            
            return fichero_entrada;
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
         return fichero_entrada;
    }

    
}
