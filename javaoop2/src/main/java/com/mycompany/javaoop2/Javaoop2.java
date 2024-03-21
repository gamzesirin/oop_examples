/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoop2;

/**
 *
 * @author gamze
 */
public class Javaoop2 {

    public int sayi1=6;//bu suan static değil o nedenle mainin içinde buna müdahale edilemez çünkü main statictir
    
   //public static int sayi1=6;
   
    
    public static void main(String[] args) {
     
       int sayi2=5;
       sayi2=7;
        System.out.println(sayi2);
       // sayi1=4;  hata verir yukarıda açıkladığım nedenden dolayı  bunu yapabilmek için 1.yol => yukarıda tanımlanan sayi1 i static keywordü ile işaretlemektir  2.yol=> static olmayan clastan bir nesne üretmek ve o üretilen nesne üzerinden erişim sağlamaktır
       
        //  sayi1++;
        //   System.out.println(sayi1);
        
        Javaoop2 nesne=new Javaoop2();
        nesne.sayi1=10;
        System.out.println(nesne.sayi1);
    }
}
