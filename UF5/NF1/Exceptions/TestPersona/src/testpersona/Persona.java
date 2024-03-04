/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpersona;

/**
 *
 * @author mabardaji
 */
public class Persona {
    private String nombre;
    private String DNI;

    public Persona(String nombre, String DNI) throws InvalidDNIException {
        this.nombre = nombre;
        this.setDNI(DNI);
    }

    public void setDNI(String DNI) throws InvalidDNIException {
        if (DNI.length()!=9)
        {
            throw new InvalidDNIException("Longitud erronea DNI");
        }
        float digitos;
        try
        {
            digitos = Float.parseFloat(DNI);
        }
        catch (NumberFormatException ex)
                {
                    throw new InvalidDNIException("8 primeros caracterares"
                            + "deben de ser numeros");
                }
        
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int residuo = (int) digitos%23;
        if (letras.charAt(residuo) != DNI.charAt(8))
        {
             throw new InvalidDNIException("Letra no coincide");
        }
        
        this.DNI = DNI;
    }
    
    
}
