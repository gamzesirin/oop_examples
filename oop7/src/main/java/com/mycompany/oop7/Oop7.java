/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oop7;

/**
 *
 * @author gamze
 */
public class Oop7 {

    public static void main(String[] args) {
     Ogrenci ogrenci1 =new Ogrenci();
     ogrenci1.isim="zezynep";
     ogrenci1.ogrenciNo=321;
     
     Ders ders1 = new Ders();
     ders1.dersId=10;
     ders1.dersAdi="nesne yönelimli programlama";
          
     Bolüm bolüm1 = new Bolüm();
     bolüm1.bolümIsmi="Yazılım mühendisliği";
     
     ders1.dersBolüm=bolüm1;
     bolüm1.bolümDersleri=new Ders[10];
     bolüm1.bolümDersleri[0]=ders1;
 
     
     ogrenci1.ogrenciBolüm=bolüm1;
     bolüm1.bolümOgrencileri=new Ogrenci[1000];
     bolüm1.bolümOgrencileri[0]=ogrenci1;
   
     ogrenci1.dersler=new Ders[7];
     ogrenci1.dersler[0]=ders1;
     
     ders1.ogrenciler=new Ogrenci[1000];
     ders1.ogrenciler[0]=ogrenci1;


     System.out.println(ogrenci1.isim +" isimli öğrencinin aldığı ders : "+ogrenci1.dersler[0].dersAdi);
     System.out.println(bolüm1.bolümIsmi+" isimli bölümün ilk dersi : "+bolüm1.bolümDersleri[0].dersAdi);

     

                
    }
}













