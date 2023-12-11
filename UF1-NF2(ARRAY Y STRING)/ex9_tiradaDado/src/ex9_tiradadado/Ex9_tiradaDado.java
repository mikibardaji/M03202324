/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex9_tiradadado;

/**
 *
 * Escriba un programa simule varios lanzamientos de un dado y muestre la frecuencia de cada una de las caras 
 * así como la proporción del número de veces que haya salido cada cara con respecto al total (frecuencia el % 
 * de que ha salido, numero_veces_sale/intentos). Para ello simule 6000 lanzamientos de un dado utilizando la 
 * función Math.random()*6 para simular cada lanzamiento. Para probarlo hacer solo 10 lanzamientos, y cuando funcione probarlo con 6000.
 * @author mabardaji
 */
public class Ex9_tiradaDado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dado;
        
        int[] arrayDado = new int [6];
        int total_tiradas = 6000;
        for (int i = 0; i < total_tiradas; i++) {
            dado=tirada();
            System.out.println("dado->"+dado);
            //opción corta
            //arrayDado[dado-1]++;
            //opcion correcta pero larga
            switch (dado) {
                case 1:
                    arrayDado[0]=arrayDado[0]+1;
                    break;
                case 2:
                    arrayDado[1]=arrayDado[1]+1;
                    break;
                case 3:
                    arrayDado[2]=arrayDado[2]+1;
                    break;
                case 4:
                    arrayDado[3]++;
                    break;
                case 5:
                    arrayDado[4]++;
                    break;
                case 6:
                    arrayDado[5]++;
                    break;
            }
        }
        mostrarArray(arrayDado);
        calcularPorcentaje(arrayDado);
    }

    private static int tirada() {
        int max=6, min=1, range=max-min+1;
        int aleatorio=(int)(Math.random()*range)+min;
        return aleatorio;
        
    }

    private static void mostrarArray(int[] arrayDado) {
        for (int i = 0; i < arrayDado.length; i++) {
            System.out.println("la cara "+((i)+1)+
                    " ha salido "+ arrayDado[i]+" veces");
        }
    }

    private static void calcularPorcentaje(int[] arrayDado) {
        int num_tiradas=0;
        for (int i = 0; i < arrayDado.length; i++) {
            num_tiradas += arrayDado[i];
        }
        //num_tiradas es el total que se ha tirado
        //regla de 3
        //    num_tirada --> tiradas[i]
        //    100 ---- > X
        // num_tirada* X = tiradas[i] *100
        // x = (tiradas[i] *100)/num_tirada
        double porcentaje;
        for (int i = 0; i < arrayDado.length; i++) {
            porcentaje = (double)(arrayDado[i] *100)/num_tiradas;
            System.out.println("El " + (i+1) + " ha salido " + porcentaje);
        }
        
        
    }

   
    
}
