/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package personamain;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Instancia de objetos Persona
        Persona persona1 = new Persona("per1", "per1", "per1", 50);
        Persona persona2 = new Persona("per2", "per2", "per2", 10);

        // Pedir datos por teclado
        Scanner scanner = new Scanner(System.in);
        Persona persona3 = new Persona();
        System.out.println("Introduce los datos para la Persona 1:");
        System.out.print("DNI: ");
        persona3.setDni(scanner.nextLine());
        System.out.print("Nombre: ");
        persona3.setNombre(scanner.nextLine());
        System.out.print("Apellidos: ");
        persona3.setApellidos(scanner.nextLine());
        System.out.print("Edad: ");
        persona3.setEdad(scanner.nextInt());
        scanner.nextLine(); // Consumir la nueva línea pendiente

//        System.out.println("\nIntroduce los datos para la Persona 2:");
//        System.out.print("DNI: ");
//        persona2.setDni(scanner.nextLine());
//        System.out.print("Nombre: ");
//        persona2.setNombre(scanner.nextLine());
//        System.out.print("Apellidos: ");
//        persona2.setApellidos(scanner.nextLine());
//        System.out.print("Edad: ");
//        persona2.setEdad(scanner.nextInt());

        // Mostrar mensajes por pantalla
        System.out.println("\nInformación de la Persona 1:");
        persona1.imprime();
        System.out.println("Es mayor de edad: " + persona1.esMayorEdad());
        System.out.println("Es jubilado: " + persona1.esJubilado());

        System.out.println("\nInformación de la Persona 2:");
        persona2.imprime();
        System.out.println("Es mayor de edad: " + persona2.esMayorEdad());
        System.out.println("Es jubilado: " + persona2.esJubilado());

        System.out.println("\nInformación de la Persona 3:");
        persona3.imprime();
        System.out.println("Es mayor de edad: " + persona3.esMayorEdad());
        System.out.println("Es jubilado: " + persona3.esJubilado());
        // Calcular y mostrar la diferencia de edad
        System.out.println("\nDiferencia de edad entre Persona 1 y Persona 2: " + persona1.diferenciaEdad(persona2));
        
        System.out.println("Persona existentes " + persona2.getNum_personas());
    }
    
}
