/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_09;

/**
 *
 * @author HeartLess
 */
public class TwentyExchange {
    public static int TwentyExchange(int money){
            money = money%50;
            int twenty = money/20; 
            return twenty;
    }   
}
