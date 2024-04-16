/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AgendaNoms;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;
import model.Agenda;
import model.Trabajador;



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
                case 2:
                    carregarFitxer(todos);
                    break;
                case 3:  
                    afegirNom(todos);
                    break;
                case 4:  
                    llistarNoms(todos);
                    break;                    
                case 5:    
                    gravarFitxer(todos);
                    break;            
                case 6:
                    gravarNombresNoExistentesEntrada(todos);
                    break;
                case 1: //Sortir
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
            menu.addOption("Sortir");
            menu.addOption("Carregar fitxer de treballadors");
            menu.addOption("Donar d'alta trballador");
            menu.addOption("Llistar ttreballador");
            menu.addOption("Guardar fitxers"); 
            menu.addOption("Guardar trabajadores mayores edad"); 
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
            todos.cargarTrabajadoresFichero("ficheros/trabajadoresObject.dat");
            
        } catch(EOFException ex)
        { //no es un error
           System.out.println("Todos los trabajadores cargados en memoria " + todos.getListado().size()); 
        }  
        catch (IOException  | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } 
            
    }

    private static void afegirNom(Agenda todos) {
        //interaccio usuari si es necessari
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon nombre a añadir");
        String nuevo_nombre = sc.nextLine();
        System.out.println("Pon edad a añadir");
        int nuevo_edad = sc.nextInt();
        System.out.println("Pon salario a añadir");
        double nuevo_salario = sc.nextDouble();
        Trabajador tr = new Trabajador
        (nuevo_nombre, nuevo_edad, nuevo_salario);
//interaccio dao
        boolean insertado = todos.afegirTrabajador(tr);
        
       
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
        List<Trabajador> nombres = todos.getListado();
        //interacció o mostrar resultat a usuari
        int cont=1;
        for (Trabajador treball : nombres) {
            System.out.println(treball);
        }
 
     
        System.out.println("Nombres listados " + nombres.size());
    }

    private static void gravarFitxer(Agenda todos) {
 
        try {
            todos.salvarDatosFichero("ficheros/trabajadoresObject.dat");
            System.out.println("Registros guardados " + todos.getListado().size());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        
    }

    

    private static void gravarNombresNoExistentesEntrada(Agenda todos) {
        
    }

    private static List<String> leerFicheroEntrada() {
       return null;
       
       /*
          try {
            if (todos.cargarTrabajadoresFichero("ficheros/trabajadoresObjetos.dat"))
            {
                System.out.println("Datos Cargados" + todos.getListado().size());
            }
        } catch(EOFException ex)
        {
                System.out.println("Datos Cargados" + todos.getListado().size());
        }
        catch (IOException ex) {
            Logger.getLogger(AgendaNomsMain.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AgendaNomsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       */
       
       /*
       
              try {
          
            todos.salvarDatosFichero("ficheros/trabajadoresObjetos.dat");
            System.out.println("SE han guardado los registros..."
                    + todos.getListado().size());
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());        
        } catch (IOException ex) {
            Logger.getLogger(AgendaNomsMain.class.getName()).log(Level.SEVERE, null, ex);
        }
       */
    }

    
}
