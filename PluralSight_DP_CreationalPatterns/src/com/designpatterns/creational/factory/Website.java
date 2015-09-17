/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mso36w
 */
public abstract class Website {
    
    protected List<Page> pages = new ArrayList<>();

        
    public Website() {
        this.createWebsite();
    }
    
    
//    public void setPages(List<Page> pages) {
//        this.pages = pages;
//    }

    public List<Page> getPages() {
        return pages;
    }
    
    public abstract void createWebsite();

}
