/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaentredosnumerosrecursivos;

/**
 * Realitza un algoritme recursivament , on es llegeixen dos valors enters per teclat 
 * i realitza la suma de tots els valors entre els dos números.
 * @author mabardaji
 */
public class SumaEntreDosNumerosRecursivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(sumaEntreDosNumerosRecursivos(7, 5));
    }
    
    /**
     * función recursiva para hacer la suma entre el numero max y el numero min
     * incluidos;
     * @param num1
     * @param num2
     * @return 
     */
    public static int sumaEntreDosNumerosRecursivos(int num1, int num2)
    {
        if (num1 == num2)
        {
            return num2;
        }
        else if (num2<num1)
        {
            return num2 + sumaEntreDosNumerosRecursivos(num1, num2+1);
            //return num1 + sumaEntreDosNumerosRecursivos(num1-1, num2);
            //el cas comentat el mes gran num1 es va apropant al num2
        }
        else //if (num1<num2)
        {
            return num1 + sumaEntreDosNumerosRecursivos(num1+1, num2);
            //return num2 + sumaEntreDosNumerosRecursivos(num1, num2-1);
        }
    }
    
}
