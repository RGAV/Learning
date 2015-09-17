/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.builder;

/**
 *
 * @author mso36w
 */
public class BuilderEverydayDemo {

    public static void main (String[] args) {
    
        StringBuilder builder = new StringBuilder();
    
        builder.append("This is an example ");
        builder.append("of the builder pattern. ");
        builder.append("It has methods to append");
        builder.append("almost anything we want to a String. ");
        
        builder.append(42);
        
        System.out.println(builder.toString());
            
    }
    
}
