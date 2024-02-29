/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_31;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num = new int[10];
        int check,choice;
        String word = null;
        Scanner scanIn = new Scanner(System.in);
        
        do{
            for (int i = 0;i<10;i++){ 
                num[i] = (int)( Math.random( ) * 100 );
                System.out.print(num[i]+"\n");
            }
            
            for(int i =0;i<5;i++){
                System.out.print("Enter Number  : "); 
                check = scanIn.nextInt();
                
                for (int j = 0;j<10;j++){ 
                   if (check == num[j]){
                       word = "CONGRATULATION";
                       for (int k = 0;k<10;k++){ 
                                System.out.print(num[k]+"\n");
                       }
                       break;
                   }else  word = "missing";
                }
                
                if(word.equals("CONGRATULATION")){
                    System.out.print(word+"\n");
                    break;
                }else if(i==4){ 
                    System.out.print(word+"\n");
                    System.out.print("GAME OVER\n");
                }else System.out.print(word+"\n");
            }  
            
            System.out.print("press 1 for yes , others for no/end :"); 
            choice = scanIn.nextInt();  
            if (choice != 1 ) break;
        }while (true);
    }
    
}
