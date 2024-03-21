/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop3;

/**
 *
 * @author gamze
 */
public class Javaoop3 {

    public static void main(String[] args) {
        
        Person person =new Person();
        Person person1 =new Person();
        person.firstname="gamze";
        person1.firstname="berkay";
        person.lastname="şirin";
        person1.lastname="derin";
        person.age=20;
        person1.age=23;
        
        System.out.println(person.firstname+" "+person.lastname+" "+ person.age);
        System.out.println(person1.firstname+" "+person1.lastname+" "+ person1.age);

        
        Ford focus=new Ford();
        Ford mondeo=new Ford();
        
        System.out.println(focus.numberofGears);
        System.out.println(mondeo.numberofGears);

        focus.numberofGears=5;
        mondeo.numberofGears=6;
        System.out.println(focus.numberofGears);
        
        Ford.numberofGears=9;
        System.out.println(Ford.numberofGears);
    }
}
