/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_10;

/**
 *
 * @author HeartLess
 */
public class Tax {
    public static double calculate(double netIncome) { 
            double tax = 0;
            if (netIncome <= 100000 ){
                tax = 0;
            }
            else if (netIncome <= 300000 ){
                tax = (netIncome - 100000)*0.5;
            }
            else if (netIncome <= 500000 ){
                tax = tax + 10000;
                tax = tax + (netIncome - 300000)*0.10;
            }
            else if (netIncome <= 1000000 ){
                tax = tax + 30000;
                tax = tax +  (netIncome - 500000)*0.15;
            }
            else if (netIncome > 1000000 ){
                tax = tax + 105000;
                tax = tax +  (netIncome - 1000000)*0.20;
            }
            return (double) Math.floor((tax)*100)/100;
     }  
}
