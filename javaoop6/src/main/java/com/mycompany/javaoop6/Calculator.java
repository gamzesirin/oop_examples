/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop6;

/**
 *
 * @author gamze
 */
public class Calculator {
    public int sayi1,sayi2;
    public int sayi3,sayi4;
    
    public void add(int sayi1,int sayi2){
        int toplam=sayi1+sayi2;
        System.out.println("Toplam = "+ toplam);
    }
     public void add(int sayi1,int sayi2,int sayi3){
        int toplam1=sayi1+sayi2+sayi3;
        System.out.println("Toplam 1 = "+ toplam1);
    }
      public double add(double sayi1,double sayi2,double sayi3){
        double toplam2=sayi1+sayi2+sayi3;
        return toplam2;
    }
}
