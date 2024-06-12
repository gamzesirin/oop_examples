/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop25;

/**
 *
 * @author gamze
 */
public class Oop25 {

    public static void main(String[] args) {
       Yazarlar a = new Yazarlar();
       a.yenidenaAta();
        System.out.println(a.ad);
    }
   static class Yazarlar{
        public String ad = "george martin";
         public void yenidenaAta(){
            String ad = "tolkien";
        }
    }
}
