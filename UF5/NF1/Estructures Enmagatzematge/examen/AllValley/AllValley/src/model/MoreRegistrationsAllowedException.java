/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mabardaji
 */
public class MoreRegistrationsAllowedException extends Exception {

    public MoreRegistrationsAllowedException() {
        super("No se permite mas inscritos... ");
    }
    
}
