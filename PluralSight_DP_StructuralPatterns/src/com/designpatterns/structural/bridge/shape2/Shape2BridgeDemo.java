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
public class Shape2BridgeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IColor blue = new Blue();
        Shape blueSquare = new Square(blue);
    
        IColor red = new Red();
        Shape redCircle = new Circle(red);
        
        IColor green = new Green();
        Shape greenCircle = new Circle(green);
        Shape greeSquare = new Square(green);
        
        blueSquare.applyColor();
        redCircle.applyColor();
        greenCircle.applyColor();
        greeSquare.applyColor();
    }
    
}
