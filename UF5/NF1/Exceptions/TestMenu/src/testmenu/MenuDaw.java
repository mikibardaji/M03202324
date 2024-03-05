/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testmenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mabardaji
 */
public class MenuDaw {
    private String Titol;
    private List<String> items;

    public MenuDaw(String Titol) {
        this.Titol = Titol;
        items = new ArrayList<String> ();
    }
    
    /**
     * rebrà per paràmetre una opció i afegirà l'Opció 
     * a la collection demanada. 
     * (comprovar que no existeixi abans, 
     * i si existeix llançar l’excepció OptionDuplicateException)
     * @param option_menu nueva opcion que tendra el menú
     */
    public void addOption(String option_menu) throws OptionDuplicateException
    {
        //com que el objecte arrayList es un String
        //ja te el equals implementat, i per tant funcionara 
        //contains
        if (!items.contains(option_menu))
        { //podria preguntar indexOf >0 existeix
            items.add(option_menu);
            System.out.println("Opció afegida -> " + option_menu);
        }
        else
        {
            throw new OptionDuplicateException(option_menu);
        }
        
    }
    
    public void addOptionsWithRepetition(String option_menu) throws OptionDuplicateException
    {
            items.add(option_menu);
            System.out.println("Opció afegida -> " + option_menu);
        
    }
    
    public void addOptionsByIndex(String option_menu, int pos)
            throws IndexOutOfBoundsException
    {
        //verificar que pos esta dintre de les que toquen
        //llançar la excepcio cap a dalt
        items.add(pos, option_menu);
        System.out.println("Opció afegida -> " + option_menu);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("********************").append("\n");
        sb.append(Titol).append("\n");
        sb.append("********************").append("\n");
        for (int i = 0; i < items.size(); i++) {
            sb.append((i+1)).append("-").
                    append(items.get(i)).append("\n");
        }
        sb.append("********************").append("\n");
        return sb.toString();
    }
    
    /**
     * et demana que escolleixis una opció, i la retornarà, 
     * sempre i quan sigui una opció valida, 
     * sinó és vàlida seguiré demanant 
     * la opció dintre de les opcions vàlides. Aquest mètode normalment anirà després d’haver cridat al DisplayMenú
     * @return opcion escogida
     */
    public int chooseOption()
    {
        int option;
        
        Scanner sc = new Scanner(System.in);
        do{
        System.out.print("Escoge opcion (1-" + items.size() + "): ");
         option = sc.nextInt();
        }while(option <1 || option > items.size());
        return option;
    }
    
    public int displayMenu()
    {
        // mostrar el menu
        //demanar la opció
        //retornar
    }
    
}
