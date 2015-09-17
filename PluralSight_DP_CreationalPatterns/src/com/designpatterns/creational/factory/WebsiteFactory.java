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
public class WebsiteFactory {
    
//    public static Website getWebsite(String siteType) {
//    
//        switch (siteType) {
//            case "blog" : {
//                return new Blog();
//            }
//            
//            case "shop" : {
//                return new Shop();
//            }
//        
//            default : {
//                return null;
//            }
//        }   
//    }
    
    public static Website getWebsite(WebsiteType siteType) {
    
        switch (siteType) {
            case BLOG : {
                return new Blog();
            }
            
            case SHOP : {
                return new Shop();
            }
        
            default : {
                return null;
            }
        }   
    }

}
