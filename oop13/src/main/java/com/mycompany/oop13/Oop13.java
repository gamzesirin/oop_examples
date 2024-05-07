/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop13;

import static com.mycompany.oop13.Magaza.magazaKod;

/**
 *
 * @author gamze
 */
public class Oop13 {

    public static void main(String[] args) {
       
        //staticler belleğe tek seferde yüklenir
        // nesne oluşturmaya gerek kalmadan çalışır bellekte kendine çoktan yer edinmiiş olur
        //değeri tüm nesnelerde değişmeyen değişkenlere sınıf değişkeni denir diğerleri nesne değişkeni olur
        // static metotlara sınıf metodu da denir
        // statc ögelere her yerden ulaşılır main metodu da statictir
        //tüm stactic ögeler heapte saklanır
        //boolean default değeri => false
        //dinamik ögeler ,ç,n bellkete her seferinde ona yer ayrılır
        Magaza.magazaKod=123;
       Magaza magaza1=new Magaza(888,20);
        System.out.println(magaza1.magazaKod);//normalde sınıf adı ile ulaşılıyor static ögeye am buşekilde refeans ile de yazılıyor
        //instance variable dinamik ögedir hiç bir zaman onlara sınıf adı üzerinden ulaşılmaz
        
                 
       
    }
}
