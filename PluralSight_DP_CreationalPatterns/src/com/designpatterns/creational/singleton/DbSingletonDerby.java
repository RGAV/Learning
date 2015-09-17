/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mso36w
 */
public class DbSingletonDerby {
    
    private static DbSingletonDerby instance = null; // preparing to have it Lazzyly Loaded
    
    private Connection conn = null; // Derby Connection
    
    private DbSingletonDerby() 
    {
        // Register Driver
        try {
            DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
        } catch(SQLException sqlEx){
            sqlEx.printStackTrace();
        }
        
    }
    
    public static DbSingletonDerby getInstance()   // Don't synchronize at the level of the method because it will seriously impact the performance!
    {
        if (instance == null)
        {   // Make it Theread Safe
            synchronized (DbSingletonDerby.class)  // Synchronization slows down performance, hence we synchronize ONLY for the object creation
            {
                if (instance == null)
                    instance = new DbSingletonDerby();
            }
        }
        
        return instance;
    }
    
    // Non-static method
    // It will be call the moment we have an instance of our Singleton
    public Connection getConnection() {
        if (conn == null) {
            synchronized (DbSingletonDerby.class) {
                if (conn == null) {
                    try {
                        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
                        
                        conn = DriverManager.getConnection(dbUrl);
                        
                    } catch (SQLException sqlEx) {
                        sqlEx.printStackTrace();
                    }
                }
            }
        }
        return conn;
    }
    
}
