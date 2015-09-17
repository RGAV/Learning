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
public class AmexFactory extends CreditCardFactory {
    
    @Override
    public CreditCard getCreditCard (CardType cardType) {
    
        switch (cardType) {
            case GOLD: 
                return new AmexGoldCreditCard();
            
            case PLATINUM:
                return new AmexPlatinumCreditCard();
                
            default:
                break;
        }
                
        return null;
    }
    
    @Override
    public IValidator getValidator (CardType cardType) {
            switch (cardType) {
                case GOLD: 
                    return new AmexGoldValidator();

                case PLATINUM:
                    return new AmexPlatinumValidator();

                default:
                    break;
        }
        return null;
    }
    
}
