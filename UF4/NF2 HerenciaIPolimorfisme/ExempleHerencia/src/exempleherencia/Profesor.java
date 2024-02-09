/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exempleherencia;

/**
 *
 * @author mabardaji
 */
public final class Profesor extends Persona{
    private int codi_professor;
    private String departament;
    private String modulos;
    private String horarios;

    public Profesor(String nombre, String DNI, String direccion, String telefono,
            int codi_professor, String departament) {
        super(nombre, DNI, direccion, telefono); //aprofito codi pare
        this.codi_professor = codi_professor; //meu codi
        this.departament = departament;
    }

    /**
     * Devuelve el codigo interno del instituto para el profesor
     * @return codigo profesor
     */
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

    @Override
    public String toString() {
        String persona = super.toString();
        return persona + "departament=" + departament + ", modulos=" + modulos + '}';
    }

    
    

    
//    @Override
//    public String saludar() {
//        return super.saludar()  + " Com ha anat el cap de setmana?"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
//    }
    
    
    
   
    
    
}
