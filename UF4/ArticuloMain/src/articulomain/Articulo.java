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
    private final double iva; // IVA fijo al 21%
    private int cuantosQuedan;

    // Constructor con validación de parámetros
    public Articulo(String nombre, double precio, int cuantosQuedan, double iva) {
        if (nombreValido(nombre) && 
                precioPositivo(precio) 
                && QuedanExistencias(cuantosQuedan)
                && ivaValidoEspanya(iva)) {
            this.nombre = nombre;
            this.precio = precio;
            this.cuantosQuedan = cuantosQuedan;
            this.iva = iva;
            System.out.println("Artículo creado: " + nombre);
        } else {
            this.iva = 0; //valor incorrecto 
            System.err.println("ERROR al instanciar Articulo: Parámetros no válidos.");
        }
    }

    // Getters y setters con validación
    public String getNombre() {
        return nombre;
    }

    /**
     * valida el nombre
     * @param nombre
     * @return -1 si no es valido y no ha cambiado el nombre
     */
    public int setNombre(String nombre) {
        if (nombreValido(nombre)) {
            this.nombre = nombre;
            return 0;
        } else {
            return -1;
        }
    }

    public double getPrecio() {
        return precio;
    }

    /**
     * 
     * @param precio
     * @return -1 si el precio no es positivo y no se cambia
     */
    public int setPrecio(double precio) {
        if (precioPositivo(precio)) {
            this.precio = precio;
             return 0;
        } else {
            return -1;
        }
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    
    /**
     * 
     * @param cuantosQuedan
     * @return -1 si la cantidads es negativa y no valida , no se cambiara
     */
    public int setCuantosQuedan(int cuantosQuedan) {
        if (QuedanExistencias(cuantosQuedan)) {
            this.cuantosQuedan = cuantosQuedan;
            return 0;
        } else {
            return -1;
        }
    }

    // Métodos adicionales
    public void imprimeInformacion() {
        System.out.println(nombre + " - Precio: " + precio + "€ - IVA: " + (iva * 100) + "% - PVP: " 
                + getPVP() + "€"
         + " Stock " + cuantosQuedan);
    }

    public double getPVP() {
        return precio * (1 + iva);
    }

    /**
     * 
     * @param descuento
     * @return -1 si el descuento no es valido, no se aplicara
     * returna el precio con descuento si todos los parametros son validos
     */
    public double getPVPDescuento(double descuento) {
        if (descuento >= 0 && descuento <= 100) {
            double precioConDescuento = precio * (1 - (descuento / 100));
            return precioConDescuento * (1 + iva);
        } else {
            
            return -1;
        }
    }

    /**
     * 
     * @param cantidad
     * @return false si la cantidad pedida es negativa 
     * o mayor de la que queda
     */
    public boolean vender(int cantidad) {
        if (cantidad > 0 && cantidad <= cuantosQuedan) {
            cuantosQuedan -= cantidad;
            return true;
        } else {
            //System.err.println("ERROR: No hay suficientes unidades para vender.");
            return false;
        }
    }

    public boolean almacenar(int cantidad) {
        if (cantidad > 0) {
            cuantosQuedan += cantidad;
            return true;
        } else {
          //  System.err.println("ERROR: Cantidad no válida para almacenar.");
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

    private boolean ivaValidoEspanya(double iva) {
        return (iva== 0.04) || (iva == 0.1) || (iva == 0.21);
    }
}
