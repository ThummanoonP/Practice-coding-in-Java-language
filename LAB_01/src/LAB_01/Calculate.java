/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_01;

/**
 *
 * @author HeartLess
 */
public class Calculate {
    public static double calculate(double baht,double exchange,double amout) { 
        
        if ((baht == 0) || (amout == 0)){
            return 0;
        }
        else{ 
            double result = (amout/baht)*exchange; 
            return (double) Math.floor(result*100)/100;
        }
    }   
}
