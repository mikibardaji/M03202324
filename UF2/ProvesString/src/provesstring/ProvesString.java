/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package provesstring;

import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class ProvesString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        char letra=' ';
        String frase="hsoLAssssss";
        System.out.println("--"+ frase + "--");
        String frase2="";
        Scanner sc = new Scanner(System.in);
        
        //longitudCadena(frase);
        //sustituirLetras(frase);
        //recortarFrase(frase);
        //devuelveCodigoHash(frase);
        //quitarEspacios(frase);
        //pasarMayusculaMinuscula(frase);
        //sabersiacaba(frase,sc);
        //ordenarAlfabeticamente(frase);
        //unirDosfrases(frase);
        //leerCaracterPosicion(frase);
        //convierteBoolean(frase);
        agafarSequencia(frase);
        //metodeEquals(letra,frase,frase2,sc);
        
    }

    private static void metodeEquals(char letra, String frase, String frase2, Scanner sc) {
        letra = frase.charAt(2);
        System.out.println(letra + "-" + frase);
        System.out.println("Pon una frase y la repetire");
        frase = sc.nextLine();
        System.out.println("Dime una posici�n y te mostrare la letra en esa posici�n");
        int pos = sc.nextInt();
        letra = frase.charAt(pos);
        System.out.println("->"+letra + "-" + frase);
        System.out.println("Pon una segunda frase y las comparare");
        //limpio buffer y el caracter enter/return colgado nextint()
        sc.nextLine();
        frase2 = sc.nextLine();
        if(frase.equals(frase2))
        {
            System.out.println("iguales");
        }
        else
        {
            System.out.println("Diferentes");
        }
    }

    private static void longitudCadena(String frase) {
        int largo_palabra = frase.length();
        System.out.println("Tu palabra tiene " + largo_palabra);
    }

    private static void sustituirLetras(String frase) {
           String nueva_frase=frase.replace('s', 'S');
           System.out.println(nueva_frase);
    }

    private static void recortarFrase(String frase) {
        System.out.println("substring(3)-> "+ frase.substring(3));
        System.out.println("substring(3,5)-> "+ frase.substring(3,5));
    }

    private static void devuelveCodigoHash(String frase) {
        //String nom="ola";
        int codigoHash = frase.hashCode();
        System.out.println("Codigo hash "+ codigoHash);
    }

    private static void quitarEspacios(String frase) {
        String sinEspacios = frase.trim();
        System.out.println(sinEspacios);
    }

    private static void pasarMayusculaMinuscula(String frase) {
        System.out.println("frase.toLowerCase()-"+frase.toLowerCase());
        System.out.println("frase.toUpperCase()" + frase.toUpperCase());
    }

    private static void sabersiacaba(String frase, Scanner sc) {
        System.out.println("Fica el final o el principi");
        String retall = sc.nextLine();
        if (frase.endsWith(retall))
        {
            System.out.println("Termina igual");
        }
        else if (frase.startsWith(retall))
        {
            System.out.println("Empieza igual");
        }
        
        
    }

    private static void ordenarAlfabeticamente(String frase) {
        String otrafrase = "zaaa";
        System.out.println("->"+ otrafrase.compareTo(frase));
        if(frase.compareTo(otrafrase)==0)
        {
            System.out.println("iguales");
        }
        else if(frase.compareTo(otrafrase)>0)
        {
            System.out.print("La frase " + otrafrase);
            System.out.println(" es antes que " + frase);
        }
        else
        {
            System.out.print("La frase " + frase);
            System.out.println(" es antes que " + otrafrase);
        }
        
        
    }

    private static void unirDosfrases(String frase) {
        String otrafrase = "zaaa";
        String resultado = frase.concat(otrafrase);
        System.out.println(resultado);
        
    }

    private static void leerCaracterPosicion(String frase) {
        for (int i = 0; i < frase.length(); i++) {
            System.out.println(frase.charAt(i));
            if (frase.charAt(i)=='A')
            {
                System.out.println("a encontrada");
            }
        }
    }

    private static void convierteBoolean(String frase) {
        boolean v1=true;
        boolean v2=false;
        System.out.println("-->"+frase.valueOf(v2));
        
        
    }

    private static void agafarSequencia(String frase) {
        System.out.println(frase.subSequence(0, 2));
    }
    
}
