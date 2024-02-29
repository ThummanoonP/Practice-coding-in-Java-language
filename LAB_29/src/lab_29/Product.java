/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_29;

/**
 *
 * @author HeartLess
 */
public class Product {
    int productID;
    int[] volumePerMonth = new int[6];
    
    public int getVolumePerMonth(int n){
        return volumePerMonth[n];
    }
    
    public int totalVolume(){
        int total = 0;
        for(int i =0;i<6;i++){
            total += volumePerMonth[i];
        }
        return total;
    }
    
    
}
