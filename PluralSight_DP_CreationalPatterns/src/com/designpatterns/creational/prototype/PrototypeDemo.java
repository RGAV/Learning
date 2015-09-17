/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.creational.prototype;

/**
 *
 * @author mso36w
 */
public class PrototypeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Registry registry = new Registry();
        
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Creational Patterns in Java");
        
        System.out.println(movie);
        System.out.println(movie.getRuntime());
        System.out.println(movie.getTitle());
        System.out.println(movie.getUrl());
        System.out.println("");
        
        
        
        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("Lord of the Rings");
        
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getUrl());
        System.out.println("");
        
        
        
        Book book = (Book) registry.createItem("Book");
        book.setTitle("Gang of Four");
        
        System.out.println(book);
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getTitle());
        System.out.println(book.getUrl());
        System.out.println("");
    }
    
}
