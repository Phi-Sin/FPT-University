/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.spi.DirStateFactory.Result;
import phidt.util.DBHelper;
/**
 *
 * @author MSI
 */
public class RegistrationDAO implements Serializable {
    public boolean checkLogin(String username, String password) throws SQLException {
        Connection con = null;
        PreparedStatement stm = null;
        Result rs = null;
        boolean result = false;
        
        try {
        //1. Connect DB
        con = DBHelper.makeConnection();
        if (con != null ) {
        //2. Write SQL command
        String sql = "Select username, password, lastname, isAdmin "
                + "From Registration "
                + "Where lastname Like ?";
        //3. Create Statement Object
        stm = con.prepareStatement(sql);
            String searchValue = null;
        stm.setString(1, "%" + searchValue + "%");
        //4. Execute Statement to result
        rs=stm.executeQuerry();
        //5. Process result
        while(rs.next()) {
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String fullName = rs.getString("lastname");
                    boolean role = rs.getBoolean("isAdmin");
                    
                    RegistrationDTO dto = new RegistrationDTO(
                                username, password, fullName, role);
                    if (this.accountList == null) {
                        this.accountList == new ArrayList<>();
                    }//end account List has NOT Existed
                    this.accountList.add(dto);
                }//end traverse rs to EOF
            }//end connection is existed
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (stm != null) {
                stm.close();
            }
            if ( con != null ) {
                con.close();
            }
        }
    return result;
}
        private List<RegistrationDTO> accountList;
        
        public List<RegistrationDTO> getAccountList() {
            return accountList;
        }
        
        public void searchLastname

