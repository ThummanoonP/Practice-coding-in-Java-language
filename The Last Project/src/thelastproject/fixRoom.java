/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package thelastproject;

import java.sql.*;


/**
 *
 * @author Administrator
 */
public class fixRoom {

    private int NoRoom;
    private int num;
    private int stat;
    private String h8;
    private String h9;
    private String h10;
    private String h11;
    private String h12;
    private String h13;
    private String h14;
    private String h15;
    private String h16;

    public fixRoom() {

    }


    public fixRoom(int NoRoom,int num,int stat,String h8,String h9,String h10,String h11,String h12,String h13,String h14,String h15,String h16) {
        this.NoRoom = NoRoom;
        this.num = num;
        this.stat = stat;
        this.h8 = h8;
        this.h9 = h9;
        this.h10 = h10;
        this.h11 = h11;
        this.h12 = h12;
        this.h13 = h13;
        this.h14 = h14;
        this.h15 = h15;
        this.h16 = h16;

    }


    private static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/class room", "root", "1234");
    }
    public void close() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET stat = ? WHERE NoRoom = ? LIMIT 1");
        ps.setInt(1, stat);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public void fixTime8H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 8h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h8);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void fixTime9H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 9h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h9);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void fixTime10H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 10h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h10);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void fixTime11H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 11h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h11);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void fixTime12H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 12h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h12);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void fixTime13H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 13h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h13);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void fixTime14H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 14h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h14);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void fixTime15H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 15h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h15);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void fixTime16H() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE room SET 16h = ? WHERE NoRoom = ? LIMIT 1");
        ps.setString(1, h16);
        ps.setInt(2,NoRoom);
        ps.executeUpdate();
        ps.close();
        con.close();
    }


    public static fixRoom selectByRoom(int NoRoom) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE NoRoom = ?");
        ps.setInt(1, NoRoom);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }

    public static fixRoom selectByNum(int num) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE num = ?");
        ps.setInt(1, num);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
        public static fixRoom selectBy8H(String h8) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 8h = ?");
        ps.setString(1, h8);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static fixRoom selectBy9H(String h9) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 9h = ?");
        ps.setString(1, h9);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static fixRoom selectBy10H(String h10) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 10h = ?");
        ps.setString(1, h10);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static fixRoom selectBy11H(String h11) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 11h = ?");
        ps.setString(1, h11);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");;
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static fixRoom selectBy12H(String h12) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 12h = ?");
        ps.setString(1, h12);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static fixRoom selectBy13H(String h13) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 13h = ?");
        ps.setString(1, h13);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static fixRoom selectBy14H(String h14) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 14h = ?");
        ps.setString(1, h14);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static fixRoom selectBy15H(String h15) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 15h = ?");
        ps.setString(1, h15);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static fixRoom selectBy16H(String h16) throws Exception {
        fixRoom p;
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM room WHERE 16h = ?");
        ps.setString(1, h16);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            p = new fixRoom(rs.getInt("NoRoom"),rs.getInt("num"),rs.getInt("stat"),rs.getString("8h"),rs.getString("9h"),rs.getString("10h"),rs.getString("11h"),rs.getString("12h"),rs.getString("13h"),rs.getString("14h"),rs.getString("15h"),rs.getString("16h"));
        } else {
            p = new fixRoom(0,0,0,"","","","","","","","","");
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }

    public int getNoRoom() {
        return NoRoom;
    }
    public int getNum() {
        return num;
    }
    public int getStat() {
        return stat;
    }
    public void setStat(int stat) {
        this.stat = stat;
    }
    public String geth8() {
        return h8;
    }
    public void seth8(String h8) {
        this.h8 = h8;
    }
    public String geth9() {
        return h9;
    }
    public void seth9(String h9) {
        this.h9 = h9;
    }
    public String geth10() {
        return h10;
    }
    public void seth10(String h10) {
        this.h10 = h10;
    }
    public String geth11() {
        return h11;
    }
    public void seth11(String h11) {
        this.h11 = h11;
    }
    public String geth12() {
        return h12;
    }
    public void seth12(String h12) {
        this.h12 = h12;
    }
    public String geth13() {
        return h13;
    }
    public void seth13(String h13) {
        this.h13 = h13;
    }
    public String geth14() {
        return h14;
    }
    public void seth14(String h14) {
        this.h14 = h14;
    }
    public String geth15() {
        return h15;
    }
    public void seth15(String h15) {
        this.h15 = h15;
    }
    public String geth16() {
        return h16;
    }
    public void seth16(String h16) {
        this.h16 = h16;
    }
}
