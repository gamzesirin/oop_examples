/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop11;

/**
 *
 * @author gamze
 */
public class Ev {
    int kapiNo;
    String sokakAdi;
    
    public Ev(){
        System.out.println("321 Deniz");
    }
    public Ev(String sokakAdi){
        this.sokakAdi=sokakAdi;
        System.out.println("654 "+this.sokakAdi);
    }
     public Ev(int  kapiNo){
        this.kapiNo=kapiNo;
        System.out.println(this.kapiNo+" kenar");
    }
            
}
