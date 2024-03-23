/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop7;

/**
 *
 * @author gamze
 */
public class Javaoop7 {

    public static void main(String[] args) {
        Person person = new Person();
        person.firstname="gamze";
        person.lastname="şirin";
        person.age=22;
        //person.email="gamzesirin9876@gmail.com";
        
        person.setEmail("berkayderin@gmail.com");
        System.out.println(person.getEmail());
        
        person.setEmail("zeynepsiringmail.com");
        System.out.println(person.getEmail());
        
        
       Animal cat = new Animal();
       cat.name="boncuk";
       cat.age=3;
       cat.setgenus("tekir");
        System.out.println(cat.getgenus()); 
        System.out.println(cat.name+" "+ cat.age);
    }
}
