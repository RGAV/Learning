/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.singleton;

/**
 *
 * @author mso36w
 */
public class DbSingleton {
    
    //private static DbSingleton instance = new DbSingleton(); // 1. Static Singleton: created at the time the JVM had started up
    private static DbSingleton instance = null; // preparing to have it Lazzyly Loaded
    
    private DbSingleton() {}
    
    //Eagerly Loaded Into Memory -> Not Nice!
//    public static DbSingleton getINstance(){
//        return instance;
//    }
    
    // 2. LazzyLy Loaded
//    public static DbSingleton getINstance()
//    {
//        if (instance == null)
//            instance = new DbSingleton();
//        
//        return instance;
//    }
    
    // 3. Theread Safe
    public static DbSingleton getInstance()   // Don't synchronize at the level of the method because it will seriously impact the performance!
    {
        if (instance == null)
        {   
            // Make it Theread Safe
            synchronized(DbSingleton.class)  // Synchronization slows down performance, hence we synchronize ONLY for the object creation
            {
                if (instance == null)
                    instance = new DbSingleton();
            }
        }
        
        return instance;
    }
}
