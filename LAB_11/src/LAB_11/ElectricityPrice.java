/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_11;

/**
 *
 * @author HeartLess
 */
public class ElectricityPrice {
    public static double[] electricityPrice(double electricityUnit){
        double[] electricityPrice = new double[4]; 
        if (electricityUnit<=50){
            electricityPrice[0] = (double) Math.floor((electricityUnit*8)*100)/100;
            electricityPrice[1] = 0;
            electricityPrice[2] = 0;
            electricityPrice[3] = (double) Math.floor((electricityPrice[0]+electricityPrice[1]+electricityPrice[2])*100)/100; 
        }
        else if(electricityUnit<=200){
            electricityPrice[0] = 50*8;
            electricityPrice[1] = (double) Math.floor(((electricityUnit-50)*9)*100)/100;
            electricityPrice[2] = 0;
            electricityPrice[3] = (double) Math.floor((electricityPrice[0]+electricityPrice[1]+electricityPrice[2])*100)/100; 
        }
        else{
            electricityPrice[0] = 50*8;
            electricityPrice[1] = 150*9;
            electricityPrice[2] = (double) Math.floor(((electricityUnit-200)*10) *100)/100;
            electricityPrice[3] = (double) Math.floor((electricityPrice[0]+electricityPrice[1]+electricityPrice[2])*100)/100; 
        }
        return electricityPrice;   
    }
}
