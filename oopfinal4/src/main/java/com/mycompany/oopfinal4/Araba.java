/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopfinal4;

/**
 *
 * @author gamze
 */
public class Araba extends AtArabasi{
    private int kapiSayisi;
    
    public int getKapi(){
        return kapiSayisi;
    }
    public void setKapi(int kapiSayisi){
        this.kapiSayisi=kapiSayisi;
    }
    public void bilgi2(){
        System.out.println("beygir Gücü :" + beygirGücü);
    }
}
