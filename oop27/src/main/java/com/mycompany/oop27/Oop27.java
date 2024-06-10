/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop27;

/**
 *
 * @author gamze
 */
public class Oop27 {

    public static void main(String[] args) {
        MyClass obj1=new MyClass();
        MyClass obj2=new MyClass();
        MyClass obj3=new MyClass();
        MyClass.incrementcount();     
        MyClass.incrementcount();
        System.out.println(MyClass.getcount());
        
                
    }
}
