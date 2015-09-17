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

// Abstract Product
public abstract class CreditCard {
    
    protected int cardNumberLength;
    protected int cscNumber;
    
    public int getCardNumberLength() {
        return cardNumberLength;
    }

    public void setCardNumberLength(int cardNumberLength) {
        this.cardNumberLength = cardNumberLength;
    }

    
    public int getCscNumber() {
        return cscNumber;
    }
    
    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
    
}
