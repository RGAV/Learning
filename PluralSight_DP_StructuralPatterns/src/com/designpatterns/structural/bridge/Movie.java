/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.bridge;

/**
 *
 * @author mso36w
 */
public class Movie {

    private String classification;
    private String runtime;
    private String title;
    private String year;

    public String getClassification() {
        return classification;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    
    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    
    
    
}
