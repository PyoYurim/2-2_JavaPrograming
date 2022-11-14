import java.sql.*;
import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 표유림
 */
public class DB_MAN {
    String strDriver = "oracle.jdbc.driver.OracleDriver";
    String strURL = "jdbc:oracle:thin:@10.70.41.80:1521";
    String strUser = "INHATC";
    String strPWD = "inha1958";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        try{
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        }catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        }catch (SQLException e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    } 
}
