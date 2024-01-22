/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntomain;

/**
 *
 * @author mabardaji
 */
public class Punto {
    // Atributos privados
    private int x, y;

    // Constructor por defecto
    public Punto() {
        // Sin parámetros, inicializa a 0 por defecto
    }

    // Constructor con parámetros
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Constructor que copia las coordenadas de otro Punto
    public Punto(Punto otroPunto) {
        this.x = otroPunto.x;
        this.y = otroPunto.y;
    }

    // Getter para x
    public int getX() {
        return x;
    }

    // Getter para y
    public int getY() {
        return y;
    }

    // Setter para x
    public void setX(int x) {
        this.x = x;
    }

    // Setter para y
    public void setY(int y) {
        this.y = y;
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
        this.x += dx;
        this.y += dy;
    }

    // Método para calcular la distancia entre dos puntos
    public int distancia(Punto p) {
        int dx = this.x - p.x;
        int dy = this.y - p.y;
        return (int) Math.sqrt(dx * dx + dy * dy);
    }    
}
