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

    // Constructor con validaci�n de par�metros
    public Articulo(String nombre, double precio, int cuantosQuedan) {
        if (nombreValido(nombre) && precioPositivo(precio) && QuedanExistencias(cuantosQuedan)) {
            this.nombre = nombre;
            this.precio = precio;
            this.cuantosQuedan = cuantosQuedan;
            System.out.println("Art�culo creado: " + nombre);
        } else {
            System.err.println("ERROR al instanciar Articulo: Par�metros no v�lidos.");
        }
    }

    // Getters y setters con validaci�n
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombreValido(nombre)) {
            this.nombre = nombre;
        } else {
            System.err.println("ERROR al modificar nombre: Nombre no v�lido.");
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precioPositivo(precio)) {
            this.precio = precio;
        } else {
            System.err.println("ERROR al modificar precio: Precio no v�lido.");
        }
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (QuedanExistencias(cuantosQuedan)) {
            this.cuantosQuedan = cuantosQuedan;
        } else {
            System.err.println("ERROR al modificar cuantosQuedan: Cantidad no v�lida.");
        }
    }

    // M�todos adicionales
    public void imprimeInformacion() {
        System.out.println(nombre + " - Precio: " + precio + "� - IVA: " + (iva * 100) + "% - PVP: " + getPVP() + "�");
    }

    public double getPVP() {
        return precio * (1 + iva);
    }

    public double getPVPDescuento(double descuento) {
        if (descuento >= 0 && descuento <= 100) {
            double precioConDescuento = precio * (1 - (descuento / 100));
            return precioConDescuento * (1 + iva);
        } else {
            System.err.println("ERROR: Descuento no v�lido.");
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
            System.err.println("ERROR: Cantidad no v�lida para almacenar.");
            return false;
        }
    }

    // M�todos de validaci�n
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
