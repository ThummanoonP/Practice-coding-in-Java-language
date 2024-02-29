/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_14;

/**
 *
 * @author HeartLess
 */
class Factorial {
     public static String stringLine(int num){
        String stringLine = "";
        int total=1;
        for (int i =1;i<=num ;i++){
            total = total*i;
            stringLine =stringLine+i;
            if (i<num) stringLine =stringLine+"*";
        }      
        stringLine = stringLine +" = "+total+ "\n";
        return stringLine ;
    }   
}
