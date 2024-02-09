/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exempleherencia;

/**
 *
 * @author mabardaji
 */
public class ExempleHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona people = new Persona("p1", "p1", "p1", "606");
        Alumne student = new Alumne("a1", "43730274S", "a1", "666",
                1, "DAW", 1);
        Profesor teacher 
                = new Profesor("nombre", "DNI", "direccion", "telefono", 1, "departament");
        
        System.out.println("Datos alumno "
        + student.getNombre() + "," + student.getDNI() + ", "
        + student.getN_expediente() + ", " + student.getCurso());
        
        student.codificarDNI();
        
          System.out.println("Datos alumno "
        + student.getNombre() + "," + student.getDNI() + ", "
        + student.getN_expediente() + ", " + student.getCurso()
          + " " + student.saludar());
        
        
        
        
        
        System.out.println("Datos Persona " 
        + people.getNombre() + "," + people.getDNI() + ", ");
        
        System.out.println("Datos Profesor " 
        + teacher.getNombre() + "," + teacher.getDNI() + ", "
        + teacher.getCodi_professor() + "-" + teacher.saludar());
        
    }
    
}
