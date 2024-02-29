/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_16;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int width,length;
        String char1,stringLine="";
        Scanner scanIn = new Scanner(System.in);
        
        System.out.print("Please enter a character :");
        char1 = scanIn.nextLine();
        
        do {
            System.out.print("Please enter the width of the rectangle ( greater than 0 and no more than 15 ) :"); 
             width = scanIn.nextInt();  
            if (width  > 0 && width  <= 15){
            break;
            }else System.out.print("INVALID NUMBER\n");
        } while(true);
        
        do {
            System.out.print("Please enter the length of the rectangle ( greater than 0 and no more than 15 ) :"); 
            length = scanIn.nextInt();  
            if (length  > 0 && length  <= 15){
            break;
            }else System.out.print("INVALID NUMBER\n");
        } while(true);
       stringLine = MakeSquare.stringLine(char1, width, length);  
       System.out.print(stringLine); 
    }
    
}
