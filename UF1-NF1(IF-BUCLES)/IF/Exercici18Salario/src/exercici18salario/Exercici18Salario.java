/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici18salario;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Exercici18Salario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas, h_extra; //Es enter perque no tractem amb mitjes hores
        final int HORAS_NORMAL = 40; //es enter perque no te sentit que sigui hores partides
        final double T_NORMAL = 20; //el fico double, perque et podrien pagar la hora a 10.5
        final double PRECIOS_EXTRA = 1.5;
        double salario, salario_extra, salario_normal; //
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantes hores has treballat?...");
        horas = sc.nextInt();

        if (horas>HORAS_NORMAL)
        { //tinc que pagar hores extres
            h_extra = horas - HORAS_NORMAL;
            //System.out.println("horas extra" + h_extra);
            salario_extra = h_extra*T_NORMAL*PRECIOS_EXTRA;
            salario_normal = HORAS_NORMAL*T_NORMAL;
            salario = salario_extra + salario_normal;
        }
        else
        { //tarifa normal
            //no definicio de variables
            salario = horas * T_NORMAL;
        }
        
        System.out.println("Tu salario BRUTO es... " + salario);
        final int SALARIO_SIN_IMPUESTOS = 500;
        final int SALARIO_TOPE_IMPUESTOS = 900;
        //double impuestos;
        double impuestos=0, impuestos_25;
        //double salario_neto;
        double salario_impuestos, salario_tope_impuestos;
        //calcul de impostos
        if(salario>SALARIO_TOPE_IMPUESTOS)
        { // he superado el tope y tengo que aplicar 45%
            salario_tope_impuestos = salario - SALARIO_TOPE_IMPUESTOS;
            impuestos = salario_tope_impuestos*0.45; //impuesto de lo que se pasa del tope
            salario_impuestos = SALARIO_TOPE_IMPUESTOS - SALARIO_SIN_IMPUESTOS;
            impuestos_25 = salario_impuestos * 0.25;
            impuestos = impuestos + impuestos_25 ;
        }
        else if (salario>SALARIO_SIN_IMPUESTOS &&
                salario < SALARIO_TOPE_IMPUESTOS)
        {//tengo que calcular los impuestos
            salario_impuestos = salario - SALARIO_SIN_IMPUESTOS;
            //System.out.println("salario a aplicar impuestos.... " + salario_impuestos);
            impuestos = (salario_impuestos * 25)/100; // * 0.25;
            System.out.println("         impuestos .... " + impuestos);
        }
        else // podria borrar el else porque no hace nada...
        {//no hay impuestos
          impuestos = 0;  
        }
        //salario_neto = salario - impuestos;
        salario = salario - impuestos;
        System.out.println("     Salario NETO .... " + salario);
        
    }
    
}
