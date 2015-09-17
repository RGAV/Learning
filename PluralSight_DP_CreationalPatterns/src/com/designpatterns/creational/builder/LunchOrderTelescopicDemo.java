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
public class LunchOrderTelescopicDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        LunchOrderTelescopic lunchOrderBean = new LunchOrderTelescopic("Wheat", "Lettuce", "Mustard", "Ham");
        
//        lunchOrderBean.setBread("Wheat");
//        lunchOrderBean.setCondiments("Lettuce");
//        lunchOrderBean.setDressing("Mustard");
//        lunchOrderBean.setMeat("Ham");
        
        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
    
}
