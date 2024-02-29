/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_02;

/**
 *
 * @author HeartLess
 */
public class SubTotalDiscount {
    
    public static double subTotalDiscount(double subTotal ,double discount){
            double subTotalDiscount = subTotal-(subTotal*(discount/100));
            return (double) Math.floor(subTotalDiscount*100)/100;
    }
}
