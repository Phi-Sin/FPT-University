/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import context.DBUtils;
import entity.Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MSI
 */
public class LoginDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    public Account checkLogin(String UserID, String Password){
          try {
            String query ="select * from Register where UserID = ? and Password = ?"; 
            conn = new DBUtils().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, UserID);
            ps.setString(2, Password);
            rs = ps.executeQuery();
            while(rs.next()){
                Account a = new Account(rs.getString(1),rs.getString(2));
                return a;
            }
            
        } catch (Exception e) {
        }
        return null;
    }
}
