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
public class DbSingletonDemo {
    
    public static void main(String arg[])
    {
        DbSingleton instance = DbSingleton.getInstance();
    
        //DbSingleton anotherInstance  = new DbSingleton();  //error: DbSingleton() has private access in DbSingleton
        
        System.out.println(instance);
        
        DbSingleton anotherInstance = DbSingleton.getInstance();
        System.out.println(anotherInstance);
    }
}
