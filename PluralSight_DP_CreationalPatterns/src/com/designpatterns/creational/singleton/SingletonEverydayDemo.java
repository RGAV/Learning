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
public class SingletonEverydayDemo {
    
    public static void main (String args[])
    {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);
        
        Runtime anotherSingletonRuntime = Runtime.getRuntime();
        System.out.println(anotherSingletonRuntime);
        
        if (singletonRuntime == anotherSingletonRuntime)
        {
            System.out.println("They are the same instances");
        }
        
        if (singletonRuntime.equals(anotherSingletonRuntime))
        {
            System.out.println("\nThe 2 instances are equal!");
            System.out.println("Obj1: " + (Object) singletonRuntime);
            System.out.println("Obj2: " + (Object) anotherSingletonRuntime);
        }
    }
    
    
}
