/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_27;

/**
 *
 * @author HeartLess
 */
public class Account {
    String accountNumber;
    double balance;
    Customer accountOwner = new Customer() ;
    double interestRate;
    
    public Account(String ac, double b, String n, String s, String id, double r){
        accountNumber = ac;
        balance = b;
        accountOwner.name =n;
        accountOwner.surname = s;
        accountOwner.setID(id);
        interestRate = r;
    }
    
    public void deposit(double m){
        balance = balance+m;
        showBalance();
    }
    
    public void withdraw(double m){
        balance = balance-m;
        showBalance();
    }
    
    public double calculateInterest(){
        return (balance*interestRate)/100;
    }
    
    public void showBalance(){
        System.out.print("Balance = "+balance +"\n");
    }
    
    public void showAccount(){
        System.out.print("Account Number : "+accountNumber +"\n");
        accountOwner.showCustomer();
        showBalance();
    }
}
