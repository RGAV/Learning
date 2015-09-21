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
public abstract class Shape {
    
    protected IColor color;
    
    public Shape(IColor color) {
        this.color = color;
    }
    
    abstract public void applyColor();
}
