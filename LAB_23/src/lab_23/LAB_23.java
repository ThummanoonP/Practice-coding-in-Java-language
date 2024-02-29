/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_23;

/**
 *
 * @author HeartLess
 */
public class LAB_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 5;
        char letter = 'M' ;
        drawSquare(var1) ;
        drawSquare(var1,letter);
        drawSquare(var1,letter,2);
        double area1 = calAreaRectangle(5.0,7.0) ;
        double area2 = calAreaRectangle(5.0) ;
        System.out.println("Rectangle (base=5.0 , height=7.0) has area = "+ area1) ;
        System.out.println("Rectangle (base=5.0 , height=5.0) has area = " + area2) ;
    }
    
    public static void drawSquare (int width){
        for (int i =1;i<=width ;i++){
            for(int j =1;j<=width ;j++){
                if(i==1||i==width||j==1||j==width){
                    System.out.print("@");
                }else System.out.print(" ");
            } 
            System.out.print("\n");
        }
    }
    
    public static void drawSquare (int width, char achar){
        for (int i =1;i<=width ;i++){
            for(int j =1;j<=width ;j++){
                if(i==1||i==width||j==1||j==width){
                    System.out.print(achar);
                }else System.out.print(" ");
            } 
            System.out.print("\n");
        }
    }
    
    public static void drawSquare (int width, char achar, int number){
        for (int i =1;i<=(width*number) ;i++){
            for(int j =1;j<=(width*number) ;j++){
                if(i==1||i==(width*number)||j==1||j==(width*number)){
                    System.out.print(achar);
                }else System.out.print(" ");
            } 
            System.out.print("\n");
        }
    }
    
    public static double calAreaRectangle(double width ){
        return (width*width);
    }
    
    public static double calAreaRectangle(double width , double length ){
        return (width*length);
    } 
}
