package Exercici3;


import Fitxers.EscrituraSerializadaPrimitius;
import Fitxers.LecturaSerializadaPrimitius;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CopyUsers {

    public static void main(String[] args) {
       
            Scanner scan = new Scanner(System.in);
            //instantiate main class
            CopyUsers ap = new CopyUsers();
            //create test data
            List<User> originalData = ap.loadData();
            //display original data
            //en original data tenemos todos los datos de los usuarios
            System.out.println("Original data");
            ap.displayList(originalData);
            //ask file name
            System.out.print("Input public data file name: ");
            String publicFilename = scan.next();
            System.out.print("Input private data file name: ");
            String privateFilename = scan.next();
            //write data to file
            int elemsWritten = ap.writeToFile(publicFilename, privateFilename, originalData);
            //TO DO show the numbers of items save
            System.out.println("registros gravados " + elemsWritten);
            //END TO DO
            
            //read data from file
            System.out.println("Read data");
            List<User> readData = ap.readFromFile(publicFilename, privateFilename);
            //display read data
            ap.displayList(readData);
        
    }

    /**
     * displays a list of User
     * @param data the list of User to display
     */
    public void displayList(List<User> data) {
        for (User t : data) {
            System.out.println(t);
        }
    }
    
    /**
     * writes User data to two files (public and private data)
     * @param pubFilename the file name to write public data
     * @param privFilename the file name to write private data
     * @param data the list to be written to file
     * @return the number of elements actually written to file
     */
    public int writeToFile(String pubFilename, String privFilename, List<User> data) {
        int counter = 0;
        try {
            
            
            EscrituraSerializadaPrimitius datos_publicos = new EscrituraSerializadaPrimitius(pubFilename);
            EscrituraSerializadaPrimitius datos_privados = new EscrituraSerializadaPrimitius(privFilename);
            
            for (User usuario : data) {
                datos_publicos.escribirInt(usuario.getid());
                datos_publicos.escribirString(usuario.getName());
                datos_privados.escribirString(usuario.getpassword());
                datos_privados.escribirDouble(usuario.getbalance());
                counter++;
            }
            //TODO write the list to file
            datos_privados.cerrarFicheros();
            datos_publicos.cerrarFicheros();
            //END TODO
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CopyUsers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CopyUsers.class.getName()).log(Level.SEVERE, null, ex);
        }
        return counter;
    }

    /**
     * reads a list of double from file
     * @param filename the file name to read from
     * @return the list of double read from file
     */
    private List<User> readFromFile(String pubFilename, String privFilename)  {
        List<User> data = new ArrayList<>();
        User leido;
         LecturaSerializadaPrimitius leer_publicos=null;
         LecturaSerializadaPrimitius leer_privados = null;
        try {
            
            leer_publicos = new LecturaSerializadaPrimitius(pubFilename);
            leer_privados = new LecturaSerializadaPrimitius(privFilename);
            do{
                int id_leido = leer_publicos.leerInt();
                String name = leer_publicos.leerLinea();
                String pw = leer_privados.leerLinea();
                double balance = leer_privados.leerDouble();
                leido = new User(id_leido, name, pw, balance);
                data.add(leido);
                
            }while(true);
            
            
        } catch(EOFException ex )
        {
            try {
                leer_publicos.cerrarFicheros();
                leer_privados.cerrarFicheros();
            } catch (IOException ex1) {
                Logger.getLogger(CopyUsers.class.getName()).log(Level.SEVERE, null, ex1);
            }
            
        }
        catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }catch ( IOException ex){
            System.out.println(ex.getMessage());
        }
        return data;
    }

    /**
     * loads test data
     * @return list of double with some data
     */
    public List<User> loadData() {
        List<User> data = new ArrayList<>();
        data.add(new User(1, "name01", "PW21", 1001.0));
        data.add(new User(2, "name02", "PW22", 1002.0));
        data.add(new User(3, "name03", "PW22", 1003.0));
        data.add(new User(4, "name04", "PW23", 1004.0));
        data.add(new User(5, "name05", "PW37", 1005.0));
        data.add(new User(6, "name06", "PW26", 1006.0));
        return data;
    }
    
}
