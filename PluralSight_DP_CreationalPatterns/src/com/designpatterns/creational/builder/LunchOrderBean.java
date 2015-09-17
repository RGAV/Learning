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

// It is MUTABLE (because it has setter methods) and I can have any configuration that I have

public class LunchOrderBean {

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;
    
    public LunchOrderBean() {
		
    }
     
    
    
    public String getBread() {
	return bread;
    }

    public String getCondiments() {
	return condiments;
    }
    
    public String getDressing() {
	return dressing;
    }

    public String getMeat() {
	return meat;
    }

    public void setBread(String bread) {
	this.bread = bread;
    }

    public void setCondiments(String condiments) {
	this.condiments = condiments;
    }

    public void setDressing(String dressing) {
	this.dressing = dressing;
    }

    public void setMeat(String meat) {
	this.meat = meat;
    } 
    
    
}
