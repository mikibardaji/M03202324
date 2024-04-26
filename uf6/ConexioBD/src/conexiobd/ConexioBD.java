/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexiobd;

import BD.DBConnect;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Country;
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
                    case 2:
                        printAllMetadataCountries();
                        break;                     
                    case 3:
                        InsertCountry2();
                        break;                         
                    case 4:
                        UpdateCapitalCountry();
                        break;
                    case 5:
                        DeleteCapitalCountry();
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
            int counter = 0;
            conn = DBConnect.getConnection();
            Country show_country = new Country();
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
                    //show_country = new Country(id, name, capital, id, id, id, id);
                    //al no recuperarlos tots, faig els setters del camps 
                    show_country.setId(id);
                    show_country.setName(name);
                    show_country.setCapital(capital);
                    System.out.println(show_country);
                    counter++;
                }
                System.out.println("Paises mostrados....");
                //mostrar quants paisos he ensenyat
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

    /* imprimir metadatos del cursor */
    private void printAllMetadataCountries() {
         try {
            Connection conn;
            int counter = 0;
       
            conn = DBConnect.getConnection();
            
            //statement es el que tindra la instrucció sql
            Statement stmt = conn.createStatement();
                
            String query = "SELECT * from countries";
            //cursor igual
            ResultSet cursor = stmt.executeQuery(query);
            //vaig a averiguar els metadatos del cursor
            ResultSetMetaData cursor_mtd = cursor.getMetaData();
            int num_col = cursor_mtd.getColumnCount();
            for (int i = 0; i < num_col; i++) {
                System.out.print(cursor_mtd.getColumnLabel(i+1) + "\t");
                System.out.print(cursor_mtd.getColumnName(i+1) + "\t");
                System.out.print(cursor_mtd.getColumnType(i+1) + "\t");
                System.out.print(cursor_mtd.getColumnTypeName(i+1) + "\t");
                System.out.print(cursor_mtd.isAutoIncrement(i+1) + "\t");
                System.out.print(cursor_mtd.isNullable(i+1) + "\t");
                System.out.print(cursor_mtd.getPrecision(i+1) + "\t");
                System.out.println("");
            }
            
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexioBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*
    inserta un pais fixe, fica't per codi
    */
    private void InsertCountry() {
        try {
            Connection conn;
            
            conn = DBConnect.getConnection();
            if (conn != null)
            {
                //statement es el que tindra la instrucció sql
                Statement stmt = conn.createStatement();
                //Creem query de insert
                String name = "El salvador";
                double poblacion = 100;
                String query = "INSERT INTO COUNTRIES  VALUES"
                        + " (NULL,'" + name + "','El salvador',"+poblacion+",50,2.0,83)";
                //verificacio
                System.out.println(query);
                
                int numRowsAffected = stmt.executeUpdate(query);
                System.out.println("Pais insertado");
                stmt.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConexioBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*
    inserta un pais fixe, fica't per codi
    */
    private void InsertCountry2() {
        try {
            Connection conn;
            
            conn = DBConnect.getConnection();
            if (conn != null)
            {
                
                //Creem query de insert
                String query = "INSERT INTO COUNTRIES  "
                        + "(name,capital,surface,inhabitants,pib,lifeexpectancy) "
                        + " VALUES"
                        + " (?,?,?,?,?,?)";
                //verificacio
                System.out.println(query);
               
                PreparedStatement preparedQuery = conn.prepareStatement(query);
                //informo cada interrogant amb el seu valor
                preparedQuery.setString(1, "El salvador2");
                preparedQuery.setString(2, "Capital");
                preparedQuery.setDouble(3,23.00);
                preparedQuery.setInt(4, 1000);
                preparedQuery.setDouble(5,123.00);
                preparedQuery.setInt(6,23);
                
                int rows = preparedQuery.executeUpdate();
                System.out.println("Pais insertado... " + rows);
//                if (!preparedQuery.executeUpdate())
//                {
//                    System.out.println("no ejecutado correctamente");
//                }
//                else
//                {
//                    System.out.println("Insertado correctamente");
//                }
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println(ex.getSQLState());
        }
    }

    /*
    Demanarem el numero de pais i la seva nova capital
    i l'actualitzarem... 
    */
    
    private void UpdateCapitalCountry() {
        try {
            Connection conn;
            Scanner sc = new Scanner(System.in);
            conn = DBConnect.getConnection();
            if (conn!=null)
            {
                
            Statement stmt = conn.createStatement();
                
            System.out.println("Que numero de pais quieres cambiar");
            int num_country = sc.nextInt();
            sc.nextLine();
            System.out.println("Que nueva capital tienes");
            String new_capital = sc.nextLine();
            
            String query = "UPDATE COUNTRIES "
                    + " SET CAPITAL='" + new_capital +"' "
                    + " WHERE ID = " + num_country;
            System.out.println(query);
                
            int rowsAffected = stmt.executeUpdate(query);
            System.out.println("parametros afectados " + rowsAffected);
            stmt.close(); //
            conn.close();
            }
            
        } catch (SQLException ex) {
            System.out.println("Error SQL" + ex.getMessage());
        }
    }

    private void DeleteCapitalCountry() {
        try {
            Connection conn;
            Scanner sc = new Scanner(System.in);
            conn = DBConnect.getConnection();
            if (conn != null)
            {
                 System.out.println("Que numero de pais quieres cambiar");
                 int num_country = sc.nextInt();
                 
                 Statement stmt = conn.createStatement();
                
                String query2 = "SELECT * from countries where id=" + num_country;
                ResultSet cursor = stmt.executeQuery(query2);
                int cont=0;
                while(cursor.next())
                {
                    cont++;
                }
                System.out.println("Voy a borrar " + cont + "registros");
                System.out.println("Estas seguro");
                sc.nextLine();
                String si_no = sc.nextLine();
                stmt.close();
                if (si_no.equalsIgnoreCase("SI"))
                {
                    String query = "DELETE FROM COUNTRIES "
                         + " WHERE ID = ?";
                    //verificacio
                    System.out.println(query);

                    PreparedStatement preparedQuery = conn.prepareStatement(query);
                    preparedQuery.setInt(1, num_country);
                    int rows = preparedQuery.executeUpdate();
                    System.out.println("numero registros borrados ---- " + rows);
                    preparedQuery.close();
                }
                 
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error SQL" + ex.getMessage());
        }
    }
    
    
    
    
}
