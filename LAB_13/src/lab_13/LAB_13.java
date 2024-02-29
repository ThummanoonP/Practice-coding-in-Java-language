/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_13;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double homeWorkScore, projectScore, quizScore, finalExamScore, totalScore;
        String grade;
        Scanner scanIn = new Scanner(System.in);
        
       for (int i = 0;i<10;i++){ 
            do {
                System.out.print("Home Work Score :"); 
                homeWorkScore = scanIn.nextDouble();  
                if (homeWorkScore  >= 0 && homeWorkScore  <= 20){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
        
            do {
                System.out.print("Projeck Score :"); 
                projectScore = scanIn.nextDouble();  
                if (projectScore  >= 0 && projectScore  <= 10){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
        
            do {
                System.out.print("Quiz Score :"); 
                quizScore = scanIn.nextDouble();  
                if (quizScore  >= 0 && quizScore  <= 30){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
        
            do {
                System.out.print("Final Eaxm Score :"); 
                finalExamScore = scanIn.nextDouble();  
                if (finalExamScore  >= 0 && finalExamScore  <= 40){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
            
            totalScore = TotalScore.calculate(homeWorkScore, projectScore, quizScore, finalExamScore);
            grade = Grade.calculate(totalScore);
            System.out.print("Total Score : "+totalScore+"\n"); 
            System.out.print("Grade : "+grade+"\n"); 
       }
    }
}
