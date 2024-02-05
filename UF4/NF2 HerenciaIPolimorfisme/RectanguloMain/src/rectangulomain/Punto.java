/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rectangulomain;

/**
 *
 * @author mabardaji
 */
public class Punto {
    // Atributos privados
    private int x, y;



    // Constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    // Constructor que copia las coordenadas de otro Punto
//    public Punto(Punto otroPunto) {
//        this.x = otroPunto.getX();
//        this.y = otroPunto.getY();
//    }

    // Getter para x
    public int getX() {
        return x;
    }

    // Getter para y
    public int getY() {
        return y;
    }

    // Setter para x
    public void setX(int x1) {
        this.x = x1;
    }

    // Setter para y
    public void setY(int y1) {
        this.y = y1;
    }

    // Método para imprimir coordenadas
    public void imprime() {
        System.out.println("(" + x + ", " + y + ")");
    }

    // Setter doble para modificar ambas coordenadas
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para desplazar el punto
    public void desplaza(int dx, int dy) {
        this.x += dx; //this.x = this.x + distanciaX;
        this.y += dy;
    }

    // Método para calcular la distancia entre dos puntos
    public int distancia(Punto p) {
        int distanciaX = Math.abs(this.x - p.getX()); //sempre positiu
        int distanciaY = Math.abs(this.y - p.getY());
        return (int) Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }    
}
