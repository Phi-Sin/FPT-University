package context;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Acer
 */
public class DBUtils {
    public Connection getConnection() throws Exception{
        String url = "jdbc:sqlserver://" + serverName + ":" + portNumber + "\\" + instance + ";databaseName=" + dbName;
        if (instance == null || instance.trim().isEmpty()){
            url = "jdbc.sqlserver://" + serverName + ":" + portNumber + ":databaseName" + dbName;
        }
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url, userID, password);
    }
    
    private final String serverName = "localhost"; //host cua SQL
    private final String dbName = "account";        //ten db
    private final String portNumber = "1433";       //cong sql
    private final String instance = "";                     //khong neu nhu ta xai intance sql
    private final String userID = "sa";                     // tk admin
    private final String password = "123";              //password admin
}

