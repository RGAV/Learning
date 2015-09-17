/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.prototype;

/**
 *
 * @author mso36w
 */
public abstract class Item implements Cloneable {
    
    private String title;
    private double price;
    private String url;

    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }

    
    
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getUrl() {
        return url;
    }

 
    
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
