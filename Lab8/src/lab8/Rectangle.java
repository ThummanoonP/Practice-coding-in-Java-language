/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab8;

import java.awt.Graphics;

/**
 *
 * @author CS-KU
 */
public class Rectangle extends Shape{

    public Rectangle (int x,int y,int w,int h){
         super(x,y,w,h);
    }

    @Override
    void paint(Graphics g) {
        g.drawRect(x, y, w, h);
    }
}
