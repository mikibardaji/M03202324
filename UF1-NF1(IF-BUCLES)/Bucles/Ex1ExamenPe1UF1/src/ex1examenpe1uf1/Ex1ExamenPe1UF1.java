/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1examenpe1uf1;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex1ExamenPe1UF1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioFinal, precioEntrada, descuento=0;
        char temporada,tipoCliente;
        boolean error = false;
        final double DESCUENTO_ADULT_BAJA = 0.05,
                DESCUENTO_ADULT_ALTA = 0,DESCUENTO_JUBILADO_BAJA = 0.15,
                DESCUENTO_JUBILADO_ALTA = 0.15;
        System.out.print("Introduce el precio de la entrada: ");
        precioEntrada = sc.nextDouble();

        System.out.print("Estamos en temporada alta (t) o temporada baixa (x): ");
        temporada = sc.next().charAt(0);

        System.out.print("Eres adulto (a) o jubilado (j): ");
        tipoCliente = sc.next().charAt(0);

        if (temporada=='t')
        {
            if (tipoCliente=='a')
            {
                descuento = DESCUENTO_ADULT_ALTA;
            }
            else if (tipoCliente=='j')
            {
                descuento = DESCUENTO_JUBILADO_ALTA;
            }
            else
            {
                System.out.println("Tipo cliente erroneo");
                error = true;
            }
        }
        else if (temporada == 'x')
        {
            if (tipoCliente=='a')
            {
                descuento = DESCUENTO_ADULT_BAJA;
            }
            else if (tipoCliente=='j')
            {
                descuento = DESCUENTO_JUBILADO_BAJA;
            }
            else
            {
                System.out.println("Tipo cliente erroneo");
                error = true;                                
            }
        }
        else
        {
            System.out.println("Temporada opcion incorrecta");
                error = true;            
        }
            
        if (!error)
        {
            descuento = descuento * precioEntrada; //obtengo el descuento que voy a aplicar
           //precioEntrada = precioEntrada - descuento;
           precioEntrada -= descuento;

           System.out.println("Precio final->" + precioEntrada);   
        }
        
    }
    
}
