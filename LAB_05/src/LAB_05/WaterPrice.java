/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_05;

/**
 *
 * @author HeartLess
 */
public class WaterPrice {
    public static double[] waterPrice(double waterUnit){
        double[] waterPrice = new double[4]; 
        if (waterUnit<=5){
            waterPrice[0] = (double) Math.floor((waterUnit*15)*100)/100;
            waterPrice[1] = 0;
            waterPrice[2] = 0;
            waterPrice[3] = (double) Math.floor((waterPrice[0]+waterPrice[1]+waterPrice[2])*100)/100; 
        }
        else if(waterUnit<=10){
            waterPrice[0] = 5*15;
            waterPrice[1] = (double) Math.floor(((waterUnit-5)*20) *100)/100;
            waterPrice[2] = 0;
            waterPrice[3] = (double) Math.floor((waterPrice[0]+waterPrice[1]+waterPrice[2])*100)/100; 
        }
        else{
            waterPrice[0] = 5*15;
            waterPrice[1] = 5*20;
            waterPrice[2] = (double) Math.floor(((waterUnit-10)*25) *100)/100;
            waterPrice[3] = (double) Math.floor((waterPrice[0]+waterPrice[1]+waterPrice[2])*100)/100; 
        }
        return waterPrice;   
    }
}
