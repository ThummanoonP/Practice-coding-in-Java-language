/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_06;

/**
 *
 * @author HeartLess
 */
public class CalculateTriangleArea{
    public static double calculateTriangleArea(double height,double base) {      
        double area = (height*base)/2; 
        return (double) Math.floor(area*100)/100;
    }   
    
}
