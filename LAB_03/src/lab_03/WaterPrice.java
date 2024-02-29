/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_03;

/**
 *
 * @author HeartLess
 */
public class WaterPrice {
    public static double waterPrice(double waterUnit){
            double waterPrice = waterUnit*15; 
            return (double) Math.floor(waterPrice *100)/100;
    }
}
