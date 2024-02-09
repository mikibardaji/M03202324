/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exempleherencia;

/**
 *
 * @author mabardaji
 */
public class Alumne extends Persona{
    private int n_expediente;
    private String ciclo;
    private int Curso;
    private int nota_media;

    public Alumne(String nombre, String DNI, String direccion, String telefono,
            int n_expediente, String ciclo, int Curso) 
    {
        super(nombre, DNI, direccion, telefono);
        this.n_expediente = n_expediente;
        this.ciclo = ciclo;
        this.Curso = Curso;
        this.nota_media=0;
    }

    

    public int getN_expediente() {
        return n_expediente;
    }

    public String getCiclo() {
        return ciclo;
    }

    public int getCurso() {
        return Curso;
    }

    public int getNota_media() {
        return nota_media;
    }
    
    
    public void codificarDNI()
    {
        //DNI es protected no private
        String ultimos_digitos = this.DNI.substring(this.DNI.length()-2);
        //si el atributo se mantiene privado
        String ultimos_digitos2 = this.getDNI().substring(this.getDNI().length()-2);
        //canvio para codificarlo
        this.DNI = "XXXXXXX" + ultimos_digitos;
    }

//    @Override
//    public String saludar() {
//        return "Que tal bro! "; 
//    }
    
    
}
