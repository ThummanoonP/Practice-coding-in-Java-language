/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * classRoomSection1.java
 *
 * Created on 9 ต.ค. 2553, 22:24:11
 */

package thelastproject;

import java.awt.Color;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class ClassRoomSection1 extends javax.swing.JFrame {
    String ID;
    int a,time;
    private Calendar upDateTime = Calendar.getInstance();
    /** Creates new form classRoomSection1 */
    public ClassRoomSection1(String id, int a) throws Exception{
            initComponents();
           // Calendar u = Calendar.getInstance();
            this.ID=id;
            this.a=a;
            this.time = upDateTime.get(Calendar.HOUR);
            if(time<8) time+=12;
            if(a==1) admin.setVisible(true);
            else admin.setVisible(false);
            if (fixRoom.selectByRoom(101).getStat() == 1) {
                room101.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(101).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(101).geth8()).getTime()==time+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(101).geth8().equals("X")==false)
                    room101.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(101).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(101).geth9()).getTime() == time+.0+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(101).geth9().equals("X")==false)
                    room101.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(101).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(101).geth10()).getTime() == time+.0+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(101).geth10().equals("X")==false)
                    room101.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(101).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(101).geth11()).getTime() == time+.0+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(101).geth11().equals("X")==false)
                    room101.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(101).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(101).geth12()).getTime() == time+.0+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(101).geth12().equals("X")==false)
                    room101.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(101).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(101).geth13()).getTime() == time+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(101).geth13().equals("X")==false)
                    room101.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(101).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(101).geth14()).getTime() == time+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(101).geth14().equals("X")==false)
                    room101.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(101).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(101).geth15()).getTime() == time+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(101).geth15().equals("X")==false)
                    room101.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(101).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(101).geth16()).getTime() == time+.0)
                   room101.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(101).geth16().equals("X")==false)
                    room101.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(102).getStat() == 1) {
                room102.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(102).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(102).geth8()).getTime()==time)
                   room102.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(102).geth8().equals("X")==false)
                    room102.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(102).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(102).geth9()).getTime() == time+.0)
                   room102.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(102).geth9().equals("X")==false)
                    room102.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(102).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(102).geth10()).getTime() == time+.0)
                   room102.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(102).geth10().equals("X")==false)
                    room102.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(102).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(102).geth11()).getTime() == time+.0)
                   room102.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(102).geth11().equals("X")==false)
                    room102.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(102).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(102).geth12()).getTime() == time+.0)
                   room102.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(102).geth12().equals("X")==false)
                    room102.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(102).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(102).geth13()).getTime() == time+.0)
                   room102.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(102).geth13().equals("X")==false)
                    room102.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(102).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(102).geth14()).getTime() == time+.0)
                   room102.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(102).geth14().equals("X")==false)
                    room102.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(102).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(102).geth15()).getTime() == time+.0)
                   room102.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(102).geth15().equals("X")==false)
                    room102.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(101).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(102).geth16()).getTime() == time+.0)
                   room102.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(101).geth16().equals("X")==false)
                    room102.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(103).getStat() == 1) {
                room103.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(103).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(103).geth8()).getTime()==time)
                   room103.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(103).geth8().equals("X")==false)
                    room103.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(103).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(103).geth9()).getTime() == time+.0)
                   room103.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(103).geth9().equals("X")==false)
                    room103.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(103).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(103).geth10()).getTime() == time+.0)
                   room103.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(103).geth10().equals("X")==false)
                    room103.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(103).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(103).geth11()).getTime() == time+.0)
                   room103.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(103).geth11().equals("X")==false)
                    room103.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(103).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(103).geth12()).getTime() == time+.0)
                   room103.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(103).geth12().equals("X")==false)
                    room103.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(103).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(103).geth13()).getTime() == time+.0)
                   room103.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(103).geth13().equals("X")==false)
                    room103.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(103).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(103).geth14()).getTime() == time+.0)
                   room103.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(103).geth14().equals("X")==false)
                    room103.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(103).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(103).geth15()).getTime() == time+.0)
                   room103.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(103).geth15().equals("X")==false)
                    room103.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(103).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(103).geth16()).getTime() == time+.0)
                   room103.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(103).geth16().equals("X")==false)
                    room103.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(104).getStat() == 1) {
                room104.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(104).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(104).geth8()).getTime()==time)
                   room104.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(104).geth8().equals("X")==false)
                    room104.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(104).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(104).geth9()).getTime() == time+.0)
                   room104.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(104).geth9().equals("X")==false)
                    room104.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(104).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(104).geth10()).getTime() == time+.0)
                   room104.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(104).geth10().equals("X")==false)
                    room104.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(104).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(104).geth11()).getTime() == time+.0)
                   room104.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(104).geth11().equals("X")==false)
                    room104.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(104).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(104).geth12()).getTime() == time+.0)
                   room104.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(104).geth12().equals("X")==false)
                    room104.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(104).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(104).geth13()).getTime() == time+.0)
                   room104.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(104).geth13().equals("X")==false)
                    room104.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(104).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(104).geth14()).getTime() == time+.0)
                   room104.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(104).geth14().equals("X")==false)
                    room104.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(104).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(104).geth15()).getTime() == time+.0)
                   room104.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(104).geth15().equals("X")==false)
                    room104.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(104).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(104).geth16()).getTime() == time+.0)
                   room104.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(104).geth16().equals("X")==false)
                    room104.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(105).getStat() == 1) {
                room105.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(105).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(105).geth8()).getTime()==time)
                   room105.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(105).geth8().equals("X")==false)
                    room105.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(105).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(105).geth9()).getTime() == time+.0)
                   room105.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(105).geth9().equals("X")==false)
                    room105.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(105).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(105).geth10()).getTime() == time+.0)
                   room105.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(105).geth10().equals("X")==false)
                    room105.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(105).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(105).geth11()).getTime() == time+.0)
                   room105.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(105).geth11().equals("X")==false)
                    room105.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(105).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(105).geth12()).getTime() == time+.0)
                   room105.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(105).geth12().equals("X")==false)
                    room105.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(105).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(105).geth13()).getTime() == time+.0)
                   room105.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(105).geth13().equals("X")==false)
                    room105.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(105).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(105).geth14()).getTime() == time+.0)
                   room105.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(105).geth14().equals("X")==false)
                    room105.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(105).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(105).geth15()).getTime() == time+.0)
                   room105.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(105).geth15().equals("X")==false)
                    room105.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(105).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(105).geth16()).getTime() == time+.0)
                   room105.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(105).geth16().equals("X")==false)
                    room105.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(106).getStat() == 1) {
                room106.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(106).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(106).geth8()).getTime()==time)
                   room106.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(106).geth8().equals("X")==false)
                    room106.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(106).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(106).geth9()).getTime() == time+.0)
                   room106.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(106).geth9().equals("X")==false)
                    room106.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(106).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(106).geth10()).getTime() == time+.0)
                   room106.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(106).geth10().equals("X")==false)
                    room106.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(106).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(106).geth11()).getTime() == time+.0)
                   room106.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(106).geth11().equals("X")==false)
                    room106.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(106).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(106).geth12()).getTime() == time+.0)
                   room106.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(106).geth12().equals("X")==false)
                    room106.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(106).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(106).geth13()).getTime() == time+.0)
                   room106.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(106).geth13().equals("X")==false)
                    room106.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(106).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(106).geth14()).getTime() == time+.0)
                   room106.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(106).geth14().equals("X")==false)
                    room106.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(106).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(106).geth15()).getTime() == time+.0)
                   room106.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(106).geth15().equals("X")==false)
                    room106.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(106).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(106).geth16()).getTime() == time+.0)
                   room106.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(106).geth16().equals("X")==false)
                    room106.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(107).getStat() == 1) {
                room107.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(107).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(107).geth8()).getTime()==time)
                   room107.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(107).geth8().equals("X")==false)
                    room107.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(107).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(107).geth9()).getTime() == time+.0)
                   room107.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(107).geth9().equals("X")==false)
                    room107.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(107).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(107).geth10()).getTime() == time+.0)
                   room107.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(107).geth10().equals("X")==false)
                    room107.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(107).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(107).geth11()).getTime() == time+.0)
                   room107.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(107).geth11().equals("X")==false)
                    room107.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(107).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(107).geth12()).getTime() == time+.0)
                   room107.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(107).geth12().equals("X")==false)
                    room107.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(107).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(107).geth13()).getTime() == time+.0)
                   room107.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(107).geth13().equals("X")==false)
                    room107.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(107).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(107).geth14()).getTime() == time+.0)
                   room107.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(107).geth14().equals("X")==false)
                    room107.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(107).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(107).geth15()).getTime() == time+.0)
                   room107.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(107).geth15().equals("X")==false)
                    room107.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(107).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(107).geth16()).getTime() == time+.0)
                   room107.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(107).geth16().equals("X")==false)
                    room107.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(108).getStat() == 1) {
                room108.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(108).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(108).geth8()).getTime()==time)
                   room108.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(108).geth8().equals("X")==false)
                    room108.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(108).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(108).geth9()).getTime() == time+.0)
                   room108.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(108).geth9().equals("X")==false)
                    room108.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(108).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(108).geth10()).getTime() == time+.0)
                   room108.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(108).geth10().equals("X")==false)
                    room108.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(108).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(108).geth11()).getTime() == time+.0)
                   room108.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(108).geth11().equals("X")==false)
                    room108.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(108).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(108).geth12()).getTime() == time+.0)
                   room108.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(108).geth12().equals("X")==false)
                    room108.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(108).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(108).geth13()).getTime() == time+.0)
                   room108.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(108).geth13().equals("X")==false)
                    room108.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(108).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(108).geth14()).getTime() == time+.0)
                   room108.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(108).geth14().equals("X")==false)
                    room108.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(108).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(108).geth15()).getTime() == time+.0)
                   room108.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(108).geth15().equals("X")==false)
                    room108.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(108).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(108).geth16()).getTime() == time+.0)
                   room108.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(108).geth16().equals("X")==false)
                    room108.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(109).getStat() == 1) {
                room109.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(109).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(109).geth8()).getTime()==time)
                   room109.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(109).geth8().equals("X")==false)
                    room109.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(109).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(109).geth9()).getTime() == time+.0)
                   room109.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(109).geth9().equals("X")==false)
                    room109.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(109).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(109).geth10()).getTime() == time+.0)
                   room109.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(109).geth10().equals("X")==false)
                    room109.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(109).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(109).geth11()).getTime() == time+.0)
                   room109.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(109).geth11().equals("X")==false)
                    room109.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(109).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(109).geth12()).getTime() == time+.0)
                   room109.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(109).geth12().equals("X")==false)
                    room109.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(109).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(109).geth13()).getTime() == time+.0)
                   room109.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(109).geth13().equals("X")==false)
                    room109.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(109).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(109).geth14()).getTime() == time+.0)
                   room109.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(109).geth14().equals("X")==false)
                    room109.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(109).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(109).geth15()).getTime() == time+.0)
                   room109.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(109).geth15().equals("X")==false)
                    room109.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(109).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(109).geth16()).getTime() == time+.0)
                   room109.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(109).geth16().equals("X")==false)
                    room109.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(110).getStat() == 1) {
                room110.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(110).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(110).geth8()).getTime()==time)
                   room110.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(110).geth8().equals("X")==false)
                    room110.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(110).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(110).geth9()).getTime() == time+.0)
                   room110.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(110).geth9().equals("X")==false)
                    room110.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(110).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(110).geth10()).getTime() == time+.0)
                   room110.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(110).geth10().equals("X")==false)
                    room110.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(110).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(110).geth11()).getTime() == time+.0)
                   room110.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(110).geth11().equals("X")==false)
                    room110.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(110).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(110).geth12()).getTime() == time+.0)
                   room110.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(110).geth12().equals("X")==false)
                    room110.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(110).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(110).geth13()).getTime() == time+.0)
                   room110.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(110).geth13().equals("X")==false)
                    room110.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(110).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(110).geth14()).getTime() == time+.0)
                   room110.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(110).geth14().equals("X")==false)
                    room110.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(110).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(110).geth15()).getTime() == time+.0)
                   room110.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(110).geth15().equals("X")==false)
                    room110.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(110).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(110).geth16()).getTime() == time+.0)
                   room110.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(110).geth16().equals("X")==false)
                    room110.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(111).getStat() == 1) {
                room111.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(111).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(111).geth8()).getTime()==time)
                   room111.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(111).geth8().equals("X")==false)
                    room111.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(111).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(111).geth9()).getTime() == time+.0)
                   room111.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(111).geth9().equals("X")==false)
                    room111.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(111).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(111).geth10()).getTime() == time+.0)
                   room111.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(111).geth10().equals("X")==false)
                    room111.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(111).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(111).geth11()).getTime() == time+.0)
                   room111.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(111).geth11().equals("X")==false)
                    room111.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(111).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(111).geth12()).getTime() == time+.0)
                   room111.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(111).geth12().equals("X")==false)
                    room111.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(111).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(111).geth13()).getTime() == time+.0)
                   room111.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(111).geth13().equals("X")==false)
                    room111.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(111).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(111).geth14()).getTime() == time+.0)
                   room111.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(111).geth14().equals("X")==false)
                    room111.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(111).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(111).geth15()).getTime() == time+.0)
                   room111.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(111).geth15().equals("X")==false)
                    room111.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(111).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(111).geth16()).getTime() == time+.0)
                   room111.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(111).geth16().equals("X")==false)
                    room111.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(112).getStat() == 1) {
                room112.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(112).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(112).geth8()).getTime()==time)
                   room112.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(112).geth8().equals("X")==false)
                    room112.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(112).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(112).geth9()).getTime() == time+.0)
                   room112.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(112).geth9().equals("X")==false)
                    room112.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(112).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(112).geth10()).getTime() == time+.0)
                   room112.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(112).geth10().equals("X")==false)
                    room112.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(112).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(112).geth11()).getTime() == time+.0)
                   room112.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(112).geth11().equals("X")==false)
                    room112.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(112).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(112).geth12()).getTime() == time+.0)
                   room112.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(112).geth12().equals("X")==false)
                    room112.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(112).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(112).geth13()).getTime() == time+.0)
                   room112.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(112).geth13().equals("X")==false)
                    room112.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(112).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(112).geth14()).getTime() == time+.0)
                   room112.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(112).geth14().equals("X")==false)
                    room112.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(112).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(112).geth15()).getTime() == time+.0)
                   room112.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(112).geth15().equals("X")==false)
                    room112.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(112).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(112).geth16()).getTime() == time+.0)
                   room112.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(112).geth16().equals("X")==false)
                    room112.setBackground(Color.RED);
            }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchRoom = new javax.swing.JButton();
        room112 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        room106 = new javax.swing.JButton();
        room111 = new javax.swing.JButton();
        room102 = new javax.swing.JButton();
        room105 = new javax.swing.JButton();
        room107 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        room104 = new javax.swing.JButton();
        room110 = new javax.swing.JButton();
        room108 = new javax.swing.JButton();
        room103 = new javax.swing.JButton();
        room109 = new javax.swing.JButton();
        staBox = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        ปิดปรับปรุง = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        room101 = new javax.swing.JButton();
        admin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        searchRoom.setFont(new java.awt.Font("Tahoma", 1, 11));
        searchRoom.setText("SearchRoom");
        searchRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRoomActionPerformed(evt);
            }
        });

        room112.setBackground(new java.awt.Color(0, 255, 0));
        room112.setFont(new java.awt.Font("Tahoma", 1, 18));
        room112.setText("112");
        room112.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room112ActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 11));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        room106.setBackground(new java.awt.Color(0, 255, 0));
        room106.setFont(new java.awt.Font("Tahoma", 1, 18));
        room106.setText("106");
        room106.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room106ActionPerformed(evt);
            }
        });

        room111.setBackground(new java.awt.Color(0, 255, 0));
        room111.setFont(new java.awt.Font("Tahoma", 1, 18));
        room111.setText("111");
        room111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room111ActionPerformed(evt);
            }
        });

        room102.setBackground(new java.awt.Color(0, 255, 0));
        room102.setFont(new java.awt.Font("Tahoma", 1, 18));
        room102.setText("102");
        room102.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room102ActionPerformed(evt);
            }
        });

        room105.setBackground(new java.awt.Color(0, 255, 0));
        room105.setFont(new java.awt.Font("Tahoma", 1, 18));
        room105.setText("105");
        room105.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room105ActionPerformed(evt);
            }
        });

        room107.setBackground(new java.awt.Color(0, 255, 0));
        room107.setFont(new java.awt.Font("Tahoma", 1, 18));
        room107.setText("107");
        room107.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room107ActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 1, 11));
        next.setText("Next Section");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        room104.setBackground(new java.awt.Color(0, 255, 0));
        room104.setFont(new java.awt.Font("Tahoma", 1, 18));
        room104.setText("104");
        room104.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room104ActionPerformed(evt);
            }
        });

        room110.setBackground(new java.awt.Color(0, 255, 0));
        room110.setFont(new java.awt.Font("Tahoma", 1, 18));
        room110.setText("110");
        room110.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room110ActionPerformed(evt);
            }
        });

        room108.setBackground(new java.awt.Color(0, 255, 0));
        room108.setFont(new java.awt.Font("Tahoma", 1, 18));
        room108.setText("108");
        room108.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room108ActionPerformed(evt);
            }
        });

        room103.setBackground(new java.awt.Color(0, 255, 0));
        room103.setFont(new java.awt.Font("Tahoma", 1, 18));
        room103.setText("103");
        room103.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room103ActionPerformed(evt);
            }
        });

        room109.setBackground(new java.awt.Color(0, 255, 0));
        room109.setFont(new java.awt.Font("Tahoma", 1, 18));
        room109.setText("109");
        room109.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room109ActionPerformed(evt);
            }
        });

        staBox.setBackground(new java.awt.Color(102, 255, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(0, 255, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("ว่าง");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("มีการจองใข้งาน");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("มีการใช้งานอยู่");

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 42, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        ปิดปรับปรุง.setFont(new java.awt.Font("Tahoma", 1, 11));
        ปิดปรับปรุง.setText("ปิดปรับปรุง");

        javax.swing.GroupLayout staBoxLayout = new javax.swing.GroupLayout(staBox);
        staBox.setLayout(staBoxLayout);
        staBoxLayout.setHorizontalGroup(
            staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, staBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(ปิดปรับปรุง, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        staBoxLayout.setVerticalGroup(
            staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(staBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(staBoxLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(staBoxLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ปิดปรับปรุง)))
                .addContainerGap())
        );

        admin.setFont(new java.awt.Font("Tahoma", 1, 11));
        admin.setText("Admin Room");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        room101.setBackground(new java.awt.Color(0, 255, 0));
        room101.setFont(new java.awt.Font("Tahoma", 1, 18));
        room101.setText("101");
        room101.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room101ActionPerformed(evt);
            }
        });

        admin1.setFont(new java.awt.Font("Tahoma", 1, 11));
        admin1.setText("User Room");
        admin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(room105, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room106, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room104, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room102, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room103, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(81, 81, 81)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(searchRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(staBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(82, 82, 82)
                                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59))))
                    .addComponent(room101, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room107, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room108, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room109, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room110, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(room107, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room101, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(room108, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(room109, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(room110, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(room111, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(room112, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(room102, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(room103, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(room104, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(room105, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(room106, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(next)
                                .addGap(33, 33, 33)
                                .addComponent(admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(staBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
          ClassRoomSection2 c = new ClassRoomSection2(ID, a);
                  c.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextActionPerformed

    private void searchRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRoomActionPerformed
        // TODO add your handling code here:
       this.dispose();
       SearchRoom sr = new SearchRoom(ID, a);
       sr.setVisible(true);
    }//GEN-LAST:event_searchRoomActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainManu().setVisible(true);
    }//GEN-LAST:event_logoutActionPerformed

    private void room102ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room102ActionPerformed
        try {
            if (fixRoom.selectByRoom(102).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
                this.dispose();
                Room r = new Room(ID, 102, a);;
                r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room102ActionPerformed

    private void room103ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room103ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(103).getStat() == 1)
                JOptionPane.showMessageDialog(this, "ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
                this.dispose();
                Room r = new Room(ID, 103, a);
                r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room103ActionPerformed

    private void room104ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room104ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(104).getStat() == 1)
                JOptionPane.showMessageDialog(this, "ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
                this.dispose();
                Room r = new Room(ID, 104, a); //เรียก constructor เพื่อกำหนดค่าตามต้องการ
                r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room104ActionPerformed

    private void room105ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room105ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(105).getStat() == 1)
                JOptionPane.showMessageDialog(this, "ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
             else {
                this.dispose();
                Room r = new Room(ID, 105, a);
                r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room105ActionPerformed

    private void room106ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room106ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(106).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
            this.dispose();
            Room r = new Room(ID, 106, a);
            r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room106ActionPerformed

    private void room107ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room107ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(107).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
            this.dispose();
            Room r = new Room(ID, 107, a);
            r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room107ActionPerformed

    private void room108ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room108ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(108).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
            this.dispose();
            Room r = new Room(ID, 108, a);
            r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room108ActionPerformed

    private void room109ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room109ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(109).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
            this.dispose();
            Room r = new Room(ID, 109, a);
            r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room109ActionPerformed

    private void room110ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room110ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(110).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
            this.dispose();
            Room r = new Room(ID, 110, a);
            r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room110ActionPerformed

    private void room111ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room111ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(111).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
            this.dispose();
            Room r = new Room(ID, 111, a);
            r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room111ActionPerformed

    private void room112ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room112ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(112).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
            this.dispose();
            Room r = new Room(ID, 112, a);
            r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room112ActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdminRoom(ID, a).setVisible(true);
}//GEN-LAST:event_adminActionPerformed

    private void room101ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room101ActionPerformed
        try {
            // TODO add your handling code here:
            if (fixRoom.selectByRoom(101).getStat() == 1)
            JOptionPane.showMessageDialog(this,"ห้องนี้ปิดปรับปรุงอยู่กรุณาเลือกห้องใหม่");
            else {
            this.dispose();
            Room r = new Room(ID, 101, a);
            r.setVisible(true);
            }
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room101ActionPerformed

    private void admin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new UserRoom(ID, a).setVisible(true);
    }//GEN-LAST:event_admin1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ClassRoomSection1().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ClassRoomSection1.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admin;
    private javax.swing.JButton admin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton logout;
    private javax.swing.JButton next;
    private javax.swing.JButton room101;
    private javax.swing.JButton room102;
    private javax.swing.JButton room103;
    private javax.swing.JButton room104;
    private javax.swing.JButton room105;
    private javax.swing.JButton room106;
    private javax.swing.JButton room107;
    private javax.swing.JButton room108;
    private javax.swing.JButton room109;
    private javax.swing.JButton room110;
    private javax.swing.JButton room111;
    private javax.swing.JButton room112;
    private javax.swing.JButton searchRoom;
    private javax.swing.JPanel staBox;
    private javax.swing.JLabel ปิดปรับปรุง;
    // End of variables declaration//GEN-END:variables

}
