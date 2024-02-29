/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_30;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = new int[10]; 
        int maxIndex, minIndex;
        double average;
        Scanner scanIn = new Scanner(System.in);
        
        for (int i = 0;i<10;i++){ 
            System.out.print("Number Position "+(i+1)+" : "); 
            num[i] = scanIn.nextInt();
        }
        maxIndex = findMax(num);
        minIndex = findMin(num);
        average = findAverage(num);
        System.out.print("Maximum is Position "+(maxIndex+1)+" Value = " + num[maxIndex]+"\n");
        System.out.print("Minimum is Position "+(minIndex+1)+" Value = " + num[minIndex]+"\n"); 
        System.out.print("Average =  "+average+" \n"); 
    }
    
    public static int findMax(int[] anArray){
        int check=0;
        for (int i=0;i<10;i++){
            if(anArray[i]>=anArray[check]){
            check = i;
            }
        }
        return check;
    }  
    
    public static int findMin(int[] anArray){
        int check = 0;
        for (int i=0;i<10;i++){
            if(anArray[i]<=anArray[check]){
            check = i;
            }
        }
        return check;
    } 
    
    public static double findAverage(int[] anArray){
        double average = 0;
        for (int i=0;i<10;i++){
            average += anArray[i];
        }
        return average/10;
    } 
    
}
