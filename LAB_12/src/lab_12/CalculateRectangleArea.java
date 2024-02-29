/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_12;

/**
 *
 * @author HeartLess
 */
public class CalculateRectangleArea{
    public static double calculateRectangleArea(double width,double length) {      
        double area = width*length; 
        return (double) Math.floor(area*100)/100;
    }   
    
}
