/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop12;

/**
 *
 * @author gamze
 */
public class Javaoop12 {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("gamze");
        customer.setLastName("Şirin");
        
        Customer customer2 = new Customer(1,150,25,"eda","gül");
        
        
        Logger logger = new DatabaseLogger();
        logger = new SmsLogger();
        
        
        CustomerManager customermanager = new CustomerManager(logger);
        customermanager.add(customer);
        System.out.println();
        customermanager.add(customer2);

    }
}
