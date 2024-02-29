/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab_1;

/**
 *
 * @author CS-KU
 */
public class Lab1_3 {
    public static boolean isPrime(int n){
        int i;
         for(i=2;i<(n/2);i++)  
         {
             if(n%i==0) return false;
         }
        return true;
    }
}
