/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Fashion;
import model.User;
import pe.utils.DBContext;

/**
 *
 * @author admin
 */
public class DAO {
    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // login
    public User checkUserValid(String user, String pass) {
        String query = "select *from tblUser where UserID = ? and password =?";
        try {
            conn = DBContext.getConnection();// mo ket noi
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new User(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getBoolean(5));
            }
        } catch (Exception e) {
        }
        return null;
    }
    public List<Fashion> getFashion() {
        List<Fashion> list = new ArrayList<>();
        String query = "select * from tblFashion";
        try {
            conn = DBContext.getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Fashion(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getBoolean(6)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public Fashion getFashionById(String IDFs){
        String query = "select * from tblFashion where id=?";
        try {
            conn = DBContext.getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            ps.setString(1, IDFs); 
            rs = ps.executeQuery();
            while(rs.next()){
                return(new Fashion(rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getBoolean(6)));
            }
        } catch (Exception e) {
        }
        return null;
    }
    
    public void deleteFashion(String id) {
        String query = "delete from tblFashion where id = ?";
        try {
            conn = DBContext.getConnection();//mo ket noi
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }
}
