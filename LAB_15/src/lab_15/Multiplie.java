/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_15;

/**
 *
 * @author HeartLess
 */
class Multiplie {
    public static String stringLine(int num){
        String stringLine = "";
        for (int i =1;i<=12 ;i++){
            stringLine =stringLine+num+" x "+i+"\t"+"= "+(num*i)+"\n";
        }      
        return stringLine ;
    }   
}
