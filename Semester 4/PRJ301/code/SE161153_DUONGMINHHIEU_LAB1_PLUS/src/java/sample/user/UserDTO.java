/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.user;

/**
 *
 * @author Acer
 */
public class UserDTO {

    private String UserID;
    private String FullName;
    private String RoleID;
    private String Password;
    
public UserDTO() {
       this.UserID = "";
       this.FullName = "";
       this.RoleID = "";
       this.Password = "";
}
    public UserDTO(String UserID, String FullName, String RoleID, String Password) {
        this.UserID = UserID;
        this.FullName = FullName;
        this.RoleID = RoleID;
        this.Password = Password;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getRoleID() {
        return RoleID;
    }

    public void setRoleID(String RoleID) {
        this.RoleID = RoleID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
