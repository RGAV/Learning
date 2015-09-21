/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.bridge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mso36w
 */
public class BridgeEverydayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // JDBC is an API
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver()); // <-- Driver
            
            String dbUrl = "jdbc:derby:memory:codejava/wedb;create=true";
            
            Connection conn = DriverManager.getConnection(dbUrl);
            
            Statement stmt = conn.createStatement();
            
            // This client is an abstraction and can work with any database that has a driver
            stmt.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))");
            
            System.out.println("Table created");
            
        } catch (SQLException ex) {
            Logger.getLogger(BridgeEverydayDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
