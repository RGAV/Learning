/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.abstractfactory;

/**
 *
 * @author mso36w
 */
public class AbstractFactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CreditCardFactory abstrFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard cardFactory = abstrFactory.getCreditCard(CardType.PLATINUM);
        
        System.out.println("Card Factory: " + cardFactory.getClass());
        
        
        abstrFactory = CreditCardFactory.getCreditCardFactory(600);
        CreditCard cardFactory2 = abstrFactory.getCreditCard(CardType.GOLD);
        
        System.out.println("Card Factory: " + cardFactory2.getClass());
        
        
    }
    
}
