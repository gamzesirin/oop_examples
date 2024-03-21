/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop4;

/**
 *
 * @author gamze
 */
public class PassByReference {
    public int number2;//instance variable
    
    
    public void change(  PassByReference referance ){
        referance=new PassByReference();//bunu yapmak yeni bir referans oluşturmaktır bu sayede iki yeni nesne olur asıl nesne etkilenmez yani alt satırdaki kod boşa çıkar gibi olur 
        referance.number2=referance.number2+5;
    }
}
