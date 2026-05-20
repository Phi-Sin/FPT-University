/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class TimeBean {
    private Date now;
    private String location;

    public TimeBean() {
    }

    public TimeBean(Date now, String location) {
        this.now = now;
        this.location = location;
    }

    public Date getNow() {
        return now;
    }

    public void setNow(Date now) {
        this.now = now;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public String getDate(String format){
        String date = "";
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        date = sdf.format(now);
        return date;
    }
}
