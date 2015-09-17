/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.designpatterns.structural.adapter;

/**
 *
 * @author mso36w
 */
public class EmployeeLDAP {

    private String cn;
    private String surname;
    private String givenName;
    private String mail;

    public EmployeeLDAP(String cn, String surName, String givenName, String mail) {
        this.cn = cn;
        this.surname = surName;
        this.givenName = givenName;
        this.mail = mail;
    }

    public String getCn() {
        return cn;
    }

    public String getSurname() {
        return surname;
    }

    public String getGivenName() {
        return givenName;
    }

    public String getMail() {
        return mail;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "EmployeeLDAP {" + "cn=" + cn + ", surName=" + surname + ", givenName=" + givenName + ", mail=" + mail + '}';
    }
    
   
    
}
