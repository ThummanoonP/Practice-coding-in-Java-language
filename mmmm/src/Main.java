
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mmmm;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        DatabaseConnection dbcon = new DatabaseConnection();
        Connection con = (Connection) dbcon.getConnection();
        Statement stmt = (Statement) con.createStatement();
        String sql = "INSERT INTO persons (id ,name ) VALUES (NULL , 'AAAbbbb')";
        stmt.execute(sql);
    }

}



