/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop10;

/**
 *
 * @author gamze
 */
public class Ogrenci {
    int ogrenciNo;
    String isim;
    public Ogrenci(String isim,int ogrenciNo){
        this.isim=isim;
        this.ogrenciNo=ogrenciNo;
        System.out.println("isminiz : "+this.isim+" numaranız : "+ this.ogrenciNo);
    }
}
