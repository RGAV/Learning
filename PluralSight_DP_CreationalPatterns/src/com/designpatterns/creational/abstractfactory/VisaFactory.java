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
public class VisaFactory extends CreditCardFactory {
    
    @Override
    public CreditCard getCreditCard (CardType cardType) {
        switch (cardType) {
            case GOLD :
                return new VisaGoldCreditCard();
                
            case PLATINUM : 
                return new VisaBlackCreditCard();
        }
        
        return null;
    }
    
    @Override
    public IValidator getValidator (CardType cardType) {
        return new VisaValidator();
    }
    
}
