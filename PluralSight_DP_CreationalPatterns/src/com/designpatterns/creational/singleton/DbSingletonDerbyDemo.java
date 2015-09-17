/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.singleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.iapi.reference.ClassName;

/**
 *
 * @author mso36w
 */
public class DbSingletonDerbyDemo {

    public static void main (String arg[]) {
        
        long timeBefore = 0;
        long timeAfter = 0;
    
        DbSingletonDerby instance = DbSingletonDerby.getInstance();
        System.out.println(instance);
        
        timeBefore = System.currentTimeMillis();
        Connection conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        
        System.out.println("Get Conn FIRST time: " + (timeAfter - timeBefore));
        
        Statement stm;
        try {
            stm = conn.createStatement();
            
            int count = stm.executeUpdate("CREATE TABLE Address (ID INT, StreetName VARCHAR(20), " + "City VARCHAR(20))");
            System.out.println("Table created. count = " + count);
            
            stm.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        timeBefore = System.currentTimeMillis();
        conn = instance.getConnection();
        timeAfter = System.currentTimeMillis();
        
        System.out.println("Get Conn SECOND time: " + (timeAfter - timeBefore));
        
        try {
            stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * from Address");
            
            System.out.println("Results set: " + rs); // How to get data from a ResultSet?
            
            rs.close();
            stm.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    
    
   
    
}
