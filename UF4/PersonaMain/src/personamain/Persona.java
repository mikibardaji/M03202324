/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personamain;

/**
 *
 * @author mabardaji
 */
public class Persona {
    // Atributos privados
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // Constructor
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Métodos adicionales
    public void imprime() {
        System.out.println("DNI: " + dni + " Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad);
    }

    public boolean esMayorEdad() {
        return edad >= 18;
    }

    public boolean esJubilado() {
        return edad >= 65;
    }

    public int diferenciaEdad(Persona p) {
        return Math.abs(this.edad - p.edad);
    }    
}
