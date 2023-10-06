/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exempledowhile;

/**
 *
 * @author mabardaji
 */
public class ExempleDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=1;
        
        do{
            System.out.println("Contador --> " + cont);
            ++cont;//cont = cont + 1;
            
        }while(cont<=10);
        System.out.println("Final*****");
        cont = 0;
        do{
            ++cont;//cont = cont + 1;
            System.out.println("Contador --> " + cont);
        }while(cont<10);
        System.out.println("Final con el contador antes de pintar*****");
        
        boolean end = false;
       do{
            ++cont;//cont = cont + 1;
            System.out.println("Contador --> " + cont);
            if (cont>=10)
            {
                end = true;
            }
        }while(!end);
        
        
    }
    
}
