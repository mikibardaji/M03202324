/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mabardaji
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CuentaBancaria> Banco = new ArrayList();
        
        Banco.add(new CuentaCorriente());
        Banco.add(new CuentaAhorro());
        Banco.add(new CuentaAhorro());
        Banco.add(new CuentaAhorro());
    }
    
}
