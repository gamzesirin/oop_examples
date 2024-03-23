/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop7;

/**
 *
 * @author gamze
 */
public class Person {
    public String firstname;
    public String lastname;
    public int age;
    private String email;
    
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        //this.email=email;
        if(email.contains("@")){
            this.email=email;
        }
        else{
            this.email="invalid email";
        }
    }
    
    

}
