/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.adapter;

import java.util.List;

/**
 *
 * @author mso36w
 */
public class AdapterDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();
        
        List<IEmployee> employees = client.getEmployeeList();
        
        System.out.println(employees);
    
    }
    
}
