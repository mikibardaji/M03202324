/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10validarfecha;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Ex10ValidarFecha {

    /**
     * Realiza un programa que lea una fecha introduciendo el día, mes y año por separado y nos diga
       si la fecha es correcta o no. Supondremos que todos los meses tienen 30 días. Se debe crear una
       función donde le pasemos los datos y devuelva si es correcta o no.
     */
    public static void main(String[] args) {
        int dia, mes, anyo;
        boolean diaValido, mesValido, anyoValido;
        System.out.print("Introduce dia... ");
        dia = pedirDatoEnteroPositivo();
        System.out.print("Introduce mes... ");
        mes = pedirDatoEnteroPositivo();
        System.out.print("Introduce año... ");
        anyo = pedirDatoEnteroPositivo();
        
        diaValido = validaDia(dia);
        mesValido = validaMes(mes);
        anyoValido = validaAnyo(anyo);
        
        //if (diaValido==true && mesValido==true && anyoValido==true)
        if (diaValido && mesValido && anyoValido==true)
        {
            System.out.println("Fecha correcta");
        }
        else
        {
            System.out.println("Fecha incorrecta");
        }
        
        
    }
    
    /**
     * pide por consola un valor que debe ser superior a 0
     * @return valor introducido válido
     */    
    public static int pedirDatoEnteroPositivo() {
          Scanner sc = new Scanner(System.in); 
          int num;
          do
          {
            System.out.print("El valor superior a 0... ");
            num = sc.nextInt();
          }while(num<=0);
          return num;
    }
    
    /**
     * valida que el dia sea valido debe estar entre 1 y 30
     * @param dia
     * @return true si es vcalido false si no es valido
     */
    public static boolean validaDia(int dia)
    {
        if(dia>=1 && dia<=30)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * valida que el mes sea valido tiene que estar entre  1 al 12
     * @param mes
     * @return true si es un mes valido
     */
    public static boolean validaMes(int mes)
    {
        //podria ser solo return mes>0 && mes<=12;
        if(mes>0 && mes<=12)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * valida que el año sea valido superior o igual a 1900
     * @param any
     * @return true si es valido
     */
    public static boolean validaAnyo(int any)
    {
        return any>=1900;
    }
    
}
