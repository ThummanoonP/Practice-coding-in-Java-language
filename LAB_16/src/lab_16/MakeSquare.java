/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_16;

/**
 *
 * @author HeartLess
 */
class MakeSquare {
    public static String stringLine(String char1, int width, int length){
        String stringLine = "";
        for (int i =1;i<=width ;i++){
            for(int j =1;j<=length ;j++){
                if(i==1||i==width||j==1||j==length){
                    stringLine =stringLine+char1;
                }else stringLine =stringLine+" ";
            } 
            stringLine =stringLine+"\n";
        }      
        return stringLine ;
    } 
}
