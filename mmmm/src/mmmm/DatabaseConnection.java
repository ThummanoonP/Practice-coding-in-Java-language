/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mmmm;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Administrator
 */
public class DatabaseConnection {
    public Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/report", "root", "1234");
    }
}

