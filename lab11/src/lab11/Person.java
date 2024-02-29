/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab11;

import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.util.*;

/**
 *
 * @author CS-KU
 */
public class Person {
    public Person(){
    }
    public Person(int id, String name){
    }
    public static Person selectById(int id) throws Exception{
    }
    public static Person selectByName(String name) throws Exception{
    }
    public void delete() throws Exception {
    }
    public void update() throws Exception {
    }
    public void insert(String getText) throws Exception {
            Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/heartless","root", "1234");
        Statement stmt = con.createStatement();
        String sql =  "INSERT INTO persons (name) VALUES ('" + getText + "')";
        stmt.executeUpdate(sql);
        stmt.close();
        con.close();
    }
    public int getId(){
    }
    public void setId(int id){
    }
    public String getName(){
    }
    public void setName(String name){
    } 

}
