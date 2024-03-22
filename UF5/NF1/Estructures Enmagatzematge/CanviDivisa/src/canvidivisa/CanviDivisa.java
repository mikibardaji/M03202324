/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package canvidivisa;

import Model.DAODivisa;
import Model.Divisa;
import Model.MaxDivisiException;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import menuUtils.MenuDaw;
import menuUtils.OptionDuplicateException;

/**
 *
 * @author mabardaji
 */
public class CanviDivisa {
     static DAODivisa monedas_cambio;
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MenuDaw menu = new MenuDaw("Oficina Canvi Divises");
       
       monedas_cambio = new DAODivisa();
       // conté la colecció del model dades
       int opcio;
       boolean exit = false;
       addAllOptions(menu); 
       
      introDadesProva();
       
       //tractar opcio escollida bucle fins que donis sortir no acabi CASA
       do
       {
           //mostrar el menu i escollir opcio CASA
          opcio = menu.displayMenu();
          switch(opcio)
            {
                case 2: //afegir
                    anyadirDivisa();
                    break;
                case 3:    //canvi valor
                   cambioValorDivisa();
                    break;                       
                case 4:    //Llistar totes les divises
                    llistarDivises();
                    break;
                case 6:    //consultar per nom
                    borrarDivisa();
                    break;                    
          
                case 5:    //consultar per nom
                    consultarDivisa();
                    break; 
                case 1: //Sortir
                    exit = true;
                    break;
            } 
       }while(!exit);
    }
    
    
    private static void addAllOptions(MenuDaw menu) {
        try {
            //Afegir personatge
            menu.addOption("Sortir");
            menu.addOption("Alta Divisa");
            menu.addOption("Canvi Divisa"); //desapareix la priemra cua
            menu.addOption("Llistar Divises");
            menu.addOption("Consultar Divisa");
            menu.addOption("Borrar Divisa");
            
        } catch (OptionDuplicateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
    }

    
    private static void introDadesProva() {
         try {
             monedas_cambio.altaDivisa("EUR", 2.3);
             monedas_cambio.altaDivisa("USD", 1.3);
             monedas_cambio.altaDivisa("YEN", 10.0);
         } catch (MaxDivisiException ex) {
             System.out.println(ex.getMessage());
         }
    }

    private static void anyadirDivisa() {
         try {
             //pido datos usuario
             Scanner sc = new Scanner(System.in);
             System.out.println("Pon moneda");
             String moneda = sc.nextLine();
             System.out.println("Pon cambio divisa");
             Double cambio = sc.nextDouble();
             //añado con el DAO
             Double add =monedas_cambio.altaDivisa(moneda, cambio);
             //informo usuario resultado
             if (add==null)
             {
                 System.out.println("Divisa añadida");
             }
             else
             {
                 System.out.println("Divisa ya existente se ha cambiado el cambio el cambi antiguo era" + add);
             }
             pausa();
         } catch (MaxDivisiException ex) {
             //validacion collection DAO (numero capacidad superada)
             System.out.println(ex.getMessage());
         }
    }

    private static void anyadirDivisaObjeto() {
         try {
             //pido datos usuario
             
             Divisa coin = crearObjetoDivisa();
             
             //añado con el DAO
             Double add =monedas_cambio.altaDivisa(coin);
             //informo usuario resultado
             if (add!=null)
             {
                 System.out.println("Divisa añadida");
             }
             else
             {
                 System.out.println("Divisa ya existente se ha cambiado el cambio el cambi antiguo era" + add);
             }
             pausa();
         } catch (MaxDivisiException ex) {
             //validacion collection DAO (numero capacidad superada)
             System.out.println(ex.getMessage());
         }
    }

    /**
     * Crear objeto divisa
     * @return 
     */
    private static Divisa crearObjetoDivisa() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pon moneda");
        String moneda = sc.nextLine();
        System.out.println("Pon cambio divisa");
        Double cambio = sc.nextDouble();
        Divisa nuevo = new Divisa(moneda, cambio);
        return nuevo;
    }

    private static void llistarDivises() {
         //opcional demanar dades usuari
         //no demano res
         //obligatori crida al metode corresponen DAO
         Map<String, Double> coins = monedas_cambio.getDivisas();
         //opcional quasi obligatori informar al usuari
         for(Map.Entry<String,Double> entrada: coins.entrySet())
            {
                Divisa nueva = new Divisa(entrada.getKey(), entrada.getValue());
                System.out.println(nueva);
                
                //System.out.println("La divisa " + entrada.getKey() + " actualmente tiene el cambio " +entrada.getValue());
            }
         System.out.println("Total divisas :" + coins.size());
         pausa();
        
    }

    private static void pausa() {
        Scanner sc = new Scanner(System.in);
         System.out.println("Pren tecla per tornar al menu");
         sc.nextLine();
    }

    private static void consultarDivisa() {
        //opcional demanar dades usuari
        String nombre_divisa = devolverNombreDivisa("Que divisa quieres consultar");
        
         //obligatori crida al metode corresponen DAO
         Double cambio = monedas_cambio.devuelveCambioDivisa(nombre_divisa);           //getter
         // obligatori informar al usuari
         if (cambio!=null)
         {
             System.out.println("La moneda " +
                     nombre_divisa + " esta a " + cambio);
         }
         else
         {
             System.out.println("No tienes esta divisa");
         }
         pausa();
    }

    private static void borrarDivisa() {
        
        String nombre_divisa = devolverNombreDivisa("Que divisa quieres borrar");
        //no se que retorna
        Double cambio = monedas_cambio.bajaDivisa(nombre_divisa);
        if (cambio!=null)
         {
             System.out.println("La moneda " +
                     nombre_divisa + " esta borrada" );
         }
         else
         {
             System.out.println("No tienes esta divisa");
         }
         pausa();
    }

    private static void cambioValorDivisa() {
        Scanner sc = new Scanner(System.in);
        //opcional demanar dades usuari
        String nombre_divisa = devolverNombreDivisa("Que divisa quieres cambiar valor");
        System.out.println("El nuevo valor divisa");
        Double nuevo_valor = sc.nextDouble();
        
        //no se que devuelve 
        //despues valoro si recojo en variable
        Double cambio = monedas_cambio.cambiarDivisa(nombre_divisa, nuevo_valor);
        if (cambio!=null)
        {
            System.out.println("He cambiado el valor"
            + cambio + " de la moneda " +nombre_divisa + 
                     " a su nuevo cambio " + nuevo_valor);
        }
        else
        {
            System.out.println("La divisa"
            + nombre_divisa + " no existe");
        }
        pausa();
    }

    private static String devolverNombreDivisa(String frase) {
        Scanner sc = new Scanner(System.in);
        //opcional demanar dades usuari
        System.out.println(frase);
        String nombre_divisa = sc.nextLine();
        return nombre_divisa;
    }
    
}
