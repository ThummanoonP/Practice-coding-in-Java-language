/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_18;

/**
 *
 * @author HeartLess
 */
import java.util.Scanner ;
public class LAB_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = getNumber( ) ;
        multiply12(number) ;
    }
    
    public static int getNumber( ){
     int num;
        Scanner scanIn = new Scanner(System.in);
        do {
            System.out.print("enter number (greater than 10 and not greater than 30) :"); 
            num = scanIn.nextInt();  
            if (num  > 10 && num  <= 30){
            break;
            }else System.out.print("wrong number\n"); 
        }while(true);
        return num;
}
    public static String multiply12(int num){
        String stringLine = "";
        for (int i =1;i<=12 ;i++){
            System.out.print(num+" x "+i+"\t"+"= "+(num*i)+"\n");
        }      
        return null;
    }   
}
