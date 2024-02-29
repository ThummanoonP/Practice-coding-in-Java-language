/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_14;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class Lab_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String stringLine;
        Scanner scanIn = new Scanner(System.in);
        
        do {
            System.out.print("Factorial :"); 
            num = scanIn.nextInt();  
            if (num  >= 1 && num  <= 10){
            break;
            }else System.out.print("wrong number\n"); 
        }while(true);
        stringLine = Factorial.stringLine(num);  
        System.out.print(num+"! = "+stringLine+"\n"); 
    }
    
}
