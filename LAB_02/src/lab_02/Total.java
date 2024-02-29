/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_02;

/**
 *
 * @author HeartLess
 */
public class Total {

    public static double total(double subTotalDiscount ,double serviceCharge ,double vat){
            double total = subTotalDiscount+serviceCharge+vat; 
            return (double) Math.floor(total*100)/100;
    }
    
}
