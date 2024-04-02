/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectefilepruebas;

import java.io.File;
import java.util.Date;

/**
 *
 * @author mabardaji
 */
public class ObjecteFilePruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //fichero o una carpeta
        File fitxer = new File("bardaji/inventado_bardaji.txt");
        File carpeta = new File("bardaji/");
        //si existe
        if (carpeta.exists())
        {
            System.out.println("Fichero existe");
        }
        else
        {
            System.out.println("Fichero no existe");
        }
        
       // pintarRutas(fitxer);
      //  System.out.println("************");
      //  pintarRutas(carpeta);
        
        listarFicherosCarpeta(carpeta);
        System.out.println("************");
        listarFicherosCarpeta(fitxer);
        
        
    }

    private static void pintarRutas(File fitxer) {
        System.out.println("Nombre fichero --> " + fitxer.getName());
        System.out.println("Ruta fichero (relativa)  -->" + fitxer.getParent());
        System.out.println("Ruta absoluta --> " + fitxer.getAbsolutePath());
        System.out.println("Tamaño fichero --> " + fitxer.length());
        //ms desde 1 junio 1970
        System.out.println("Ultima modificacion en ms --> " + fitxer.lastModified());
        Date fecha = new Date(fitxer.lastModified());
        System.out.println("Fecha modificacion " + fecha);

        System.out.println("-------------------------------------");
    }

    /**
     * mirar si file es una carpeta
     * y en caso de que si, listar todos los files de dentro
     * @param carpeta 
     */
    private static void listarFicherosCarpeta(File carpeta) {
        if (carpeta.isDirectory())
        {
            File[] listado = carpeta.listFiles();
            System.out.println("Numero de ficheros" + listado.length);
            for (File fichero : listado) {
                pintarRutas(fichero);
            }
        }
        else
        {
            System.out.println("Es un fichero");
            pintarRutas(carpeta);
        }
    }
    
}
