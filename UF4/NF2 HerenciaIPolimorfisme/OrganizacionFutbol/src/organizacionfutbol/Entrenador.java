/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package organizacionfutbol;

/**
 *
 * @author mabardaji
 */
public class Entrenador extends Equipo{
    private boolean tiene_titulo;
    
    public Entrenador( int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.tiene_titulo = true;
    }

    public Entrenador(boolean tiene_titulo, int id, String nombre, int edad) {
        super(id, nombre, edad);
        this.tiene_titulo = tiene_titulo;
    }

    public void dirigirPartido()
    {
        System.out.println("Dirigiendo el partido");   
    }

    @Override
    public void entrenar() {
        System.out.println(this.nombre + " dirijo el entreno y les hago hacer flexiones");
    }

    public boolean isTiene_titulo() {
        return tiene_titulo;
    }
    
    
}
