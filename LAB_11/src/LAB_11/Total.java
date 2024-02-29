/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_11;

/**
 *
 * @author HeartLess
 */
public class Total {
    public static double total(double dormitoryPrice ,double electricityPrice ,double waterPrice ,double wiFiPrice){
            double total = dormitoryPrice + electricityPrice + waterPrice + wiFiPrice; 
            return (double) Math.floor(total *100)/100;
    }
}
