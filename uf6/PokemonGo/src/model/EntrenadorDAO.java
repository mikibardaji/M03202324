/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import BD.DBConnect;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author mabardaji
 */
public class EntrenadorDAO {
    //atribut per la conexió
    Connection conn_principal;

    public EntrenadorDAO() throws SQLException {
        conn_principal = DBConnect.getConnection(); //estara oberta fins al final
    }
    
    
    public int altaEntrenador(Entrenador trainer) throws SQLException
    {

        int rows=0;
        if (conn_principal!=null)
        {
            //realitzo insert
           //llamar al metodo existeEntrenador y si da cierto no hago el insert
            
           String query = "INSERT INTO ENTRENADORS  "
                        + "(name, password) "
                        + " VALUES"
                        + " (?,?)"; //id no informat perque es autoincremental
            //verificacio
            System.out.println(query); //s'ha de treure quant funcioni 
            
            PreparedStatement preparedQuery = conn_principal.prepareStatement(query);
            
            preparedQuery.setString(1, trainer.getName());
            preparedQuery.setString(2,trainer.getPassword());
            rows = preparedQuery.executeUpdate();   
        }
        
        return rows;
    }
    
    
    /**
     * devuelve cierto si ya exsite un entrenador en base de datos con ese nombre
     * false si no existe
     * @param name
     * @return 
     */
    public boolean existeEntrenador(String name)
    {
        //fer una consulta y si existe
        
        //devolver true
        
        //si no existe devolver false
        
        return false;
        
    }
    
    
    /**
     * Borrar entrenador amb el nom
     * Primer el te que recuperar, si existeix
     * i despres borrar-lo, pero retornant el objecte entrenador informat
     * si no existia, retorna null 
     * @param name
     * @return 
     */
    public Entrenador esborrarEntrenador(String name)
    {
        
        return null;
    }
    
    
    /**
     * retorna tots els entrenadors de la base de dades o null si no n'hi ha cap
     * @return 
     */
    public List<Entrenador> totsEntrenadors() throws SQLException
    {
        List<Entrenador> all_trainers = null;
        if (conn_principal!=null)
        {
            Statement stmt = conn_principal.createStatement();
            String query = "Select id, name, password"
                    + " from entrenadors";
            
            ResultSet cursor = stmt.executeQuery(query);
            all_trainers = new ArrayList<>();
            while(cursor.next())
            {
                String nom = cursor.getString("name");
                String contrasenya = cursor.getString("password");
                int id = cursor.getInt("id");
//                Entrenador nuevo = new Entrenador(id, nom, contrasenya);
//                all_trainers.add(nuevo);
                all_trainers.add(new Entrenador(id, nom, contrasenya));
            }
             cursor.close();
        }
        return all_trainers;
    }
    
    
    /**
     * retorna un objecte entrenador amb els atributs informats que tingui el name.
     * Si no existei retorna null
     * @param name 
     */
    public Entrenador devolverEntrenador(String name)
    {
        
        return null;
    }
    
    
    public void cerrarConexion() throws SQLException
    {
        conn_principal.close();
    }
    
}
