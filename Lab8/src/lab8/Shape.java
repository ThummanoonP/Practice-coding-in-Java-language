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
abstract public class Shape {
    protected int x,y,w,h;

    public Shape(int x,int y,int w,int h){
        this.x=x;
        this.y=y;
        this.w=w;
        this.h=h;
    }
    abstract void paint(Graphics g);
}
