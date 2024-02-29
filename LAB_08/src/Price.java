/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author HeartLess
 */
public class Price {
    public static double calculate(int minisTime) {
        double price = 0;
        if(minisTime<=30){
           return 0; 
        }
        else if(minisTime<=120){
           price = minisTime-30;
           return Math.floor(price*100)/100; 
        }
        else if(minisTime<=240){
           price = 90+((minisTime-120)*1.5);
           return Math.floor(price*100)/100; 
        }
        else {
           price = 90+(120*1.5)+((minisTime-240)*2);
           return Math.floor(price*100)/100; 
        }
    }   
    
}
