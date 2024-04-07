/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop5;

/**
 *
 * @author gamze
 */
public class Oop5 {

    public static void main(String[] args) {
     int c=3;
     int d=0;
     System.out.println(c);
     System.out.println(d);
     Ornek sayi1 = new Ornek();
     System.out.println(sayi1.a);// default değerlerini atar gen kurucu çalışır bir nesne üzerinden olduğu için 
     System.out.println(sayi1.b);
     System.out.println(sayi1.e);
     System.out.println(sayi1.f);

    sayi1.ekranayaz();
      
    }
}
