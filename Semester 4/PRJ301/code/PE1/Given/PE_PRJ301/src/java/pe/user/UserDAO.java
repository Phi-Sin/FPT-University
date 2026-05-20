/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.utils.DBUtils;

/**
 *
 * @author MSI
 */
public class UserDAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public User checkLogin(String userID, String password){
        try {
            String query = "select * from ComesticManagement where userid='?' and password='?'";
            conn = new DBUtils().getConnection() ;
            ps = conn.prepareStatement(query);
            ps.setString(1, userID);
            ps.setString(2, password);
            rs = ps.executeQuery();
            while(rs.next()){
                User u = new User(rs.getString(1),  rs.getString(2));
                return u;
            }
        } catch (Exception e) {
        }
        return null;
    }
}
