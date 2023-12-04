/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trileros;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class Trileros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //definició cubiletes
        char[] cubiletes = new char[3];
        //plenar amb X totes les posicion
        inicializarCubiletes(cubiletes);
        //colocar la bola en una posició
        colocarBola(cubiletes);
        //mostrar estado
        mostrarEstadoCubiletes(cubiletes);
        System.out.println("Aprieta enter para empezar");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        cambiarPosicion(cubiletes);
        
        boolean ganado = escogerDondeEsta(cubiletes);
        if (ganado)
        {
            System.out.println("Acertaste");
        }
        else
        {
            System.out.println("fallaste");
        }
        
        
        
        
    }
    
    private static void cambiarPosicion(char[] cubiletes)
    {
         int pos2,pos1;
         for (int i = 0; i < 1; i++) 
         { //faig el moviment 10 vegades
            pos1 = escogerPosicionAleatoria(cubiletes);
            do
            {
            pos2 = escogerPosicionAleatoria(cubiletes);
            }while(pos1==pos2); //hasta que sean diferentes

            char guardar = cubiletes[pos1];
            cubiletes[pos1] = cubiletes[pos2];
            cubiletes[pos2] = guardar;
            //System.out.println("cambio " + (pos1+1) + " por " + (pos2+1));   
            if ((pos1==1 && pos2==2)
               || (pos1==2 && pos2==1))
            {
                intercambiarposicion2con3();
            }
            else if((pos1==0 && pos2==1)
               || (pos1==1 && pos2==0))
            {
                intercambiarposicion1con2();
            }
            else
            {
                intercambiarposicion1con3();
            }
        }
        
    }
    private static void inicializarCubiletes(char[] cubiletes) {
        for (int i = 0; i < cubiletes.length; i++) {
            cubiletes[i] = 'X';
        }
        //una de les dues opcions
        Arrays.fill(cubiletes,'X');
        
    }

    /**
     * en una de las posiciones escogida aleatoriamente
     * ponemos la bola 'O'
     * @param cubiletes posiciones
     */
    private static void colocarBola(char[] cubiletes) {
        int pos = escogerPosicionAleatoria(cubiletes);
//        for (int i = 0; i < cubiletes.length; i++) {
//            if (i==pos)
//            {
//                cubiletes[i]='O';
//            }
//        }
        cubiletes[pos] = 'O';
    }

    /**
     * Me muestra donde esta la bola
     * @param cubiletes 
     */
    private static void mostrarEstadoCubiletes(char[] cubiletes) {
        for (int i = 0; i < cubiletes.length; i++) {
            System.out.print(cubiletes[i]);
            if (i<(cubiletes.length-1))
            { //la ultima posicio del array no entra aqui
                System.out.print("-");
            }
        }
        System.out.println("");//salt linea fina
    }

public static void dibujarCubiletesMostrando(char[] bolas) {
       
        limpiarConsola();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("  ***     ***     ***");
        System.out.println(" *   *   *   *   *   *");    
        System.out.println("******* ******* *******");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    public static void dibujarCubiletes() {
       
        limpiarConsola();
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("  ***     ***     ***");
        System.out.println(" *   *   *   *   *   *");    
        System.out.println("******* ******* *******");
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
    
    public static void intercambiarposicion1con3() {
       
        dibujarCubiletes();
        limpiarConsola();
         
         System.out.println("");
          System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *    ***    ");
        System.out.println("*******  *   *    ***");    
        System.out.println("        *******  *   *");
        System.out.println("                *******");
         System.out.println("");
          System.out.println("");
        limpiarConsola();
         System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******   ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******   ***");
        System.out.println("                 *   *");        
        System.out.println("                *******");        
         System.out.println("");
        limpiarConsola();
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                  ***");
        System.out.println("                 *   *");        
        System.out.println("                *******");        
        limpiarConsola();
        System.out.println("   ***");
        System.out.println("  *   *");
        System.out.println(" *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                 ***");
        System.out.println("                *   *");        
        System.out.println("               *******");        
        limpiarConsola();
        System.out.println("    ***");
        System.out.println("   *   *");
        System.out.println("  *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("                ***");
        System.out.println("               *   *");        
        System.out.println("              *******");        
        limpiarConsola();
        System.out.println("     ***");
        System.out.println("    *   *");
        System.out.println("   *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("               ***");
        System.out.println("              *   *");        
        System.out.println("             *******");        
        limpiarConsola();
        System.out.println("       ***");
        System.out.println("      *   *");
        System.out.println("     *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("             ***");
        System.out.println("            *   *");        
        System.out.println("           *******");        
        limpiarConsola();
        System.out.println("         ***");
        System.out.println("        *   *");
        System.out.println("       *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("           ***");
        System.out.println("          *   *");        
        System.out.println("         *******");        
        limpiarConsola();        
        System.out.println("           ***");
        System.out.println("          *   *");
        System.out.println("         *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("         ***");
        System.out.println("        *   *");        
        System.out.println("       *******");        
        limpiarConsola();    
        System.out.println("             ***");
        System.out.println("            *   *");
        System.out.println("           *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("       ***");
        System.out.println("      *   *");        
        System.out.println("     *******");        
        limpiarConsola();    
        System.out.println("               ***");
        System.out.println("              *   *");
        System.out.println("             *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("     ***");
        System.out.println("    *   *");        
        System.out.println("   *******");        
        limpiarConsola();    
        System.out.println("                 ***");
        System.out.println("                *   *");
        System.out.println("               *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("   ***");
        System.out.println("  *   *");        
        System.out.println(" *******");        
        limpiarConsola();            
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("                *******");
        System.out.println("          ***    ");
        System.out.println("         *   *          ");    
        System.out.println("        *******      ");
        System.out.println("  ***");
        System.out.println(" *   *");        
        System.out.println("*******");        
        limpiarConsola();    
       
         System.out.println("");
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("          ***   *******");
        System.out.println("         *   *          ");    
        System.out.println("  ***   *******      ");
        System.out.println(" *   *");
        System.out.println("*******");        
         System.out.println("");
       
        limpiarConsola();    
       
         System.out.println("");
          System.out.println("");
        System.out.println("                  ***");
        System.out.println("          ***    *   *");
        System.out.println("  ***    *   *  *******");    
        System.out.println(" *   *  *******      ");
        System.out.println("*******");
        System.out.println("");
        System.out.println("");
        dibujarCubiletes();


    }

    
    public static void intercambiarposicion1con2() {
       
        dibujarCubiletes();
        limpiarConsola();
         
        System.out.println("");
        System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *            ***");
        System.out.println("*******   ***    *   *");    
        System.out.println("         *   *  ******* ");
        System.out.println("        *******        ");
        System.out.println("");
        System.out.println("");
        limpiarConsola();
        
        System.out.println("");
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******           ***");
        System.out.println("                 *   *");    
        System.out.println("          ***   ******* ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola();
        System.out.println("  ***");
        System.out.println(" *   *");
        System.out.println("*******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("           ***");
        System.out.println("          *   *");        
        System.out.println("         *******");        
        limpiarConsola();
        System.out.println("   ***");
        System.out.println("  *   *");
        System.out.println(" *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("          ***");
        System.out.println("         *   *");        
        System.out.println("        *******");        
        limpiarConsola();       
        System.out.println("    ***");
        System.out.println("   *   *");
        System.out.println("  *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("         ***");
        System.out.println("        *   *");        
        System.out.println("       *******");        
        limpiarConsola();       
        System.out.println("     ***");
        System.out.println("    *   *");
        System.out.println("   *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("        ***");
        System.out.println("       *   *");        
        System.out.println("      *******");        
        limpiarConsola();       
 
        System.out.println("      ***");
        System.out.println("     *   *");
        System.out.println("    *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("       ***");
        System.out.println("      *   *");        
        System.out.println("     *******");        
        limpiarConsola();       
        System.out.println("       ***");
        System.out.println("      *   *");
        System.out.println("     *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("      ***");
        System.out.println("     *   *");        
        System.out.println("    *******");        
        limpiarConsola();       
        System.out.println("        ***");
        System.out.println("       *   *");
        System.out.println("      *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("     ***");
        System.out.println("    *   *");        
        System.out.println("   *******");        
        limpiarConsola();             
        System.out.println("         ***");
        System.out.println("        *   *");
        System.out.println("       *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("    ***");
        System.out.println("   *   *");        
        System.out.println("  *******");        
        limpiarConsola();     
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******");
        System.out.println("                  *** ");
        System.out.println("                 *   *  ");    
        System.out.println("                *******");
        System.out.println("  ***");
        System.out.println(" *   *");        
        System.out.println("*******");        
        limpiarConsola();   
                 
          System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******   *** ");
        System.out.println("                 *   *  ");    
        System.out.println("  ***           *******");        
        System.out.println(" *   *");        
        System.out.println("*******");        
                 
          System.out.println("");
        limpiarConsola();     
          System.out.println("");
          System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *    *** ");
        System.out.println("  ***   *******  *   *  ");    
        System.out.println(" *   *          *******");        
        System.out.println("*******");        
                 System.out.println("");
          System.out.println("");   

        dibujarCubiletes();


    }
    

    public static void intercambiarposicion2con3() {
       
        dibujarCubiletes();
        limpiarConsola();
         
        System.out.println("");
        System.out.println("");
        System.out.println("                  *** ");
        System.out.println("  ***            *   *");
        System.out.println(" *   *    ***   ******* ");    
        System.out.println("*******  *   *         ");
        System.out.println("        *******        ");
        System.out.println("");
        System.out.println("");
        limpiarConsola();
        
        
        
        System.out.println("");
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("  ***           *******");
        System.out.println(" *   *                ");    
        System.out.println("*******   ***           ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola();
        System.out.println("                  ***");
        System.out.println("                 *   *");
        System.out.println("                *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("          ***           ");
        System.out.println("         *   *        ");        
        System.out.println("        *******        ");                 
        System.out.println("");
        limpiarConsola();
        System.out.println("                 ***");
        System.out.println("                *   *");
        System.out.println("               *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("           ***           ");
        System.out.println("          *   *        ");        
        System.out.println("         *******        ");                 
     
        limpiarConsola(); 
        System.out.println("                ***");
        System.out.println("               *   *");
        System.out.println("              *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("            ***           ");
        System.out.println("           *   *        ");        
        System.out.println("          *******        ");                 

        limpiarConsola(); 
        System.out.println("               ***");
        System.out.println("              *   *");
        System.out.println("             *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("             ***           ");
        System.out.println("            *   *        ");        
        System.out.println("           *******        ");                 

        limpiarConsola(); 
        System.out.println("              ***");
        System.out.println("             *   *");
        System.out.println("            *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("              ***           ");
        System.out.println("             *   *        ");        
        System.out.println("            *******        ");                 

        limpiarConsola(); 
        System.out.println("             ***");
        System.out.println("            *   *");
        System.out.println("           *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("               ***           ");
        System.out.println("              *   *        ");        
        System.out.println("             *******        ");                 

        limpiarConsola(); 
        System.out.println("            ***");
        System.out.println("           *   *");
        System.out.println("          *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("                ***           ");
        System.out.println("               *   *        ");        
        System.out.println("              *******        ");
        limpiarConsola(); 
        System.out.println("           ***");
        System.out.println("          *   *");
        System.out.println("         *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("                 ***           ");
        System.out.println("                *   *        ");        
        System.out.println("               *******        ");                 
        
        limpiarConsola(); 
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("        *******");
        System.out.println("  ***                  ");
        System.out.println(" *   *                ");    
        System.out.println("*******               ");
        System.out.println("                  ***           ");
        System.out.println("                 *   *        ");        
        System.out.println("                *******        ");                 
        
        limpiarConsola(); 
        System.out.println("");
        System.out.println("          ***");
        System.out.println("         *   *");
        System.out.println("  ***   *******        ");
        System.out.println(" *   *                ");    
        System.out.println("*******           *** ");
        System.out.println("                 *   *        ");        
        System.out.println("                *******        ");                 
        System.out.println("");
        
        limpiarConsola(); 
        System.out.println("");
        System.out.println("");
        System.out.println("          ***");
        System.out.println("  ***    *   *        ");
        System.out.println(" *   *  *******   *** ");    
        System.out.println("*******          *   *");
        System.out.println("                *******        ");                 
        System.out.println("");
        
        dibujarCubiletes();


    }


    
    
    public static void limpiarConsola() {
       try {
           Thread.sleep(100);
           for (int i = 0; i < 10; i++) {
               System.out.println("");
           }
       } catch (InterruptedException ex) {
           System.out.println("no sleep");
       }
    
    }

    private static int escogerPosicionAleatoria(char[] cubiletes) {
        int min = 0;
        int max = cubiletes.length-1; //d'aquesta manera
        //si augmenten els cubiletes segueixen funcionant
        int range = (max-min)+1;
        int pos = (int)(Math.random()*range)+min;
        return pos;
    }

    private static boolean escogerDondeEsta(char[] cubiletes) {
          Scanner sc = new Scanner(System.in);
          int pos;
          
          do
          {
              System.out.println("Donde esta la pelotita?");
              pos = sc.nextInt();
          }while(pos<1 || pos>3);
          //pos-1 es para pasarla a lenguaje programacion
          //la primera posicion es 0
          if (cubiletes[pos-1]=='O')
          {
              return true;
          }
          else
          {
              return false;
          }
          
          
    }
    
    
    
    
    
    
    
}