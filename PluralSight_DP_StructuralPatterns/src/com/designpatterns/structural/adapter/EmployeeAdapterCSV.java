/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.adapter;

/**
 *
 * @author mso36w
 */
public class EmployeeAdapterCSV implements IEmployee {

    private EmployeeCSV instance;
    
    public EmployeeAdapterCSV(EmployeeCSV employeeFromCSV) {
        this.instance = employeeFromCSV;
    }

    @Override
    public String getId() {
        // poor man fix
         return  instance.getId() + "";
        //return  Integer.toString(instance.getId());
    }

    @Override
    public String getFirstName() {
        return instance.getFirstName();
    }

    @Override
    public String getLastName() {
        return instance.getLastName();
    }

    @Override
    public String getEmail() {
        return instance.getEmailAddress();
    }

    @Override
    public String toString() {
        return instance.toString();
    }
    
    
    
}
