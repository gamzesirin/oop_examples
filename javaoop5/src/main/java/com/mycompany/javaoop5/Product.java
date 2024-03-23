/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop5;

/**
 *
 * @author gamze
 */
public class Product {
    public String name;
    public String color;
    public String model;
    public int price;
    public int stockAmount;
    
    public Product(){
        this("Monster","abra a5 v19 gaming",25000);
//        this.color="black";
//        this.model="pro";
//        this.name="Macbook";
//        this.price=20000;
//        this.stockAmount=500;
    }
     public Product(String name,String model,int price){
         this.name=name;
         this.model=model;
         this.price=price;
     }
     
}
