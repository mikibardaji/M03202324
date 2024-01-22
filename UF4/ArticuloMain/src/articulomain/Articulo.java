/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package articulomain;

/**
 *
 * @author mabardaji
 */
class Articulo {
    // Atributos privados
    private String nombre;
    private double precio;
    private final double iva = 0.21; // IVA fijo al 21%
    private int cuantosQuedan;

    // Constructor con validación de parámetros
    public Articulo(String nombre, double precio, int cuantosQuedan) {
        if (nombreValido(nombre) && precioPositivo(precio) && QuedanExistencias(cuantosQuedan)) {
            this.nombre = nombre;
            this.precio = precio;
            this.cuantosQuedan = cuantosQuedan;
            System.out.println("Artículo creado: " + nombre);
        } else {
            System.err.println("ERROR al instanciar Articulo: Parámetros no válidos.");
        }
    }

    // Getters y setters con validación
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombreValido(nombre)) {
            this.nombre = nombre;
        } else {
            System.err.println("ERROR al modificar nombre: Nombre no válido.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precioPositivo(precio)) {
            this.precio = precio;
        } else {
            System.err.println("ERROR al modificar precio: Precio no válido.");
        }
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (QuedanExistencias(cuantosQuedan)) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.err.println("ERROR al modificar cuantosQuedan: Cantidad no válida.");
        }
    }

    // Métodos adicionales
    public void imprimeInformacion() {
        System.out.println(nombre + " - Precio: " + precio + "€ - IVA: " + (iva * 100) + "% - PVP: " + getPVP() + "€");
    }

    public double getPVP() {
        return precio * (1 + iva);
    }

    public double getPVPDescuento(double descuento) {
        if (descuento >= 0 && descuento <= 100) {
            double precioConDescuento = precio * (1 - (descuento / 100));
            return precioConDescuento * (1 + iva);
        } else {
            System.err.println("ERROR: Descuento no válido.");
            return -1;
        }
    }

    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad <= cuantosQuedan) {
            cuantosQuedan -= cantidad;
            return true;
        } else {
            System.err.println("ERROR: No hay suficientes unidades para vender.");
            return false;
        }
    }

    public boolean almacenar(int cantidad) {
        if (cantidad > 0) {
            cuantosQuedan += cantidad;
            return true;
        } else {
            System.err.println("ERROR: Cantidad no válida para almacenar.");
            return false;
        }
    }

    // Métodos de validación
    private boolean nombreValido(String nombre) {
        return nombre != null && !nombre.trim().isEmpty();
    }

    private boolean precioPositivo(double precio) {
        return precio >= 0;
    }

    private boolean QuedanExistencias(int cuantosQuedan) {
        return cuantosQuedan >= 0;
    }
}
