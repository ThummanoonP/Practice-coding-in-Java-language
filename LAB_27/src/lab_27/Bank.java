/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_27;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class Bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, surname, id, accoutNum;
        double balance, interest, num;
        
        for(int i=1;i<=2;i++){
            Scanner scanIn = new Scanner(System.in);
            System.out.print("Account Number : ");
            accoutNum = scanIn.nextLine();  
            System.out.print("Name : ");
            name = scanIn.nextLine();  
            System.out.print("Surname : ");
            surname = scanIn.nextLine();  
            System.out.print("ID : ");
            id = scanIn.nextLine();  
            do {
                System.out.print("Balance :"); 
                balance = scanIn.nextDouble();  
                if (balance  >= 1000){
                   break;
                }else System.out.print("MInimum 1000 bath\n"); 
            }while(true);
            System.out.print("Interest Rate %  : ");
            interest = scanIn.nextDouble();  
            Account account;
            account = new Account(accoutNum, balance, name, surname, id,  interest);
            
            account.showAccount();
            System.out.print("deposit : ");
            num = scanIn.nextDouble();  
            account.deposit(num);            
            do {
                System.out.print("With Draw :"); 
                num = scanIn.nextDouble();  
                if ((account.balance-num)  >= 1000){
                    account.withdraw(num);
                   break;
                }else System.out.print("Insufficient account balance.\n"); 
            }while(true);
            
            account.accountOwner.changeName("Somsak");
            account.accountOwner.changeSurname("InwZa");
            System.out.print("Calculate interest : " +account.calculateInterest()+"\n");
            account.showAccount();
            
        }
        // TODO code application logic here
    }
    
}
