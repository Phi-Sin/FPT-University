/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author MSI
 */
public class Account {
    private String userid;
    private String fullname;
    private String roleid;
    private String password;
    private String confirm;

    public Account() {
        this.userid = "";
        this.fullname = "";
        this.roleid = "";
        this.password = "";
        this.confirm = "";
    }

    public Account(String userid, String fullname, String roleid, String password, String confirm) {
        this.userid = userid;
        this.fullname = fullname;
        this.roleid = roleid;
        this.password = password;
        this.confirm = confirm;
    }

    public Account(String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }
       
}
