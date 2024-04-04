/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop1;


public class Ogrenci {
    
    private static String isim="deniz";
    public void isimNe(String ad){    
        isim=ad; 
    }
    public static void ekrana_yaz(){
        System.out.println("öğrencinin ismi "+isim);
    }
}
