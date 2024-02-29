/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_15;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        String stringLine;
        Scanner scanIn = new Scanner(System.in);
        
        do {
            System.out.print("enter number (greater than 10 and not greater than 30) :"); 
            num = scanIn.nextInt();  
            if (num  > 10 && num  <= 30) break;
        } while(true);
        stringLine = Multiplie.stringLine(num);  
        System.out.print(stringLine+"\n"); 
    }
    
}
