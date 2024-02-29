/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package lab10;

import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

/**
 *
 * @author acer
 */
public class Databaseconnect {


    public static void connect(JList list) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/heartless","root","1234");
        Statement stmt = con.createStatement();
        String sql = "SELECT * FROM persons ";
        ResultSet rs = stmt.executeQuery(sql);
        DefaultListModel listmodel =new DefaultListModel();
        while (rs.next()) {
            listmodel.addElement(rs.getString("name"));
        }
        list.setModel(listmodel);
        stmt.close();
        con.close();
    }


     public static void report() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/heartless", "root", "1234");

        String reportFilename = "C:/Users/acer/Desktop/report.jasper";
        Map param = new HashMap();
        JasperPrint print = JasperFillManager.fillReport(
                reportFilename, param, con);

        JasperViewer jv = new JasperViewer(print, false);
        jv.setVisible(true);
    }


    public static void report(String s) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/heartless", "root", "1234");

        String reportFilename = "C:/Users/acer/Desktop/report1.jasper";
        Map param = new HashMap();
        param.put("keyword", "%"+s+"%");
        JasperPrint print = JasperFillManager.fillReport(
                reportFilename, param, con);

        JasperViewer jv = new JasperViewer(print, false);
        jv.setVisible(true);
    }


    public static void insert(String getText) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/heartless","root", "1234");
        Statement stmt = con.createStatement();
        String sql =  "INSERT INTO persons (name) VALUES ('" + getText + "')";
        stmt.executeUpdate(sql);
        stmt.close();
        con.close();
    }

}
