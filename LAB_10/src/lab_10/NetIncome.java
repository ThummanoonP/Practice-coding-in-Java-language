/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_10;

/**
 *
 * @author HeartLess
 */
public class NetIncome {
    public static double calculate(double salary ,double extraIncome ,double insurance ,double discountOfChilden) { 
        double netIncome = (salary*12) + extraIncome - 60000 - insurance - discountOfChilden;
        return (double) Math.floor((netIncome )*100)/100;
     }
}
