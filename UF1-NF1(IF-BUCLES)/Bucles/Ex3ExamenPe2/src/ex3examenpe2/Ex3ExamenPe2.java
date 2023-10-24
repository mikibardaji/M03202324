/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3examenpe2;

import java.util.Scanner;

/**
 * Escriu un programa que permeti practicar les sumes de nombres enters.

Per fer-ho, el programa haur� de generar nombres enters aleatoris amb valor absolut no superior al l�mit que inicialment indiqui l�usuari i preguntar a l�usuari el resultat del c�lcul.

El primer pas, doncs, ser� preguntar a l�usuari el valor absolut m�xim (LIMIT) dels nombres amb els quals es faran les sumes.

El programa iniciar� un bucle per generar aleat?riament dos nombres enters entre  1 i +LIMIT (ambd�s no inclosos) i preguntar a l�usuari el resultat de la suma dels dos nombres, comprovar si la resposta �s correcta o no i informar l�usuari.

A cada iteraci�, el programa preguntar� a l�usuari si vol continuar o no i actuar� en conseq��ncia.
Al final del programa, un cop l�usuari ha decidit no continuar o a arribat al nombre m�xim d�errades, informar� del nombre d�encerts i del nombre d�errors.

Versi� 2.0 (0,50 punt)*: El programa tamb� limitar� el nombre d�errades a 3. Un cop arribi a aquest nombre d�errades, finalitza el bucle.

Versi� 3.0 (0,50 pts)*: El programa generar� aleatoris de -LIMIT a +LIMIT, i funcionar� com fins ara

 * @author mabardaji
 */
public class Ex3ExamenPe2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sumaUsuario;

        System.out.print("Introduce el limite entero: ");
        int limite = sc.nextInt();

        int aciertos = 0;
        int fallos = 0;
        char respuesta='s';
        int max = limite;
        int min = (-1) * limite;
        int range = max - min + 1;  
        
         
        do
        {
            num1 = (int)(Math.random()*range) + min;
            num2 = (int)(Math.random()*range) + min;
            System.out.print(num1 + " + " + num2 + " = ");
            sumaUsuario = sc.nextInt();
            if(sumaUsuario == (num1+num2))
            {
                System.out.println("Acertaste!!!");
                aciertos++;
            }
            else
            {
                System.out.println("Fallaste!!!");
                fallos++;
            }
            if(fallos<3)
            {
                System.out.println("Quieres continuar(s/n)");
                respuesta = sc.next().charAt(0);
            }
        }while(respuesta=='s' && fallos < 3);
        
        System.out.println("Numero de aciertos: " + aciertos);
        System.out.println("Numero de fallos: " + fallos);
    }
    
}
