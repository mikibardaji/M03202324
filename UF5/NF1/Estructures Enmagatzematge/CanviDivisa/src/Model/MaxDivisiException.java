/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Model;

/**
 *
 * @author mabardaji
 */
public class MaxDivisiException extends Exception {

    /**
     * Creates a new instance of <code>MAXDIVISAEXCEPTION</code> without detail
     * message.
     */
    public MaxDivisiException(int num) {
         super("Capacidad de guardar superada"+ num );
    }

}
