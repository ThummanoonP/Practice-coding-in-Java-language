package lab_04;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HeartLess
 */
public class FiftyExchange {
    public static int fiftyExchange(int money){
            money = money%100;
            int fifty = money/50; 
            return fifty;
    }   
}
