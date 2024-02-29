/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;
import java.sql.*;
/**
 *
 * @author acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception  {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/report",
                "root",
                "1234");

    }

}
