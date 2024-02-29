/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_04;

/**
 *
 * @author HeartLess
 */
public class TenExchange {
    public static int tenExchange(int money){
            money = money%50;
            money = money%20;
            int ten = money/10; 
            return ten;
    }   
}
