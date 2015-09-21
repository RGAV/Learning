/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.bridge.shape2;

/**
 *
 * @author RGAV
 */
public class Circle extends Shape {

    public Circle(IColor color) {
        super(color);
    }

    
    @Override
    public void applyColor() {
        color.applyColor();
    }
    
}
