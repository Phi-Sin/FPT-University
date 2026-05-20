/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate; 

/**
 *
 * @author MSI
 */
public class Employee {
    private int empid;
    private String empname;
    private LocalDate date;
    private boolean empgender;
    private String createdby;

    public Employee() {
    }

    public Employee(int empid, String empname, LocalDate date, boolean empgender, String createdby) {
        this.empid = empid;
        this.empname = empname;
        this.date = date;
        this.empgender = empgender;
        this.createdby = createdby;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isEmpgender() {
        return empgender;
    }

    public void setEmpgender(boolean empgender) {
        this.empgender = empgender;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }
    
    
}
