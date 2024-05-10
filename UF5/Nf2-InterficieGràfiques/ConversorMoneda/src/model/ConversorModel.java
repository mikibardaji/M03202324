/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mabardaji
 */
public class ConversorModel {
    
    private double EuroDollar = 1.08; //1 euro es 1.08 dollars
    
    
   public double EuroToDollar(double quantity)
   {
       return quantity*EuroDollar;
   }
   
   public double DollarToEuro(double quantity)
   {
       return (double) quantity/EuroDollar;
   }
  
}
