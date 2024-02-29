/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_09;

/**
 *
 * @author HeartLess
 */
public class FiveHundredExchange {
    public static int fiveHundredExchange(int money){
            money = money%1000;
            int fiveHundred = money/500; 
            return fiveHundred;
    }   
}
