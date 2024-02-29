/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_21;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner scanIn = new Scanner(System.in);
        OUTER:
        do {
            System.out.print("calculate rectangle area enter 1\n" +"calculate triangle area enter 2\n" +"calculate circle area enter 3\n"+"Select Choice :");
            num = scanIn.nextInt();
            switch (num) {
                case 1 -> {
                    calculateRectangleArea() ;
                    break OUTER;
                }
                case 2 -> {
                    calculateTriangleArea() ;
                    break OUTER;
                }
                case 3 -> {
                    calculateCircleArea() ;
                    break OUTER;
                }
                default -> System.out.print("INVALID CHOICE\n");
            }
        } while (true);
    }
    
    public static void calculateCircleArea() {      
        double area;
        int radius;
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Radius : "); 
        radius = scanIn.nextInt(); 
        area = Math.PI*(radius*radius); 
        System.out.print("Circle Area = "+(double) Math.round(area*100)/100+"\n"); 
    }  
    
    public static void calculateRectangleArea() {    
        double area;
        int width,length;
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Width : "); 
        width= scanIn.nextInt(); 
        System.out.print("Length : "); 
        length = scanIn.nextInt();
        area = width*length; 
        System.out.print("Rectangle Area = "+area+"\n"); 
    }  
    
    public static void calculateTriangleArea() {      
        double area;
        int height,base;
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Height : "); 
        height = scanIn.nextInt(); 
        System.out.print("Base : "); 
        base = scanIn.nextInt();
        area = (height*base)/2;
        System.out.print("Triangle Area = "+(double) Math.round(area*100)/100+"\n"); 
    }   
}
