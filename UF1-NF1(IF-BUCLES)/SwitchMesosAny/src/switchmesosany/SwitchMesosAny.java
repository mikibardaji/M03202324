/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchmesosany;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class SwitchMesosAny {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon la letra del mes...");
        mes = sc.next().charAt(0);
        
        
        
        switch (mes) {
            case 'e':
            case 'E':    
                System.out.println("Enero");
                break;
            case 'f':
            case 'F':
                System.out.println("febrero");
                break;  
            case 'm':
            case 'M':    
                System.out.println("Marzo");
                break;
            case 'a':
            case 'A':    
                System.out.println("Abril");
                break;
                
            default:
                System.out.println("Letra no valida");
                break;
        }
    }
    
}
