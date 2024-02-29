/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_27;

/**
 *
 * @author HeartLess
 */
public class Customer {
    String nationalIDCard;
    String name;
    String surname;
    
    public void setID(String id){
        nationalIDCard = id;
    }
    
    public void changeName(String n){
        name = n;
    }
    
    public void changeSurname(String s){
        surname = s;
    }
    
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    
    public void showCustomer(){
        System.out.print("Customer Name :"+name+"  "+surname +"\n");
        System.out.print("National ID : "+nationalIDCard +"\n");
    }

    
}
