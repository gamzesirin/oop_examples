/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaoop4;

/**
 *
 * @author gamze
 */
public class Arrayasareference {
    
    public void changethearray(int[]array){
        array=new int[]{7,8,9};//yeni bir yere referance ediyor başka bir nesneye işret ediyor bu yüzden alttaki kod boşa çıkmış gibi olur asıl nesne gerçek veri değişmez kopyası oluşmuş olur
        
        array[0]=array[0]+8 ;
    }
}
