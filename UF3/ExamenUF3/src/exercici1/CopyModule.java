package exercici1;


import Fitxers.ObjectoLecturaFicheros;
import Fitxers.ObjetosEscrituraFicheros;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CopyModule {

    public static void main(String[] args) {
        
        //instantiate main class
        CopyModule ap = new CopyModule();
        ap.run();
    }

    public void run()
    {
        Scanner scan = new Scanner(System.in);
        //create test data
        List<Module> originalData = loadData();
        //display original data
        System.out.println("Original data");
        displayList(originalData);
        //ask file name
        System.out.print("Input public data file name: ");
        String publicFilename = scan.next();
       //demanar GM o GS sTring
        System.out.print("Put the type of module to save");
        String Level= scan.next();
        //write data to file
        int elemsWritten = writeToFile(publicFilename, originalData, Level);
        //show the number of elements written by console
        //TO DO
        System.out.println("Modulos grabados..." + elemsWritten);
        //END TO DO
        //read data from file
        System.out.println("Read data");
        List<Module> readData = readFromFile(publicFilename);
        //display read data
        displayList(readData);
    }



    /**
     * displays a list of user
     * @param data the list of user to display
     */
    public void displayList(List<Module> data) {
        for (Module t : data) {
            System.out.println(t);
        }
    }
    
    /**
     * writes user data to two files (public and private data)
     * @param pubFilename the file name to write public data
     * @param data the list to be written to file
     * @Level  Type of module to save (GM, Gs)
     * @return the number of elements actually written to file
     */
    public int writeToFile(String pubFilename,  List<Module> data, String Level) {
        int counter = 0;
        try {
            
            //TODO write the list to file
            //abrir fichero
            ObjetosEscrituraFicheros escritura = new ObjetosEscrituraFicheros(pubFilename);
            
            for (Module modulo : data) {
                if (modulo.getType().equalsIgnoreCase(Level))
                {
                    escritura.escribirObjeto(modulo);
                    counter++;
                }
            }
            //recorrrer collection data
            //si el que leo tiene el nivel pedido grabo
            
            //actualizo contador
            escritura.cerrarFicheros();
            //cierro fichero
            //END TODO
            
           
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
         return counter;
    }

    /**
     * reads a list of double from file
     * @param filename the file name to read from
     * @return the list of double read from file
     */
    private List<Module> readFromFile(String pubFilename) {
         List<Module> data = new ArrayList<>();
        try {
           
            ObjectoLecturaFicheros leer = new ObjectoLecturaFicheros(pubFilename);
            
            Module leido = new Module("M01");
            Object leido_objeto = new Object();
            while (leido_objeto!=null)
            {
                leido_objeto = leer.leerObjeto();
                if (leido_objeto!= null)
                {
                    if (leido_objeto instanceof Module)
                    {
                        leido = (Module) leido_objeto;
                        data.add(leido);
                    }
                }  
            }
            leer.cerrarFicheros();

            
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return data;
    }

    /**
     * loads test data
     * @return list of double with some data
     */
    public List<Module> loadData() {
        List<Module> data = new ArrayList<>();
        data.add(new Module("M03", "Programacion", "GS", 99));
        data.add(new Module("M02", "Base dades", "GS", 297));
        data.add(new Module("M04", "Llenguatges", "GM", 198));
        data.add(new Module("M05", "xXXX", "GM",200));
        data.add(new Module("id5", "name05", "GM",200));
        data.add(new Module("id7", "name06", "GM",170));
        return data;
    }
    
}
