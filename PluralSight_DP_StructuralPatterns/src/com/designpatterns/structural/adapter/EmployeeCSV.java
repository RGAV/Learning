/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.adapter;

import java.util.StringTokenizer;

/**
 *
 * @author mso36w
 */
public class EmployeeCSV {
    
    private int id;
    private String firstName;
    private String lastName;
    private String emailAddress;

    
    public EmployeeCSV(String values) {

        StringTokenizer tokenizer = new StringTokenizer(values, ",");
        if (tokenizer.hasMoreElements()) {
            id  = Integer.parseInt(tokenizer.nextToken());
        }
        
        if (tokenizer.hasMoreElements()) {
            firstName = tokenizer.nextToken();
        }
        
        if (tokenizer.hasMoreElements()) {
            lastName = tokenizer.nextToken();
        }
        
        if (tokenizer.hasMoreElements()) {
            emailAddress = tokenizer.nextToken();
        }
    
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    
    
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "EmployeeCSV {" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress + '}';
    }
    
    
    
}
