/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author jepa2698
 */
public class Trabajador {
    String nombre ;
    int edad;
    double salari;

    public Trabajador(String nombre, int edad, double salari) {
        this.nombre = nombre;
        this.edad = edad;
        this.salari = salari;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", edad=" + edad + ", salari=" + salari + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Trabajador)) {
            return false;
        }
        final Trabajador other = (Trabajador) obj;
        return this.nombre.equalsIgnoreCase(other.nombre);
    }
    
}
