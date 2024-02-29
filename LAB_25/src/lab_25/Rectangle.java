/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_25;

/**
 *
 * @author HeartLess
 */
public class Rectangle {
    double width;
    double height;
    
    public Rectangle(double w,double h){
        width = w;
        height = h;
    }
    public double calArea( ){
        return width*height;
    }
    
    public double calPerimeter( ){
        return (width+height)*2;
    }
    
    public void showRectangle( ){
        System.out.println("Rectangle has Width = " + width) ;
        System.out.println("Rectangle has height = " + height) ;
        System.out.println("Rectangle has Perimeter = " + calPerimeter( )) ;
        System.out.println("Rectangle has Area = " + calArea( )) ;
    }
    
    public void changeSize(){
        width =2*width;
        height=2*height;
    }
    
    public void changeSize(int amount){
        width =width*amount;
        height=height*amount;
    }
    
    public void changeSize(int amount1,int amount2){
        width =width*amount1;
        height=height*amount2;
    }
    
}
