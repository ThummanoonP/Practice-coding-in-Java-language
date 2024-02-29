/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_28;

import java.util.Scanner;

/**
 *
 * @author HeartLess
 */
public class LAB_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] homeWorkScore = new int[8], projectScore = new int[8], quizScore = new int[8], finalExamScore = new int[8], totalScore = new int[8], studenID = new int[8];
        double hwAverage = 0, reAverage = 0,quAverage = 0, fiAverage = 0, totAverage = 0;
        String[]  grade = new String[8];
        String getA = " ", getB = " ", getC = " ", getD = " ", getF = " ";
        Scanner scanIn = new Scanner(System.in);
        
       for (int i = 0;i<8;i++){ 
           
            System.out.print("Studen ID : "); 
            studenID[i] = scanIn.nextInt();
            do {
                System.out.print("Home Work Score :"); 
                homeWorkScore[i] = scanIn.nextInt();  
                if (homeWorkScore[i]  >= 0 && homeWorkScore[i]  <= 20){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
        
            do {
                System.out.print("Projeck Score :"); 
                projectScore[i] = scanIn.nextInt();  
                if (projectScore[i]  >= 0 && projectScore[i]  <= 10){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
        
            do {
                System.out.print("Quiz Score :"); 
                quizScore[i] = scanIn.nextInt();  
                if (quizScore[i]  >= 0 && quizScore[i]  <= 30){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
        
            do {
                System.out.print("Final Eaxm Score :"); 
                finalExamScore[i] = scanIn.nextInt();  
                if (finalExamScore[i]  >= 0 && finalExamScore[i]  <= 40){
                   break;
                }else System.out.print("INVALID SCORE\n"); 
            }while(true);
            
            totalScore[i] = getTotalScore(homeWorkScore[i], projectScore[i], quizScore[i], finalExamScore[i]);
            grade[i] = getGrade(totalScore[i]);
       }
       System.out.print("                HW\tRE\tQU\tFI\tTOT\tGrade \n"); 

       for(int i = 0;i<8;i++){
               System.out.print("Student no. "+studenID[i]+"\t"+homeWorkScore[i]+"\t"+projectScore[i]+"\t"+quizScore[i]+"\t"+finalExamScore[i]+"\t"+totalScore[i] +"\t"+grade[i]+" \n");
               hwAverage += homeWorkScore[i];
               reAverage += projectScore[i];
               quAverage += quizScore[i];
               fiAverage += finalExamScore[i];
               totAverage += totalScore[i];        
               if (grade[i].equals("A")){
                   getA = getA + studenID[i]+"\t";
               }else if (grade[i].equals("B")){
                   getB = getB + studenID[i]+"\t";
               }else if (grade[i].equals("C")){
                   getC = getC + studenID[i]+"\t";
               }else if (grade[i].equals("D")){
                   getD = getD + studenID[i]+"\t";
               }else if (grade[i].equals("F")){     
                   getF = getF + studenID[i]+"\t";
               }     
       }
       
       hwAverage /= 8;
       reAverage /= 8;
       quAverage /= 8;
       fiAverage /= 8;
       totAverage /= 8; 
       System.out.print("Average         "+hwAverage+"\t"+reAverage+"\t"+quAverage+"\t"+fiAverage+"\t"+totAverage+" \n");
       System.out.print("Number of A student  =  "+getA+"\n");
       System.out.print("Number of B student  =  "+getB+"\n");
       System.out.print("Number of C student  =  "+getC+"\n");
       System.out.print("Number of D student  =  "+getD+"\n");
       System.out.print("Number of F student  =  "+getF+"\n");
    }
    
    public static String getGrade(double totalScore) { 
        if (totalScore < 50){
            return "F";
        }else if (totalScore >= 50 && totalScore < 60 ){
            return "D";
        }else if (totalScore >= 60 && totalScore < 80){
            return "C"; 
        }else if (totalScore >= 80 && totalScore < 90){
            return "B";
        }else if (totalScore >= 90 && totalScore <= 100){
            return "A";
        }else 
            return "F";
    }   
     
    public static int getTotalScore(int homeWorkScore , int projectScore, int quizScore, int finalExamScore) { 
        int result = homeWorkScore+projectScore+quizScore+finalExamScore;
        return result;
    }
}
