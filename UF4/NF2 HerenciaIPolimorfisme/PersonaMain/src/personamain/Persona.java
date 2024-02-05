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
    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    public static int num_personas; //global y comú (unica )
    private static final int mayor_edad=18, jubilado = 65;
    //a tots els objectes persona que es crein

    public Persona() {
        num_personas++;
    }

    
    
    // Constructor
    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni; //no canvia mai
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        num_personas++;
    }

    // Getters y setters
    public String getDni() {
        return dni;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (!nombre.isEmpty())
        {
            this.nombre = nombre;
        }
        
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
        return edad >= mayor_edad;
    }

    public boolean esJubilado() {
        return edad >= jubilado;
    }

    public int diferenciaEdad(Persona p) {
//        int resta;
//        if (edad>= p.getEdad())
//        {
//            resta = edad - p.getEdad();
//        }
//        else
//        {
//            resta = p.getEdad() - edad;
//        }
//        return resta;
        return Math.abs(this.edad - p.edad);
    }    

    public  int getNum_personas() {
        return num_personas;
    }
    
    /**
     * te que medir 9 de longitud i la ultima pisiucio numerica
     * @param dni
     * @return 
     */
    public static boolean validarDNI(String dni)
    {
        if(dni.length()!=9)
        {
            return false;
        }
        else
        {
            char num = dni.charAt(dni.length()-1);
            return Character.isDigit(num);
        }
    }
    
}
