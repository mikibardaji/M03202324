/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaplenargots;

/**
 *
 * @author mabardaji
 */
public class Got {
    //atributs i material
    int capacity; //capacidad que tiene el baso
    int liquid; //liquid dentro del vaso
    String material; //material

 
    
    
    public Got()
    {
        this.capacity = 100;
        this.material = "Cristal";
        this.liquid=0;
    }
    
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getLiquid() {
        return liquid;
    }

    public void setLiquid(int liquid) {
        this.liquid = liquid;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    
    /**
     * plenar got amb el liquid 
     * @param liquid que es vol ficar dins el got
     * @return 0 si s'ha ficat tot, i > 0 si ha sobrat
     * capacitat sobra
     */
    public int omplirGot(int liquid)
    {
        int sobra;
        if ((this.liquid + liquid) <= this.capacity)
        {
            this.liquid += liquid;
            return 0;
        }
        else
        {
            sobra = this.capacity - (this.liquid + liquid);
            return sobra;
        }   
    }
    
    /**
     * sacar liquido del vaso
     * @param beber cantidad que queremos del vasp
     * Si beber es mas grande que el liquido a 0.
     */
    public void beureGot(int beber)
    {
        
        this.liquid = this.liquid - beber;
        dejarA0();
       
    }
    
    /**
     * Sin parametros, restara 20 ml siempre que pueda
     * Si no puede, lo dejara a 0.
     */
    public void beureGot()
    {
        this.liquid = this.liquid  - 20;
        dejarA0();
    }

    /**
     * metodo privado, si el liquido esta en negativo
     * lo deja a 0.
     */
    private void dejarA0() {
        if (this.liquid<0)
        {
            this.liquid = 0;
        }
    }
    
    /**
     * 
     * @return true si esta totalmente lleno
     * false sino.
     */
    public boolean isPle()
    {
        return this.capacity==this.liquid;
    }
}
