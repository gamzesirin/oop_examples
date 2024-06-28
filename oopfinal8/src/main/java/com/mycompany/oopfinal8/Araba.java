/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopfinal8;

/**
 *
 * @author gamze
 */
public class Araba extends Atarabası{
   private int kapiSayisi;

    public int getKapi() {
        return kapiSayisi;
    }

    public void setKapi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public int getTekerlek(int x) {
        return 8;
    }
}
