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

// ASTRACT FACTORY
public abstract class CreditCardFactory {
    
    public static CreditCardFactory getCreditCardFactory (int creditScore) {
    
        if (creditScore > 650) {
            return new AmexFactory();
        }
        else {
            return new VisaFactory();
        }
    }
    
    
    public abstract CreditCard getCreditCard(CardType cardType);
    
    public abstract IValidator getValidator(CardType cardType);
}
