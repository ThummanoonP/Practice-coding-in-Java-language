/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_04;

/**
 *
 * @author HeartLess
 */
public class OneExchange {
    public static int oneExchange(int money){
            int one = money%5;
            one = one %2;
            return one;
    }   
}
