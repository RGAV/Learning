/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.factory;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author mso36w
 */
public class FactoryEverydayDemo {

    public static void main (String args[])
    {
        Calendar cal = Calendar.getInstance();
        
//        Calendar cal = Calendar.getInstance(Locale.ENGLISH );
//        Calendar cal = Calendar.getInstance(Locale.UK );
//        Calendar cal = Calendar.getInstance(Locale.US );
        
        System.out.println("Calendar " + cal);
        
        System.out.println("Calendar - day of month: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}
