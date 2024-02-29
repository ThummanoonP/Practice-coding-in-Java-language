/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_04;

/**
 *
 * @author HeartLess
 */
public class FiveExchange {
    public static int fiveExchange(int money){
            money = money%10;
            int five = money/5; 
            return five;
    }   
}
