/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_02;

/**
 *
 * @author HeartLess
 */
public class ServiceCharge {
    
    public static double serviceCharge(double subTotalDiscount){
            double serviceCharge = (subTotalDiscount/100)*10; 
            return (double) Math.floor(serviceCharge *100)/100;
    }
}
