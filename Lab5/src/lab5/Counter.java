/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab5;

/**
 *
 * @author CS-KU
 */
public class Counter {
    private int x=0;
    public void up(){
        if(x<10) x++;
    }

    public void down(){
       if(x>0) x--;
    }
    public int getNumber(){
    return x;
    }

}
