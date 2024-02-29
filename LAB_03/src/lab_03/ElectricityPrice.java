/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_03;

/**
 *
 * @author HeartLess
 */
public class ElectricityPrice {
    public static double electricityPrice(double electricityUnit){
            double electricityPrice = electricityUnit*10; 
            return (double) Math.floor(electricityPrice *100)/100;
    }
}
