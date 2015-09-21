/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.bridge.shape1;

/**
 *
 * @author RGAV
 */
public class Shape1BridgeDemo {

    public static void main(String[] args) {
    
        Circle circle = new BlueCircle();
        
        Square square = new RedSquare();
        
        Square greenSquare = new GreenSquare();
        
        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    
    }
    
}
