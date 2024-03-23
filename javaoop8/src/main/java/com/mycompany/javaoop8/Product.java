/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop8;

/**
 *
 * @author gamze
 */
public class Product {
    private String id;
    public String name;
    public String model; 
    public String brand;
//    public String color;
    public int price;
//    public int stockAmount;
    
    public Product(){
        
    }
   
    public Product( String name,  String brand ,String model , int price ){
        this.name=name;
        this.brand=brand;
         this.model=model;
        this.price=price;
    }
    
    public void setId(String id){
       // this.id=id;
       this.id=id.substring(0,1)+id.substring(4,5);
    }
    
     public String getId(){
        return id;
    }
    
    
}
