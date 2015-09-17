/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.factory;

/**
 *
 * @author mso36w
 */
public class FactoryDemo {

    public static void main (String args[]) {
        
        //Website site = WebsiteFactory.getWebsite("blog");
        Website site = WebsiteFactory.getWebsite(WebsiteType.BLOG);
        
        System.out.println(site.getPages());
        
        //site = WebsiteFactory.getWebsite("shop");
        site = WebsiteFactory.getWebsite(WebsiteType.SHOP);
        
        System.out.println(site.getPages());
        
    }
}
