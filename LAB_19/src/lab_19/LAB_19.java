/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_19;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here     
         String char1 = getChar( );
         int width = getWidth( );
         int length = getLength( );
        square(char1, width, length);
    }
    
    public static String getChar( ){
        String char1;
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Please enter a character :");
        char1 = scanIn.nextLine();
        return char1;
    }
    
    public static int getWidth( ){
     int width;
        Scanner scanIn = new Scanner(System.in);
        do {
            System.out.print("Please enter the width of the rectangle ( greater than 0 and no more than 15 ) :"); 
             width = scanIn.nextInt();  
            if (width  > 0 && width  <= 15){
            break;
            }else System.out.print("INVALID NUMBER\n");
        } while(true);
        return width;
    }
    
    public static int getLength( ){
     int length;
        Scanner scanIn = new Scanner(System.in);
        do {
            System.out.print("Please enter the length of the rectangle ( greater than 0 and no more than 15 ) :"); 
            length = scanIn.nextInt();  
            if (length  > 0 && length  <= 15){
            break;
            }else System.out.print("INVALID NUMBER\n");
        } while(true);
        return length;
    }
    
    public static void square(String char1, int width, int length){
        for (int i =1;i<=width ;i++){
            for(int j =1;j<=length ;j++){
                if(i==1||i==width||j==1||j==length){
                    System.out.print(char1);
                }else System.out.print(" ");
            } 
            System.out.print("\n");
        }      
    } 
}
