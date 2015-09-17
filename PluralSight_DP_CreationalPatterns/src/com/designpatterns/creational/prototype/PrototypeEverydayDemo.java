/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mso36w
 */
public class PrototypeEverydayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String sql = "Select * from movies where title = ?";
        
        List<String> parameters = new ArrayList<>();
        parameters.add("Star Wars");
        
        Record record = new Record();
        
        Statement firstStatement = new Statement(sql, parameters, record);
        System.out.println("First Statement:");
        System.out.println(firstStatement.getSql());
        System.out.println(firstStatement.getParameters());
        System.out.println(firstStatement.getRecord());
        
        Statement secondStatement = new Statement(sql, parameters, record);
        System.out.println("Second Statement:");
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
        
        
    }
    
}
