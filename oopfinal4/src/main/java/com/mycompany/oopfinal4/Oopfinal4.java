/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopfinal4;

/**
 *
 * @author gamze
 */
public class Oopfinal4 {

    public static void main(String[] args) {
        AtArabasi atArabasi=new AtArabasi();
        System.out.println(atArabasi.getTekerlek());
        
        
        Araba araba = new Araba();
        araba.setKapi(2);
        System.out.println(araba.getKapi());
        System.out.println(araba.getTekerlek());
       
        AtArabasi atArabasi2=new AtArabasi();
        atArabasi2.bilgi();
        
        Araba araba1= new Araba();
        araba1.bilgi2();
    }
}
