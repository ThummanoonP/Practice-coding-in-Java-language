/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_25;

/**
 *
 * @author HeartLess
 */
public class RectTest {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle rectangle1 = new Rectangle(10,10);
        Rectangle rectangle2 = new Rectangle(10,10);
        Rectangle rectangle3 = new Rectangle(10,10);
        rectangle1.showRectangle();
        rectangle1.changeSize();
        rectangle1.showRectangle();
        rectangle2.changeSize(5);
        rectangle2.showRectangle();
        rectangle3.changeSize(3, 7);
        rectangle3.showRectangle();
    }
    
    
}
