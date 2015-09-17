/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mso36w
 */
public class EmployeeClient {

    public List<IEmployee> getEmployeeList() {
    
        List<IEmployee>  employees = new ArrayList<>();
        
        IEmployee employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");
        
        employees.add(employeeFromDB);
        
        
        // This code cannot work since EmployeeLDAP is NOT implementing IEmployee interface
        //IEmployee employeeFromLdap = new EmployeeLDAP("chewie", "Solo", "Han", "han@solo.com");
        // Adapter Pattern comes into place now.
        
        EmployeeLDAP employeeFromLdap = new EmployeeLDAP("chewie", "Solo", "Han", "han@solo.com");
        
        // Create and Adapter to add employeeFromLdap to our list.    
        employees.add(new EmployeeAdapterLDAP(employeeFromLdap));
        
        EmployeeCSV employeeFromCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");
        employees.add(new EmployeeAdapterCSV(employeeFromCSV));
        
        return employees;
    }
    
}
