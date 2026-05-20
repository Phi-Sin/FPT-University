/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.entity.Fashion;
import pe.utils.DBUtils;

/**
 *
 * @author Henry
 */
public class FashionDAO {
    Connection conn = null; //connect DB
    PreparedStatement pre = null; //chuyển câu lệnh query sang sql
    ResultSet re = null; //xử lí kết quả trả về
    public List<Fashion> getlistFashion() {
        String query = "SELECT id, name, description, price, size, status \n"
                + "From tblFashion";
        try {
            conn = new DBUtils().getConnection();
            pre = conn.prepareStatement(query);
            re = pre.executeQuery();
            List<Fashion> list = new ArrayList<>();
            while (re.next()) {
                Fashion fash = new Fashion(re.getString(1), re.getString(2), re.getString(3), re.getFloat(4),
                                re.getString(5), re.getBoolean(6));
                list.add(fash);
            }
            return list;
        } catch (Exception e) {
        }
        return null;
    }
    public List<Fashion> searchByName(String name) {
        List<Fashion> list = new ArrayList<>();
        String query = "select id, name, description, price, size, status\n"
                + "from tblFashion\n"
                + "WHere name LIKE ?";
        try {
            conn = new DBUtils().getConnection();
            pre = conn.prepareStatement(query);
            pre.setString(1, "%" + name + "%");
            re = pre.executeQuery();
            while (re.next()) {
                Fashion fash = new Fashion(re.getString(1), re.getString(2), re.getString(3), re.getFloat(4),
                                re.getString(5), re.getBoolean(6));
                list.add(fash);
            }

        } catch (Exception e) {
        }
        return list;
    }
    public void deleteAccount(String id) {
        String query = "  Update tblFashion\n"
                + "Set status = 0"
                + "  Where id = ?";
        try {
            conn = new DBUtils().getConnection();
            pre = conn.prepareStatement(query);
            pre.setString(1, id);
            re = pre.executeQuery();
        } catch (Exception e) {
        }
    }
}
