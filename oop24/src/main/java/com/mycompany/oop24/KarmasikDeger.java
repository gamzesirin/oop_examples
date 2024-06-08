/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop24;

/**
 *
 * @author gamze
 */
public class KarmasikDeger {
   
    static int karmaşıkDeğer;

    static {
        // Karmaşık bir hesaplama sonucu elde edilen değer
        int hesaplama = 0;
        for (int i = 0; i < 100; i++) {
            hesaplama += i;
        }
        karmaşıkDeğer = hesaplama;
         System.out.println("Karmaşık Değer: " + karmaşıkDeğer);
    }
    
}
