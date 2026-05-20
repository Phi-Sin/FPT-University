/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ws.utils.DBUtils;

/**
 *
 * @author Acer
 */
public class MobileDAO {

    private static final String SEARCH = "SELECT * FROM tbl_Mobile WHERE mobileName like ?";
    private static final String DELETE = "DELETE tbl_Mobile WHERE mobileId=?";
    private static final String UPDATE = "UPDATE tbl_Mobile SET description=?, price=?, quantity=?, notSale=? WHERE mobileId=?";
    private static final String INSERT = "INSERT INTO tbl_Mobile(mobileId, description, price, mobileName, yearOfProduct, quantity, notSale)" + "VALUES(?,?,?,?,?,?,?)";

    public List<MobileDTO> getListMobile(String search) throws SQLException {
        List<MobileDTO> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement ptm = null;
        ResultSet rs = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(SEARCH);
                ptm.setString(1, "%" + search + "%");
                rs = ptm.executeQuery();
                while (rs.next()) {
//                    String mobileId = rs.getString("mobileId");
//                    String description = rs.getString("description");
//                    float price = rs.getFloat("price");
//                    String mobileName = rs.getString("mobileName");
//                    int yearOfProduction = rs.getInt("yearOfProduction");
//                    int quantity = rs.getInt("quantity");
//                    boolean notSale = rs.getBoolean("notSale");
                    list.add(new MobileDTO(rs.getString(1), rs.getString(2), rs.getFloat(3), rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getBoolean(7)));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return list;
    }

    public boolean delete(String mobileId) throws SQLException {
        boolean checkDelete = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(DELETE);
                ptm.setString(1, mobileId);
                checkDelete = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkDelete;
    }

    public boolean update(MobileDTO mobile) throws SQLException {
        boolean checkUpdate = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(UPDATE);
                ptm.setString(1, mobile.getMobileId());
                ptm.setString(2, mobile.getDescription());
                ptm.setString(3, mobile.getMobileName());
                ptm.setFloat(4, mobile.getPrice());
                ptm.setInt(5, mobile.getQuantity());
                ptm.setInt(6, mobile.getYearOfProduction());
                ptm.setBoolean(7, mobile.isNotSale());
                checkUpdate = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkUpdate;
    }

    public boolean insert(MobileDTO mobile) throws SQLException, ClassNotFoundException {
        boolean checkInsert = false;
        Connection conn = null;
        PreparedStatement ptm = null;
        try {
            conn = DBUtils.getConnection();
            if (conn != null) {
                ptm = conn.prepareStatement(INSERT);
                ptm.setString(1, mobile.getMobileId());
                ptm.setString(2, mobile.getDescription());
                ptm.setFloat(3, mobile.getPrice());
                ptm.setString(4, mobile.getMobileName());
                ptm.setInt(5, mobile.getYearOfProduction());
                ptm.setInt(6, mobile.getQuantity());
                ptm.setBoolean(7, mobile.isNotSale());
                checkInsert = ptm.executeUpdate() > 0 ? true : false;
            }
        } catch (Exception e) {
        } finally {
            if (ptm != null) {
                ptm.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
        return checkInsert;
    }
}
