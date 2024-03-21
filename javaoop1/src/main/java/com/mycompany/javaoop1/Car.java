/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop1;

/**
 *
 * @author gamze
 */
public class Car {
    public String brand;
    public String color;
    public String model;
    public int speed;
    public int price;
    
    public void speedUp(int increment){
        this.speed=this.speed+increment;
    }
    public void speedDown(int decrement){
        this.speed=this.speed-decrement;
    }
    public void print(){
        System.out.println("araç rengi "+ this.color + " araç modeli "+ this.model + " araç markası "+ this.brand + " araç fiyatı "+ this.price  );
    }
}
