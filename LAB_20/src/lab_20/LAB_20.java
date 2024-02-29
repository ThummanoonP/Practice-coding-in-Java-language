/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_20;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int roomNumber, roomPrice, electricUnit, waterUnit, wifiPrice, check, total,electricPiceTotal,waterPiceTotal;
        
        do{
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Room Number:");
        roomNumber = scanIn.nextInt(); 
        System.out.print("Room Price:");
        roomPrice = scanIn.nextInt(); 
        System.out.print("Electric Unit:");
        electricUnit = scanIn.nextInt(); 
        System.out.print("Water Unit:");
        waterUnit = scanIn.nextInt(); 
        System.out.print("Wifi Price:");
        wifiPrice = scanIn.nextInt(); 
        
        System.out.print("Room: "+roomNumber+"\n");
        System.out.print("Room Price = "+roomPrice+"\n");
        electricPiceTotal = electricPrice(electricUnit);
        System.out.print("Total Electreic Price = "+electricPiceTotal+"\n");
        waterPiceTotal = waterPrice(waterUnit);
        System.out.print("Total Water Price = "+waterPiceTotal+"\n");
        System.out.print("Total WiFi Price = "+wifiPrice+"\n");
        total = roomPrice+electricPiceTotal+waterPiceTotal+wifiPrice;
        System.out.print("Total Price = "+total+"\n");
        
        System.out.print("more room? (9 for more OR others for end )");
        check = scanIn.nextInt(); 
        if (check !=9 ){
            break;
        }
        }while(true);
    }
    
    public static int waterPrice(int waterUnit){
        int waterPrice ; 
        if (waterUnit<=5){
            System.out.print("Water Unit 1 - 5 Price 15 Bath Per Unit  = "+waterUnit*15+" bath \n");
            waterPrice = waterUnit*15; 
        }
        else if(waterUnit<=10){
            System.out.print("Water Unit 1 - 5 Price 15 Bath Per Unit  = "+5*15+" bath \n");
            System.out.print("Water Unit 6 to 10 Price 20 Bath Per Unit  = "+(waterUnit-5)*20+" bath \n");
            waterPrice = (5*15)+((waterUnit-5)*20); 
        }
        else{
            System.out.print("Water Unit 1 to 5 Price 15 Bath Per Unit  = "+5*15+" bath \n");
            System.out.print("Water Unit 6 to 10 Price 20 Bath Per Unit  = "+5*20+" bath \n");
            System.out.print("Water Unit 11 to Higth Price 25 Bath Per Unit  = "+(waterUnit-10)*25+" bath \n");
            waterPrice = (5*15)+(5*20)+((waterUnit-10)*20); 
        }
        return waterPrice;   
    }
    
    public static int electricPrice(int electricUnit){
        int electricPrice ; 
        if (electricUnit<=50){
            System.out.print("Electric Unit 1 - 50 Price 8 Bath Per Unit  = "+electricUnit*8+" bath \n");
            electricPrice = electricUnit*8; 
        }
        else if(electricUnit<=200){
            System.out.print("Electric Unit 1 - 50 Price 8 Bath Per Unit  = "+50*8+" bath \n");
            System.out.print("Electric Unit 51 to 200 Price 9 Bath Per Unit  = "+(electricUnit-50)*9+" bath \n");
            electricPrice = (5*8)+((electricUnit-50)*9); 
        }
        else{
            System.out.print("Electric Unit 1 to 50 Price 8 Bath Per Unit  = "+50*8+" bath \n");
            System.out.print("Electric Unit 50 to 200 Price 9 Bath Per Unit  = "+150*9+" bath \n");
            System.out.print("Electric Unit 201 to Higth Price 10 Bath Per Unit  = "+(electricUnit-200)*10+" bath \n");
            electricPrice = (5*8)+(5*9)+((electricUnit-200)*10); 
        }
        return electricPrice;  
    }
}
