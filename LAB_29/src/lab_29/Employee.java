/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_29;

/**
 *
 * @author HeartLess
 */
public class Employee {
    int employeeID;
    Product[] product = new Product[5];
    

    public Employee() {
        for(int i=0; i<5;i++){
            product[i] = new Product();
        }
    }
    
}
