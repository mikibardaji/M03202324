/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package helloworldfuncion;

/**
 *
 * @author mabardaji
 */
public class HelloWorldFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        System.out.println("Inicio main");
//        imprimeHolaMundo();      
//        System.out.println("Final main");
          int num=5;
          int num2=7;
          int calculo=doble(num);
          System.out.println("El doble de "
          + num + " es " + calculo);
          calculo = multiplica(num, num2);
          System.out.println(num + "x" + num2 + "=" + calculo);
    }
    
    //funcions fora del main
    
    /**
     * función que muestra por consola hello world
     */
    public static void imprimeHolaMundo()
    {
        System.out.println("Hello World");
    }
    
    /**
     * funcion que devuelve el doble
     * @param valor el valor del cual calcularemos el doble
     * @return valro doble del entrado
     */
    public static int doble(int valor)
    {
        int resultado = valor * 2;
        
        return resultado;
    }
    
    /**
     * función multiplica
     * recibe dos parametros enteros y los multiplica entre ellos
     * @param v1 primer parametro
     * @param v2 segundo parametro
     * @return resultado de la multiplicación entera
     */
     public static int multiplica(int v1, int v2)
     {
         int resultat = v1*v2;
         return resultat;
     }
    
}
