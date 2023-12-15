/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alexa;

import java.util.Calendar;
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
                    salir=darBuenasNoches(nombre);   
                }
                else if(instruccion_ok.equalsIgnoreCase("Canta cancion"))
                {
                    cantarCancion();
                }
                else if(instruccion_ok.equalsIgnoreCase("Dime edad"))
                {
                    dimeMiEdad();
                } 
                else if(instruccion_ok.equalsIgnoreCase("A que dia estamos"))
                {
                    diaEstamos();
                }
                else if(instruccion_ok.startsWith("Habla con la "))
                {
                    decirFraseConLetra(instruccion_ok);
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
        //System.out.println("Recortada " + instruccion_real);
        return instruccion_real;
    }

    private static void darBuenosdias(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static boolean darBuenasNoches(String nombre) {
        return true;
    }

    private static void cantarCancion() {
        for (int i = 2; i <= 10; i++) {
            System.out.println(i+" elefantes.... ");
        }
    }

    /**
     * pide el a?o  de nacimiento y calcula la edad que tiene el usuario
     */
    private static void dimeMiEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuando naciste");
        Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        int toyear = sc.nextInt();
        year -= toyear; //calculo edad
        System.out.println("Tu edad es " + year + " a?os.");
    }

    private static void diaEstamos() 
    {
        Calendar cal= Calendar.getInstance();
        int date = cal.get(Calendar.DATE);
        System.out.println("estamos a dia " + date);
    }

    private static void decirFraseConLetra(String instruccion_ok) {
        String inicio_frase = "Habla con la ";
        String recorte = instruccion_ok.substring(inicio_frase.length());
        System.out.println("recorte -> " + recorte);
        //letra y di FRASE = E y di hola que tal
        char letra_sustituir = recorte.charAt(0);
        System.out.println("letra " + letra_sustituir);
        String parte_recortar = "E y dime ";
        String frase = recorte.substring(parte_recortar.length());
        System.out.println("frase a canviar-> " + frase);
        char[] letras = {'a','e','i','o','u'};
       // String letras_frase = Arrays.
        String Hector = "aeiou";
        String frase_minuscula = frase.toLowerCase();
        for (int i = 0; i < letras.length; i++) {
            frase_minuscula = frase_minuscula.replace(Hector.charAt(i), letra_sustituir);
        }
        System.out.println(frase_minuscula);
 
        
        
    }
    
}
