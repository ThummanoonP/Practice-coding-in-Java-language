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
public class Ellipse extends Shape{
    public Ellipse (int x,int y,int w,int h){
       super(x,y,w,h);
    }

    @Override
    void paint(Graphics g) {
          g.drawOval(x, y, w, h);
    }

}
