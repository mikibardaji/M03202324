/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaplenargots;

/**
 * public ambit de coneixerse
 * si es public desde altres fitxers, poden cridarla
 * @author mabardaji
 */
public class Botella {
    //atributs i propietats
    private boolean closed;
    private int capacity;
    private int liquid; //liquid dins de la botella
    private final String material;
    
    //metodes
    //Obrir
    //Tancar
    //Omplir
    //plenarBotella
    //getters
    //constructor
    public Botella()
    {
        this.capacity = 1000;
        this.material = "Cristal"; //ja no pot canviar el valor
        this.liquid = 0;
        this.closed = true;
    }
    
    public Botella(int capacity)
    {
        this.capacity = capacity;
        this.material = "Cristal";
        this.liquid = 0;
        this.closed = true;
    }
    /** no es valid perque te el mateix numero de variables
     * i les variables son del mateix TIPUS (INT)
     * @param liquid 
     */
    /*public Botella(int liquid)
    {
        this.capacity = 1500;
        this.material = material;
        this.liquid = 0;
        this.closed = true;
    }*/



    public Botella(int capacity, int liquid)
    {
        this.capacity = capacity;
        this.liquid = liquid;
        this.material = "Cristal";
        this.closed = true;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    public int getLiquid()
    {
        return liquid;
    }        

    /**
     * Te muestra si la botella esta cerrada o abierta
     * @return 
     */
    public boolean isClosed() {
        return closed;
    }

    public String getMaterial() {
        return material;
    }

    /**
     * Seria VOID si no hagues validacions
     * te return perque valida el valor d'entrada i informa al usuari
    * Cambia la capacidad de la botella
    * Solo se podra cambiar valores menores a 2000
     * @param new_capacity nueva capacidad botella     
     * @return 0 si el cambio se ha producido -1 si no se ha 
     * podido hacer el cambio
     */
    public int setCapacity(int new_capacity)
    {
        //pots posar validacions abans o despres de 
        //cambiar
        if (new_capacity<2000)
        {
            this.capacity = new_capacity;
            return 0;
        }
        else
        {
            return -1;
        }
       
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public void setLiquid(int liquid) {
        this.liquid = liquid;
    }

    /**
     * obres botella closed = false
     */
    public void obrirBotella()
    {
        this.setClosed(false);
    }
     
    public void tancarBotella()
    {
        this.setClosed(true);
    }
           
    /**
     * fica liquid a la botella,
     * sempre que estigui oberta , sino no fica
     * @return  -1 sino s0ha plenat botella perque estava
     * tancada, qualsevol altre valor positiu si s'ha plenat
     * (capacitat
     */
    public int plenarBotella()
    {
        if (this.isClosed()==false)
        {
            this.liquid = this.capacity;
            return this.liquid; //return 0;
        }
        else
        {
            return -1;
        }
    }
    
    /**
     * Llena la botella con la cantidad deseada
     * @param liquid a a?adir a la botella
     * @return 0 si se ha llenado sin pasarse.
     * -1 si la botella esta cerrada
     * > 0 si ha sobrado liquido 
     */
    public int plenarBotella(int liquid)
    {
        if (this.isClosed()==false)
        {
            //no pasarse de la capacidad
            if ((this.liquid + liquid) <= this.capacity)
            {
                this.liquid += liquid;
                return 0; //se ha llenado correctamente
            }
            else
            {
                int sobra = capacity - (this.liquid + liquid);
                this.liquid = capacity;
                return sobra; //liquido sobrante
            }
            
        }
        else
        {
            return -1; //cerrada
        }
    }
    
        /**
         * treure liquid de la botella
         * @return cantidad vertida
         */
        public int Servir()
        {
            final int sacado = 50;
            this.liquid  = this.liquid - sacado;
            return sacado;
        }
    
}
