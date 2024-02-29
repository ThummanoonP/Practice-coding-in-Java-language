/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_1;

/**
 *
 * @author CS-KU
 */
public class Lab1_4 {
   public static double tax(double income){
       double x=0;
       if(income>4000000) {
           x=x+((income-4000000)*37/100);
           income=4000000;
       }
       if(income>1000000&&income<=4000000){
           x=x+((income-1000000)*30/100);
           income=1000000;
       }
       if(income>500000&&income<=1000000){
           x=x+((income-500000)*20/100);
           income=500000;
       }
       if(income>150000&&income<=500000) {
           x=x+((income-150000)*10/100);
       }
       return x;
   }
}