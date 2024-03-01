/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package excepcionesusuario;

/**
 *
 * @author mabardaji
 */
public class ExcepcionPropia extends Exception{
    int num;

    
    public ExcepcionPropia(int num) {
        this.num = num;
    }

    public ExcepcionPropia(String message) {
        super(message);
    }
    
    
    
    @Override
    public String toString() {
        return "La excepcion se ha provocado por el valor " + num ;
    }


}
