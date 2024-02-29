/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_02;

/**
 *
 * @author HeartLess
 */
public class Vat {
    
    public static double vat(double subTotalDiscount ,double serviceCharge){
            double vat = ((subTotalDiscount+serviceCharge)/100)*7;
            return (double) Math.floor(vat*100)/100;
    }
}
