/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HeartLess
 */
public class MinisTime {
    public static int time(int hourTimeIn ,int hourTimeOut ,int minisTimeIn ,int minisTimeOut) {  
        int totalMinisTime ,totalIn ,totalOut;
        totalIn = (hourTimeIn*60) + minisTimeIn;
        totalOut = (hourTimeOut*60) + minisTimeOut;
        totalMinisTime = totalOut - totalIn;
        return totalMinisTime;
    }   
    
}
