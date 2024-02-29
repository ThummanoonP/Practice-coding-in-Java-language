/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_17;

/**
 *
 * @author HeartLess
 */
import java.util.Scanner ;
public class LAB_17 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = getNumber( );
        int result = calFactotial(number);
        System.out.print( number + "! =" + result); 
    }
    
public static int getNumber( ){
     int num;
        Scanner scanIn = new Scanner(System.in);
        do {
            System.out.print("Factorial :"); 
            num = scanIn.nextInt();  
            if (num  >= 1 && num  <= 10){
            break;
            }else System.out.print("wrong number\n"); 
        }while(true);
        return num;
}
public static int calFactotial( int digit ){
    int result=1;
    for(int i = 1 ;i<=digit;i++){
        result = result*i;
    }
    return result;
}
}