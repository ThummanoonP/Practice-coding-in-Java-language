/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ClassRoomSection3.java
 *
 * Created on 9 ต.ค. 2553, 22:29:54
 */

package thelastproject;

import java.awt.Color;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class ClassRoomSection3 extends javax.swing.JFrame {
    String ID;
    int a,time;
    private Calendar upDateTime = Calendar.getInstance();
    /** Creates new form ClassRoomSection3 */
    public ClassRoomSection3(String id, int a) throws Exception {
        initComponents();
            this.ID=id;
            this.a=a;
            this.time = upDateTime.get(Calendar.HOUR);
            if(a==0) admin.setVisible(false);
            else admin.setVisible(true);
            if (fixRoom.selectByRoom(301).getStat() == 1) {
                room301.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(301).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(301).geth8()).getTime()==time)
                   room301.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(301).geth8().equals("X")==false)
                    room301.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(301).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(301).geth9()).getTime() == time+.0)
                   room301.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(301).geth9().equals("X")==false)
                    room301.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(301).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(301).geth10()).getTime() == time+.0)
                   room301.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(301).geth10().equals("X")==false)
                    room301.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(301).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(301).geth11()).getTime() == time+.0)
                   room301.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(301).geth11().equals("X")==false)
                    room301.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(301).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(301).geth12()).getTime() == time+.0)
                   room301.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(301).geth12().equals("X")==false)
                    room301.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(301).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(301).geth13()).getTime() == time+.0)
                   room301.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(301).geth13().equals("X")==false)
                    room301.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(301).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(301).geth14()).getTime() == time+.0)
                   room301.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(301).geth14().equals("X")==false)
                    room301.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(301).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(301).geth15()).getTime() == time+.0)
                   room301.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(301).geth15().equals("X")==false)
                    room301.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(301).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(301).geth16()).getTime() == time+.0)
                   room301.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(301).geth16().equals("X")==false)
                    room301.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(302).getStat() == 1) {
                room302.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(302).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(302).geth8()).getTime()==time)
                   room302.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(302).geth8().equals("X")==false)
                    room302.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(302).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(302).geth9()).getTime() == time+.0)
                   room302.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(302).geth9().equals("X")==false)
                    room302.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(302).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(302).geth10()).getTime() == time+.0)
                   room302.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(302).geth10().equals("X")==false)
                    room302.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(302).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(302).geth11()).getTime() == time+.0)
                   room302.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(302).geth11().equals("X")==false)
                    room302.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(302).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(302).geth12()).getTime() == time+.0)
                   room302.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(302).geth12().equals("X")==false)
                    room302.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(302).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(302).geth13()).getTime() == time+.0)
                   room302.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(302).geth13().equals("X")==false)
                    room302.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(302).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(302).geth14()).getTime() == time+.0)
                   room302.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(302).geth14().equals("X")==false)
                    room302.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(302).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(302).geth15()).getTime() == time+.0)
                   room302.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(302).geth15().equals("X")==false)
                    room302.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(302).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(302).geth16()).getTime() == time+.0)
                   room302.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(302).geth16().equals("X")==false)
                    room302.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(303).getStat() == 1) {
                room303.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(303).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(303).geth8()).getTime()==time)
                   room303.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(303).geth8().equals("X")==false)
                    room303.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(303).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(303).geth9()).getTime() == time+.0)
                   room303.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(303).geth9().equals("X")==false)
                    room303.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(303).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(303).geth10()).getTime() == time+.0)
                   room303.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(303).geth10().equals("X")==false)
                    room303.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(303).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(303).geth11()).getTime() == time+.0)
                   room303.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(303).geth11().equals("X")==false)
                    room303.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(303).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(303).geth12()).getTime() == time+.0)
                   room303.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(303).geth12().equals("X")==false)
                    room303.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(303).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(303).geth13()).getTime() == time+.0)
                   room303.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(303).geth13().equals("X")==false)
                    room303.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(303).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(303).geth14()).getTime() == time+.0)
                   room303.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(303).geth14().equals("X")==false)
                    room303.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(303).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(303).geth15()).getTime() == time+.0)
                   room303.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(303).geth15().equals("X")==false)
                    room303.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(303).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(303).geth16()).getTime() == time+.0)
                   room303.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(303).geth16().equals("X")==false)
                    room303.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(304).getStat() == 1) {
                room304.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(304).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(304).geth8()).getTime()==time)
                   room304.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(304).geth8().equals("X")==false)
                    room304.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(304).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(304).geth9()).getTime() == time+.0)
                   room304.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(304).geth9().equals("X")==false)
                    room304.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(304).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(304).geth10()).getTime() == time+.0)
                   room304.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(304).geth10().equals("X")==false)
                    room304.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(304).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(304).geth11()).getTime() == time+.0)
                   room304.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(304).geth11().equals("X")==false)
                    room304.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(304).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(304).geth12()).getTime() == time+.0)
                   room304.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(304).geth12().equals("X")==false)
                    room304.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(304).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(304).geth13()).getTime() == time+.0)
                   room304.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(304).geth13().equals("X")==false)
                    room304.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(304).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(304).geth14()).getTime() == time+.0)
                   room304.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(304).geth14().equals("X")==false)
                    room304.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(304).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(304).geth15()).getTime() == time+.0)
                   room304.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(304).geth15().equals("X")==false)
                    room304.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(304).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(304).geth16()).getTime() == time+.0)
                   room304.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(304).geth16().equals("X")==false)
                    room304.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(305).getStat() == 1) {
                room305.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(305).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(305).geth8()).getTime()==time)
                   room305.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(305).geth8().equals("X")==false)
                    room305.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(305).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(305).geth9()).getTime() == time+.0)
                   room305.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(305).geth9().equals("X")==false)
                    room305.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(305).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(305).geth10()).getTime() == time+.0)
                   room305.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(305).geth10().equals("X")==false)
                    room305.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(305).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(305).geth11()).getTime() == time+.0)
                   room305.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(305).geth11().equals("X")==false)
                    room305.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(305).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(305).geth12()).getTime() == time+.0)
                   room305.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(305).geth12().equals("X")==false)
                    room305.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(305).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(305).geth13()).getTime() == time+.0)
                   room305.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(305).geth13().equals("X")==false)
                    room305.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(305).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(305).geth14()).getTime() == time+.0)
                   room305.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(305).geth14().equals("X")==false)
                    room305.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(305).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(305).geth15()).getTime() == time+.0)
                   room305.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(305).geth15().equals("X")==false)
                    room305.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(305).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(305).geth16()).getTime() == time+.0)
                   room305.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(305).geth16().equals("X")==false)
                    room305.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(306).getStat() == 1) {
                room306.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(306).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(306).geth8()).getTime()==time)
                   room306.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(306).geth8().equals("X")==false)
                    room306.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(306).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(306).geth9()).getTime() == time+.0)
                   room306.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(306).geth9().equals("X")==false)
                    room306.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(306).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(306).geth10()).getTime() == time+.0)
                   room306.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(306).geth10().equals("X")==false)
                    room306.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(306).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(306).geth11()).getTime() == time+.0)
                   room306.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(306).geth11().equals("X")==false)
                    room306.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(306).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(306).geth12()).getTime() == time+.0)
                   room306.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(306).geth12().equals("X")==false)
                    room306.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(306).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(306).geth13()).getTime() == time+.0)
                   room306.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(306).geth13().equals("X")==false)
                    room306.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(306).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(306).geth14()).getTime() == time+.0)
                   room306.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(306).geth14().equals("X")==false)
                    room306.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(306).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(306).geth15()).getTime() == time+.0)
                   room306.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(306).geth15().equals("X")==false)
                    room306.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(306).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(306).geth16()).getTime() == time+.0)
                   room306.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(306).geth16().equals("X")==false)
                    room306.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(307).getStat() == 1) {
                room307.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(307).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(307).geth8()).getTime()==time)
                   room307.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(307).geth8().equals("X")==false)
                    room307.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(307).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(307).geth9()).getTime() == time+.0)
                   room307.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(307).geth9().equals("X")==false)
                    room307.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(307).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(307).geth10()).getTime() == time+.0)
                   room307.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(307).geth10().equals("X")==false)
                    room307.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(307).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(307).geth11()).getTime() == time+.0)
                   room307.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(307).geth11().equals("X")==false)
                    room307.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(307).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(307).geth12()).getTime() == time+.0)
                   room307.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(307).geth12().equals("X")==false)
                    room307.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(307).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(307).geth13()).getTime() == time+.0)
                   room307.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(307).geth13().equals("X")==false)
                    room307.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(307).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(307).geth14()).getTime() == time+.0)
                   room307.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(307).geth14().equals("X")==false)
                    room307.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(307).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(307).geth15()).getTime() == time+.0)
                   room307.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(307).geth15().equals("X")==false)
                    room307.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(307).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(307).geth16()).getTime() == time+.0)
                   room307.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(307).geth16().equals("X")==false)
                    room307.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(308).getStat() == 1) {
                room308.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(308).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(308).geth8()).getTime()==time)
                   room308.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(308).geth8().equals("X")==false)
                    room308.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(308).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(308).geth9()).getTime() == time+.0)
                   room308.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(308).geth9().equals("X")==false)
                    room308.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(308).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(308).geth10()).getTime() == time+.0)
                   room308.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(308).geth10().equals("X")==false)
                    room308.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(308).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(308).geth11()).getTime() == time+.0)
                   room308.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(308).geth11().equals("X")==false)
                    room308.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(308).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(308).geth12()).getTime() == time+.0)
                   room308.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(308).geth12().equals("X")==false)
                    room308.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(308).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(308).geth13()).getTime() == time+.0)
                   room308.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(308).geth13().equals("X")==false)
                    room308.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(308).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(308).geth14()).getTime() == time+.0)
                   room308.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(308).geth14().equals("X")==false)
                    room308.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(308).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(308).geth15()).getTime() == time+.0)
                   room308.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(308).geth15().equals("X")==false)
                    room308.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(308).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(308).geth16()).getTime() == time+.0)
                   room308.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(308).geth16().equals("X")==false)
                    room308.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(309).getStat() == 1) {
                room309.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(309).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(309).geth8()).getTime()==time)
                   room309.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(309).geth8().equals("X")==false)
                    room309.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(309).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(309).geth9()).getTime() == time+.0)
                   room309.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(309).geth9().equals("X")==false)
                    room309.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(309).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(309).geth10()).getTime() == time+.0)
                   room309.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(309).geth10().equals("X")==false)
                    room309.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(309).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(309).geth11()).getTime() == time+.0)
                   room309.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(309).geth11().equals("X")==false)
                    room309.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(309).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(309).geth12()).getTime() == time+.0)
                   room309.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(309).geth12().equals("X")==false)
                    room309.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(309).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(309).geth13()).getTime() == time+.0)
                   room309.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(309).geth13().equals("X")==false)
                    room309.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(309).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(309).geth14()).getTime() == time+.0)
                   room309.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(309).geth14().equals("X")==false)
                    room309.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(309).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(309).geth15()).getTime() == time+.0)
                   room309.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(309).geth15().equals("X")==false)
                    room309.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(309).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(309).geth16()).getTime() == time+.0)
                   room309.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(309).geth16().equals("X")==false)
                    room309.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(310).getStat() == 1) {
                room310.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(310).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(310).geth8()).getTime()==time)
                   room310.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(310).geth8().equals("X")==false)
                    room310.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(310).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(310).geth9()).getTime() == time+.0)
                   room310.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(310).geth9().equals("X")==false)
                    room310.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(310).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(310).geth10()).getTime() == time+.0)
                   room310.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(310).geth10().equals("X")==false)
                    room310.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(310).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(310).geth11()).getTime() == time+.0)
                   room310.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(310).geth11().equals("X")==false)
                    room310.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(310).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(310).geth12()).getTime() == time+.0)
                   room310.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(310).geth12().equals("X")==false)
                    room310.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(310).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(310).geth13()).getTime() == time+.0)
                   room310.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(310).geth13().equals("X")==false)
                    room310.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(310).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(310).geth14()).getTime() == time+.0)
                   room310.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(310).geth14().equals("X")==false)
                    room310.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(310).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(310).geth15()).getTime() == time+.0)
                   room310.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(310).geth15().equals("X")==false)
                    room310.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(310).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(310).geth16()).getTime() == time+.0)
                   room310.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(310).geth16().equals("X")==false)
                    room310.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(312).getStat() == 1) {
                room312.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(312).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(312).geth8()).getTime()==time)
                   room312.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(312).geth8().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(312).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth9()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(312).geth9().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(312).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth10()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(312).geth10().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(312).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth11()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(312).geth11().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(312).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth12()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(312).geth12().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(312).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth13()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(312).geth13().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(312).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth14()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(312).geth14().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(312).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth15()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(312).geth15().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(312).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth16()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(312).geth16().equals("X")==false)
                    room312.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(312).getStat() == 1) {
                room312.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(312).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(312).geth8()).getTime()==time)
                   room312.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(312).geth8().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(312).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth9()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(312).geth9().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(312).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth10()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(312).geth10().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(312).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth11()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(312).geth11().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(312).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth12()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(312).geth12().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(312).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth13()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(312).geth13().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(312).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth14()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(312).geth14().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(312).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth15()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(312).geth15().equals("X")==false)
                    room312.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(312).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(312).geth16()).getTime() == time+.0)
                   room312.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(312).geth16().equals("X")==false)
                    room312.setBackground(Color.RED);
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

        room303 = new javax.swing.JButton();
        room309 = new javax.swing.JButton();
        room310 = new javax.swing.JButton();
        room308 = new javax.swing.JButton();
        room304 = new javax.swing.JButton();
        room312 = new javax.swing.JButton();
        searchRoom = new javax.swing.JButton();
        room307 = new javax.swing.JButton();
        room301 = new javax.swing.JButton();
        room311 = new javax.swing.JButton();
        room306 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        room305 = new javax.swing.JButton();
        room302 = new javax.swing.JButton();
        Pre = new javax.swing.JButton();
        staBox = new javax.swing.JPanel();
        ปิดปรับปรุง = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        admin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        room303.setBackground(new java.awt.Color(0, 255, 0));
        room303.setFont(new java.awt.Font("Tahoma", 1, 18));
        room303.setText("303");
        room303.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room303ActionPerformed(evt);
            }
        });

        room309.setBackground(new java.awt.Color(0, 255, 0));
        room309.setFont(new java.awt.Font("Tahoma", 1, 18));
        room309.setText("309");
        room309.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room309ActionPerformed(evt);
            }
        });

        room310.setBackground(new java.awt.Color(0, 255, 0));
        room310.setFont(new java.awt.Font("Tahoma", 1, 18));
        room310.setText("310");
        room310.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room310ActionPerformed(evt);
            }
        });

        room308.setBackground(new java.awt.Color(0, 255, 0));
        room308.setFont(new java.awt.Font("Tahoma", 1, 18));
        room308.setText("308");
        room308.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room308ActionPerformed(evt);
            }
        });

        room304.setBackground(new java.awt.Color(0, 255, 0));
        room304.setFont(new java.awt.Font("Tahoma", 1, 18));
        room304.setText("304");
        room304.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room304ActionPerformed(evt);
            }
        });

        room312.setBackground(new java.awt.Color(0, 255, 0));
        room312.setFont(new java.awt.Font("Tahoma", 1, 18));
        room312.setText("312");
        room312.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room312ActionPerformed(evt);
            }
        });

        searchRoom.setFont(new java.awt.Font("Tahoma", 1, 11));
        searchRoom.setText("SearchRoom");
        searchRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRoomActionPerformed(evt);
            }
        });

        room307.setBackground(new java.awt.Color(0, 255, 0));
        room307.setFont(new java.awt.Font("Tahoma", 1, 18));
        room307.setText("307");
        room307.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room307ActionPerformed(evt);
            }
        });

        room301.setBackground(new java.awt.Color(0, 255, 0));
        room301.setFont(new java.awt.Font("Tahoma", 1, 18));
        room301.setText("301");
        room301.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room301ActionPerformed(evt);
            }
        });

        room311.setBackground(new java.awt.Color(0, 255, 0));
        room311.setFont(new java.awt.Font("Tahoma", 1, 18));
        room311.setText("311");
        room311.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room311ActionPerformed(evt);
            }
        });

        room306.setBackground(new java.awt.Color(0, 255, 0));
        room306.setFont(new java.awt.Font("Tahoma", 1, 18));
        room306.setText("306");
        room306.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room306ActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 11));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        room305.setBackground(new java.awt.Color(0, 255, 0));
        room305.setFont(new java.awt.Font("Tahoma", 1, 18));
        room305.setText("305");
        room305.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room305ActionPerformed(evt);
            }
        });

        room302.setBackground(new java.awt.Color(0, 255, 0));
        room302.setFont(new java.awt.Font("Tahoma", 1, 18));
        room302.setText("302");
        room302.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room302ActionPerformed(evt);
            }
        });

        Pre.setFont(new java.awt.Font("Tahoma", 1, 11));
        Pre.setText("Previous Section");
        Pre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreActionPerformed(evt);
            }
        });

        staBox.setBackground(new java.awt.Color(102, 255, 204));

        ปิดปรับปรุง.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ปิดปรับปรุง.setText("ปิดปรับปรุง");

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("มีการใช้งานอยู่");

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
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
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel2.setText("มีการจองใข้งาน");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel1.setText("ว่าง");

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
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ปิดปรับปรุง))
                .addContainerGap(112, Short.MAX_VALUE))
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
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ปิดปรับปรุง)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        admin.setFont(new java.awt.Font("Tahoma", 1, 11));
        admin.setText("Admin Room");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
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
                    .addComponent(room301, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room305, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room306, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room304, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room302, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room303, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Pre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(staBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(room307, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room308, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room309, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room310, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room311, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room312, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(room301, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room307, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room308, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room302, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room303, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room309, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(room310, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room304, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Pre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(room311, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(room312, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(staBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(room305, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(room306, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void room309ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room309ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 309, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room309ActionPerformed

    private void room310ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room310ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
             Room r = new Room(ID, 310, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room310ActionPerformed

    private void room307ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room307ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 307, a);
            r.setVisible(true);;
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room307ActionPerformed

    private void room312ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room312ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 312, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room312ActionPerformed

    private void room308ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room308ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 308, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room308ActionPerformed

    private void room305ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room305ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 305, a);
            r.setVisible(true);;
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room305ActionPerformed

    private void room303ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room303ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
             Room r = new Room(ID, 303, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room303ActionPerformed

    private void room306ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room306ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
             Room r = new Room(ID, 306, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room306ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainManu().setVisible(true);
}//GEN-LAST:event_logoutActionPerformed

    private void room304ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room304ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
             Room r = new Room(ID, 304, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room304ActionPerformed

    private void room302ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room302ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
             Room r = new Room(ID, 302, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room302ActionPerformed

    private void PreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            ClassRoomSection2 c = new ClassRoomSection2(ID, a);
            c.ID=this.ID;
            c.a=this.a;
            c.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_PreActionPerformed

    private void room311ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room311ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
             Room r = new Room(ID, 312, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room311ActionPerformed

    private void searchRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRoomActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SearchRoom sr = new SearchRoom(ID, a);
        sr.ID=this.ID;
        sr.a=this.a;
        sr.setVisible(true);
}//GEN-LAST:event_searchRoomActionPerformed

    private void room301ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room301ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
             Room r = new Room(ID, 301, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room301ActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new AdminRoom(ID, a).setVisible(true);
}//GEN-LAST:event_adminActionPerformed

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
                    new ClassRoomSection3().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ClassRoomSection3.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pre;
    private javax.swing.JButton admin;
    private javax.swing.JButton admin1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JButton logout;
    private javax.swing.JButton room301;
    private javax.swing.JButton room302;
    private javax.swing.JButton room303;
    private javax.swing.JButton room304;
    private javax.swing.JButton room305;
    private javax.swing.JButton room306;
    private javax.swing.JButton room307;
    private javax.swing.JButton room308;
    private javax.swing.JButton room309;
    private javax.swing.JButton room310;
    private javax.swing.JButton room311;
    private javax.swing.JButton room312;
    private javax.swing.JButton searchRoom;
    private javax.swing.JPanel staBox;
    private javax.swing.JLabel ปิดปรับปรุง;
    // End of variables declaration//GEN-END:variables

}
