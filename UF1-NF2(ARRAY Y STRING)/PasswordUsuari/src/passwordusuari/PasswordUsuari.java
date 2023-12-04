/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package passwordusuari;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PasswordUsuari {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String usuari, password;
        Scanner sc = new Scanner(System.in);
        System.out.println("pon tu usuario");
        usuari = sc.nextLine();
        System.out.println("pon tu password");
        password = sc.nextLine();
        
        boolean user_valid=true, password_valid=true;
        boolean error = false;
        
        user_valid = validarUsuario(usuari);
        password_valid = validarPassword(password);
        
        if (!user_valid)
        {
            System.out.println("Usuario no valido");
        }
        if (!password_valid)
        {
            System.out.println("Password no valido");
        }
        if(password_valid && user_valid)
        {
            System.out.println("usuario y password correcto");
        }
        
    }

    private static boolean validarUsuario(String usuari) {
            boolean error = false;
            
           
            for (int i = 0; i < usuari.length(); i++) {
                if (usuari.charAt(i)=='@')
                {
                    error=true; //no hay error
                }
            }
            if (usuari.contains("@"))
            {
                error = true;
            }
            
            if(usuari.length()<8)
            {
                error = false;
            }
            
            if(!usuari.endsWith("proven.cat"))
            {
                error = false;
            }
            
            return error;
            
            
            
    }

    private static boolean validarPassword(String password) {
        boolean error = true;
        
        if(password.contains(" "))
        {
            error = false;
        }
        
        if(password.length()<8)
        {
            error = false;
        }
        
        return error;
    }
    
}
