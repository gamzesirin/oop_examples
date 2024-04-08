/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop6;

/**
 *
 * @author gamze
 */
public class Oop6 {

    public static void main(String[] args) {
     Ogrenci ogrenci1 =new Ogrenci();
     ogrenci1.isim="gamze";
     ogrenci1.ogrenciNo=123;
     
     Ders ders = new Ders();
     ders.dersId=3;
     ders.dersAdi="oop";
   
     
     ogrenci1.ders1=ders;
     ders.ogr1=ogrenci1;
     System.out.println( ogrenci1.ekranaYaz()); 
     System.out.println( ders.ekranaYaz());    

                
    }
}
