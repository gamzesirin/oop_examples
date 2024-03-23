/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop12;

/**
 *
 * @author gamze
 */
public class CustomerManager {
    
    Logger logger;//composition
    
    public CustomerManager(Logger newLogger){//dependency injection
        this.logger=newLogger;
    }
    
    
    
    public void add(Customer customer){
        System.out.println(customer.getFirstName()+" " + customer.getLastName()+" added to the databases");
        
        this.logger.log();
    
    }
}
