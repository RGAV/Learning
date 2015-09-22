/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.bridge;

import java.util.List;

/**
 *
 * @author mso36w
 */
public abstract class Printer {
    
    public String print(IFormatter formatter) {
    
        return formatter.format(getHeader(), getDetails());
    }
    
    abstract protected List<Detail> getDetails();
    
    abstract protected String getHeader();
    
}
