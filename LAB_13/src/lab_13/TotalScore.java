/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_13;

/**
 *
 * @author HeartLess
 */
class TotalScore {
    public static double calculate(double homeWorkScore , double projectScore, double quizScore, double finalExamScore) { 
        double result = homeWorkScore+projectScore+quizScore+finalExamScore;
        return (double) Math.floor(result*100)/100;
    }   
}
