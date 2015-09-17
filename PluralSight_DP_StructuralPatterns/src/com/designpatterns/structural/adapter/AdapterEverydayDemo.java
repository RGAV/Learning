/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.adapter;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author mso36w
 */
public class AdapterEverydayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Integer[] arrayOfInts = new Integer[] {42, 43, 44};
        
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);
        
        System.out.println("Array of Ints: " + arrayOfInts);  // it prints Array of Ints: [Ljava.lang.Integer;@2a139a55
        System.out.println("List of Ints: " + listOfInts);    // it prints List of Ints: [42, 43, 44]
        
    }
    
}
