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
public class EmployeeAdapterLDAP implements IEmployee {

    private EmployeeLDAP instance;
    
    
    public EmployeeAdapterLDAP(EmployeeLDAP employeeFromLdap) {
        this.instance = employeeFromLdap;
    }

    
    @Override
    public String getId() {
        return instance.getCn();
    }

    @Override
    public String getFirstName() {
        return instance.getGivenName();
    }

    @Override
    public String getLastName() {
        return instance.getSurname();
    }

    @Override
    public String getEmail() {
        return instance.getMail();
    }

    @Override
    public String toString() {
        //return "EmployeeAdapterLDAP{" + "cn=" + instance.getCn() + ", givenName=" + instance.getGivenName() + ", surname=" + instance.getSurname() + ", mail=" + instance.getMail() + "}";
        return instance.toString();
    }
    
    
    
}
