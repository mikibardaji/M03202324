/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasempleado;

/**
 *
 * @author mabardaji
 */
public class DepartamentInvalidException extends Exception {

    public DepartamentInvalidException(String message) {
        super("departamento incorrecto solo son validos informatica, comercial y direcccion " + message);
    }
    
    //e.getMesagge
    
}
