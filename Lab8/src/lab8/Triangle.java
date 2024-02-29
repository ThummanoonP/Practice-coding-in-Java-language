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
public class Triangle extends Shape {
    public Triangle (int x,int y,int w,int h){
       super(x,y,w,h);

    }

    @Override
    void paint(Graphics g) {
         g.drawLine(x,y,x+w,y);
         g.drawLine(x,y,x,y+h);
         g.drawLine(x+w,y,x,y+h);
    }

}
