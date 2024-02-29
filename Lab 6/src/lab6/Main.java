/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;

/**
 *
 * @author CS-KU
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        RatNum x = new RatNum(4, 16);
        RatNum y = new RatNum(2, 8);
        x.plus(y);
       // System.out.println(x.);
        System.out.println(x);
}


}
