/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculpotenciarecursiu;

/**
 *
 * Programa que calculi un numero elevat a una potencia , 
 * tots dos valors demanats al usuari, de forma recursiva.
 */
public class CalculPotenciaRecursiu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    
    public int suma_pars(int num)
    {
        if (num%2!=0)
        {
            return -1;
        }
        else if(num==0)
        {
            return num; //es 0
        }
        else
        {
            int calculo = num+suma_pars(num-2);
            return calculo;
        }
    }
    
    public int potencia(int base, int exp)
    {
        //caso base exp sigui 0
        
        //caso recursiu 3.3.3.3 base*base*base* 
    }
}
