/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thelastproject;

import java.sql.*;
import java.util.*;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author B
 */
public class Report {
        private static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return (Connection) DriverManager.getConnection("jdbc:mysql://localhost/class room", "root", "1234");
    }

    public static void report() throws Exception {
        Connection con = getConnection();
        String reportFilename = "C:/Documents and Settings/B/Desktop/room11.jasper";
        Map param = new HashMap();
        JasperPrint print = JasperFillManager.fillReport(
                reportFilename, param, con);
        JasperViewer jv = new JasperViewer(print, false);
        jv.setVisible(true);
    }

}
