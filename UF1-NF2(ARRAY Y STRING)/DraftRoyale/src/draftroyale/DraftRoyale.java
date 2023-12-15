/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package draftroyale;

import java.util.Scanner;

/**
 *
 * enunciado https://docs.google.com/document/d/1uHBctIzmhVzl99Ax9JR3fMameCPkJDsgUoqYaakWswY/edit?usp=sharing
 */
public class DraftRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] tu_mazo = new String[8]; //cartas escogidas por el usuario
       String[] todas_cartas = new String[61];
       inicializarMazos(tu_mazo);
       inicializarMazos(todas_cartas);
      
       ponerTodasCartas(todas_cartas);
       llenar_mazo(todas_cartas,tu_mazo); 
       mostrarMazo(tu_mazo);
       
    }

    private static void inicializarMazos(String[] deck) {
            for (int i = 0; i < deck.length; i++) {
            deck[i] = "";
        }
    }

    /**
     * funcion que pone todas las cartas de clash royale en el array
     * @param todas_cartas 
     */
    private static void ponerTodasCartas(String[] todas_cartas) {
            todas_cartas[0]="El tronco";
    todas_cartas[1]="Bola de fuego";
    todas_cartas[2]="Valquiria";
    todas_cartas[3]="Megacaballero";
    todas_cartas[4]="Ejército de esqueletos";
    todas_cartas[5]= "Flechas";
    todas_cartas[6]= "Montapuercos";
    todas_cartas[7]= "Barril de duendes";
    todas_cartas[8]= "Mini P.E.K.K.A";
    todas_cartas[9]= "Lanzafuegos";
    todas_cartas[10]= "Principito";
    todas_cartas[11]= "Caballero";
    todas_cartas[12]= "Descarga";
    todas_cartas[13]= "Bruja";
    todas_cartas[14]= "Mago";
    todas_cartas[15]= "Pol Bandido";
    todas_cartas[16] = "Espiritu de hielo";
    todas_cartas[17] = "Mago eléctrico";
    todas_cartas[18] = "Murciélagos";
    todas_cartas[19] = "Pandilla de duendes";
    todas_cartas[20] = "P.E.K.K.A";
    todas_cartas[21]= "Principe oscuro";
    todas_cartas[22]= "Bebé dragón";
    todas_cartas[23]= "Mosquetera";
    todas_cartas[24]= "Esqueletos";
    todas_cartas[25]= "Princesa";
    todas_cartas[26]= "Torre Tesla";
    todas_cartas[27]= "Príncipe";
    todas_cartas[28]= "Torre infernal";
    todas_cartas[29]= "Globo bombástico";
    todas_cartas[30]= "Ca?on";
    todas_cartas[31]= "Arqueras";
    todas_cartas[32]= "Bárbaros de élite";
    todas_cartas[33]= "Esbirros";
    todas_cartas[34]= "Furia";
    todas_cartas[35]= "Minero";
    todas_cartas[36]= "Bandida";
    todas_cartas[37]= "Duende lanzadardos";
    todas_cartas[38]= "Ejercito de Adristoni marti";
    todas_cartas[39]= "montesinos";
    todas_cartas[40] = "Alvaro";
    todas_cartas[41]= "Alvaro electrico";
    todas_cartas[42]= "Torne";
    todas_cartas[43]= "Recuero";
    todas_cartas[44]= "Alvaro montapuercos";
    todas_cartas[45]= "Alvaro de fuego";
    todas_cartas[45] = "Ariete de batallami mama";
    todas_cartas[46] = "Javier";
    todas_cartas[47] = "Javier magico";
    todas_cartas[48] = "Javier destructor";
    todas_cartas[49] = "Javier dorado";
    todas_cartas[50] = "Javier acuatico";    
    todas_cartas[51] = "princesa";
    todas_cartas[52] = "caballeroRompemuros";
    todas_cartas[53] = "Esqueleto gigante";
    todas_cartas[54] = "Guardias";
    todas_cartas[55] = "Chispitas";
    todas_cartas[56] = "Gigante";
    todas_cartas[57] = "7Gigante noble";
    todas_cartas[58] = "Lapida";
    todas_cartas[59] = "Verdugo";
    todas_cartas[60] = "Bombardero";
    }

    /**
     * escogera entre dos cartas aleatorias y la escogida se pondra en tu mazo
     * @param todas_cartas existentes
     * @param tu_mazo mazo
     */
    private static void llenar_mazo(String[] todas_cartas, String[] tu_mazo) {
         Scanner sc = new Scanner(System.in);
         int cartas_tengo =0,eleccion,carta1,carta2; //contador de cartas que tengo en el mazo
         do{
            do{
             carta1 = carta_aleatoria(todas_cartas.length);
            }while(existeEnMazo(tu_mazo,todas_cartas[carta1]));
            do{
                carta2 = carta_aleatoria(todas_cartas.length);
            }while(existeEnMazo(tu_mazo,todas_cartas[carta2]));
            
         
            System.out.println("Escoge entre " + carta1 + "-" + todas_cartas[carta1]
            + " y "  + carta2 + "-" + todas_cartas[carta2]);
            System.out.println("Que carta quieres?");
            eleccion = sc.nextInt();
            System.out.println("has escogido " + eleccion);
            tu_mazo[cartas_tengo] = todas_cartas[eleccion];
            cartas_tengo++;
            System.out.println("Ya tienes " + cartas_tengo + " cartas ");
         }while(!(cartas_tengo>=8));
    }

    /**realizar un random de todas las cartas
     * 
     * @param maximo
     * @return 
     */
    private static int carta_aleatoria(int maximo) {
         int MAX = maximo;
         int MIN = 0;
         int range= (MAX-MIN)+1;
         int aleatorio = (int)(Math.random()*range)+MIN;
         return aleatorio;
    }

    
    
    private static void mostrarMazo(String[] tu_mazo) {
        System.out.println("Tu mazo es ");
        for (int i = 0; i < tu_mazo.length; i++) {
            System.out.println(tu_mazo[i]);
        }
    }

    /**
     * 
     * @param tu_mazo tu mazo con cartas
     * @param carta carta a poner
     * @return 
     */
    private static boolean existeEnMazo(String[] tu_mazo, String carta) {
        for (int i = 0; i <tu_mazo.length; i++) {
            if (tu_mazo[i].equals(carta))
            { //existe
                return true;
            }
        }
        return false;
    }

   
    
}
