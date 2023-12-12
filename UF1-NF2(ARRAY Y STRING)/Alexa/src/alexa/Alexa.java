/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexa;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Alexa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, instruccion_larga, instruccion_ok;
        boolean salir=false;
        nombre = solicitarNombre();
        
        do{
            instruccion_larga = solicitarInstruccion();
            if (empiezaPorAlexa(instruccion_larga))
            {
                instruccion_ok = recortarInstruccion(instruccion_larga);
                //instruccion ok ya no tiene ALEXA 
                if (instruccion_ok.equalsIgnoreCase("Buenos dias"))
                {
                    darBuenosdias(nombre);
                }
                else if(instruccion_ok.equalsIgnoreCase("Buenas noches"))
                {
                    salir=true;
                    darBuenasNoches(nombre);
                }
                         
            }
        
        }while(!salir);
        
    }

    /**
     * pide al usuario que se identifique por su nombre
     * @return el nombre del usuario
     */
    private static String solicitarNombre() {
           Scanner sc = new Scanner(System.in);
           System.out.println("Hola, dime tu nombre... ");
           String nombre = sc.nextLine();
           return nombre;
    }

    /** verifica que empieza por alexa el string pasado
     * 
     * @return true si empieza por alexa
     */
    private static boolean empiezaPorAlexa(String instruccion) {
        String mayusculas = instruccion.toUpperCase();
        return mayusculas.startsWith("ALEXA ");
      //  String inicio = "ALEXA ";
      //  String inst_inici = instruccion.substring(0, inicio.length());
      //  return inst_inici.equalsIgnoreCase(inicio);
    }

    /**
     * espera la instrucción
     * @return instrucción escrita por usuario
     */
    private static String solicitarInstruccion() {
        Scanner sc = new Scanner(System.in);
           System.out.println("Esperando instrucción... ");
           String instruction = sc.nextLine();
           return instruction;
    }

    /**
     * La instrucción la recorta con la parte ALEXA y se queda con la parte
     * que es la instruccion
     * @param instruccion_larga
     * @return 
     */
    private static String recortarInstruccion(String instruccion_larga) {
        String inicio = "ALEXA ";
        String instruccion_real = instruccion_larga.substring(inicio.length());
        System.out.println("Recortada " + instruccion_real);
        return instruccion_real;
    }

    private static void darBuenosdias(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void darBuenasNoches(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
