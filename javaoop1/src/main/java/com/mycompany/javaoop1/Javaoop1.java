/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop1;

/**
 *
 * @author gamze
 */
public class Javaoop1 {

    public static void main(String[] args) {
       Car car = new Car();
       Car car2 = new Car();
       
       car.brand="ford";
       car2.brand="renault";
       
       car.model="focus";
       car2.model="megane";
       
       car.color="red";
       car2.color="grey";
       
       car.price=100000;
       car2.price=150000;
       
        System.out.println("araç1 modeli "+ car.brand);
        System.out.println("araç2 modeli "+ car2.brand);

        car.print();
        car2.print();
        
        car.speed=100;
        car2.speed=120;
        
        car.speedUp(100);
        car2.speedUp(30);
        System.out.println(car.speed);
        System.out.println(car2.speed);
          car.speedDown(50);
        car2.speedDown(10);
        System.out.println(car.speed);
        System.out.println(car2.speed);
    }
}
