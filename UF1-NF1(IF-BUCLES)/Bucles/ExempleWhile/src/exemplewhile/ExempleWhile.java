/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplewhile;

/**
 *
 * @author mabardaji
 */
public class ExempleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont=2;
        
        while(cont<=20)
        {
            System.out.println("Contador -> " + cont);
            cont = cont + 2;
        }
        System.out.println("****************************");
        boolean end = false;
        cont = 1;
        while (!end)
        {
            System.out.println("Contador -> " + cont);
            cont = cont + 1;
            if (cont>10)
            {//activar variable
                System.out.println("Activo variable end... ");
                end = true;
            }
        }
        
    }
    
}
