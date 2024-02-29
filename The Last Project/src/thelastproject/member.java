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
public class Member {

    private String id;          
    private String pass;
    private String name;
    private String lastName;               
    private String pCode;
    private String day;
    private String address;
    private String zipcode;
    private String  eMail;
    private String phone;
    private int roomFix=0;
    private int roomU=0;
    private double timeU=0;
    private double timeF=0;
    private int admin=0;

   public Member() {
    }


    public Member(String id,String pass,String name,String lastName,String pCode,String day,String address,String zipcode,String  eMail,String phone,int roomU,int roomFix,double timeU,double timeF,int admin) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.lastName = lastName;
        this.pCode = pCode;
        this.day = day;
        this.address = address;
        this.zipcode = zipcode;
        this.eMail = eMail;
        this.phone = phone;
        this.roomU = roomU;
        this.roomFix = roomFix;
        this.timeU = timeU;
        this.timeF = timeF;
        this.admin = admin;
    }
    private static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost/class room", "root", "1234");
    }

    public void regis() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("INSERT INTO user (ID,Password,Name,LastName,pCode,day,Address,zipcode,eMail,Phone,roomU,roomfix,Time,Timefix,Admin) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, id);
        ps.setString(2, pass);
        ps.setString(3, name);
        ps.setString(4, lastName);
        ps.setString(5, pCode);
        ps.setString(6, day );
        ps.setString(7, address);
        ps.setString(8, zipcode);
        ps.setString(9, eMail);
        ps.setString(10, phone);
        ps.setInt(11, roomFix);
        ps.setInt(12, roomU);
        ps.setDouble(13, timeU);
        ps.setDouble(14, timeF);
        ps.setInt(15,admin);
        ps.executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        rs.next();
        rs.close();
        ps.close();
        con.close();
    }

    public void repass() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE user SET Password = ? WHERE CONVERT( user.ID USING utf8 ) = ? LIMIT 1");
        ps.setString(1, pass);
        ps.setString(2, id);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    
    public void useramin() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE user SET Admin = ? WHERE CONVERT( user.ID USING utf8 ) = ? LIMIT 1");
        ps.setInt(1, admin);
        ps.setString(2, id);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void roomUse() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE user SET roomU = ? WHERE CONVERT( user.ID USING utf8 ) = ? LIMIT 1");
        ps.setInt(1, roomU);
        ps.setString(2, id);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public void roomF() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE user SET roomfix = ? WHERE CONVERT( user.ID USING utf8 ) = ? LIMIT 1");
        ps.setInt(1, roomFix);
        ps.setString(2, id);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public void timefix() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE user SET Timefix = ? WHERE CONVERT( user.ID USING utf8 ) = ? LIMIT 1");
        ps.setDouble(1, timeF);
        ps.setString(2, id);
        ps.executeUpdate();
        ps.close();
        con.close();
    }
    public void timeUse() throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("UPDATE user SET Time = ? WHERE CONVERT( user.ID USING utf8 ) = ? LIMIT 1");
        ps.setDouble(1, timeU);
        ps.setString(2, id);
        ps.executeUpdate();
        ps.close();
        con.close();
    }

    public static Member selectByID(String id) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM user WHERE ID = ?");
        ps.setString(1, id);
        ResultSet rs = ps.executeQuery();
        Member p;
        if (rs.next()) {
            p = new Member(rs.getString("ID"),rs.getString("Password"),rs.getString("Name"),rs.getString("LastName"),rs.getString("pCode"),rs.getString("day"),rs.getString("Address"),rs.getString("zipcode"),rs.getString("eMail"),rs.getString("Phone"),rs.getInt("roomU"),rs.getInt("roomfix"),rs.getDouble("Time"),rs.getDouble("Timefix"),rs.getInt("Admin"));
        } else {
            p = new Member("","","","","","","","","","",0,0,0.0,0.0,0);
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static Member selectByEmail(String eMail) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM user WHERE eMail  = ?");
        ps.setString(1, eMail);
        ResultSet rs = ps.executeQuery();
        Member p;
        if (rs.next()) {
            p = new Member(rs.getString("ID"),rs.getString("Password"),rs.getString("Name"),rs.getString("LastName"),rs.getString("pCode"),rs.getString("day"),rs.getString("Address"),rs.getString("zipcode"),rs.getString("eMail"),rs.getString("Phone"),rs.getInt("roomU"),rs.getInt("roomfix"),rs.getDouble("Time"),rs.getDouble("Timefix"),rs.getInt("Admin"));
        } else {
            p = new Member("","","","","","","","","","",0,0,0.0,0.0,0);
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static Member selectByPcode(String pCode) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM user WHERE pCode = ?");
        ps.setString(1, pCode);
        ResultSet rs = ps.executeQuery();
        Member p;
        if (rs.next()) {
            p = new Member(rs.getString("ID"),rs.getString("Password"),rs.getString("Name"),rs.getString("LastName"),rs.getString("pCode"),rs.getString("day"),rs.getString("Address"),rs.getString("zipcode"),rs.getString("eMail"),rs.getString("Phone"),rs.getInt("roomU"),rs.getInt("roomfix"),rs.getDouble("Time"),rs.getDouble("Timefix"),rs.getInt("Admin"));
        } else {
            p = new Member("","","","","","","","","","",0,0,0.0,0.0,0);
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static Member selectByTime(double timeF) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM user WHERE Timefix = ?");
        ps.setDouble(1, timeF);
        ResultSet rs = ps.executeQuery();
        Member p;
        if (rs.next()) {
            p = new Member(rs.getString("ID"),rs.getString("Password"),rs.getString("Name"),rs.getString("LastName"),rs.getString("pCode"),rs.getString("day"),rs.getString("Address"),rs.getString("zipcode"),rs.getString("eMail"),rs.getString("Phone"),rs.getInt("roomU"),rs.getInt("roomfix"),rs.getDouble("Time"),rs.getDouble("Timefix"),rs.getInt("Admin"));
        } else {
            p = new Member("","","","","","","","","","",0,0,0.0,0.0,0);
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public static Member selectByTimeUse(double timeU) throws Exception {
        Connection con = getConnection();
        PreparedStatement ps = con.prepareStatement("SELECT *  FROM user WHERE Time = ?");
        ps.setDouble(1, timeU);
        ResultSet rs = ps.executeQuery();
        Member p;
        if (rs.next()) {
            p = new Member(rs.getString("ID"),rs.getString("Password"),rs.getString("Name"),rs.getString("LastName"),rs.getString("pCode"),rs.getString("day"),rs.getString("Address"),rs.getString("zipcode"),rs.getString("eMail"),rs.getString("Phone"),rs.getInt("roomU"),rs.getInt("roomfix"),rs.getDouble("Time"),rs.getDouble("Timefix"),rs.getInt("Admin"));
        } else {
            p = new Member("","","","","","","","","","",0,0,0.0,0.0,0);
        }
        rs.close();
        ps.close();
        con.close();
        return p;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPCode() {
        return pCode;
    }

    public void setPCode(String pCode) {
        this.pCode = pCode;
    }
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getRoomU() {
        return roomFix;
    }

    public void setRoomU(int roomU) {
        this.roomU = roomU;
    }
    public int getRoomFix() {
        return roomFix;
    }

    public void setRoomFix(int roomFix) {
        this.roomFix = roomFix;
    }
    public double getTimeUse() {
        return timeU;
    }

    public void setTimeUse(double timeU) {
        this.timeU = timeU;
    }
    public double getTime() {
        return timeF;
    }

    public void setTime(double timeF) {
        this.timeF = timeF;
    }
    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }
}


