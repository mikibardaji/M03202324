/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasempleado;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mabardaji
 */
public class PruebasEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleat e1 = new Empleat();
        try {
            e1.setSalari(15000);
        } catch (SalariInvalidException ex) {
            System.out.println(ex); //toString
        }
        String s1;
        
        try {
            e1.setDepartment("Inventat");
        } catch (DepartamentInvalidException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            Empleat e2 = new Empleat("e2", 0, "Informatica");
        } catch (SalariInvalidException ex) {
            System.out.println("empleat e2");
            System.out.println(ex); //toString    
        } catch (DepartamentInvalidException ex) {
            System.out.println("empleat e2");
            System.out.println(ex.getMessage());
        }
        try {
            Empleat e3 = new Empleat("sddd", 25000,"Informatica");
            System.out.println("E3 correcte");
            Empleat e4 = new Empleat(e3);
            
        } catch (SalariInvalidException ex) {
            System.out.println("empleat e3");
            System.out.println(ex); //toString 
        } catch (DepartamentInvalidException ex) {
            System.out.println("empleat e3");
            System.out.println(ex.getMessage());  
        }
                
        
    }
    
}
