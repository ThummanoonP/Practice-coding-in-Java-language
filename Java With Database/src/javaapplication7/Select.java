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
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListModel;

public class Select {
    public static void main(JList showName) throws Exception {
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
        String sql = "SELECT * FROM persons ";
        ResultSet rs = stmt.executeQuery(sql);
        // 5. แสดงผล
        DefaultListModel listmodel =new DefaultListModel();
        while (rs.next()) {
            listmodel.addElement(rs.getString("name"));
            //System.out.println(rs.getString("name"));
            //System.out.println(rs.getInt("ID"));
        }
        showName.setModel(listmodel);
        // 6. ปิดการเชื่อมต่อ (2.)
        stmt.close();
        con.close();
    }

}

