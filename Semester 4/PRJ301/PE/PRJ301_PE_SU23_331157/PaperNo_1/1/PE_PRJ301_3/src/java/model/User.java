/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author admin
 */
public class User {
    private String userId;
    private String fullName;
    private String password;
    private String roleId;
    private boolean status;

//    public User(String userId, String fullName, String password, String roleId, boolean status) {
//        this.userId = userId;
//        this.fullName = fullName;
//        this.password = password;
//        this.roleId = roleId;
//        this.status = status;
//    }
    
    public User(String userId, String fullName, String password, String roleId, boolean status) {
        this.userId = userId;
        this.fullName = fullName;
        this.password = password;
        this.roleId = roleId;
        this.status = status;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", fullName=" + fullName + ", password=" + password + ", roleId=" + roleId + ", status=" + status + '}';
    }
    
}
