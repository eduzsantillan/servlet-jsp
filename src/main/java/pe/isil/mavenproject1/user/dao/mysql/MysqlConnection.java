/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.isil.mavenproject1.user.dao.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author edu
 */
public class MysqlConnection {
    
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/moduloseg";
    public static final String USER = "root";
    public static final String PASS = "budakar01";
    
    public MysqlConnection(){
        try{
            Class.forName(DRIVER);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASS);
    }
    
    public Connection getConnection(String url,String user, String pass) throws SQLException{
        return DriverManager.getConnection(url,user,pass);
    }
    
    
}
