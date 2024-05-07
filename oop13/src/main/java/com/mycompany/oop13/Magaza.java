/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop13;

/**
 *
 * @author gamze
 */
public class Magaza {
        public  int siparisKod;
        public static int magazaKod;
        public int indirim;

        Magaza(int siparisKod, int indirim){
             System.out.println(magazaKod+ " kodlu mağazada "+ siparisKod +" şiparişli ürün yüzde "+ indirim +" oranında indirime girdi ...");
        }
}
