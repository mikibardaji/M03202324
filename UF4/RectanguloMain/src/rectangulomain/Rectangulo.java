/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rectangulomain;

/**
 *
 * @author mabardaji
 */
class Rectangulo {
    // Atributos privados
    private int x1, y1, x2, y2;
//    Punto pinicial;
//    Punto pfinal;
    // Constructor con validación de coordenadas
    public Rectangulo(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
//            pinicial = new Punto(x1, y1);
//            pfinal = new Punto(x2,y2);
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al instanciar Rectangulo: Coordenadas no válidas.");
        }
    }

    // Getters y setters
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1<this.x2)
        {
            this.x1 = x1;
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if (y1<this.y2)
        {
        this.y1 = y1;
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
       if (this.x1<x2)
        {
            this.x2 = x2;
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if (this.y1<y2)
        {
        this.y2 = y2;
        }
    }

    // Métodos adicionales
    public void imprimeInformacion() {
        System.out.println("Coordenadas: (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ")");
        System.out.println("Perímetro: " + getPerimetro());
        System.out.println("Área: " + getArea());
    }

    public void setX1Y1(int x1, int y1) {
        this.setX1(x1);
        this.setY1(y1);
    }

    public void setX2Y2(int x2, int y2) {
        this.setX2(x2);
        this.setY2(y2);
    }

    public void setAll(int x1, int y1, int x2, int y2) {
        if (x1 < x2 && y1 < y2) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        } else {
            System.err.println("ERROR al modificar Rectangulo: Coordenadas no válidas.");
        }
    }

    private int getBase()
    {
        //return Math.abs(x2 - x1);
        
        return (x2 - x1);
    }
    
    private int getAltura()
    {
        //return Math.abs(y2 - y1);
        //perque y2 sempre es mes gran qye y1 (setters tenen la 
        //validació pertinent)
        return (y2 - y1);
    }
    
    public int getPerimetro() {
        return 2 * (this.getBase() + this.getAltura());
    }

    public int getArea() {
        return this.getBase()  * this.getAltura();
    }
}
