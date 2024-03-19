/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebasempleado;

/**
 *
 * @author mabardaji
 */
public class SalariInvalidException extends Exception{
    private double salari;

    public SalariInvalidException(double salari) {
        this.salari = salari;
    }

    @Override
    public String toString() {
        return "SalariInvalidException el salario es menor que el SMI -> " + salari ;
    }
    
    
}
