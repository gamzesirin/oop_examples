/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop12;

/**
 *
 * @author gamze
 */
public class Ev {
    public int kapiNo = 444;
    public String sokakAdi="Meltem";
    Ev(int kapiNo,String sokakAdi){
        System.out.println(kapiNo + " "+ sokakAdi);
    }
    Ev(){
        this(123,"temel");
        System.out.println("default");
    }
     Ev(int kapiNo){
        this( kapiNo,"temel");
    }
    Ev(String sokakAdi){
           this( 654,sokakAdi);
       }
}
