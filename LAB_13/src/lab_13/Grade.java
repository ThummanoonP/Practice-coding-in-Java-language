/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_13;

/**
 *
 * @author HeartLess
 */
class Grade {
    public static String calculate(double totalScore) { 
        
        if (totalScore < 50){
            return "F";
        }
        else if (totalScore >= 50 && totalScore < 60 ){
            return "D";
        }
        else if (totalScore >= 60 && totalScore < 80){
            return "C";
        }
        else if (totalScore >= 80 && totalScore < 90){
            return "B";
        }
        else if (totalScore >= 90 && totalScore <= 100){
            return "A";
        }
        else return "F";
    }    
}
