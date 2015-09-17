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
public class AmexPlatinumValidator implements IValidator {
    
    @Override
    public boolean isValid (CreditCard creditCard) {
        return false;
    }
    
}
