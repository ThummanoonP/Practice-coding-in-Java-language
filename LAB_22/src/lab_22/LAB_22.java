/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_22;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int homeWorkScore, projectScore, quizScore, finalExamScore, totalScore;
        String studenID;
        for (int i = 0;i<10;i++){ 
            Scanner scanIn = new Scanner(System.in);
            System.out.print("Studen ID : "); 
            studenID = scanIn.nextLine();  
            homeWorkScore = homeWorkScore( );
            projectScore = projectScore( );
            quizScore = quizScore( );
            finalExamScore = finalExamScore( );
            totalScore = totalScore(homeWorkScore, projectScore, quizScore, finalExamScore);
            System.out.print("Total Score : "+totalScore+"\n"); 
            grade(totalScore);
        }
    }
    
     public static int homeWorkScore( ){
        int homeWorkScore;
        Scanner scanIn = new Scanner(System.in);
        do {
                System.out.print("Home Work Score :"); 
                homeWorkScore = scanIn.nextInt();  
                if (homeWorkScore  >= 0 && homeWorkScore  <= 20){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true); 
        return homeWorkScore;
    }
     
     public static int projectScore( ){
        int projectScore;
        Scanner scanIn = new Scanner(System.in);
        do {
                System.out.print("Projeck Score :"); 
                projectScore = scanIn.nextInt();  
                if (projectScore  >= 0 && projectScore  <= 10){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
        return projectScore;
    }
     
     public static int quizScore( ){
         int quizScore;
        Scanner scanIn = new Scanner(System.in);
        do {
                System.out.print("Quiz Score :"); 
                quizScore = scanIn.nextInt();  
                if (quizScore  >= 0 && quizScore  <= 30){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true); 
        return quizScore;
    }
     
     public static int finalExamScore( ){
        int finalExamScore;
        Scanner scanIn = new Scanner(System.in);
        do {
                System.out.print("Final Eaxm Score :"); 
                finalExamScore = scanIn.nextInt();  
                if (finalExamScore  >= 0 && finalExamScore  <= 40){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
        return finalExamScore;
    }
    
     public static void grade(double totalScore) { 
        
        if (totalScore < 50){
            System.out.print("Grade : F \n"); 
        }else if (totalScore >= 50 && totalScore < 60 ){
            System.out.print("Grade : D \n"); 
        }else if (totalScore >= 60 && totalScore < 80){
            System.out.print("Grade : C \n"); 
        }else if (totalScore >= 80 && totalScore < 90){
            System.out.print("Grade : B \n"); 
        }else if (totalScore >= 90 && totalScore <= 100){
            System.out.print("Grade : A \n"); 
        }else 
            System.out.print("Grade : F \n"); 
    }   
     
    public static int totalScore(int homeWorkScore , int projectScore, int quizScore, int finalExamScore) { 
        int result = homeWorkScore+projectScore+quizScore+finalExamScore;
        return result;
    }   
}
