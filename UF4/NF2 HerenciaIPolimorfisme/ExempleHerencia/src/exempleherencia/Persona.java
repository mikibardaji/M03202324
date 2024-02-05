/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exempleherencia;

/**
 *
 * @author mabardaji
 */
public class Persona {
    protected String nombre; //privada excepto para clases hijas
    protected String DNI; //
    private String direccion; //pot ser private, si clase filla no la utiliza /manipula
    private String telefono;

    public Persona(String nombre, String DNI, String direccion, String telefono) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
    
}
