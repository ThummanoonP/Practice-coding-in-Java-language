package javaapplication7;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;


/**
 *
 * @author acer
 */
public class ireport {
    public static void main() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/report", "root", "1234");

        String reportFilename = "C:/Users/acer/Desktop/report.jasper";
        Map param = new HashMap();
        //param.put("keyword", args);
        JasperPrint print = JasperFillManager.fillReport(
                reportFilename, param, con);

        JasperViewer jv = new JasperViewer(print, false);
        jv.setVisible(true);
    }
    public static void main(String s) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/report", "root", "1234");

        String reportFilename = "C:/Users/acer/Desktop/report1.jasper";
        Map param = new HashMap();
        param.put("keyword", "%"+s+"%");
        JasperPrint print = JasperFillManager.fillReport(
                reportFilename, param, con);

        JasperViewer jv = new JasperViewer(print, false);
        jv.setVisible(true);
    }


}
