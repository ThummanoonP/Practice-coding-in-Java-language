/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_04;

/**
 *
 * @author HeartLess
 */
public class HundredExchange {
    public static int hundredExchange(int money){
            money = money%500;
            int hundred = money/100; 
            return hundred;
    }   
    
}
