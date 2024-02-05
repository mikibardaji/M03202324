/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exempleherencia;

/**
 *
 * @author mabardaji
 */
public class Profesor extends Persona{
    private int codi_professor;
    private String departament;
    private String modulos;
    private String horarios;

    public Profesor(String nombre, String DNI, String direccion, String telefono,
            int codi_professor, String departament) {
        super(nombre, DNI, direccion, telefono);
        this.codi_professor = codi_professor;
        this.departament = departament;
    }

    public int getCodi_professor() {        
        return codi_professor;
    }

    public String getDepartament() {
        return departament;
    }

    public String getModulos() {
        return modulos;
    }

    public String getHorarios() {
        return horarios;
    }
    
    
    
   
    
    
}
