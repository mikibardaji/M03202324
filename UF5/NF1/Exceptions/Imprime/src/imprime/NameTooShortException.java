/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imprime;

/**
 *
 * @author mabardaji
 */
public class NameTooShortException extends Exception {
    private String name;

    public NameTooShortException(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "El nombre no tiene 3 caracteres => " + name ;
    }
    
    
}
