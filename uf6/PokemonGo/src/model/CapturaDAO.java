/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import BD.DBConnect;
import java.sql.*;


/**
 *
 * @author mabardaji
 */
public class CapturaDAO {
    //atribut per la conexió
    Connection conn_principal;

    public CapturaDAO() throws SQLException {
        conn_principal = DBConnect.getConnection(); //estara oberta fins al final
    }    
    
    
    public boolean darCaptura(int id_coach, int num_pokemon, int CP) throws SQLException
    {
        int rows;
        if (conn_principal!=null)
        {
            String query = "INSERT INTO MOCHILA (id_entrenador,num_pokemon,CP) "
                    + " VALUES (?,?,?)";
            
            PreparedStatement stmt = conn_principal.prepareStatement(query);
            stmt.setInt(1, id_coach);
            stmt.setInt(2, num_pokemon);
            stmt.setInt(3, CP);
            
            rows = stmt.executeUpdate();
            if (rows>0)
            {
                return true;
            }
            else
            {
                return false;
            }
            
        }
        
        return false;
        
    }
    
}
