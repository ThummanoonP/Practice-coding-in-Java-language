/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * classRoomSection2.java
 *
 * Created on 9 ต.ค. 2553, 22:29:19
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
public class ClassRoomSection2 extends javax.swing.JFrame {
    String ID;
    int a,time;
    private Calendar upDateTime = Calendar.getInstance();
    /** Creates new form classRoomSection2 */
    public ClassRoomSection2(String id, int a) throws Exception {
        initComponents();
            this.ID=id;
            this.a=a;
            this.time = upDateTime.get(Calendar.HOUR);
            if(a==0) admin.setVisible(false);
            else admin.setVisible(true);
            if (fixRoom.selectByRoom(201).getStat() == 1) {
                room201.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(201).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(201).geth8()).getTime()==time)
                   room201.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(201).geth8().equals("X")==false)
                    room201.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(201).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(201).geth9()).getTime() == time+.0)
                   room201.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(201).geth9().equals("X")==false)
                    room201.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(201).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(201).geth10()).getTime() == time+.0)
                   room201.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(201).geth10().equals("X")==false)
                    room201.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(201).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(201).geth11()).getTime() == time+.0)
                   room201.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(201).geth11().equals("X")==false)
                    room201.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(201).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(201).geth12()).getTime() == time+.0)
                   room201.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(201).geth12().equals("X")==false)
                    room201.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(201).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(201).geth13()).getTime() == time+.0)
                   room201.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(201).geth13().equals("X")==false)
                    room201.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(201).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(201).geth14()).getTime() == time+.0)
                   room201.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(201).geth14().equals("X")==false)
                    room201.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(201).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(201).geth15()).getTime() == time+.0)
                   room201.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(201).geth15().equals("X")==false)
                    room201.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(201).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(201).geth16()).getTime() == time+.0)
                   room201.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(201).geth16().equals("X")==false)
                    room201.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(202).getStat() == 1) {
                room202.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(202).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(202).geth8()).getTime()==time)
                   room202.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(202).geth8().equals("X")==false)
                    room202.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(202).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(202).geth9()).getTime() == time+.0)
                   room202.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(202).geth9().equals("X")==false)
                    room202.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(202).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(202).geth10()).getTime() == time+.0)
                   room202.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(202).geth10().equals("X")==false)
                    room202.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(202).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(202).geth11()).getTime() == time+.0)
                   room202.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(202).geth11().equals("X")==false)
                    room202.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(202).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(202).geth12()).getTime() == time+.0)
                   room202.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(202).geth12().equals("X")==false)
                    room202.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(202).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(202).geth13()).getTime() == time+.0)
                   room202.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(202).geth13().equals("X")==false)
                    room202.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(202).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(202).geth14()).getTime() == time+.0)
                   room202.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(202).geth14().equals("X")==false)
                    room202.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(202).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(202).geth15()).getTime() == time+.0)
                   room202.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(202).geth15().equals("X")==false)
                    room202.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(202).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(202).geth16()).getTime() == time+.0)
                   room202.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(202).geth16().equals("X")==false)
                    room202.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(203).getStat() == 1) {
                room203.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(203).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(203).geth8()).getTime()==time)
                   room203.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(203).geth8().equals("X")==false)
                    room203.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(203).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(203).geth9()).getTime() == time+.0)
                   room203.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(203).geth9().equals("X")==false)
                    room203.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(203).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(203).geth10()).getTime() == time+.0)
                   room203.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(203).geth10().equals("X")==false)
                    room203.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(203).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(203).geth11()).getTime() == time+.0)
                   room203.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(203).geth11().equals("X")==false)
                    room203.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(203).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(203).geth12()).getTime() == time+.0)
                   room203.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(203).geth12().equals("X")==false)
                    room203.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(203).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(203).geth13()).getTime() == time+.0)
                   room203.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(203).geth13().equals("X")==false)
                    room203.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(203).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(203).geth14()).getTime() == time+.0)
                   room203.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(203).geth14().equals("X")==false)
                    room203.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(203).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(203).geth15()).getTime() == time+.0)
                   room203.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(203).geth15().equals("X")==false)
                    room203.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(203).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(203).geth16()).getTime() == time+.0)
                   room203.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(203).geth16().equals("X")==false)
                    room203.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(204).getStat() == 1) {
                room204.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(204).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(204).geth8()).getTime()==time)
                   room204.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(204).geth8().equals("X")==false)
                    room204.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(204).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(204).geth9()).getTime() == time+.0)
                   room204.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(204).geth9().equals("X")==false)
                    room204.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(204).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(204).geth10()).getTime() == time+.0)
                   room204.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(204).geth10().equals("X")==false)
                    room204.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(204).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(204).geth11()).getTime() == time+.0)
                   room204.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(204).geth11().equals("X")==false)
                    room204.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(204).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(204).geth12()).getTime() == time+.0)
                   room204.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(204).geth12().equals("X")==false)
                    room204.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(204).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(204).geth13()).getTime() == time+.0)
                   room204.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(204).geth13().equals("X")==false)
                    room204.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(204).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(204).geth14()).getTime() == time+.0)
                   room204.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(204).geth14().equals("X")==false)
                    room204.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(204).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(204).geth15()).getTime() == time+.0)
                   room204.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(204).geth15().equals("X")==false)
                    room204.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(204).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(204).geth16()).getTime() == time+.0)
                   room204.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(204).geth16().equals("X")==false)
                    room204.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(205).getStat() == 1) {
                room205.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(205).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(205).geth8()).getTime()==time)
                   room205.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(205).geth8().equals("X")==false)
                    room205.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(205).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(205).geth9()).getTime() == time+.0)
                   room205.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(205).geth9().equals("X")==false)
                    room205.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(205).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(205).geth10()).getTime() == time+.0)
                   room205.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(205).geth10().equals("X")==false)
                    room205.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(205).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(205).geth11()).getTime() == time+.0)
                   room205.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(205).geth11().equals("X")==false)
                    room205.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(205).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(205).geth12()).getTime() == time+.0)
                   room205.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(205).geth12().equals("X")==false)
                    room205.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(205).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(205).geth13()).getTime() == time+.0)
                   room205.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(205).geth13().equals("X")==false)
                    room205.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(205).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(205).geth14()).getTime() == time+.0)
                   room205.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(205).geth14().equals("X")==false)
                    room205.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(205).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(205).geth15()).getTime() == time+.0)
                   room205.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(205).geth15().equals("X")==false)
                    room205.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(205).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(205).geth16()).getTime() == time+.0)
                   room205.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(205).geth16().equals("X")==false)
                    room205.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(206).getStat() == 1) {
                room206.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(206).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(206).geth8()).getTime()==time)
                   room206.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(206).geth8().equals("X")==false)
                    room206.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(206).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(206).geth9()).getTime() == time+.0)
                   room206.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(206).geth9().equals("X")==false)
                    room206.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(206).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(206).geth10()).getTime() == time+.0)
                   room206.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(206).geth10().equals("X")==false)
                    room206.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(206).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(206).geth11()).getTime() == time+.0)
                   room206.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(206).geth11().equals("X")==false)
                    room206.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(206).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(206).geth12()).getTime() == time+.0)
                   room206.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(206).geth12().equals("X")==false)
                    room206.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(206).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(206).geth13()).getTime() == time+.0)
                   room206.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(206).geth13().equals("X")==false)
                    room206.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(206).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(206).geth14()).getTime() == time+.0)
                   room206.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(206).geth14().equals("X")==false)
                    room206.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(206).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(206).geth15()).getTime() == time+.0)
                   room206.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(206).geth15().equals("X")==false)
                    room206.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(206).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(206).geth16()).getTime() == time+.0)
                   room206.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(206).geth16().equals("X")==false)
                    room206.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(207).getStat() == 1) {
                room207.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(207).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(207).geth8()).getTime()==time)
                   room207.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(207).geth8().equals("X")==false)
                    room207.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(207).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(207).geth9()).getTime() == time+.0)
                   room207.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(207).geth9().equals("X")==false)
                    room207.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(207).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(207).geth10()).getTime() == time+.0)
                   room207.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(207).geth10().equals("X")==false)
                    room207.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(207).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(207).geth11()).getTime() == time+.0)
                   room207.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(207).geth11().equals("X")==false)
                    room207.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(207).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(207).geth12()).getTime() == time+.0)
                   room207.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(207).geth12().equals("X")==false)
                    room207.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(207).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(207).geth13()).getTime() == time+.0)
                   room207.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(207).geth13().equals("X")==false)
                    room207.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(207).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(207).geth14()).getTime() == time+.0)
                   room207.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(207).geth14().equals("X")==false)
                    room207.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(207).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(207).geth15()).getTime() == time+.0)
                   room207.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(207).geth15().equals("X")==false)
                    room207.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(207).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(207).geth16()).getTime() == time+.0)
                   room207.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(207).geth16().equals("X")==false)
                    room207.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(208).getStat() == 1) {
                room208.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(208).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(208).geth8()).getTime()==time)
                   room208.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(208).geth8().equals("X")==false)
                    room208.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(208).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(208).geth9()).getTime() == time+.0)
                   room208.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(208).geth9().equals("X")==false)
                    room208.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(208).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(208).geth10()).getTime() == time+.0)
                   room208.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(208).geth10().equals("X")==false)
                    room208.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(208).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(208).geth11()).getTime() == time+.0)
                   room208.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(208).geth11().equals("X")==false)
                    room208.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(208).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(208).geth12()).getTime() == time+.0)
                   room208.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(208).geth12().equals("X")==false)
                    room208.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(208).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(208).geth13()).getTime() == time+.0)
                   room208.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(208).geth13().equals("X")==false)
                    room208.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(208).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(208).geth14()).getTime() == time+.0)
                   room208.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(208).geth14().equals("X")==false)
                    room208.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(208).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(208).geth15()).getTime() == time+.0)
                   room208.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(208).geth15().equals("X")==false)
                    room208.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(208).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(208).geth16()).getTime() == time+.0)
                   room208.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(208).geth16().equals("X")==false)
                    room208.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(209).getStat() == 1) {
                room209.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(209).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(209).geth8()).getTime()==time)
                   room209.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(209).geth8().equals("X")==false)
                    room209.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(209).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(209).geth9()).getTime() == time+.0)
                   room209.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(209).geth9().equals("X")==false)
                    room209.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(209).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(209).geth10()).getTime() == time+.0)
                   room209.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(209).geth10().equals("X")==false)
                    room209.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(209).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(209).geth11()).getTime() == time+.0)
                   room209.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(209).geth11().equals("X")==false)
                    room209.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(209).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(209).geth12()).getTime() == time+.0)
                   room209.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(209).geth12().equals("X")==false)
                    room209.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(209).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(209).geth13()).getTime() == time+.0)
                   room209.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(209).geth13().equals("X")==false)
                    room209.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(209).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(209).geth14()).getTime() == time+.0)
                   room209.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(209).geth14().equals("X")==false)
                    room209.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(209).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(209).geth15()).getTime() == time+.0)
                   room209.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(209).geth15().equals("X")==false)
                    room209.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(209).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(209).geth16()).getTime() == time+.0)
                   room209.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(209).geth16().equals("X")==false)
                    room209.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(210).getStat() == 1) {
                room210.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(210).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(210).geth8()).getTime()==time)
                   room210.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(210).geth8().equals("X")==false)
                    room210.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(210).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(210).geth9()).getTime() == time+.0)
                   room210.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(210).geth9().equals("X")==false)
                    room210.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(210).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(210).geth10()).getTime() == time+.0)
                   room210.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(210).geth10().equals("X")==false)
                    room210.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(210).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(210).geth11()).getTime() == time+.0)
                   room210.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(210).geth11().equals("X")==false)
                    room210.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(210).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(210).geth12()).getTime() == time+.0)
                   room210.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(210).geth12().equals("X")==false)
                    room210.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(210).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(210).geth13()).getTime() == time+.0)
                   room210.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(210).geth13().equals("X")==false)
                    room210.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(210).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(210).geth14()).getTime() == time+.0)
                   room210.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(210).geth14().equals("X")==false)
                    room210.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(210).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(210).geth15()).getTime() == time+.0)
                   room210.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(210).geth15().equals("X")==false)
                    room210.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(210).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(210).geth16()).getTime() == time+.0)
                   room210.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(210).geth16().equals("X")==false)
                    room210.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(211).getStat() == 1) {
                room211.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(211).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(211).geth8()).getTime()==time)
                   room211.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(211).geth8().equals("X")==false)
                    room211.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(211).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(211).geth9()).getTime() == time+.0)
                   room211.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(211).geth9().equals("X")==false)
                    room211.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(211).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(211).geth10()).getTime() == time+.0)
                   room211.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(211).geth10().equals("X")==false)
                    room211.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(211).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(211).geth11()).getTime() == time+.0)
                   room211.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(211).geth11().equals("X")==false)
                    room211.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(211).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(211).geth12()).getTime() == time+.0)
                   room211.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(211).geth12().equals("X")==false)
                    room211.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(211).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(211).geth13()).getTime() == time+.0)
                   room211.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(211).geth13().equals("X")==false)
                    room211.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(211).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(211).geth14()).getTime() == time+.0)
                   room211.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(211).geth14().equals("X")==false)
                    room211.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(211).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(211).geth15()).getTime() == time+.0)
                   room211.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(211).geth15().equals("X")==false)
                    room211.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(211).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(211).geth16()).getTime() == time+.0)
                   room211.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(211).geth16().equals("X")==false)
                    room211.setBackground(Color.RED);
            }
            if (fixRoom.selectByRoom(212).getStat() == 1) {
                room212.setBackground(Color.LIGHT_GRAY);
            }else{
                if(time==8&&fixRoom.selectByRoom(212).geth8().equals("X")==false&&Member.selectByID(fixRoom.selectByRoom(212).geth8()).getTime()==time)
                   room212.setBackground(Color.YELLOW);
                else if(time==8&&fixRoom.selectByRoom(212).geth8().equals("X")==false)
                    room212.setBackground(Color.RED);
                else if (time == 9 && fixRoom.selectByRoom(212).geth9().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(212).geth9()).getTime() == time+.0)
                   room212.setBackground(Color.YELLOW);
                else if(time==9&&fixRoom.selectByRoom(212).geth9().equals("X")==false)
                    room212.setBackground(Color.RED);
                else if (time == 10 && fixRoom.selectByRoom(212).geth10().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(212).geth10()).getTime() == time+.0)
                   room212.setBackground(Color.YELLOW);
                else if(time==10&&fixRoom.selectByRoom(212).geth10().equals("X")==false)
                    room212.setBackground(Color.RED);
                else if (time == 11 && fixRoom.selectByRoom(212).geth11().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(212).geth11()).getTime() == time+.0)
                   room212.setBackground(Color.YELLOW);
                else if(time==11&&fixRoom.selectByRoom(212).geth11().equals("X")==false)
                    room212.setBackground(Color.RED);
                else if (time == 12 && fixRoom.selectByRoom(212).geth12().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(212).geth12()).getTime() == time+.0)
                   room212.setBackground(Color.YELLOW);
                else if(time==12&&fixRoom.selectByRoom(212).geth12().equals("X")==false)
                    room212.setBackground(Color.RED);
                else if (time == 13 && fixRoom.selectByRoom(212).geth13().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(212).geth13()).getTime() == time+.0)
                   room212.setBackground(Color.YELLOW);
                else if(time==13&&fixRoom.selectByRoom(212).geth13().equals("X")==false)
                    room212.setBackground(Color.RED);
                else if (time == 14 && fixRoom.selectByRoom(212).geth14().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(212).geth14()).getTime() == time+.0)
                   room212.setBackground(Color.YELLOW);
                else if(time==14&&fixRoom.selectByRoom(212).geth14().equals("X")==false)
                    room212.setBackground(Color.RED);
                else if (time == 15 && fixRoom.selectByRoom(212).geth15().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(212).geth15()).getTime() == time+.0)
                   room212.setBackground(Color.YELLOW);
                else if(time==15&&fixRoom.selectByRoom(212).geth15().equals("X")==false)
                    room212.setBackground(Color.RED);
                else if (time == 16 && fixRoom.selectByRoom(212).geth16().equals("X") == false && Member.selectByID(fixRoom.selectByRoom(212).geth16()).getTime() == time+.0)
                   room212.setBackground(Color.YELLOW);
                else if(time==16&&fixRoom.selectByRoom(212).geth16().equals("X")==false)
                    room212.setBackground(Color.RED);
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

        room203 = new javax.swing.JButton();
        room209 = new javax.swing.JButton();
        room210 = new javax.swing.JButton();
        room208 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        room204 = new javax.swing.JButton();
        room212 = new javax.swing.JButton();
        searchRoom = new javax.swing.JButton();
        room207 = new javax.swing.JButton();
        room201 = new javax.swing.JButton();
        room211 = new javax.swing.JButton();
        room206 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        room205 = new javax.swing.JButton();
        room202 = new javax.swing.JButton();
        Pre = new javax.swing.JButton();
        staBox = new javax.swing.JPanel();
        ปิดปรับปรุง = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        admin = new javax.swing.JButton();
        admin1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        room203.setBackground(new java.awt.Color(0, 255, 0));
        room203.setFont(new java.awt.Font("Tahoma", 1, 18));
        room203.setText("203");
        room203.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room203ActionPerformed(evt);
            }
        });

        room209.setBackground(new java.awt.Color(0, 255, 0));
        room209.setFont(new java.awt.Font("Tahoma", 1, 18));
        room209.setText("209");
        room209.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room209ActionPerformed(evt);
            }
        });

        room210.setBackground(new java.awt.Color(0, 255, 0));
        room210.setFont(new java.awt.Font("Tahoma", 1, 18));
        room210.setText("210");
        room210.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room210ActionPerformed(evt);
            }
        });

        room208.setBackground(new java.awt.Color(0, 255, 0));
        room208.setFont(new java.awt.Font("Tahoma", 1, 18));
        room208.setText("208");
        room208.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room208ActionPerformed(evt);
            }
        });

        next.setFont(new java.awt.Font("Tahoma", 1, 11));
        next.setText("Next Section");
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        room204.setBackground(new java.awt.Color(0, 255, 0));
        room204.setFont(new java.awt.Font("Tahoma", 1, 18));
        room204.setText("204");
        room204.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room204ActionPerformed(evt);
            }
        });

        room212.setBackground(new java.awt.Color(0, 255, 0));
        room212.setFont(new java.awt.Font("Tahoma", 1, 18));
        room212.setText("212");
        room212.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room212ActionPerformed(evt);
            }
        });

        searchRoom.setFont(new java.awt.Font("Tahoma", 1, 11));
        searchRoom.setText("SearchRoom");
        searchRoom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRoomActionPerformed(evt);
            }
        });

        room207.setBackground(new java.awt.Color(0, 255, 0));
        room207.setFont(new java.awt.Font("Tahoma", 1, 18));
        room207.setText("207");
        room207.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room207ActionPerformed(evt);
            }
        });

        room201.setBackground(new java.awt.Color(0, 255, 0));
        room201.setFont(new java.awt.Font("Tahoma", 1, 18));
        room201.setText("201");
        room201.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room201ActionPerformed(evt);
            }
        });

        room211.setBackground(new java.awt.Color(0, 255, 0));
        room211.setFont(new java.awt.Font("Tahoma", 1, 18));
        room211.setText("211");
        room211.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room211ActionPerformed(evt);
            }
        });

        room206.setBackground(new java.awt.Color(0, 255, 0));
        room206.setFont(new java.awt.Font("Tahoma", 1, 18));
        room206.setText("206");
        room206.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room206ActionPerformed(evt);
            }
        });

        logout.setFont(new java.awt.Font("Tahoma", 1, 11));
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        room205.setBackground(new java.awt.Color(0, 255, 0));
        room205.setFont(new java.awt.Font("Tahoma", 1, 18));
        room205.setText("205");
        room205.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room205ActionPerformed(evt);
            }
        });

        room202.setBackground(new java.awt.Color(0, 255, 0));
        room202.setFont(new java.awt.Font("Tahoma", 1, 18));
        room202.setText("202");
        room202.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                room202ActionPerformed(evt);
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

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 44, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(staBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(ปิดปรับปรุง))
                .addContainerGap(108, Short.MAX_VALUE))
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(room205, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room204, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room203, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room202, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(room206, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(searchRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Pre)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(staBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addComponent(room201, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(room208, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room209, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(room210, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(room211, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addComponent(room207, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room212, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(room201, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room207, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(room202, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(room208, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(room203, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(room209, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(room204, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(next)
                                    .addComponent(Pre))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(admin1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(staBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(room205, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(room206, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(room210, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(room211, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(room212, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void room203ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room203ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 203, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room203ActionPerformed

    private void room209ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room209ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 209, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room209ActionPerformed

    private void room210ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room210ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 210, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room210ActionPerformed

    private void room208ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room208ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 208, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room208ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            ClassRoomSection3 c = new ClassRoomSection3(ID, a);
                  c.ID=this.ID;
                  c.a=this.a;
                  c.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_nextActionPerformed

    private void room204ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room204ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 204, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room204ActionPerformed

    private void room212ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room212ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 212, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room212ActionPerformed

    private void searchRoomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchRoomActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SearchRoom sr = new SearchRoom(ID, a);
        sr.ID=this.ID;
        sr.a=this.a;
        sr.setVisible(true);
}//GEN-LAST:event_searchRoomActionPerformed

    private void room207ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room207ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 207, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room207ActionPerformed

    private void room201ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room201ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 201, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_room201ActionPerformed

    private void room211ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room211ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 211, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room211ActionPerformed

    private void room206ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room206ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 206, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room206ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainManu().setVisible(true);
}//GEN-LAST:event_logoutActionPerformed

    private void room205ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room205ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 205, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room205ActionPerformed

    private void room202ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_room202ActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            Room r = new Room(ID, 202, a);
            r.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_room202ActionPerformed

    private void PreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreActionPerformed
        // TODO add your handling code here:
        this.dispose();
        try {
            ClassRoomSection1 c = new ClassRoomSection1(ID, a);
            c.ID=this.ID;
            c.a=this.a;
            c.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
        }
}//GEN-LAST:event_PreActionPerformed

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
                    new ClassRoomSection2().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(ClassRoomSection2.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton logout;
    private javax.swing.JButton next;
    private javax.swing.JButton room201;
    private javax.swing.JButton room202;
    private javax.swing.JButton room203;
    private javax.swing.JButton room204;
    private javax.swing.JButton room205;
    private javax.swing.JButton room206;
    private javax.swing.JButton room207;
    private javax.swing.JButton room208;
    private javax.swing.JButton room209;
    private javax.swing.JButton room210;
    private javax.swing.JButton room211;
    private javax.swing.JButton room212;
    private javax.swing.JButton searchRoom;
    private javax.swing.JPanel staBox;
    private javax.swing.JLabel ปิดปรับปรุง;
    // End of variables declaration//GEN-END:variables

}
