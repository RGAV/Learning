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

// Compared to LunchOrderBean this Tele implementation is IMMUTABLE, 
// but it DOESN't work for all food configurations that I want if there isn't a specific constructor implemented.
class LunchOrderTelescopic {
    
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;
    
    
    // TELESCOPIC Constructors
    public LunchOrderTelescopic (String bread) {
        this.bread = bread;
    }
     
    public LunchOrderTelescopic (String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }
    
    public LunchOrderTelescopic (String bread, String condiments, String dressing) {
        this(bread, condiments);
        this.dressing = dressing;
    }

    public LunchOrderTelescopic (String bread, String condiments, String dressing, String meat) {
        this(bread, condiments, dressing);
        this.meat = meat;
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
}
