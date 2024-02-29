/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_06;

/**
 *
 * @author HeartLess
 */
public class CalculateCircleArea{
    public static double calculateCircleArea(double radius) {      
        double area = Math.PI*(radius*radius); 
        return (double) Math.floor(area*100)/100;
    }   
    
}
