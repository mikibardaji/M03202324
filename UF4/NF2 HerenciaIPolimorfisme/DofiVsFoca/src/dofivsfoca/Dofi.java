/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dofivsfoca;

import java.util.Random;

/**
 *
 * @author mabardaji
 */
public class Dofi {
    
    private final int age;
    private final String raza;
    private final int speed;
    private int distancia_recorreguda;

    public Dofi(int age, String raza) {
        if (age>0 && age <=60)
        {
            this.age = age;
        }
        else
        {
            System.out.println("Edad no valida -->" + age);
            this.age = 30;
        }
        
        if (raza.equalsIgnoreCase("Austral"))
        {
            this.raza = raza.toUpperCase();
            this.speed = this.age * 22;
        }
        else if (raza.equalsIgnoreCase("Fosc")) 
        {
            this.raza = raza.toUpperCase();
            this.speed = this.age * 10;
        }
        else
        {
            System.out.println("Raza incorrecta" + raza);
            this.raza = "FOSC";
            this.speed = this.age * 10;
        }
        this.distancia_recorreguda=0;
        //calculo Speed
    }
    
    
    public void sprint()
    {
        if (this.distancia_recorreguda<400)
        { //	en aquest mètode s’actualitzara la distància 
            //recorreguda, amb la velocitat del dofí,
            this.distancia_recorreguda += this.speed;
        }
        else
        {//si porten més de 400 que la seva velocitat serà diferent, 
            //cridaran a la funció sprint_final, 
            //i la velocitat que 
            //s’ha de sumar sera la que retorna 
            //la funció sprint_final. 
            int sprint_final = finalSprint();
            this.distancia_recorreguda += this.speed;
            this.distancia_recorreguda += sprint_final;
        }
        System.out.println("Dofí ha recorregut " + this.distancia_recorreguda);
    }

    /**
     * Els dofins, tindran un mètode sprint_final, 
     * que retornara  el speed + (random del 25 al 100), 
     * que fan el sprint. 
     * Aquest metode no s’haura de poder cridar MAI desde 
     * fora la classe, o sigui per exemple 
     * desde el main del projecte no te que ser accesible
     * @return 
     */
    private int finalSprint() {
        Random rd = new Random();
        int min=25;
        int range=75; //rang de valors posibles
        int num = rd.nextInt(range)+min;
        return num;
    }

    public int getAge() {
        return age;
    }

    public String getRaza() {
        return raza;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDistancia_recorreguda() {
        return distancia_recorreguda;
    }

    @Override
    public String toString() {
        if (age>=10)
        {
            return "Dofi->" + " major d'edat , velocitat=" + speed ;
        }
        else
        {
            return "Dofi->" + " menor d'edat , velocitat=" + speed ;
        }
        
    }
    
    
    
}
