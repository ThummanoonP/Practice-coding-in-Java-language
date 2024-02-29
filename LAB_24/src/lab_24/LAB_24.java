/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_24;

/**
 *
 * @author HeartLess
 */
public class LAB_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var1 = 5;
        char letter = 'M' ;
        drawTriangle(var1) ;
        drawTriangle (var1,letter);
        drawTriangle (var1,letter,2);   
        double area1 = computeArea(5.0 , 8.0) ;
        System.out.println("Triangle (base=5.0 , height=8.0) has area = " + area1) ;
        area1 = computeArea(5.0 , 8.0 , 7.0);
        System.out.println("Triangle (side1=5.0 , side2=8.0 , side3=7.0) has area = " + area1) ;
    }
    
    public static void drawTriangle (int base){
        for (int i =1;i<=base ;i++){
            for(int j =1;j<=i ;j++){
                if(i==1||i==base|j==1||j==i){
                    System.out.print("@");
                }else System.out.print(" ");
            } 
            System.out.print("\n");
        }
    }
    
    public static void drawTriangle (int base, char achar){
        for (int i =1;i<=base ;i++){
            for(int j =1;j<=i ;j++){
                if(i==1||i==base|j==1||j==i){
                    System.out.print(achar);
                }else System.out.print(" ");
            } 
            System.out.print("\n");
        }
    }
    
    public static void drawTriangle (int base , char achar, int number){
        for(int x = 1;x<=number;x++){
            for (int i =1;i<=base ;i++){
                for(int j =1;j<=i ;j++){
                    if(i==1||i==base|j==1||j==i){
                        System.out.print(achar);
                    }else System.out.print(" ");
                } 
                System.out.print("\n");
            }
        }
    }
    
    public static double computeArea(double base , double height ){
        return (base*height)/2;
    }
    
    public static double computeArea(double side1 , double side2 , double side3 ){
        double s =(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}
