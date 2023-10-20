/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expincajero;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ExPinCajero {

    /**
     * Dibuja un ordinograma que pida introducir Pin hasta 3 veces: 
     * Simularemos la entrada de un portal de un banco donde te pide un pin (el pin sera 1234), 
     * te ha de pedir el pin hasta que adivinar el pin, o al tercer golpe 
     * tiene terminar diciendo que se ha sobrepasado el número máximo de intentos.
     */
    public static void main(String[] args) {
        final int PIN_OK = 1234;
        int intentos=0, pin_introducido;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        do{
        System.out.println("Pon el pin de la tarjeta");
        pin_introducido = sc.nextInt();
        ++intentos;
        if (pin_introducido!=PIN_OK)
        {
            System.out.println("Pin incorrecto... ");
        }
        if (pin_introducido==PIN_OK) // || intentos>=3)
        {
            salir=true;
        }
        if (intentos>=3)
        {
            salir=true;
        }
        
        }while(salir==false); //}while(!salir);
// opcion 2
//        do{
//        System.out.println("Pon el pin de la tarjeta");
//        pin_introducido = sc.nextInt();
//        ++intentos;
//        if (pin_introducido!=PIN_OK)
//        {
//            System.out.println("Pin incorrecto... ");
//        }
//        }while(pin_introducido!=PIN_OK && intentos<3);
        //si hi ha dos condicions per sortir 
        //haig de saber per quina condició he sortit
        if (pin_introducido==PIN_OK)
        {
            System.out.println("Puedes sacar dinero... ");
        }
        else
        {
            System.out.println("Tarjeta bloqueada");
        }
        
    }
    
}
