/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigousuario;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class CodigoUsuario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1,s2,s3;
        Scanner sc= new Scanner(System.in);
        System.out.println("pon tu nombre");
        s1 = sc.nextLine();
        System.out.println("pon tu apellido");
        s2 = sc.nextLine().toUpperCase();
        System.out.println("pon tu segundo apellido");
        s3 = sc.nextLine();
        
        s1 = s1.toUpperCase();
        s3 = s3.toUpperCase();
        String nombre_usuario = s1.substring(0, 3) + s2.substring(0,3)
                + s3.substring(0, 3);
        System.out.println("Nombre usuario " + nombre_usuario);
        
        
    }
    
}
