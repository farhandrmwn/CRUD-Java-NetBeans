package Dashboard;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Farhan Darmawan
 */
public class koneksi {
    public static Connection con;
    public static Statement stm;
    public void config() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con =DriverManager.getConnection("jdbc:mysql://localhost/db_siswa","root","");
            stm = con.createStatement();
        } catch (Exception e) {
            System.err.println("koneksi gagal " +e.getMessage());
        }
    }
    public static Connection configDB() throws SQLException{
        return null;
    }
}
