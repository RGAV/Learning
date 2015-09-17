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

// It is NOT IMMUTABLE
// There is NO CONTRACT to what should signalize a valid lunch order 
public class LunchOrderBeanDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LunchOrderBean lunchOrderBean = new LunchOrderBean();
        
        lunchOrderBean.setBread("Wheat");
        lunchOrderBean.setCondiments("Lettuce");
        lunchOrderBean.setDressing("Mustard");
        lunchOrderBean.setMeat("Ham");
        
        System.out.println(lunchOrderBean.getBread());
        System.out.println(lunchOrderBean.getCondiments());
        System.out.println(lunchOrderBean.getDressing());
        System.out.println(lunchOrderBean.getMeat());
    }
    
}
