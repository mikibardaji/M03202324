/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizacionfutbol;

/**
 *
 * @author mabardaji
 */
public abstract class Equipo extends EquipoFutbol{
    protected static final int SALARIO_MINIMO=1500;
    
    public Equipo(int id, String nombre, int edad) {
        super(id, nombre, edad);
        salario = SALARIO_MINIMO;
    }
    
    public abstract void entrenar();
}
