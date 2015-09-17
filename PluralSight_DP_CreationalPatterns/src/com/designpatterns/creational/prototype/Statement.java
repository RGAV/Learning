/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.prototype;

import java.util.List;

/**
 *
 * @author mso36w
 */
public class Statement implements Cloneable {

    private String sql;
    private List<String> parameters;
    private Record record;   //Shallow copy
    
    // Shallow copy (or Shallow Clone)
    // For Shallow copy the changes will be reflected in both lists
    public Statement (String sql, List<String> parameters, Record record) {
        // Returnig just the references of members it means it is a Shallow copy
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;  
    }
    
    // For a Deep Copy it will return a NEW array list with those parameters values copied. Same for record.
    
    public Statement clone() {
        try {
            
            return (Statement) super.clone();
        
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public List<String> getParameters() {
        return parameters;
    }
    
    public Record getRecord() {
        return record;
    }
    
    public String getSql() {
        return sql;
    }

    
    
    public void setSql(String sql) {
        this.sql = sql;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public void setRecord(Record record) {
        this.record = record;
    }
    
    
}
