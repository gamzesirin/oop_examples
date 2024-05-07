/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop14;

/**
 *
 * @author gamze
 */
public class Hesapla {
        int y =3;//7dinamik öge
        int x=y+z;
        static int z=5; //static olduğu için bellkete yeri var hataya neden olmaz
        
        int m = hesapla();
      
        public int hesapla(){
            return 3+5;
        }
        
        //yeni nesnede staticler çalışmaz dinamik ögeleri ve yapılandırıcıyı çalıştırır
        //static bir metot içinde dinamik öge çağırılamaz
        //staticlik staticliği getirir
        //static sabittir değişmez onun için kullanılır
        //dinamik ögeler nesne üyesi
        //static ögeler sınıf üyesi
        //staticlik ile genelde globallik verilir
}
