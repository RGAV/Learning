/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mso36w
 */
public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    
    // This is the heart and soul of Prototype Pattern
    public Item createItem (String type) {
        Item item = null;
        try {
            
            item = (Item) (items.get(type).clone());
                    
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        return item;
    }
    
    
    
    private void loadItems() {
        
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("2 hours");
        
        items.put("Movie", movie);
        
        
        Book book = new Book();
        book.setNumberOfPages(335);
        book.setPrice(19.99);
        book.setTitle("Basic Book");
        
        items.put("Book", book);
    }
    
    
    
}
