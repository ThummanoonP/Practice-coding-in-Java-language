/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_26;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int choice;
        double result,num1,num2;
        Calculator cal = new Calculator();
        Scanner scanIn = new Scanner(System.in);
        OUTER:
        do {
            System.out.print("1 : Sum of two numbers\n");
            System.out.print("2 : Minus of two numbers\n");
            System.out.print("3 : Product of two numbers\n");
            System.out.print("4 : Divide of two numbers\n");
            System.out.print("Please Select Choice : ");
            choice = scanIn.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("First Number : ");
                    num1 = scanIn.nextDouble();
                    System.out.print("Second  Number : ");
                    num2 = scanIn.nextDouble();
                    result = cal.sum(num1,num2);
                    System.out.print("Result of Sum = "+result);
                    break OUTER;
                }
                case 2 -> {
                    System.out.print("First Number : ");
                    num1 = scanIn.nextDouble();
                    System.out.print("Second  Number : ");
                    num2 = scanIn.nextDouble();
                    result = cal.minus(num1, num2);
                    System.out.print("Result of Minus = "+result);
                    break OUTER;
                }
                case 3 -> {
                    System.out.print("First Number : ");
                    num1 = scanIn.nextDouble();
                    System.out.print("Second  Number : ");
                    num2 = scanIn.nextDouble();
                    result = cal.product(num1, num2);
                    System.out.print("Result of Product = "+result);
                    break OUTER;
                }
                case 4 -> {
                    System.out.print("First Number : ");
                    num1 = scanIn.nextDouble();
                    System.out.print("Second  Number : ");
                    num2 = scanIn.nextDouble();
                    result = cal.divide(num1, num2);
                    System.out.print("Result of Divide = "+result);
                    break OUTER;
                }
                default -> System.out.print("INVALID CHOICE\n");
            }
        } while (true);
    }
    
}
