/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.abstractfactory;

import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

/**
 *
 * @author mso36w
 */
public class AbstractFactoryEverydayDemo {
    
    public static void main (String args[]) throws Exception {
    
        String xml = "<document> <body> <stock>AAPL</stock> </body> </document>";
        
        ByteArrayInputStream bais = new ByteArrayInputStream(xml.getBytes());
        
        DocumentBuilderFactory abstrFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docFactory = abstrFactory.newDocumentBuilder();
        
        Document doc = docFactory.parse(bais);
        
        
        doc.getDocumentElement().normalize();
        
        System.out.println("Root Element: " + doc.getDocumentElement().getNodeName());
        
        System.out.println("Abstract Factory: " + abstrFactory.getClass());
        System.out.println("Factory:          " + docFactory.getClass());
        
    }
            
    
}
