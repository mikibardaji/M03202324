/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexiobd;

import BD.DBConnect;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author mabardaji
 */
public class ConexioBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ConexioBD app = new ConexioBD();
        app.run();
    }

    //La part exectuable
    private void run() {
        try {
            System.out.println("Comencem... ");
            boolean exit = false;
            //load driver un sol cop en tot el programa
            DBConnect.loadDriver();
            System.out.println("Carregat... ");
            do{
                int opcion = promptMenu();
                switch(opcion)
                {
                    case 0:
                        exit=true;
                        break;
                    case 1:
                        printAllCountries();
                        break;
                }
                
                
            }while(!exit);
            
            
        } catch (ClassNotFoundException ex) {
            System.out.println("No encontrado el driver..." + ex.getMessage() );
        }
    }
    
     /**
     * Displays menu and reads option from user.
     *
     * @return the option selected by user or -1 in case of error.
     */
    private int promptMenu() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] options = {
            "Quit", "Print all countries", "Print all countries and metadata",
            "Insert a new country", "Modify a country", "Delete a country",};
        for (int i = 0; i < options.length; i++) {
            System.out.format("[%d]. %s\n", i, options[i]);
        }
        System.out.print("Choose a test to execute: ");
        int op;
        try {
            op = Integer.parseInt((reader.readLine()));
        } catch (NumberFormatException | IOException e) {
            op = -1;
        }
        return op;
    }

    private void printAllCountries() {
        try {
            Connection conn;
            
            conn = DBConnect.getConnection();
            if (conn!=null)
            {
                //statement es el que tindra la instrucció sql
                Statement stmt = conn.createStatement();
                
                String query = "SELECT * from countries";
                //Resultset similar a cursor SQL
                ResultSet res = stmt.executeQuery(query);// Open Cursor
                
                
                //fetch
                while(res.next())
                {
                    int id = res.getInt("id");
                    String name = res.getString("name");
                    String capital = res.getString("capital");
                    System.out.println(id + "-" + name + "-" + capital);
                    
                }
                res.close();
                stmt.close();
                
            }
            else
            {
                System.out.println("Conexión no establecida");
            }
            
            
        } catch (SQLException ex) {
            System.out.println("Error haciendo conexion" + ex.getMessage());
        }
    }
    
    
}
