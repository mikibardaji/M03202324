/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizacionfutbol;

/**
 *
 * @author mabardaji
 */
public abstract class EquipoFutbol implements Persona{
    private int id;
    protected String nombre;
    private int edad;
    protected int salario;

    public EquipoFutbol(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }
   
    public void viajar()
    {
        System.out.println(this.nombre + " estoy viajando en avión... ");
    };
    public void concentrarse()
    {
        System.out.println(this.nombre + " estoy en el hotel concentrado");
    };


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof EquipoFutbol)) {
            return false;
        }
        final EquipoFutbol other = (EquipoFutbol) obj;
        return this.id == other.id;
    }

    @Override
    public void saludar()
    {
        System.out.println(nombre + "Hola como estas ");
    }

    @Override
    public String toString() {
        return  "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSalario() {
        return salario;
    }
    
    
    
}
