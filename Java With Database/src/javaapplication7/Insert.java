/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication7;

/**
 *
 * @author acer
 */
import java.sql.*;

public class Insert {
    public static void main(String getText) throws Exception {
         // 1. โหลดไดรเวอร์
        Class.forName("com.mysql.jdbc.Driver");
        // 2. เชื่อมต่อกับ db
        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/report",
                "root",
                "1234");
        // 3. สร้าง statement สำหรับส่งคำสั่ง sql
        Statement stmt = con.createStatement();
        // 4. ส่งคำสั่ง sql
        String sql =  "INSERT INTO persons (name) VALUES ('" + getText + "')";
        stmt.executeUpdate(sql);
        // 5. แสดงผล
        // 6. ปิดการเชื่อมต่อ (2.)
        stmt.close();
        con.close();
    }
}
