/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop4;

/**
 *
 * @author gamze
 */
public class Yazarlar {
    public String ad="George Martin";
    public void yaz(){
       String ad ="Tolkien";
       System.out.println(ad + " , "+ this.ad);
    }
      public void yaz2(){
        System.out.println(ad + " , "+ this.ad);
    }
      public void yaz3(String ad){
        System.out.println(ad + " , "+ this.ad);
    }
}
